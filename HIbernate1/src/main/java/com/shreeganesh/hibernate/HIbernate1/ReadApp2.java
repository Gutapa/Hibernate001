package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;
import com.shreeganesh.hibernate.HIbernate1.utils.HibernateUtils;

public class ReadApp2 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    	Session s=sessionFactory.openSession();
    	s.beginTransaction();
    	Song s1 = s.get(Song.class,1);//s1 in persistent state
    	s.getTransaction().commit();
    	s.close();//s1 in detached state
    	System.out.println(s1);

    	
    }
}
