package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;

public class UpdateApp 
{
    public static void main( String[] args )
    {
    	Configuration c = new Configuration();
    	c.configure();
    	c.addAnnotatedClass(Song.class);
    	SessionFactory sf= c.buildSessionFactory();

    	Session s=sf.openSession();
    	Song song = s.get(Song.class, 1);
    	System.out.println("Song before update :"+ song);
    	song.setSongName("ABHI MUJH MAI KAHIN BAKI THODI SI HAI ZINDAGI");
    	
    	s.beginTransaction();
    	s.update(song);
    	s.getTransaction().commit();
    	song = s.get(Song.class, 1);
    	System.out.println("Song after update :"+ song);
    	
    }
}
