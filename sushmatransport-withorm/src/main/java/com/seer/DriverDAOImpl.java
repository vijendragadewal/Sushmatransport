package com.seer;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DriverDAOImpl implements DriverDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
		public void driverSave(DriverData driver) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(driver);
		tr.commit();
		session.close();
	}

	@Override
	public void driverUpdate(DriverData driver) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(driver);
		tr.commit();
		session.close();
	}

	@Override
	public void driverDelete(int drivercode) {
		  Session session=sessionFactory.openSession(); 
		  Transaction  tr=session.beginTransaction();
		 DriverData driver=session.get(DriverData.class, drivercode);
		  session.delete(driver); 
		  tr.commit();
		  session.close();
	}

	@Override
	public DriverData getDriverDetail(int drivercode) {
		  Session session=sessionFactory.openSession(); 
		 DriverData driver=session.get(DriverData.class, drivercode);
		// System.out.println(driver);
		 session.close();
		  return driver;
	}

	
	@Override
	public List<DriverData> getAllDrivers() {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from DriverData");
		List<DriverData> drivers= query.list();
		session.close();
		return drivers;
	}

}
