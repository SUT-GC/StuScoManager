package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

import dao.CourseDao;
import entity.Course;

public class SelectCourseNameAndId extends ActionSupport {
	private String coursename;
	private InputStream inputStream;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public InputStream getResult(){
		return inputStream;
	}
	@Override
	public String execute() throws Exception {
		List list = null;
		list = CourseDao.selectCourseByName(coursename);
		if(list == null || list.size() == 0){
			inputStream = new ByteArrayInputStream("0".getBytes("utf-8"));	
		}else{
			JSONArray jsonArray = new JSONArray();
			JSONObject jsonObject = null;
			for(Object object : list){
				jsonObject = new JSONObject();
				jsonObject.put("coursename", ((Course)object).getName());
				jsonObject.put("courseid",  ((Course)object).getId());
				jsonArray.put(jsonObject);
			}
			inputStream = new ByteArrayInputStream(jsonArray.toString().getBytes("utf-8"));
		}
		return SUCCESS;
	}
}
