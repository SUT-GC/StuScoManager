package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import dao.SelectCourseDao;
import entity.SelectCourse;

public class StudentSelectCourseEdit extends ActionSupport {
	private String teacherid;
	private String courseid;
	private String studentid;
	private int check;
	private InputStream inputStream;
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public int getCheck() {
		return check;
	}
	public void setCheck(int check) {
		this.check = check;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public String execute() throws Exception {
		int addresult = 0;
		int delresult = 0;
		if(check == 1){
			SelectCourse newSelectCourse = new SelectCourse(studentid, courseid, teacherid, -1);
			addresult = SelectCourseDao.insertSelectCourse(newSelectCourse);
		}
		if(check == 0){
			delresult = SelectCourseDao.deleteSelectCourse(teacherid, studentid, courseid);
		}
		
		if(addresult == 1){
			inputStream = new ByteArrayInputStream("选课成功！".getBytes("utf-8"));
		}else if(delresult == 1){
			inputStream = new ByteArrayInputStream("课程选择取消成功！".getBytes("utf-8"));
		}else{
			inputStream = new ByteArrayInputStream("操作失败！".getBytes("utf-8"));
		}
		return SUCCESS;
	}
}
