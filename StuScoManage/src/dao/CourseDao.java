package dao;

import java.util.List;

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
			HibernateUtil.closeSession();
			return 1;
		} else {
			HibernateUtil.closeSession();
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
		HibernateUtil.closeSession();
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
		HibernateUtil.closeSession();
		
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
		HibernateUtil.closeSession();
		
		int result = CourseDao.insertCourse(newCourse);
		return result;
	}
}
