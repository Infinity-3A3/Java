package tn.mariages.util;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salma
 */
public class MySQLConnexion {
    String url="jdbc:mysql://localhost:3306/mariages_master_dev";
    String username="root";
    String password="";
    static Connection connection;

    private MySQLConnexion(){
        try {
            connection=DriverManager.getConnection(url, username, password);
            System.out.println("connexion établie!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
   public static Connection getInstance(){
        if(connection==null){
            new MySQLConnexion();
           // System.out.println("première instanciation");
        }else{
           // System.out.println("instanciation déjà effectuée ");
        }
        return connection;
    }



}
