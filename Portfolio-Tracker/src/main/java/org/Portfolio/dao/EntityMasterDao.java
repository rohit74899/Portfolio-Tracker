package org.Portfolio.dao;

import java.util.Scanner;

import org.Portfolio.entity.Entity_Master;
import org.Portfolio.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EntityMasterDao {
	
	public Entity_Master getEntityData() {
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of the User !");
		int id=sc.nextInt();
		sc.nextLine();
		
		Entity_Master e=session.get(Entity_Master.class, id);
		
		System.out.println(e);
		return e;
		
	}
	
	public void insertEntity() {
		System.out.println("== Register Client ==");
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("SET user name :");
		String username =sc.nextLine();
		
		System.out.println("SET user password :");
		String password =sc.nextLine();
		
		System.out.println("Enter email Id:");
		String email =sc.nextLine();
		
		Entity_Master user=new Entity_Master();
		user.set_username(username);
		user.set_password(password);
		user.set_email(email);
		
		Transaction transaction= session.beginTransaction();
		
		session.persist(user);
		
		transaction.commit();
		
		session.refresh(user);
		
		System.out.println(user +"Registered");
	}
	
	public void updateEntity() {
		
		
	}
	
	public void deleteEntity() {
		System.out.println("== Register Client ==");
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Entity_Master user = getEntityData();
		
		Transaction transaction = session.beginTransaction();
		
		session.remove(user);
		
		transaction.commit();
		
	}
}
