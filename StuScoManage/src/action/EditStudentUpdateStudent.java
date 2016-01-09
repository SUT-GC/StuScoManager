package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import dao.StudentDao;
import entity.Student;

public class EditStudentUpdateStudent extends ActionSupport {
	private String newstudentid;
	private int newstudentage;
	private String newstudentcollage;
	private String newstudentgrate;
	private String newstudentname;
	private String newstudentpassword;
	private String newstudentprofession;
	private String newstudentsex;
	private String oldstudentid;
	private InputStream inputStream;

	public String getOldstudentid() {
		return oldstudentid;
	}

	public void setOldstudentid(String oldstudentid) {
		this.oldstudentid = oldstudentid;
	}

	public String getNewstudentid() {
		return newstudentid;
	}

	public void setNewstudentid(String newstudentid) {
		this.newstudentid = newstudentid;
	}

	public int getNewstudentage() {
		return newstudentage;
	}

	public void setNewstudentage(int newstudentage) {
		this.newstudentage = newstudentage;
	}

	public String getNewstudentcollage() {
		return newstudentcollage;
	}

	public void setNewstudentcollage(String newstudentcollage) {
		this.newstudentcollage = newstudentcollage;
	}

	public String getNewstudentgrate() {
		return newstudentgrate;
	}

	public void setNewstudentgrate(String newstudentgrate) {
		this.newstudentgrate = newstudentgrate;
	}

	public String getNewstudentname() {
		return newstudentname;
	}

	public void setNewstudentname(String newstudentname) {
		this.newstudentname = newstudentname;
	}

	public String getNewstudentpassword() {
		return newstudentpassword;
	}

	public void setNewstudentpassword(String newstudentpassword) {
		this.newstudentpassword = newstudentpassword;
	}

	public String getNewstudentprofession() {
		return newstudentprofession;
	}

	public void setNewstudentprofession(String newstudentprofession) {
		this.newstudentprofession = newstudentprofession;
	}

	public String getNewstudentsex() {
		return newstudentsex;
	}

	public void setNewstudentsex(String newstudentsex) {
		this.newstudentsex = newstudentsex;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public String execute() throws Exception {
		Student newStudent = new Student(newstudentid, newstudentname, newstudentsex, newstudentage, newstudentpassword, newstudentcollage, newstudentprofession, newstudentgrate);
		System.out.println(newStudent);
		int result = 0;
		result = StudentDao.updateStudentById(oldstudentid, newStudent);
		if(result == 1){
			inputStream = new ByteArrayInputStream("更新成功".getBytes("utf-8"));
		}
		if(result == 0){
			inputStream = new ByteArrayInputStream("更新失败， 该id已经存在".getBytes("utf-8"));
		}
		if(result == -1){
			inputStream = new ByteArrayInputStream("更新失败， id冲突".getBytes("utf-8"));
		}
		return SUCCESS;
	}
}
