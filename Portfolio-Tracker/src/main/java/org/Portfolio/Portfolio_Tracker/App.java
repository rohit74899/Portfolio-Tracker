package org.Portfolio.Portfolio_Tracker;

import org.Portfolio.dao.EntityMasterDao;
import org.Portfolio.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "== Welcome to Portfolio Tracker ==" );
        
        EntityMasterDao dd= new EntityMasterDao();
        dd.insertEntity();
        
        //dd.deleteEntity();
    }
}
