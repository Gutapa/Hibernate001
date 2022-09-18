package com.shreeganesh.hibernate.HIbernate1.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {

		Configuration c = new Configuration();
		c.configure();
		c.addAnnotatedClass(Song.class);
		SessionFactory sessionf = c.buildSessionFactory();

		return sessionf;
	}

}
