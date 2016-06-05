package edu.fzu.openfund.service;

import edu.fzu.openfund.dao.AdminDao;
import edu.fzu.openfund.dao.AdminDaoJDBCImpl;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao;

	public Boolean validate(String userName, String userpwd) {
		adminDao=new AdminDaoJDBCImpl();
		return adminDao.validate(userName, userpwd);
	}

}
