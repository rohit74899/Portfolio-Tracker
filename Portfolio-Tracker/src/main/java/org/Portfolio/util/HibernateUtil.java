package org.Portfolio.util;

import org.Portfolio.entity.Entity_Master;
import org.Portfolio.entity.Portfolio_Txn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {

	private static SessionFactory sessionfactory;
	static {
		try {
			StandardServiceRegistry service =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

			//require service Registry input 
			MetadataSources metaSources = new MetadataSources(service)
					.addAnnotatedClass(Entity_Master.class)
					.addAnnotatedClass(Portfolio_Txn.class);
					
			Metadata metadata =metaSources.buildMetadata();
			
			sessionfactory = metadata.buildSessionFactory();
		}
		catch(Exception e) {
			System.out.println("Error While Creating SessionFactory !!");
			e.printStackTrace();
		}
	}
	
	
	public static SessionFactory getSessionFactory(){
		return sessionfactory;
	}
}
