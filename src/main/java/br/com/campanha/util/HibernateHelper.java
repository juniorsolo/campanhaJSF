package br.com.campanha.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateHelper {
	//private static SessionFactory sessionFactory = null;
//
//    public static SessionFactory getSessionFactory() {
//        if(sessionFactory == null) {
//        	sessionFactory = new  Configuration().configure().buildSessionFactory();
//        }
//        return sessionFactory;
//    }
	
	public static SessionFactory buildSessionFactory() {
	    try {           
	        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
	        .configure( "hibernate.cfg.xml" )
	        .build();

	        Metadata metadata = new MetadataSources( standardRegistry )
	        .getMetadataBuilder()
	        .build();

	        return metadata.getSessionFactoryBuilder().build();

	    }catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
