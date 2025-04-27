package org.jsp.hib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
Configuration conf=new Configuration();
conf.configure();
SessionFactory fac=conf.buildSessionFactory();
System.out.println(fac);
	}

}
