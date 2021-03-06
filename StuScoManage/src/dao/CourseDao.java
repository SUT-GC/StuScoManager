package dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Course;

/*
 * 对COURSE表操作的类
 */
public class CourseDao {
	/*
	 * 插入Course 1:插入成功 0:插入失败，id已经存在
	 */
	public static int insertCourse(Course course) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		if (session.get(Course.class, course.getId()) == null) {
			session.save(course);
			transaction.commit();
			HibernateUtil.closeSession(session);
			return 1;
		} else {
			HibernateUtil.closeSession(session);
			return 0;
		}
	}

	/*
	 * 根据id查询Course
	 */
	public static Course selectCourseById(String id) {
		Course course = null;
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		course = (Course) session.get(Course.class, id);
		
		transaction.commit();
		HibernateUtil.closeSession(session);
		return course;
	}

	/*
	 * 根据课程名称查出list
	 */
	public static List selectCourseByName(String coursename) {
		List list = null;
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		list = session.createQuery("from Course c where c.name like ?")
				.setString(0, "%" + coursename + "%").list();

		transaction.commit();
		HibernateUtil.closeSession(session);
		return list;
	}
	
	/*
	 * 查询所有的Course
	 */
	public static List selectAllCourse(){
		List list = null;
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		list = session.createQuery("from Course").list();
		
		transaction.commit();
		HibernateUtil.closeSession(session);
		
		return list;
	}
	
	/*
	 * 根据旧的id更新Course
	 * 1:添加成功
	 * 0:该记录已经存在
	 * -1:服务器数据库操作出错，账号被异常删除
	 */
	public static int updateCourseById(String oldid, Course newCourse){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		Course course = (Course) session.get(Course.class, oldid);
		if(course == null){
			return -1;
		}else{
			session.delete(course);
		}
		transaction.commit();
		HibernateUtil.closeSession(session);
		
		int result = CourseDao.insertCourse(newCourse);
		return result;
	}
	
	/*
	 * 根据id删除Course
	 * 0:删除失败，id不存在
	 * 1:删除成功
	 */
	
	public static int deleteCourseById(String courseid){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		Course course = null;
		
		course = (Course) session.get(Course.class, courseid);
		
		if(courseid == null){
			transaction.commit();
			HibernateUtil.closeSession(session);
			return 0;
		}else{
			org.hibernate.Query query = session.createQuery("delete from TeaCourse tc where tc.course_id = "+courseid);
			query.executeUpdate();
			session.delete(course);
			transaction.commit();
			HibernateUtil.closeSession(session);
			return 1;
		}
	}
}
