package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;

public class App2 
{
    public static void main( String[] args )
    {
    	Configuration c = new Configuration();
    	c.configure("hibernate.cfg.xml");
    	c.addAnnotatedClass(Song.class);
    	SessionFactory sf= c.buildSessionFactory();

    	Session s=sf.openSession();
    	
    	Song s1 = new Song();
    	s1.setId(2);
    	s1.setSongName("Khamoshiyan");
    	s1.setSinger("Arjeet");
    	s.beginTransaction();
    	s.save(s1);
    	s.getTransaction().commit();
    	System.out.println("Row Added");
    }
}
