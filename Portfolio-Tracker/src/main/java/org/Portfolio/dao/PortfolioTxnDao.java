package org.Portfolio.dao;

import java.util.Scanner;

import org.Portfolio.entity.Entity_Master;
import org.Portfolio.entity.Portfolio_Txn;
import org.Portfolio.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.persistence.Column;

public class PortfolioTxnDao {
	
	public void insert_PortTxn() {
		System.out.println("== Register Client ==");
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc =new Scanner(System.in);

		//Txn_id Will Come Through sequence
		System.out.println("Enter txn_id :");
		int TxnId = sc.nextInt(); sc.nextLine();
		
		System.out.println("Enter user_id :");
		int userId = sc.nextInt(); sc.nextLine();
		
		System.out.println("Enter Symbol name :");
		String symbol =sc.nextLine();
		
		System.out.println("Enter Quantity:");
		int quantity =sc.nextInt();sc.nextLine();
		
		System.out.println("Enter Buy Price:");
		int buyprice =sc.nextInt();sc.nextLine();
		
		Portfolio_Txn txn= new Portfolio_Txn();
		
		txn.set_Txn_id(TxnId);
		txn.set_userid(userId);
		txn.set_symbol(symbol);
		txn.set_quantity(quantity);
		txn.set_buyPrice(buyprice);
		
		Transaction transaction= session.beginTransaction();
		
		session.persist(txn);
		
		transaction.commit();
		
		session.refresh(txn);
		
		System.out.println(txn +"Transaction Added");
	}
	
	public void update_PortTxn() {
		
	}
	
	public void delete_PortTxnById() {
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		Portfolio_Txn port_data= get_PortTxnById();
		
		Transaction txn=session.beginTransaction();
		
		session.remove(port_data);
		
		txn.commit();
		System.out.println(port_data+" Deleted From DB");
	}
	
	public Portfolio_Txn get_PortTxnByUser() {
		
		return null;
	}
	public Portfolio_Txn get_PortTxnById() {
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the user Id of the User !");
		int id=sc.nextInt();
		sc.nextLine();
		
		Portfolio_Txn txn=session.get(Portfolio_Txn.class, id);
		
		System.out.println(txn);
		return  txn;
	}
}
