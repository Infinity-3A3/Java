/*
 * Copyright (C) 2014 khaled
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
import tn.mariages.entities.Paquet;
import tn.mariages.util.MyConnection;

/**
 *
 * @author khaled
 */
public class PaquetDAO {
    public void insertPaquet(Paquet p){

        String requete = "insert into paquet (idPrest,nomPaquet,descPaquet,shortDescPaquet,imgPaquet,prixPaquet) values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, p.getIdPrest());
            ps.setString(2, p.getNomPaquet());
            ps.setString(3, p.getDescPaquet());
            ps.setString(4, p.getShortDescPaquet());
            ps.setString(5, p.getImgPaquet());
            ps.setDouble(6, p.getPrixPaquet());
            
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }
    
    
    public void updatePaquet(Paquet p){
        String requete = "update paquet set idPrest=?,nomPaquet=?,descPaquet=?,shortDescPaquet=?,imgPaquet=?,prixPaquet=? where idPaquet=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, p.getIdPrest());
            ps.setString(2, p.getNomPaquet());
            ps.setString(3, p.getDescPaquet());
            ps.setString(4, p.getShortDescPaquet());
            ps.setString(5, p.getImgPaquet());
            ps.setDouble(6, p.getPrixPaquet());
            ps.setInt(7, p.getIdPaquet());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
    
    public void deletePaquet(int id){
        String requete = "delete from paquet where idPaquet=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println(" suppression effectuée avec succés");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    public List<Paquet> DisplayAllPaquets (){


        List<Paquet> listePaquets = new ArrayList<Paquet>();

        String requete = "select * from paquet";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Paquet p =new Paquet();
                p.setIdPaquet(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomPaquet(resultat.getString(3));
                p.setDescPaquet(resultat.getString(4));
                p.setShortDescPaquet(resultat.getString(5));
                p.setImgPaquet(resultat.getString(6));
                p.setPrixPaquet(resultat.getDouble(7));

                listePaquets.add(p);
            }
            return listePaquets;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
    
    
    public List<Paquet> FindPaquetsByPrix (int prixMax,int prixMin){


        List<Paquet> listePaquets = new ArrayList<Paquet>();

        String requete = "select * from paquet where prixPaquet  < "+prixMax+" and prixPaquet > "+prixMin+" ;";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                Paquet p =new Paquet();
                p.setIdPaquet(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomPaquet(resultat.getString(3));
                p.setDescPaquet(resultat.getString(4));
                p.setShortDescPaquet(resultat.getString(5));
                p.setImgPaquet(resultat.getString(6));
                p.setPrixPaquet(resultat.getDouble(7));

                listePaquets.add(p);
            }
            return listePaquets;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
    
    
    public Paquet FindPaquetById (int id){


        

        String requete = "select * from paquet where idPaquet="+id+" ;";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Paquet p =new Paquet();
            while(resultat.next()){
                
                p.setIdPaquet(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomPaquet(resultat.getString(3));
                p.setDescPaquet(resultat.getString(4));
                p.setShortDescPaquet(resultat.getString(5));
                p.setImgPaquet(resultat.getString(6));
                p.setPrixPaquet(resultat.getDouble(7));

                
            }
            return p;
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
     public List<Paquet> FindPaquetByPrest (int id){

 List<Paquet> listePaquets = new ArrayList<Paquet>();
        

        String requete = "select * from paquet where idPrest="+id+" ;";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            
            while(resultat.next()){
                Paquet p =new Paquet();
                p.setIdPaquet(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomPaquet(resultat.getString(3));
                p.setDescPaquet(resultat.getString(4));
                p.setShortDescPaquet(resultat.getString(5));
                p.setImgPaquet(resultat.getString(6));
                p.setPrixPaquet(resultat.getDouble(7));

                   listePaquets.add(p);
            }
            return listePaquets;
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
    public Paquet FindPaquetByNom (String s){


        

        String requete = "select * from paquet where NomPaquet like '"+s+"%' ;";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Paquet p =new Paquet();
            while(resultat.next()){
                
                p.setIdPaquet(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomPaquet(resultat.getString(3));
                p.setDescPaquet(resultat.getString(4));
                p.setShortDescPaquet(resultat.getString(5));
                p.setImgPaquet(resultat.getString(6));
                p.setPrixPaquet(resultat.getDouble(7));

                
            }
            return p;
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
    public List<Paquet> DisplayPaquetPrestByNom (String s){


        List<Paquet> listePaquets = new ArrayList<Paquet>();

        String requete = "select * from paquet where  NomPaquet like '"+s+"%' ;";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Paquet p =new Paquet();
            while(resultat.next()){
                
                p.setIdPaquet(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomPaquet(resultat.getString(3));
                p.setDescPaquet(resultat.getString(4));
                p.setShortDescPaquet(resultat.getString(5));
                p.setImgPaquet(resultat.getString(6));
                p.setPrixPaquet(resultat.getDouble(7));

                listePaquets.add(p);
            }
            return listePaquets;
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
    
    public List<Paquet> FindPaquetPrestByNom (int id,String s){


        List<Paquet> listePaquets = new ArrayList<Paquet>();

        String requete = "select * from paquet where idprest="+id+" and NomPaquet like '"+s+"%' ;";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            Paquet p =new Paquet();
            while(resultat.next()){
                
                p.setIdPaquet(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomPaquet(resultat.getString(3));
                p.setDescPaquet(resultat.getString(4));
                p.setShortDescPaquet(resultat.getString(5));
                p.setImgPaquet(resultat.getString(6));
                p.setPrixPaquet(resultat.getDouble(7));

                listePaquets.add(p);
            }
            return listePaquets;
            
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
      
}

