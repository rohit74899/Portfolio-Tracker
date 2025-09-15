package org.Portfolio.dao;

import java.util.Scanner;

import org.Portfolio.entity.Entity_Master;
import org.Portfolio.util.HibernateUtil;
import org.hibernate.Session;

public class EntityMasterDao {
	
	public Entity_Master getEntityData() {
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Id of the User !");
		int id=sc.nextInt();
		sc.nextLine();
		
		Entity_Master e=session.get(Entity_Master.class, id);
		
		return e;
		
		
	}
	
	public void insertEntity() {
		
	}
	
	public void updateEntity() {
		
	}
	
	public void deleteEntity() {
		
	}
}
