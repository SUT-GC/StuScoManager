package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Course;
import entity.TeaCourse;
import entity.Teacher;

/*
 * 对TEACOURSE表进行操作
 */
public class TeaCourseDao {

	/*
	 * 插入TeaCourse 1:插入成功 -1:Teacher_id不存在 -2:course_id不存在 0:该记录已经存在
	 */
	public static int insertTeaCourse(TeaCourse teaCourse) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		if (session.get(Teacher.class, teaCourse.getTeacher_id()) == null) {
			HibernateUtil.closeSession();
			return -1;
		}

		if (session.get(Course.class, teaCourse.getCourse_id()) == null) {
			HibernateUtil.closeSession();
			return -2;
		}

		if (session
				.createQuery(
						"from TeaCourse tc where tc.teacher_id = ? and tc.course_id = ?")
				.setString(0, teaCourse.getTeacher_id())
				.setString(1, teaCourse.getCourse_id()).list().size() != 0) {
			HibernateUtil.closeSession();
			return 0;
		}

		session.save(teaCourse);
		transaction.commit();
		HibernateUtil.closeSession();
		return 1;
	}

	/*
	 * 根据teacher_id查询出记录
	 */
	public static List selectTeaCourseByTeacherId(String teacherid) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		List tc = session
				.createQuery(
						"from TeaCourse tc where tc.teacher_id = :teacherid")
				.setString("teacherid", teacherid).list();

		transaction.commit();
		HibernateUtil.closeSession();

		return tc;
	}

	/*
	 * 根据course_id查询出记录
	 */
	public static List selectTeaCourseByCourseId(String courseid) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		List tc = session
				.createQuery("from TeaCourse tc where tc.course_id = :courseid")
				.setString("courseid", courseid).list();

		transaction.commit();
		HibernateUtil.closeSession();

		return tc;
	}

	/*
	 * 根据id查询记录
	 */
	public static TeaCourse selectTeaCourseById(int id) {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		TeaCourse teaCourse = (TeaCourse) session.get(TeaCourse.class, id);
		transaction.commit();
		HibernateUtil.closeSession();
		return teaCourse;
	}

	/*
	 * 查询出记录的教师号，教师姓名，课程号，课程名称
	 */
	public static List selectCIDCNAMETIDTNAME() {
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();

		List list = null;
		list = session
				.createSQLQuery(
						"select teacourse.TC_ID, teacher.T_ID, teacher.T_NAME ,course.C_ID ,course.C_NAME FROM TEACOURSE teacourse, COURSE course, TEACHER teacher where  teacourse.T_ID = teacher.T_ID and course.C_ID = teacourse.C_ID;")
				.list();
		
		transaction.commit();
		HibernateUtil.closeSession();
		return list;
	}
	
	/*
	 * 根据id删除TeaCourse
	 */
	public static int deleteTeaCourseById(int tcid){
		int result = 0;
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		TeaCourse teaCourse = null;
		teaCourse = (TeaCourse) session.get(TeaCourse.class, tcid);
		if(teaCourse == null){
			result = 0;
		}else{
			session.delete(teaCourse);
			result = 1;
		}
		transaction.commit();
		HibernateUtil.closeSession();
		return result;
	}
}

