package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeaCourseDao;

public class StudentSelectCourseShow extends ActionSupport {
	private List list;

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	@Override
	public String execute() throws Exception {
		list = TeaCourseDao.selectCIDCNAMECATTRTNAME();
		System.out.println("这里走了StudentSelectCourseShow");
		return SUCCESS;
	}
}
