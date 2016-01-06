package test;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestJson {
	public static void main(String[] args) throws JSONException {
		JSONObject json1 = new JSONObject();
		JSONObject json2 = new JSONObject();
		JSONArray jsonarray = new JSONArray();
		json1.put("username", "gc");
		json1.put("password", "1235");
		json2.put("username", "fmz");
		json2.put("password", "232");
		
		jsonarray.put(json1);
		jsonarray.put(json2);
		
		System.out.println(jsonarray.toString());
		
	}
}
