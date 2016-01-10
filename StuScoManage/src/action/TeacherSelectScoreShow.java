package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.CourseDao;
import dao.SelectCourseDao;
import dao.TeaCourseDao;
import dao.TeacherDao;

public class TeacherSelectScoreShow extends ActionSupport {
	private List courselist;
	private List showlist;
	private String username;
	public List getCourselist() {
		return courselist;
	}
	public void setCourselist(List courselist) {
		this.courselist = courselist;
	}
	public List getShowlist() {
		return showlist;
	}
	public void setShowlist(List showlist) {
		this.showlist = showlist;
	}
	
	@Override
	public String execute() throws Exception {
		username = (String) ServletActionContext.getRequest().getSession().getAttribute("userid");
		System.out.println(username);
		courselist = TeacherDao.selectAllCourse(username);
		System.out.println("这里走了TeacherSelectScoreShow");
		return SUCCESS;
	}
}
