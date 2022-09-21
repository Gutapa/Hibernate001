package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;
import com.shreeganesh.hibernate.HIbernate1.utils.HibernateUtils;

public class UpdateApp {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

		if (sessionFactory != null) {
			
			Session s = sessionFactory.openSession();
			
			s.beginTransaction();
			
			Song song = s.get(Song.class, 2);
			
			System.out.println("Song before update :" + song);
			
			s.getTransaction().commit();
			
			s.close();
			
			song.setSongName("KHAMOSHIYAN-new");
			
			System.out.println("Song after update :" + song);
			
			Session session = sessionFactory.openSession();
			
			session.beginTransaction();
			
			session.get(Song.class,2);
			
			session.merge(song);//merging two objects with same primary id
			
			session.getTransaction().commit();
			
			session.close();

			/*
			 * s.beginTransaction(); s.update(song); s.getTransaction().commit(); song =
			 * s.get(Song.class, 2); System.out.println("Song after update :" + song);
			 */
		}
	}
}
