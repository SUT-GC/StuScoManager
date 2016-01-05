package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import dao.CourseDao;
import entity.Course;

public class AddCourse extends ActionSupport {
	private String courseid;
	private String coursename;
	private int courseattr;
	private String coursediscription;
	private InputStream inputStream;
	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getCourseattr() {
		return courseattr;
	}

	public void setCourseattr(int courseattr) {
		this.courseattr = courseattr;
	}

	public String getCoursediscription() {
		return coursediscription;
	}

	public void setCoursediscription(String coursediscription) {
		this.coursediscription = coursediscription;
	}

	public InputStream getResult() {
		return inputStream;
	}

	@Override
	public String execute() throws Exception {
		Course course = new Course(courseid, coursename, courseattr,
				coursediscription);
		int result = CourseDao.insertCourse(course);
		if (result == 1) {
			inputStream = new ByteArrayInputStream("添加成功！".getBytes("utf-8"));
		}
		if (result == 0) {
			inputStream = new ByteArrayInputStream(
					"添加失败！ 该课程id已经存在！".getBytes("utf-8"));
		}
		return SUCCESS;
	}
}
