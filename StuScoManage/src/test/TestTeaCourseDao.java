package test;

import java.util.List;

import dao.TeaCourseDao;

public class TestTeaCourseDao {

	public static void main(String[] args) {

//		for(Object o: TeaCourseDao.selectCIDCNAMETIDTNAME()){
//			Object[] a = (Object[]) o;
//			System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]);
//		}
		
//		System.out.println(TeacherDao.deleteTeacherById("16002"));
		
		List list = TeaCourseDao.selectCIDCNAMECATTRTNAME();;
		for(Object o: list){
			System.out.println(o);
		}
	}

}
