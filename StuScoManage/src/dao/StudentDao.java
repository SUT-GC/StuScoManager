package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Student;
import entity.Teacher;

/*
 * 对STUDENT表进行操作的类
 */
public class StudentDao {
	/*
	 * 插入Student 1:插入成功 0:该id已经存在
	 */
	public static int insertStudent(Student student) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		if (session.get(Student.class, student.getId()) == null) {
			session.save(student);
			transaction.commit();
			HibernateUtil.closeSession();
			return 1;
		} else {
			HibernateUtil.closeSession();
			return 0;
		}
	}

	/*
	 * 根据id查询Student
	 */
	public static Student selectStudentById(String id) {
		Student student = null;
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		student = (Student) session.get(Student.class, id);
		return student;
	}

	/*
	 * 查询出所有的Student
	 */
	public static List selectAllStudent() {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		List list = session.createQuery("from Student").list();

		transaction.commit();
		HibernateUtil.closeSession();

		return list;
	}

	/*
	 * 根据旧的studentid更新Student
	 * 1:更新成功
	 * 0:该id不存在
	 * -1:新的id冲突
	 */
	public static int updateStudentById(String oldstudentid, Student newStudent){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		int result = -1;
		
		Student student = null;
		if((student = (Student) session.get(Student.class, oldstudentid)) != null){
			if(newStudent.getPassword().equals("")){
				newStudent.setPassword(student.getPassword());
			}
			if(newStudent.getId().equals(oldstudentid) ||  session.get(Student.class, newStudent.getId()) == null){
				session.delete(student);
				transaction.commit();
				HibernateUtil.closeSession();
				
				result = StudentDao.insertStudent(newStudent);
			}else{
				result = 0;
				transaction.commit();
				HibernateUtil.closeSession();
			}
			
		}else{
			transaction.commit();
			HibernateUtil.closeSession();
		}
		
		return result;
	}
	
	/*
	 * 根据id删除Student
	 */
	public static int deleteStudentById(String studentid){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		int result = 0;
		Student student = null;
		student = (Student)session.get(Student.class, studentid);
		
		if(student != null){
			session.delete(student);
			result = 1;
		}
		
		transaction.commit();
		HibernateUtil.closeSession();
		
		return result;
				
	}
}
