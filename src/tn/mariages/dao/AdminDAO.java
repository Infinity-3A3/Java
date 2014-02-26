/*
 * Copyright (C) 2014 Karim
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tn.mariages.dao;

/**
 *
 * @author Karim
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import tn.mariages.entities.Admin;
import tn.mariages.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karray
 */
public class AdminDAO {

     public void insertAdmin(Admin a){

        String requete = "insert into admin (nomAdmin,mailAdmin,pwdAdmin) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, a.getNomAdmin());
            ps.setString(2, a.getMailAdmin());
            ps.setString(3,a.getPwdAdmin() );
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateAdmin(Admin a){
        String requete = "update admin  set nomAdmin=? ,mailAdmin=? ,pwdAdmin=? where idAdmin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, a.getNomAdmin());
            ps.setString(2, a.getMailAdmin());
             ps.setString(3,a.getPwdAdmin() );
            ps.setInt(4,a.getIdAdmin());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteAdmin(int id){
        String requete = "delete from admin where idAdmin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public Admin findAdminById(int id){
    Admin admin =new Admin();
     String requete = "select * from admin where idAdmin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setIdAdmin(resultat.getInt(1));
                admin.setNomAdmin(resultat.getString(2));
                admin.setMailAdmin(resultat.getString(3));
                admin.setPwdAdmin(resultat.getString(4));

            }
            return admin;

        } catch (SQLException ex) {
         
            
            return null;
        }
    }
    
    
       public Admin findAdminByName(String name){
    Admin admin =new Admin();
     String requete = "select * from admin where nomAdmin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, name);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setIdAdmin(resultat.getInt(1));
                admin.setNomAdmin(resultat.getString(2));
                admin.setMailAdmin(resultat.getString(3));
                admin.setPwdAdmin(resultat.getString(4));

            }
            return admin;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'admin "+ex.getMessage());
            return null;
        }
    }

       
       
         public Admin findAdminByEmail(String email){
    Admin admin =new Admin();
     String requete = "select * from admin where mailAdmin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, email);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setIdAdmin(resultat.getInt(1));
                admin.setNomAdmin(resultat.getString(2));
                admin.setMailAdmin(resultat.getString(3));
                admin.setPwdAdmin(resultat.getString(4));

            }
            return admin;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'admin "+ex.getMessage());
            return null;
        }
    }
       
       
       
         public boolean connectAdmin(String login,String pwd)
    {
        
          String requete = "select * from admin where  mailAdmin=? and pwdAdmin=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, login);
            
            ps.setString(2, pwd);
            ResultSet resultat = ps.executeQuery();
          if (resultat.next())
              return true;
     
        }
        catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
return false;
}
       
       
 
    public List<Admin> DisplayAllAdmins (){


        List<Admin> listeadmins = new ArrayList<Admin>();

        String requete = "select * from admin";
        try {
           Statement statement = MyConnection.getInstance().cnx
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Admin admin=new Admin();
               admin.setIdAdmin(resultat.getInt(1));
                admin.setNomAdmin(resultat.getString(2));
                admin.setMailAdmin(resultat.getString(3));
                admin.setPwdAdmin(resultat.getString(4));

                listeadmins.add(admin);
            }
            return listeadmins;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage()); 
            return null;
        }
    }
    
  
    
    
    

    
}
