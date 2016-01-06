package action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;
import entity.Teacher;

public class SelectTeacherNameAndId extends ActionSupport {
	private String inputteachername;
	private InputStream inputStream;

	public InputStream getResult() {
		return inputStream;
	}

	public String getInputteachername() {
		return inputteachername;
	}

	public void setInputteachername(String inputteachername) {
		this.inputteachername = inputteachername;
	}


	@Override
	public String execute() throws Exception {
		System.out.println(inputteachername);
		List list = TeacherDao.selectTeacherByName(inputteachername);
		String jsonString = "";
		if (list == null || list.size() == 0) {
			jsonString = "0";
		} else {
			JSONArray jsonarry = new JSONArray();
			JSONObject json = null;
			for (Object object : list) {
				Teacher teacher = (Teacher) object;
				json = new JSONObject();
				json.put("teachername", teacher.getName());
				json.put("teacherid", teacher.getId());
				jsonarry.put(json);
			}
			jsonString = jsonarry.toString();
		}
		System.out.println(jsonString);
		inputStream = new ByteArrayInputStream(jsonString.getBytes());
		return SUCCESS;
	}
}
