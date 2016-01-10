package dao;

import java.util.List;

import javax.persistence.Query;

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
	
	/*
	 * 根据教师姓名查询记录
	 */
	public static List selectTeacherByName(String teachername){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		List list = session.createQuery("from Teacher t where t.name like ?").setString(0, "%"+teachername+"%").list();
		
		transaction.commit();
		HibernateUtil.closeSession();
		
		return list;
	}
	
	/*
	 * 根据教师id删除教师
	 * 0:未找到该id的教师
	 * 1:删除成功
	 */
	
	public static int deleteTeacherById(String teacherid){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		Teacher teacher = null;
		
		teacher = (Teacher)session.get(Teacher.class, teacherid);
		
		if(teacher == null){
			transaction.commit();
			HibernateUtil.closeSession();
			return 0;
		}else{
			org.hibernate.Query query =  session.createQuery("delete from TeaCourse tc where tc.teacher_id = "+teacherid);
			query.executeUpdate();
			session.delete(teacher);
			transaction.commit();
			HibernateUtil.closeSession();
			return 1;
		}
	}
	
	/*
	 * 查询所有的Teacher
	 */
	public static List selectAllTeacher(){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		List list = session.createQuery("from Teacher").list();
		transaction.commit();
		HibernateUtil.closeSession();
		return list;
	}
	
	/*
	 * 根据旧的id更新teacher
	 * -1:没有查到该id的teacher
	 * 1:更新成功
	 * 0:该id冲突
	 */
	public static int updateTeacherById(String oldteachername, Teacher newTeacher){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		int result = -1;
		
		Teacher teacher = null;
		if((teacher = (Teacher) session.get(Teacher.class, oldteachername)) != null){
			if(newTeacher.getPassword().equals("")){
				newTeacher.setPassword(teacher.getPassword());
			}
			if(newTeacher.getId().equals(oldteachername) ||  session.get(Teacher.class, newTeacher.getId()) == null){
				session.delete(teacher);
				transaction.commit();
				HibernateUtil.closeSession();
				
				result = TeacherDao.insertTeacher(newTeacher);
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
	 * 根据教师id查出所教课程
	 */
	public static List selectAllCourse(String teacherid){
		List list = null;
		
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		list = session.createSQLQuery("SELECT COURSE.C_ID,COURSE.C_NAME from TEACOURSE, COURSE where TEACOURSE.T_ID = '"+teacherid+"';").list();
		
		transaction.commit();
		HibernateUtil.closeSession();
		
		return list;
	}
	
	public static List selectAllStudent(String courseid, String studentclass, String teacherid){
		List list = null;
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		list = session.createSQLQuery("SELECT STUDENT.S_ID, STUDENT.S_NAME, STUCOURSE.GRADE from STUCOURSE, STUDENT  WHERE STUCOURSE.S_ID = STUDENT.S_ID and STUDENT.S_GRATE = '"+studentclass+"' and STUCOURSE.C_ID = '"+courseid+"' and STUCOURSE.T_ID = '"+teacherid+"';").list();
		
		transaction.commit();
		HibernateUtil.closeSession();
		
		return list;
	}
}
