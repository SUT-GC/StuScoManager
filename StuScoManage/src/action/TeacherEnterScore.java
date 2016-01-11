package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import dao.SelectCourseDao;

public class TeacherEnterScore extends ActionSupport {
	private String teacherid;
	private String studentid;
	private String courseid;
	private int score;
	private InputStream inputStream;
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getStudentid() {
		return studentid;
	}
	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	@Override
	public String execute() throws Exception {
		int result = 0;
		result = SelectCourseDao.updateScoreByTeacheridStudentidCourseid(teacherid, studentid, courseid, score);
		
		inputStream = new ByteArrayInputStream((""+result).getBytes("utf-8"));
		
		return SUCCESS;
	}
}
