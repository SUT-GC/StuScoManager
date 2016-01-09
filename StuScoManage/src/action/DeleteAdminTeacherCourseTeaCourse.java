package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

import dao.AdminDao;
import dao.CourseDao;
import dao.StudentDao;
import dao.TeaCourseDao;
import dao.TeacherDao;

public class DeleteAdminTeacherCourseTeaCourse extends ActionSupport {
	private String deleteName;
	private String deleteId;
	private InputStream inputStream;

	public String getDeleteName() {
		return deleteName;
	}

	public void setDeleteName(String deleteName) {
		this.deleteName = deleteName;
	}

	public String getDeleteId() {
		return deleteId;
	}

	public void setDeleteId(String deleteId) {
		this.deleteId = deleteId;
	}


	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public String execute() throws Exception {
		int result = 0;
		if (deleteName.equals("Admin")) {
			result = AdminDao.deleteAdminById(deleteId);
		}
		if (deleteName.equals("Teacher")) {
			result = TeacherDao.deleteTeacherById(deleteId);
		}
		if (deleteName.equals("Student")) {
			result = StudentDao.deleteStudentById(deleteId);
		}
		if (deleteName.equals("Course")) {
			result = CourseDao.deleteCourseById(deleteId);
		}
		if (deleteName.equals("TeaCourse")) {
			result = TeaCourseDao.deleteTeaCourseById(Integer.parseInt(deleteId));
		}
		
		if(result == 0){
			inputStream = new ByteArrayInputStream("删除失败，id不存在".getBytes("utf-8"));
		}
		if(result == 1){
			inputStream = new ByteArrayInputStream("删除成功".getBytes("utf-8"));
		}
		return SUCCESS;
	}
}
