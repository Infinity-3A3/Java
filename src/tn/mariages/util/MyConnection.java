package tn.mariages.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Karray
 */
public class MyConnection {
    
    public static MyConnection instance;
    public Connection cnx;
    private MyConnection()
    {
     String url ="jdbc:mysql://127.0.0.1:3306/mariages_master_dev";
     String login ="root";
     String pwd="";
    
    try
    {
         cnx = DriverManager.getConnection(url, login, pwd);
        System.out.println("Connexion etablie");
    } catch (SQLException e){
        System.err.println("Connexion NON etablie!");
            System.out.println(e.getMessage());
    }
    
    }
    
    public static MyConnection getInstance()
    {
        if(instance==null)
        {
            instance = new MyConnection();
        }
        return instance;
    }
    
}

