package org.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
Configuration conf=new Configuration();
conf.configure();
SessionFactory sef=conf.buildSessionFactory();
Session ses=sef.openSession();
Transaction tran=ses.getTransaction();
tran.begin();
User u1=new User();
u1.setName("DEMO1");
u1.setEmail("Demo@gmail");
u1.setPohne(2383029l);
u1.setPassword("Demo143");
int id=(Integer)ses.save(u1);
tran.commit();
System.out.println("The id is "+id);
	}

}
