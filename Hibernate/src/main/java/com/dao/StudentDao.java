package com.dao;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.entity.Student;

public class StudentDao {

    private static SessionFactory factory;

    static {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
    }

    public void insert(Student s) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(s);
        tx.commit();
        session.close();
        System.out.println("✔ Data Inserted");
    }

    public void update(int id, String name, String city) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, id);
        if (s != null) {
            s.setName(name);
            s.setCity(city);
            session.merge(s);
            System.out.println("✔ Data Updated");
        } else {
            System.out.println("❌ Student Not Found");
        }

        tx.commit();
        session.close();
    }

    public void delete(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Student s = session.get(Student.class, id);
        if (s != null) {
            session.remove(s);
            System.out.println("✔ Data Deleted");
        } else {
            System.out.println("❌ Student Not Found");
        }

        tx.commit();
        session.close();
    }
}

