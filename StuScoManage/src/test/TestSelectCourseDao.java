package test;

import java.util.List;

import dao.SelectCourseDao;
import entity.SelectCourse;

public class TestSelectCourseDao {

	public static void main(String[] args) {
		List list = SelectCourseDao.selectSelectCourseByCourseId("1001");
		System.out.println(list.get(0));
//		SelectCourse selectCourse = new SelectCourse("130405215", "1001", "16001", 88);
//		int result = SelectCourseDao.insertSelectCourse(selectCourse);
//		System.out.println(result);
	}

}
