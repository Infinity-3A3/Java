/*
 * Copyright (C) 2014 cyrine
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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tn.mariages.entities.Client;
import tn.mariages.entities.Prestataire;
import tn.mariages.util.MyConnection;

/**
 *
 * @author cyrine
 */
public class PrestataireDAO {
    
     public void insertPrestataire(Prestataire p){
        
        String requete="insert into prestataire (nomPrest,descPrest,adrPrest,villePrest,imgPrest,telMobilePrest,telFixePrest,emailPrest,pwdPrest,categorie,specialite,mailValide,compteValide,premium,datePayement) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, p.getNomPrest());
            ps.setString(2, p.getDescPrest());
            ps.setString(3,p.getAdrPrest());
            ps.setString(4, p.getVillePrest());
            ps.setString(5, p.getImgPrest());
            ps.setString(6, p.getTelMobilePrest());
            ps.setString(7, p.getTelFixePrest());
            ps.setString(8, p.getEmailPrest());
            ps.setString(9, p.getPwdPrest());
            ps.setString(10, p.getCategorie());
            ps.setString(11, p.getSpecialite());
            ps.setBoolean(12, p.isMailValide());
            ps.setBoolean(13, p.isCompteValide());
            ps.setBoolean(14, p.isPremium());
            ps.setString(15, p.getDatePayement());
            
          
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succées");
            
            
            
        } catch (SQLException ex) {
              System.out.println("erreur lors de l'insertion "+ex.getMessage());        }
    
    }
     public void  updatePrestataire(Prestataire p ){
        
        String requete="update prestataire  set nomPrest=?,descPrest=?,adrPrest=?,villePrest=?,imgPrest=?,telMobilePrest=?,telFixePrest=?,emailPrest=?,pwdPrest=?,categorie=?,specialite=?,mailValide=?,compteValide=?,premium=?,datePayement=? where idPrest=?  ";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, p.getNomPrest());
            ps.setString(2, p.getDescPrest());
            ps.setString(3,p.getAdrPrest());
            ps.setString(4, p.getVillePrest());
            ps.setString(5, p.getImgPrest());
            ps.setString(6, p.getTelMobilePrest());
            ps.setString(7, p.getTelFixePrest());
            ps.setString(8, p.getEmailPrest());
            ps.setString(9, p.getPwdPrest());
            ps.setString(10, p.getCategorie());
            ps.setString(11, p.getSpecialite());
            ps.setBoolean(12, p.isMailValide());
            ps.setBoolean(13, p.isCompteValide());
            ps.setBoolean(14, p.isPremium());
            ps.setString(15, p.getDatePayement());
            ps.setInt(16, p.getIdPrest());
            
            ps.executeUpdate();
            System.out.println("mise à jour effectué avecc succees");
        } catch (SQLException ex) {
               System.out.println("erreur lors de la mise à jour "+ex.getMessage());      
        }
          
        
    
    
    }
    
    public void  deletePrest (Prestataire p){
        String requete = "delete from prestataire where idPrest=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, p.getIdPrest());
            ps.executeUpdate();
            System.out.println("Prestataire supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
       
        
    }
    public Prestataire findPrestById(int id){
        Prestataire prestataire=new Prestataire();
        String requete="select * from prestataire where idPrest=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat=ps.executeQuery();
            while(resultat.next()){
              
                prestataire.setIdPrest(resultat.getInt(1));
                 prestataire.setNomPrest(resultat.getString(2));
                prestataire.setDescPrest(resultat.getString(3));
                 prestataire.setAdrPrest(resultat.getString(4));
                  prestataire.setVillePrest(resultat.getString(5));
                 prestataire.setImgPrest(resultat.getString(6));
                  prestataire.setTelMobilePrest(resultat.getString(7));
                  prestataire.setTelFixePrest(resultat.getString(8));
                  prestataire.setEmailPrest(resultat.getString(9));
                  prestataire.setPwdPrest(resultat.getString(10));
                   prestataire.setCategorie(resultat.getString(11));
                   prestataire.setSpecialite(resultat.getString(12));
                   prestataire.setMailValide(resultat.getBoolean(13));
                    prestataire.setCompteValide(resultat.getBoolean(14));
                    prestataire.setPremium(resultat.getBoolean(15));
                    prestataire.setDatePayement(resultat.getString(16));

            }
            return prestataire;

            
        } catch (SQLException ex) {
System.out.println("erreur lors de la recherche du prestataire "+ex.getMessage());
      return null;        }
        
        
        
        
    }
    
    public Prestataire findPrestByNomPrest(String NomPrest){
        
        Prestataire prestataire=new Prestataire();
        String requete="select * from prestataire where nomPrest=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, NomPrest);
            ResultSet resultat=ps.executeQuery();
            while (resultat.next())
            {
                prestataire.setIdPrest(resultat.getInt(1));
                 prestataire.setNomPrest(resultat.getString(2));
                prestataire.setDescPrest(resultat.getString(3));
                 prestataire.setAdrPrest(resultat.getString(4));
                  prestataire.setVillePrest(resultat.getString(5));
                 prestataire.setImgPrest(resultat.getString(6));
                  prestataire.setTelMobilePrest(resultat.getString(7));
                  prestataire.setTelFixePrest(resultat.getString(8));
                  prestataire.setEmailPrest(resultat.getString(9));
                  prestataire.setPwdPrest(resultat.getString(10));
                   prestataire.setCategorie(resultat.getString(11));
                   prestataire.setSpecialite(resultat.getString(12));
                   prestataire.setMailValide(resultat.getBoolean(13));
                    prestataire.setCompteValide(resultat.getBoolean(14));
                    prestataire.setPremium(resultat.getBoolean(15));
                    prestataire.setDatePayement(resultat.getString(16));
            }
            return prestataire;
            
            
        } catch (SQLException ex) {
               System.out.println("erreur lors de la recherche du prest "+ex.getMessage());
               return null; 
        }
        
         
         
         
     }
    
    public Prestataire findPrestByVillePrest(String VillePrest){
        
        Prestataire prestataire=new Prestataire();
        String requete="select * from prestataire where villePrest=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, VillePrest);
            ResultSet resultat=ps.executeQuery();
            while (resultat.next())
            {
                prestataire.setIdPrest(resultat.getInt(1));
                 prestataire.setNomPrest(resultat.getString(2));
                prestataire.setDescPrest(resultat.getString(3));
                 prestataire.setAdrPrest(resultat.getString(4));
                  prestataire.setVillePrest(resultat.getString(5));
                 prestataire.setImgPrest(resultat.getString(6));
                  prestataire.setTelMobilePrest(resultat.getString(7));
                  prestataire.setTelFixePrest(resultat.getString(8));
                  prestataire.setEmailPrest(resultat.getString(9));
                  prestataire.setPwdPrest(resultat.getString(10));
                   prestataire.setCategorie(resultat.getString(11));
                   prestataire.setSpecialite(resultat.getString(12));
                   prestataire.setMailValide(resultat.getBoolean(13));
                    prestataire.setCompteValide(resultat.getBoolean(14));
                    prestataire.setPremium(resultat.getBoolean(15));
                    prestataire.setDatePayement(resultat.getString(16));
            }
            return prestataire;
            
            
        } catch (SQLException ex) {
               System.out.println("erreur lors de la recherche du prest "+ex.getMessage());
               return null; 
        }
        
         
         
         
     }
    public Prestataire findPrestByCategoriePrest(String Categorie){
        
        Prestataire prestataire=new Prestataire();
        String requete="select * from prestataire where categorie=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, Categorie);
            ResultSet resultat=ps.executeQuery();
            while (resultat.next())
            {
                prestataire.setIdPrest(resultat.getInt(1));
                 prestataire.setNomPrest(resultat.getString(2));
                prestataire.setDescPrest(resultat.getString(3));
                 prestataire.setAdrPrest(resultat.getString(4));
                  prestataire.setVillePrest(resultat.getString(5));
                 prestataire.setImgPrest(resultat.getString(6));
                  prestataire.setTelMobilePrest(resultat.getString(7));
                  prestataire.setTelFixePrest(resultat.getString(8));
                  prestataire.setEmailPrest(resultat.getString(9));
                  prestataire.setPwdPrest(resultat.getString(10));
                   prestataire.setCategorie(resultat.getString(11));
                   prestataire.setSpecialite(resultat.getString(12));
                   prestataire.setMailValide(resultat.getBoolean(13));
                    prestataire.setCompteValide(resultat.getBoolean(14));
                    prestataire.setPremium(resultat.getBoolean(15));
                    prestataire.setDatePayement(resultat.getString(16));
            }
            return prestataire;
            
            
        } catch (SQLException ex) {
               System.out.println("erreur lors de la recherche du prest "+ex.getMessage());
               return null; 
        }
        
         
         
         
     }
    
    public Prestataire findPrestBySpecialitePrest(String NomPrest){
        
        Prestataire prestataire=new Prestataire();
        String requete="select * from prestataire where specialite=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, NomPrest);
            ResultSet resultat=ps.executeQuery();
            while (resultat.next())
            {
                prestataire.setIdPrest(resultat.getInt(1));
                 prestataire.setNomPrest(resultat.getString(2));
                prestataire.setDescPrest(resultat.getString(3));
                 prestataire.setAdrPrest(resultat.getString(4));
                  prestataire.setVillePrest(resultat.getString(5));
                 prestataire.setImgPrest(resultat.getString(6));
                  prestataire.setTelMobilePrest(resultat.getString(7));
                  prestataire.setTelFixePrest(resultat.getString(8));
                  prestataire.setEmailPrest(resultat.getString(9));
                  prestataire.setPwdPrest(resultat.getString(10));
                   prestataire.setCategorie(resultat.getString(11));
                   prestataire.setSpecialite(resultat.getString(12));
                   prestataire.setMailValide(resultat.getBoolean(13));
                    prestataire.setCompteValide(resultat.getBoolean(14));
                    prestataire.setPremium(resultat.getBoolean(15));
                    prestataire.setDatePayement(resultat.getString(16));
            }
            return prestataire;
            
            
        } catch (SQLException ex) {
               System.out.println("erreur lors de la recherche du prest "+ex.getMessage());
               return null; 
        }
        
         
         
         
     }
    
    public List<Prestataire> DisplayAllPrestataire (){
        
        List<Prestataire> listePrestataires = new ArrayList<Prestataire>();

        String requete = "select * from prestataire";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);
        while(resultat.next()){
           
            
            Prestataire prest=new Prestataire();
            prest.setIdPrest(resultat.getInt(1));
                 prest.setNomPrest(resultat.getString(2));
                prest.setDescPrest(resultat.getString(3));
                 prest.setAdrPrest(resultat.getString(4));
                  prest.setImgPrest(resultat.getString(5));
                 prest.setTelMobilePrest(resultat.getString(6));
                  prest.setTelFixePrest(resultat.getString(7));
                  prest.setEmailPrest(resultat.getString(8));
                  prest.setPwdPrest(resultat.getString(9));
                  prest.setCategorie(resultat.getString(10));
                   prest.setSpecialite(resultat.getString(11));
                   prest.setMailValide(resultat.getBoolean(12));
                   prest.setCompteValide(resultat.getBoolean(13));
                   prest.setPremium(resultat.getBoolean(13));
                   prest.setDatePayement(resultat.getString(13));
                   listePrestataires.add(prest);
        }
        
                     return listePrestataires;
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}}
    
   
  
    
    
    
}
