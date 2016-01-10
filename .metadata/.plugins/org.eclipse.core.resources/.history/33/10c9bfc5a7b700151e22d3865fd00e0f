package test;

import java.util.List;

import dao.TeacherDao;
import entity.Teacher;

public class TestTeacherDao {

	public static void main(String[] args) {
		System.out.println(TeacherDao.selectTeacherById("16001"));
		Teacher teacher = new Teacher("16002", "gc", "男", 12, "111111", "ssssss");
		System.out.println(TeacherDao.updateTeacherById("16001", teacher));
//		List list = TeacherDao.selectTeacherByName("gc");
//		
//		for(Object o: list){
//			Teacher t = (Teacher)o;
//			System.out.println(t);
//		}
	}

}
