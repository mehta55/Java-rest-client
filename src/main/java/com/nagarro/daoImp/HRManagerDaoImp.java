package com.nagarro.daoImp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nagarro.dao.HRManagerDao;
import com.nagarro.dto.HRManager;

public class HRManagerDaoImp implements HRManagerDao {

	Configuration con;
	SessionFactory sessionFactory;

	public HRManagerDaoImp(){
		con = new Configuration().configure();
		sessionFactory = con.buildSessionFactory();
	}
	
	public HRManager getHRManager(String hrmId) {
		Session session = sessionFactory.openSession();
		
		HRManager hrmObject = session.get(HRManager.class, hrmId);
		
		session.close();
		
		return hrmObject;
	}

}
