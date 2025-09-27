package org.Portfolio.dao;

import java.util.Scanner;

import org.Portfolio.dto.EntityMasterDTO;
import org.Portfolio.entity.Entity_Master;
import org.Portfolio.entity.Portfolio_Txn;
import org.Portfolio.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import jakarta.persistence.Column;

public class PortfolioTxnDao {
	
	public void insert_PortTxn() {
		System.out.println("== Inserting Portfolio Entry ==");
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc =new Scanner(System.in);

		//Txn_id Will Come Through sequence
		System.out.println("Enter txn_id :");
		int TxnId = sc.nextInt(); sc.nextLine();

		//EntityMasterDTO entity= new EntityMasterDao().getuserDetails();
		Entity_Master entity= new EntityMasterDao().getuserObj();
		
		System.out.println("Enter Symbol name :");
		String symbol =sc.nextLine();
		
		System.out.println("Enter Quantity:");
		int quantity =sc.nextInt();sc.nextLine();
		
		System.out.println("Enter Buy Price:");
		int buyprice =sc.nextInt();sc.nextLine();
		
		Portfolio_Txn txn= new Portfolio_Txn();
		
		txn.set_Txn_id(TxnId);
		txn.set_userid(entity);
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
		Session session= HibernateUtil.getSessionFactory().openSession();
		
		Scanner sc=new Scanner(System.in);
		Transaction txn = session.beginTransaction();
		
		Portfolio_Txn port_data= get_PortTxnById();
		
		System.out.println("Enter new Symbol/Scrip ID: ");
		String symbol =sc.nextLine();
		if(symbol==null || symbol =="") {
			port_data.set_symbol(port_data.get_symbol());
		}
		else {
			port_data.set_symbol(symbol);
		}
		
		System.out.println("Enter new Quantity: ");
		String quantity =sc.nextLine();
		if(quantity ==null ||quantity =="") {
			port_data.set_quantity(port_data.get_quantity());
		}
		else {
			int quant=Integer.parseInt(quantity);
			port_data.set_quantity(quant);

		}
		
		System.out.println("Enter new BuyPrice ID: ");
		String buyprice =sc.nextLine();
		if(buyprice ==null ||buyprice =="") {
			port_data.set_buyPrice(port_data.get_buyPirce());
		}
		else {
			int buyp=Integer.parseInt(buyprice);
			port_data.set_buyPrice(buyp);

		}
		
		session.merge(port_data);
		
		txn.commit();
		
		System.out.println("Updated Data: "+port_data);
		
		
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
	
//	public Portfolio_Txn get_PortTxnByUser() {
//		Session session= HibernateUtil.getSessionFactory().openSession();
//		
//		return null;
//	}
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
