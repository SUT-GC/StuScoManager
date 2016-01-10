package test;

import java.util.List;

import dao.SelectCourseDao;
import entity.SelectCourse;

public class TestSelectCourseDao {

	public static void main(String[] args) {
//		List list = SelectCourseDao.selectSelectCourseByCourseId("1001");
//		System.out.println(list.get(0));
//		SelectCourse selectCourse = new SelectCourse("130405215", "1001", "16001", 88);
//		int result = SelectCourseDao.insertSelectCourse(selectCourse);
//		System.out.println(result);
//		System.out.println(SelectCourseDao.deleteSelectCourse("16002", "130405211", "1001"));
		
		List list = SelectCourseDao.selectScoreIsNotOk();
		for(Object o :list){
			Object[] or = (Object[]) o;
			System.out.println(or[0]+","+or[1]+","+or[2]+","+or[3]+","+or[4]);
		}
	}

}
