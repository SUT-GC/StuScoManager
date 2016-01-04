package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Teacher;
/*
 * 对Teacher进行数据库操作的类
 */
public class TeacherDao {
	/*
	 * 插入一个teacher
	 * 1:插入成功
	 * 0:该teacher的Id已经存在
	 */
	public static int insertTeacher(Teacher teacher){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		if(session.get(Teacher.class, teacher.getId()) == null){
			session.save(teacher);
			transaction.commit();
			HibernateUtil.closeSession();
			return 1;
		}else{
			HibernateUtil.closeSession();
			return 0;
		}
	}
	/*
	 * 根据T_ID查询教师
	 */
	public static Teacher selectTeacherById(String id){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		Teacher teacher = null;
		teacher = (Teacher) session.get(Teacher.class, id);
		transaction.commit();
		HibernateUtil.closeSession();
		return teacher;
	}
}