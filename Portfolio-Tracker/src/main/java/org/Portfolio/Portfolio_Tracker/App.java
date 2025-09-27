package org.Portfolio.Portfolio_Tracker;

import java.util.Scanner;

import org.Portfolio.dao.EntityMasterDao;
import org.Portfolio.dao.PortfolioTxnDao;
import org.Portfolio.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println( "== Welcome to Portfolio Tracker ==" );
        
        EntityMasterDao dd= new EntityMasterDao();
        PortfolioTxnDao tt=new PortfolioTxnDao();

        
        boolean flg=true;
        while(flg) {
        	
        	System.out.println("\n\tChoose Operation To Perform"
        			+ "\n\t------|     User Operations      |--------------\n"
        			+ "\n\t 1.Register a new User "
        			+ "\n\t 2.Get User Details"
        			+ "\n\t 3.Update User Details"
        			+ "\n\t 4.Delete User Details"
        			+ "\n\t------|   Portfolio Operations   |-------------\n"
        			+ "\n\t 5.Insert Portfolio Transaction"
        			+ "\n\t 6.Get Transaction Details By ID"
        			+ "\n\t 7.Update Transaction Details By ID"
        			+ "\n\t 8.Delete Transaction Details By ID"
        			+ "\n\t 9.Exit App");
        	System.out.println("Enter Option:");
        	int op=sc.nextInt(); sc.nextLine();
        	
        	switch(op) {
        	case 1:dd.insertEntity();
        		break;
        	case 2:dd.getuserDetails();
        		break;
        	case 3:dd.updateEntity();
        		break;
        	case 4:dd.deleteEntity();
        		break;
        	case 5:tt.insert_PortTxn();
        		break;
        	case 6:tt.get_PortTxnById();
        		break;
        	case 7:tt.update_PortTxn();
        		break;
        	case 8:tt.delete_PortTxnById();
        		break;
        	case 9:flg=false;
        		break;
        	default: System.out.println("Running ....");
        		break;
        	
        		
        	}
        }
        
        
        
    }
}
