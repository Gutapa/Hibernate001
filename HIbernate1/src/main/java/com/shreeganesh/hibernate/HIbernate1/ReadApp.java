package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;
import com.shreeganesh.hibernate.HIbernate1.utils.HibernateUtils;

public class ReadApp 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    	Session s=sessionFactory.openSession();
    	s.beginTransaction();
    	Song s1 = s.get(Song.class,1);
    	s.getTransaction().commit();
    	
    	s.beginTransaction();
    	Song s2 = s.load(Song.class,2);
    	s.getTransaction().commit();
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	
    }
}
