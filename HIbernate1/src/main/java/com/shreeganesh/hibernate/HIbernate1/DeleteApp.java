package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;

public class DeleteApp 
{
    public static void main( String[] args )
    {
    	Configuration c = new Configuration();
    	c.configure();
    	c.addAnnotatedClass(Song.class);
    	SessionFactory sf= c.buildSessionFactory();

    	Session s=sf.openSession();
    	Song song = s.load(Song.class, 2);
    	System.out.println("SOng to be Deleted :" + song);
    	s.beginTransaction();
    	s.delete(song);
    	s.getTransaction().commit();
    	System.out.println("Row Deleted");
    }
}
