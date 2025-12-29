package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employment.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Employment e = new Employment();
		e.setEmpID(123);
		e.setEmpName("mukesh patil");
		e.setEmail("mukesh@gmail.com");
		e.setSalary("5lakh");
		e.setNumber(9552479658l);
		e.setDepartment("testing");
		e.setCity("pune");

		// ss.save(e);
		ss.persist(e);
		tr.commit();
		ss.close();

		System.out.println("data is inserted.....!");

	}

}
