package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;
import com.shreeganesh.hibernate.HIbernate1.utils.HibernateUtils;

public class CreateApp {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		Session s = sessionFactory.openSession();
		Transaction trans = s.beginTransaction();
		try {

			Song s1 = new Song();
			s1.setSongName("Khamoshiyan - New");
			s1.setSinger("Arjeet Singhal");
			System.out.println("Sesion contains song obj : " + s.contains(s1));// s1 in Transient state
			
			trans.begin();
			s.save(s1);
			System.out.println("Sesion contains song obj : " + s.contains(s1));// s1 in persistent state
			trans.commit();
			
			s.evict(s1);
			System.out.println("Sesion contains song obj : " + s.contains(s1));// s1 in detached state

			s.close();
			System.out.println("Row Added");
		
		} catch (Exception e) {
		
			trans.rollback();
		}

	}
}
