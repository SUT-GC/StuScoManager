package test;

import dao.StudentDao;
import entity.Student;

public class TestStudentDao {

	public static void main(String[] args) {
		Student student = new Student("130405213", "gouc", "男", 20, "11111", "11111", "11111","1302");
//		System.out.println(StudentDao.insertStudent(student));
		System.out.println(StudentDao.updateStudentById("130405212", student));
	}

}
