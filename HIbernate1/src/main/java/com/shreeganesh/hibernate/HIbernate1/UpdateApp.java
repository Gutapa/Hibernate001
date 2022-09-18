package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;
import com.shreeganesh.hibernate.HIbernate1.utils.HibernateUtils;

public class UpdateApp 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    	Session s=sessionFactory.openSession();
    	Song song = s.get(Song.class, 2);
    	System.out.println("Song before update :"+ song);
    	song.setSongName("KHAMOSHIYAN");
    	
    	s.beginTransaction();
    	s.update(song);
    	s.getTransaction().commit();
    	song = s.get(Song.class, 2);
    	System.out.println("Song after update :"+ song);
    	
    }
}
