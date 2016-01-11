package action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;

public class TeacherEnterScoreShow extends ActionSupport {
	private List list;
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	@Override
	public String execute() throws Exception {
		String userid = (String) ServletActionContext.getRequest().getSession().getAttribute("userid");
		list = TeacherDao.selectAllCourse(userid);
		return SUCCESS;
	}
}
