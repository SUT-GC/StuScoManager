package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;

public class TeacherEnterScoreSelect extends ActionSupport {
	private List list ;
	private String teacherid;
	private String studentclass;
	private String courseid;
	private InputStream inputStream;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public String getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(String teacherid) {
		this.teacherid = teacherid;
	}
	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}
	public String getCourseid() {
		return courseid;
	}
	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}
	public InputStream getInputStream() {
		return inputStream;
	}
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("这里走了TeacherEnterScoreSelect");
		list = TeacherDao.selectAllStudent(courseid, studentclass, teacherid);
		if(list.size() == 0){
			inputStream = new ByteArrayInputStream("没有学生".getBytes("utf-8"));
		}else{
			JSONArray jsonArray = new JSONArray();
			JSONObject jsonObject = null;
			for(Object o : list){
				Object[] r = (Object[]) o;
				jsonObject = new JSONObject();
				jsonObject.put("studentid", r[0]);
				jsonObject.put("studentname", r[1]);
				jsonObject.put("studentscore", r[2]);
				jsonArray.put(jsonObject);
			}
			System.out.println(jsonObject.toString());
			inputStream = new ByteArrayInputStream(jsonArray.toString().getBytes("utf-8"));
		}
		return SUCCESS;
	}
}
