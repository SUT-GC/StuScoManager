package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;

public class EditTeacherShowTeacher extends ActionSupport {
	private List list;

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	@Override
	public String execute() throws Exception {
		list = TeacherDao.selectAllTeacher();
		System.out.println("这里走了EditTeacherShowTeacher的action");
		return SUCCESS;
	}
	
}
