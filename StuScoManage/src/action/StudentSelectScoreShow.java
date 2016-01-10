package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.SelectCourseDao;

public class StudentSelectScoreShow extends ActionSupport {
	private List listisok;
	private List listisnotok;
	
	
	
	public List getListisok() {
		return listisok;
	}



	public void setListisok(List listisok) {
		this.listisok = listisok;
	}



	public List getListisnotok() {
		return listisnotok;
	}



	public void setListisnotok(List listisnotok) {
		this.listisnotok = listisnotok;
	}



	@Override
	public String execute() throws Exception {
		System.out.println("这里走了StudentSelectScoreShow");
		listisnotok = SelectCourseDao.selectScoreIsNotOk();
		listisok = SelectCourseDao.selectScoreIsOk();
		System.out.println(listisnotok.size());
		System.out.println(listisok.size());
		return SUCCESS;
	}
}
