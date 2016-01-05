package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;
import entity.Teacher;

public class AddTeacher extends ActionSupport {
	private String teacherid;
	private String teachername;
	private int  teacherage;
	private String teachersex;
	private String teachercollage;
	private String teacherpassword;
	
	private InputStream inputStream;
	
	public InputStream getResult(){
		return inputStream;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public int  getTeacherage() {
		return teacherage;
	}
	public void setTeacherage(int  teacherage) {
		this.teacherage = teacherage;
	}
	public String getTeachersex() {
		return teachersex;
	}
	public void setTeachersex(String teachersex) {
		this.teachersex = teachersex;
	}
	public String getTeachercollage() {
		return teachercollage;
	}
	public void setTeachercollage(String teachercollage) {
		this.teachercollage = teachercollage;
	}
	public String getTeacherpassword() {
		return teacherpassword;
	}
	public void setTeacherpassword(String teacherpassword) {
		this.teacherpassword = teacherpassword;
	}
	
	@Override
	public String execute() throws Exception {
		Teacher teacher = new Teacher(teacherid, teachername, teachersex, teacherage, teacherpassword, teachercollage);
		int result = 0;
		result = TeacherDao.insertTeacher(teacher);
		if(result == 0){
			inputStream = new ByteArrayInputStream("添加失败，该教师工号已经存在".getBytes("utf-8"));
		}
		if(result == 1){
			inputStream = new ByteArrayInputStream("添加成功".getBytes("utf-8"));
		}
		return SUCCESS;
	}
}
