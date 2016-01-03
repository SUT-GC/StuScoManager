package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminDao;
import entity.Admin;

public class LoginCheck extends ActionSupport {

	private String username;
	private String password;
	private String tip;

	public LoginCheck() {
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String  tip) {
		this.tip = tip;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		Admin admin = AdminDao.selectAdminById(username);
		if(admin == null){
			this.setTip("用户名不存在");
			return "errorinfo";
		}else{
			if(!admin.getPassword().equals(password)){
				this.setTip("密码错误");
				return "errorinfo";
			}else{
				return "admin";
			}
		}
		
		
	}
}