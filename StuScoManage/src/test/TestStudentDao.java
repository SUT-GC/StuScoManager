package test;

import dao.StudentDao;
import entity.Student;

public class TestStudentDao {

	public static void main(String[] args) {
		Student student = new Student("130405211", "gc", "男", 20, "11111", "11111", "11111");
		System.out.println(StudentDao.insertStudent(student));
	}

}
