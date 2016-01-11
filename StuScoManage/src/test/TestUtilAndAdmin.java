package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import entity.Admin;

public class TestUtilAndAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin("11113", "gc", "11111");
		Session session = HibernateUtil.currentSession();
		Transaction transaction = session.beginTransaction();
		
		Admin a = (Admin) session.get(Admin.class, "11111");
		
		transaction.commit();
		HibernateUtil.closeSession(session);
		System.out.println(a);
	}
}
