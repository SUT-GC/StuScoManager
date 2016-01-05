package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import util.PatternUtil;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminDao;
import entity.Admin;

public class AddAdmin extends ActionSupport {
	private String adminid;
	private String adminname;
	private String adminpassword;
	private InputStream inputStream;

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}

	public InputStream getResult() {
		return inputStream;
	}

	@Override
	public String execute() throws Exception {
		Admin admin = new Admin(adminid, adminname, adminpassword);
		if(PatternUtil.noUpperAndLowerCasePattern(adminid, "[a-z]*")){
			int result = AdminDao.insertAdmin(admin);
			if(result == 1){
				inputStream = new ByteArrayInputStream("添加成功".getBytes("utf-8"));
			}
			if(result == 0){
				inputStream = new ByteArrayInputStream("添加失败, 该账号已经存在".getBytes("utf-8"));
			}
		}else{
			inputStream = new ByteArrayInputStream("添加失败，用户名必须全是字母".getBytes("utf-8"));
		}
		
		
		return SUCCESS;
	}
}
