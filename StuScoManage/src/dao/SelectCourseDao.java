package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Course;
import entity.SelectCourse;
import entity.Student;
import entity.Teacher;

/*
 * 修改STUCOURSE表
 */
public class SelectCourseDao {
	/*
	 * 插入选课记录 1:插入成功 -1:学号不存在 -2:课程号不存在 -3:教师号不存在
	 */
	public static int insertSelectCourse(SelectCourse selectCourse) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		if (session.get(Course.class, selectCourse.getCourse_id()) == null) {
			HibernateUtil.closeSession();
			return -2;
		}
		if (session.get(Student.class, selectCourse.getStudent_id()) == null) {
			HibernateUtil.closeSession();
			return -1;
		}
		if (session.get(Teacher.class, selectCourse.getTeacher_id()) == null) {
			HibernateUtil.closeSession();
			return -3;
		}
		session.save(selectCourse);
		transaction.commit();
		HibernateUtil.closeSession();
		return 1;
	}

	/*
	 * 根据Student_id查询SelectCourse
	 */
	public static List selectSelectCourseByStudentId(String id) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		List sc = session.createQuery(
				"from SelectCourse sc where sc.student_id = " + id).list();

		transaction.commit();
		HibernateUtil.closeSession();

		return sc;
	}

	/*
	 * 根据Teacher_id查询SelectCourse
	 */
	public static List selectSelectCourseByTeacherId(String id) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		List sc = session
				.createQuery("from SelectCourse sc where sc.teacher_id = :id")
				.setString("id", id).list();

		transaction.commit();
		HibernateUtil.closeSession();

		return sc;
	}

	/*
	 * 根据Teacher_id查询SelectCourse
	 */
	public static List selectSelectCourseByCourseId(String id) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		List sc = session
				.createQuery("from SelectCourse sc where sc.course_id = :id")
				.setString("id", id).list();

		transaction.commit();
		HibernateUtil.closeSession();

		return sc;
	}
}
