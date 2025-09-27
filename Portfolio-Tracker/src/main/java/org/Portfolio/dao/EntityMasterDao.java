package org.Portfolio.dao;

import java.util.Scanner;

import org.Portfolio.dto.EntityMasterDTO;
import org.Portfolio.entity.Entity_Master;
import org.Portfolio.exception.userNotFoundException;
import org.Portfolio.mapper.EntityMasterMapper;
import org.Portfolio.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EntityMasterDao {
	
	public Entity_Master getuserObj() {
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of the User !");
		int id=sc.nextInt();
		sc.nextLine();
		Entity_Master e=null;
		
		try {
			e=session.get(Entity_Master.class, id);
		}
		finally {
			session.close();
		}
		if (e == null) {
	        throw new userNotFoundException("No User With Id " + id + " exists!!");
	    }

		return e;	
	}
	public EntityMasterDTO getuserWithPortfolio() {
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of the User !");
		int id=sc.nextInt();
		sc.nextLine();
		Entity_Master e=null;
		
		try {
			e=session.get(Entity_Master.class, id);
		}
		finally {
			session.close();
		}
		if (e == null) {
	        throw new userNotFoundException("No User With Id " + id + " exists!!");
	    }
		
		EntityMasterDTO userDto= EntityMasterMapper.toDTO(e);

		System.out.println(userDto);
		return userDto;	
	}
	
	public EntityMasterDTO getuserDetails() {
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of the User !");
		int id=sc.nextInt();
		sc.nextLine();
		Entity_Master e=null;
		
		try {
			e=session.get(Entity_Master.class, id);
			if (e == null) {
		        throw new userNotFoundException("No User With Id " + id + " exists!!");
		    }
			
			EntityMasterDTO userDto= EntityMasterMapper.toDTO(e);
			System.out.println(userDto);
			return userDto;	
		}
		finally {
			session.close();
		}
		
	}
	
	public EntityMasterDTO getuserPortfolio() {
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of the User !");
		int id=sc.nextInt();
		sc.nextLine();
		Entity_Master e=null;
		
		try {
			e=session.get(Entity_Master.class, id);
		}
		finally {
			session.close();
		}
		if (e == null) {
	        throw new userNotFoundException("No User With Id " + id + " exists!!");
	    }
		
		EntityMasterDTO userDto= EntityMasterMapper.toDTO_GetPortfolio(e);

		System.out.println(userDto);
		return userDto;	
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
		
		System.out.println("== Register Client ==");
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction =session.beginTransaction();
		Scanner sc =new Scanner(System.in);
		System.out.println("== Update User ==");
		
		Entity_Master user = getuserObj(); 
		
		System.out.println("Enter New Username (Leave Blank to Keep Old)");
		String name=sc.nextLine();
		if(name.isEmpty() || name =="") user.set_username(user.get_username());
		else user.set_username(name);
		
		System.out.println("Enter New Password (Leave Blank to Keep Old)");
		String password=sc.nextLine();
		if(password.isEmpty() || password=="") user.set_password(user.get_password());
		else user.set_password(password);
		
		System.out.println("Enter New email (Leave Blank to Keep Old)");
		String email=sc.nextLine();
		if(email.isEmpty() || email=="") user.set_email(user.get_email());
		else user.set_email(email);
		
		session.merge(user);
		
		transaction.commit();
		session.close();
		System.out.println("Updated Client Details (New Details): "+user);
		
	}
	
	public void deleteEntity() {
		System.out.println("== Register Client ==");
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Entity_Master user = getuserObj(); 
		
		Transaction transaction = session.beginTransaction();
		
		session.remove(user);
		
		transaction.commit();
		
	}
}
