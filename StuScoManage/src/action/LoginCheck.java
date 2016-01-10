package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import util.PatternUtil;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminDao;
import dao.StudentDao;
import dao.TeacherDao;
import entity.Admin;
import entity.Student;
import entity.Teacher;

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
		HttpSession session = ServletActionContext.getRequest().getSession();
		/*
		 * 验证是否是管理员
		 */
		if(PatternUtil.noUpperAndLowerCasePattern(this.getUsername(),"[a-z]*")){
			Admin admin = AdminDao.selectAdminById(this.getUsername());
			if(admin == null){
				this.setTip("对不起，您的账号不存在");
				return "errorinfo";
			}else{
				if(!this.getPassword().equals(admin.getPassword())){
					this.setTip("对不起，您的密码错误");
					return "errorinfo";
				}else{
					session.setAttribute("username", admin.getName());
					return "admin";
				}
			}
		}
		/*
		 * 验证是否时老师
		 */
		if(PatternUtil.haveUpperAndLowerCasePattern(this.getUsername(),"\\d\\d\\d\\d\\d")){
			Teacher teacher = TeacherDao.selectTeacherById(this.getUsername());
			if(teacher == null){
				this.setTip("对不起，您的账号不存在");
				return "errorinfo";
			}else{
				if(!this.getPassword().equals(teacher.getPassword())){
					this.setTip("对不起，您的密码错误");
					return "errorinfo";
				}else{
					session.setAttribute("username", teacher.getName());
					session.setAttribute("userid", teacher.getId());
					return "teacher";
				}
			}
		}
		/*
		 * 验证是否是学生
		 */
		if(PatternUtil.haveUpperAndLowerCasePattern(this.getUsername(),"\\d{9}")){
			Student student = StudentDao.selectStudentById(this.getUsername());
			if(student == null){
				this.setTip("对不起，您的账号不存在");
				return "errorinfo";
			}else{
				if(!this.getPassword().equals(student.getPassword())){
					this.setTip("对不起，您的密码错误");
					return "errorinfo";
				}else{
					session.setAttribute("username", student.getName());
					session.setAttribute("userid", student.getId());
					return "student";
				}
			}
		}
		this.setTip("对不起，您的账号不存在");
		return "errorinfo";
	}
}
