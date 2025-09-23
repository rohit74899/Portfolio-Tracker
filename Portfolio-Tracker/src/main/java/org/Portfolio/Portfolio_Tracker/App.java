package org.Portfolio.Portfolio_Tracker;

import org.Portfolio.dao.EntityMasterDao;
import org.Portfolio.dao.PortfolioTxnDao;
import org.Portfolio.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "== Welcome to Portfolio Tracker ==" );
        
        EntityMasterDao dd= new EntityMasterDao();
        //dd.insertEntity();
        
        //dd.deleteEntity();
        //dd.updateEntity();
        
        
        PortfolioTxnDao tt=new PortfolioTxnDao();
        
        //tt.insert_PortTxn();
        
        //tt.delete_PortTxnById();
        tt.update_PortTxn();
        
    }
}
