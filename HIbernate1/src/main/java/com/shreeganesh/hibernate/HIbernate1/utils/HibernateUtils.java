package com.shreeganesh.hibernate.HIbernate1.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;

public class HibernateUtils {

	private static SessionFactory sessionf=null;
	
	public static SessionFactory getSessionFactory() {

		
		
		if(sessionf==null) {
		Configuration c = new Configuration();
		c.configure();
		c.addAnnotatedClass(Song.class);
		sessionf = c.buildSessionFactory();
		}
		return sessionf;
	}

}
