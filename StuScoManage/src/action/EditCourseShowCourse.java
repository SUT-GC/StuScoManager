package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.CourseDao;

public class EditCourseShowCourse extends ActionSupport {
	private List list;
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		list = CourseDao.selectAllCourse();
		System.out.println("这里走了EditCourseShowCourse的list");
		return SUCCESS;
	}
}
