package com.shreeganesh.hibernate.HIbernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.shreeganesh.hibernate.HIbernate1.dto.Song;
import com.shreeganesh.hibernate.HIbernate1.utils.HibernateUtils;

public class DeleteApp 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

    	Session s=sessionFactory.openSession();
    	Song song = s.load(Song.class, 2);
    	System.out.println("SOng to be Deleted :" + song);
    	s.beginTransaction();
    	s.delete(song);
    	s.getTransaction().commit();
    	System.out.println("Row Deleted");
    }
}
