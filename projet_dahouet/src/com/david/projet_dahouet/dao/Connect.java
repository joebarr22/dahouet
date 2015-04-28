package com.david.projet_dahouet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	private static Connection conn =null;

	 final static String URL = "jdbc:mysql://localhost/projet_dahouet?noAccessToProcedureBodies=true";
   /**
    * 
    * @return RunTimeException() if any pb
    */
public static Connection  cConnect () 
{
    if (conn==null) {

	      try
	      {
	    	  Class.forName("com.mysql.jdbc.Driver").newInstance();
	
	        // 
	    	  conn=  DriverManager.getConnection(URL,"dahouet_user","mattias");
	      }
	        catch(SQLException sqlE)
	        {
	        	//TODO Logging
	            System.out.println("Sql Erreur " + sqlE.getMessage());
	            throw new RuntimeException();
	        }
	        catch(Exception e)
	        {
	           e.printStackTrace();
	           throw new RuntimeException();
	        }
    }
    
    return conn;
    
}

}