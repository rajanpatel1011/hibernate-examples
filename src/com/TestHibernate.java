package com;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
public class TestHibernate {

	public static void main(String[] args) {
	
		AnnotationConfiguration cfg = new AnnotationConfiguration();
	
		cfg.configure("hibernate.cfg.xml");
		
	SessionFactory fact = cfg.buildSessionFactory();
	
	Session session = fact.openSession();
	
	Transaction tx = session.beginTransaction();
	
	Employee e1 = new Employee(111,"rahul",45);
	
	session.save(e1);
	tx.commit();
	session.close();
	System.out.println("Object has Create ");

	}

}
