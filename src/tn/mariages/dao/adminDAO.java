
package tn.mariages.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import tn.mariages.entities.*;
import tn.mariages.util.MyConnection;

/**
 *
 * @author RAED
 */
public class adminDAO {
    
   
    
     public void Ajouter(Admin a){
        String req="INSERT INTO animal (race,couleur,surnom) VALUES (?,?,?,?)";
        try {
                PreparedStatement prst = MyConnection.getInstance().cnx.prepareStatement(req);
      //    prst.setInt(1, a.getId());
     //    prst.setString(2, a.getRace());
    //     prst.setString(3, a.getCouleur());
   //     prst.setString(4, a.getSurnom());
        
        prst.executeUpdate();
        
        System.out.println("=> "+a.getMailAdmin()+" Ajouté");
          
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
    }
    
    
    /*
     public static void modifier(Admin a){
        String req="UPDATE animal SET race = '"+a.getRace()+"' ,couleur = '"+a.getCouleur()+"'  ,surnom = '"+a.getSurnom()+"' where id = "+a.getId();
        try {
              
            Statement st = MyConnection.getInstance().cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("modifie");
          
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
     */
        
    }
