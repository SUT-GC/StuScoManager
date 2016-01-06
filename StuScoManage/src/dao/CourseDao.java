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

}
