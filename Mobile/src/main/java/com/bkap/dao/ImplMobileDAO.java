package com.bkap.dao;

import java.util.List;

import org.hibernate.Session;

import com.bkap.entity.Mobile;
import com.bkap.utils.HibernateUtils;

public class ImplMobileDAO implements IMobileDAO {

	@Override
	public boolean insert(Mobile mobile) {
		Session ss = HibernateUtils.iniSessionFactory().openSession();
		try {
			ss.beginTransaction();
			ss.save(mobile);
			ss.getTransaction().commit();
			ss.close();
			return true;
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
			System.out.println("Reason:" + e.getMessage());
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Mobile> selectAll() {
		Session ss = HibernateUtils.iniSessionFactory().openSession();
		ss.beginTransaction();
		List<Mobile> lst = ss.createQuery("from Mobile").list();
		ss.getTransaction().commit();
		ss.close();
		
		return lst;
	}

}
