/*
 * Copyright (C) 2014 omar
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

import tn.mariages.entities.Commentaire;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tn.mariages.util.MyConnection;

/**
 *
 * @author omar
 */
public class CommentaireDAO {
    
  public void insertCommentaire(Commentaire c) {
        try {
            String requete="insert into commentaire (idClient,idProd,dateCom,texteCom) values (?,?,?,?)";
            
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, c.getIdClient());
            ps.setInt(2, c.getIdProd());
            ps.setString(3, c.getDateCom());
            ps.setString(4, c.getTexteCom());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succées");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("pff");
        }
    }
        
  public void updateCommentaire(Commentaire c){
        try {
            String requete="update commentaire set idClient=?,idProd=?,dateCom=?,texteCom=? ";
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, c.getIdClient());
            ps.setInt(2, c.getIdProd());
            ps.setString(3, c.getDateCom());
            ps.setString(4, c.getTexteCom());
            ps.executeUpdate();
            System.out.println("mise à jour effectué avecc succees");
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
            
  public void deleteCommentaire(Commentaire c){
                    String requete = "delete from commenataire where idClient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.setInt(2, id2);
            ps.executeUpdate();
            System.out.println("Commentaire supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }

        }
        
  public List<Commentaire> DisplayAllCommentaires (){
        
        List<Commentaire> listeCommentaire= new ArrayList<>();

        String requete = "select * from commentaire";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);
        while(resultat.next()){
            Commentaire commentaire=new Commentaire();
            commentaire.setIdClient(resultat.getInt(1));
            commentaire.setIdProd(resultat.getInt(2));
            commentaire.setDateCom(resultat.getString(3));
            commentaire.setTexteCom(resultat.getString(4));
            

                   listeCommentaire.add(commentaire);
                   System.out.println(commentaire.getTexteCom()+" "+commentaire.getDateCom());
        }
        
                     return listeCommentaire;
                    
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}
        
        
}
        
  public List<Commentaire> DisplayAllCommentairesbyIdProd (int id){
        
        List<Commentaire> listeCommentaire= new ArrayList<>();

        String requete = "select * from commentaire where idProd="+id+"";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);
        while(resultat.next()){
            Commentaire commentaire=new Commentaire();
            commentaire.setIdClient(resultat.getInt(1));
            commentaire.setIdProd(resultat.getInt(2));
            commentaire.setDateCom(resultat.getString(3));
            commentaire.setTexteCom(resultat.getString(4));
            

                   listeCommentaire.add(commentaire);
                   System.out.println(commentaire.getTexteCom()+" "+commentaire.getDateCom());
        }
        
                     return listeCommentaire;
                    
        }
        catch (SQLException ex) {
    System.out.println("erreur lors du chargement des depots "+ex.getMessage());
    return null;
            }
        
        
}

  public HashMap<Integer, Integer> getTop10Coms(){
      
        HashMap<Integer, Integer> topComs = new HashMap<Integer, Integer>();
String requete = "SELECT `idProd` , count(`idProd`) FROM `commentaire` group by `idProd`";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);
        
            int i =0;
            while(resultat.next() && i<10){
             topComs.put(resultat.getInt(1), resultat.getInt(2));
            i++;
            }
       return topComs;
                   }
        catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
        return null;
            }
       }

}

 


    
    }
  
}
