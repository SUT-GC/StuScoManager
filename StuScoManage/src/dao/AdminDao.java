package dao;


import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Admin;

/*
 * 对MANAGER表进行操作
 */
public class AdminDao {
	
	/*
	 * 根据ID查询Admin
	 */
	public static Admin selectAdminById(String ID){
		Admin admin = null;
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		admin = (Admin) session.get(Admin.class, ID);
		transaction.commit();
		HibernateUtil.closeSession();
		return admin;
	}
	
	/*
	 * 插入管理员
	 * 1:插入成功
	 * 0:插入失败，已存在该账号
	 */
	public static int insertAdmin(Admin admin){
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		if(session.get(Admin.class, admin.getId()) == null){
			session.save(admin);
			transaction.commit();
			HibernateUtil.closeSession();
			return 1;
		}else{
			HibernateUtil.closeSession();
			return 0;
		}
	}
}
