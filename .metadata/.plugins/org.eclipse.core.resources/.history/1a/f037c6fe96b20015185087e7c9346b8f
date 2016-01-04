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
}
