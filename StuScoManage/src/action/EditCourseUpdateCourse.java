package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import dao.CourseDao;
import entity.Course;

public class EditCourseUpdateCourse extends ActionSupport {
	
	private String oldcourseid;
	private String newcourseid;
	private String newcoursename;
	private int newcourseattr;
	private String newcoursedescription;
	private InputStream inputStream;
	
	public String getOldcourseid() {
		return oldcourseid;
	}

	public void setOldcourseid(String oldcourseid) {
		this.oldcourseid = oldcourseid;
	}

	public String getNewcourseid() {
		return newcourseid;
	}

	public void setNewcourseid(String newcourseid) {
		this.newcourseid = newcourseid;
	}

	public String getNewcoursename() {
		return newcoursename;
	}

	public void setNewcoursename(String newcoursename) {
		this.newcoursename = newcoursename;
	}

	public int getNewcourseattr() {
		return newcourseattr;
	}

	public void setNewcourseattr(int newcourseattr) {
		this.newcourseattr = newcourseattr;
	}

	public String getNewcoursedescription() {
		return newcoursedescription;
	}

	public void setNewcoursedescription(String newcoursedescription) {
		this.newcoursedescription = newcoursedescription;
	}

	public InputStream getResult() {
		return inputStream;
	}
	
	@Override
	public String execute() throws Exception {
		Course newCourse = new Course(newcourseid, newcoursename, newcourseattr, newcoursedescription);
		int result = CourseDao.updateCourseById(oldcourseid, newCourse);
		if(result == 1){
			inputStream = new ByteArrayInputStream("更新成功".getBytes("utf-8"));
		}
		if(result == -1){
			inputStream = new ByteArrayInputStream("更新失败，服务器数据库操作出错，账号被异常删除".getBytes("utf-8"));
		}
		if(result == 0){
			inputStream = new ByteArrayInputStream("更新失败，已经存在该条记录".getBytes("utf-8"));
		}
		return super.execute();
	}
}
