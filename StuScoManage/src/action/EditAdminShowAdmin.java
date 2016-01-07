package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminDao;

public class EditAdminShowAdmin extends ActionSupport {
	private List list = null;

	public List getList() {
		return list;
	}
	
	
	public void setList(List list) {
		this.list = list;
	}
	
	@Override
	public String execute() throws Exception {
		list = AdminDao.selectAllAdmin();
		System.out.println("这里走了List");
		return SUCCESS;
	}
}
