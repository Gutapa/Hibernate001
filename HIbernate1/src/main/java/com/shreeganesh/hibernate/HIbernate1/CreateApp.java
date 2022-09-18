package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;
import com.shreeganesh.hibernate.HIbernate1.utils.HibernateUtils;

public class CreateApp 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    	Session s=sessionFactory.openSession();
    	
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
