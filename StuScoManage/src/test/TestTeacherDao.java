package test;

import java.util.List;

import dao.TeacherDao;
import entity.Teacher;

public class TestTeacherDao {

	public static void main(String[] args) {
//		System.out.println(TeacherDao.selectTeacherById("16001"));
//		Teacher teacher = new Teacher("16002", "gc", "男", 12, "111111", "ssssss");
//		System.out.println(TeacherDao.updateTeacherById("16001", teacher));
		List list = TeacherDao.selectAllStudent("1000", "1302", "16001");
		
		for(Object o: list){
			Object[] r = (Object[]) o;
			System.out.println(r[0]+","+r[1]);
		}
	}

}
