package test;

import dao.AdminDao;
import entity.Admin;

public class TestAdminDao {

	public static void main(String[] args) {
		Admin admin = new Admin("admin", "gc", "admin");
		int result =AdminDao.insertAdmin(admin);
		System.out.println(result);

	}

}