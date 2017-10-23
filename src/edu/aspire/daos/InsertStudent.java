package edu.aspire.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.aspire.domain.Student;

public class InsertStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration cfg = new Configuration();
 cfg.configure("student.cfg.xml");
SessionFactory factory = cfg.buildSessionFactory();
Session s = factory.openSession();
Transaction tx = s.beginTransaction();

Student s1 = new Student();
s1.setSno(3);
s1.setSname("suji");
s1.setEmail("sujireddy@gmail.com");
s1.setMobile(9550272047L);

s.save(s1);
s.flush();
tx.commit();
s.close();
	}
}
