package com.shreeganesh.hibernate.HIbernate1.utils;

import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;

public class HibernateUtils {

	private static SessionFactory sessionf=null;
	
	public static SessionFactory getSessionFactory() {

		
		try {
			if(sessionf==null) {
			Configuration c = new Configuration();
			c.configure();
			c.addAnnotatedClass(Song.class);
			sessionf = c.buildSessionFactory();
			}
			
		} catch (Exception e) {
			System.out.println("Session Factory Object not create because of some issue");
			e.printStackTrace();
			System.out.println("Session Factory Object not create because of some issue");
		}
		return sessionf;
	}

}
