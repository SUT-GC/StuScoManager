package test;

import dao.TeacherDao;
import entity.Teacher;

public class TestTeacherDao {

	public static void main(String[] args) {
//		System.out.println(TeacherDao.selectTeacherById("16001"));
		Teacher teacher = new Teacher("16001", "gc", "男", 12, "111111", "ssssss");
		System.out.println(TeacherDao.insertTeacher(teacher));
	}

}
