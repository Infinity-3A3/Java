/*
 * Copyright (C) 2014 RAED
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
import tn.mariages.entities.Produit;
import tn.mariages.util.MyConnection;

/**
 *
 * @author RAED
 */
public class ProduitDAO {

    public void InsertProduit(Produit p) {

        String requete = "INSERT INTO `produit`(`idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, `dateAjoutProd`, `prixProd`, `exclusifPaquet`,"
                + " `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`) VALUES"
                + " (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, p.getIdPrest());
            ps.setString(2, p.getNomProd());
            ps.setString(3, p.getDescProd());
            ps.setString(4, p.getShortDescProd());
            ps.setString(5, p.getCategorieProd());
            ps.setString(6, p.getDateAjoutProd());
            ps.setDouble(7, p.getPrixProd());
            ps.setBoolean(8, p.isExclusifPaquet());
            ps.setString(9, p.getImgProd_P());
            ps.setString(10, p.getImgProd_1());
            ps.setString(11, p.getImgProd_2());
            ps.setString(12, p.getImgProd_3());
            ps.setString(13, p.getImgProd_4());
            ps.executeUpdate();
            System.out.println("Ajout Produit effectuée avec succées");

        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }

    public List<Produit> DisplayAllProd() {

        List<Produit> listeProd = new ArrayList<Produit>();

        String requete = "select * from Produit";

        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                Produit p = new Produit();

                /*SELECT `idProd`, `idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, 
                 `dateAjoutProd`, `prixProd`, `exclusifPaquet`, `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`
                 */
                p.setIdProd(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomProd(resultat.getString(3));
                p.setDescProd(resultat.getString(4));
                p.setShortDescProd(resultat.getString(5));
                p.setCategorieProd(resultat.getString(6));
                p.setDateAjoutProd(resultat.getString(7));
                p.setPrixProd(resultat.getDouble(8));
                p.setExclusifPaquet(resultat.getBoolean(9));
                p.setImgProd_P(resultat.getString(10));
                p.setImgProd_1(resultat.getString(11));
                p.setImgProd_2(resultat.getString(12));
                p.setImgProd_3(resultat.getString(13));
                p.setImgProd_4(resultat.getString(14));

                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }

    }

    public void UpdateProd(Produit p) {

        String requete = "UPDATE `produit` SET `nomProd`=?,`descProd`=?,`shortDescProd`=?,"
                + "       `categorieProd`=?,`dateAjoutProd`=?,`prixProd`=?,`exclusifPaquet`=?,"
                + "       `imgProd_P`=?,`imgProd_1`=?,`imgProd_2`=?,`imgProd_3`=?,`imgProd_4`=? ;";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);

            ps.setString(1, p.getNomProd());
            ps.setString(2, p.getDescProd());
            ps.setString(3, p.getShortDescProd());
            ps.setString(4, p.getCategorieProd());
            ps.setString(5, p.getDateAjoutProd());
            ps.setDouble(6, p.getPrixProd());
            ps.setBoolean(7, p.isExclusifPaquet());
            ps.setString(8, p.getImgProd_P());
            ps.setString(9, p.getImgProd_1());
            ps.setString(10, p.getImgProd_2());
            ps.setString(11, p.getImgProd_3());
            ps.setString(12, p.getImgProd_4());

            ps.executeUpdate();
            System.out.println("mise à jour effectué avecc succees");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
    }

    public List<Produit> DisplayProdByPrest(int id) {

        List<Produit> listeProd = new ArrayList<Produit>();

        String requete = "select * from Produit where idPrest = " + id;

        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                Produit p = new Produit();

                /*SELECT `idProd`, `idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, 
                 `dateAjoutProd`, `prixProd`, `exclusifPaquet`, `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`
                 */
                p.setIdProd(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomProd(resultat.getString(3));
                p.setDescProd(resultat.getString(4));
                p.setShortDescProd(resultat.getString(5));
                p.setCategorieProd(resultat.getString(6));
                p.setDateAjoutProd(resultat.getString(7));
                p.setPrixProd(resultat.getDouble(8));
                p.setExclusifPaquet(resultat.getBoolean(9));
                p.setImgProd_P(resultat.getString(10));
                p.setImgProd_1(resultat.getString(11));
                p.setImgProd_2(resultat.getString(12));
                p.setImgProd_3(resultat.getString(13));
                p.setImgProd_4(resultat.getString(14));

                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }

    }
    
    public List<Produit> DisplayProdByPrestByNom(int id,String s) {

        List<Produit> listeProd = new ArrayList<Produit>();

        String requete = "select * from Produit where idPrest = " + id+" and nomProd like '"+s+"%';" ;

        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                Produit p = new Produit();

                /*SELECT `idProd`, `idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, 
                 `dateAjoutProd`, `prixProd`, `exclusifPaquet`, `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`
                 */
                p.setIdProd(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomProd(resultat.getString(3));
                p.setDescProd(resultat.getString(4));
                p.setShortDescProd(resultat.getString(5));
                p.setCategorieProd(resultat.getString(6));
                p.setDateAjoutProd(resultat.getString(7));
                p.setPrixProd(resultat.getDouble(8));
                p.setExclusifPaquet(resultat.getBoolean(9));
                p.setImgProd_P(resultat.getString(10));
                p.setImgProd_1(resultat.getString(11));
                p.setImgProd_2(resultat.getString(12));
                p.setImgProd_3(resultat.getString(13));
                p.setImgProd_4(resultat.getString(14));

                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }

    }

    public List<Produit> DisplayProdByCategorie(String s) {

        List<Produit> listeProd = new ArrayList<Produit>();

        String requete = "select * from produit where categorieProd = ?";

        
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, s);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {

                Produit p = new Produit();

                /*SELECT `idProd`, `idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, 
                 `dateAjoutProd`, `prixProd`, `exclusifPaquet`, `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`
                 */
                p.setIdProd(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomProd(resultat.getString(3));
                p.setDescProd(resultat.getString(4));
                p.setShortDescProd(resultat.getString(5));
                p.setCategorieProd(resultat.getString(6));
                p.setDateAjoutProd(resultat.getString(7));
                p.setPrixProd(resultat.getDouble(8));
                p.setExclusifPaquet(resultat.getBoolean(9));
                p.setImgProd_P(resultat.getString(10));
                p.setImgProd_1(resultat.getString(11));
                p.setImgProd_2(resultat.getString(12));
                p.setImgProd_3(resultat.getString(13));
                p.setImgProd_4(resultat.getString(14));

                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }

    }
    public List<Produit> DisplayProdByCategorieAndPrest(String s,int id) {

        List<Produit> listeProd = new ArrayList<Produit>();

        String requete = "select * from produit where categorieProd = ? and Idprest= ?";

        
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, s);
            ps.setInt(2, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next()) {

                Produit p = new Produit();

                /*SELECT `idProd`, `idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, 
                 `dateAjoutProd`, `prixProd`, `exclusifPaquet`, `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`
                 */
                p.setIdProd(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomProd(resultat.getString(3));
                p.setDescProd(resultat.getString(4));
                p.setShortDescProd(resultat.getString(5));
                p.setCategorieProd(resultat.getString(6));
                p.setDateAjoutProd(resultat.getString(7));
                p.setPrixProd(resultat.getDouble(8));
                p.setExclusifPaquet(resultat.getBoolean(9));
                p.setImgProd_P(resultat.getString(10));
                p.setImgProd_1(resultat.getString(11));
                p.setImgProd_2(resultat.getString(12));
                p.setImgProd_3(resultat.getString(13));
                p.setImgProd_4(resultat.getString(14));

                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }

    }

    public void DeleteProd(int id) {
        String requete = "delete from Produit where idProd=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Produit supprimée");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression " + ex.getMessage());
        }

    }
   

 public Produit DisplayProdByID (int id){
        
Produit p = new Produit();
p.setIdProd(-1); // si il y'a pas de prod id = -1
        String requete = "select * from Produit where idProd = "+id;
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);

            while(resultat.next()){
            
                
                /*SELECT `idProd`, `idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, 
                `dateAjoutProd`, `prixProd`, `exclusifPaquet`, `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`
                */
                p.setIdProd(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomProd(resultat.getString(3));
                p.setDescProd(resultat.getString(4));
                p.setShortDescProd(resultat.getString(5));
                p.setCategorieProd(resultat.getString(6));
                p.setDateAjoutProd(resultat.getString(7));
                p.setPrixProd(resultat.getDouble(8));
                p.setExclusifPaquet(resultat.getBoolean(9));
                p.setImgProd_P(resultat.getString(10));
                p.setImgProd_1(resultat.getString(11));
                p.setImgProd_2(resultat.getString(12));
                p.setImgProd_3(resultat.getString(13));
                p.setImgProd_4(resultat.getString(14));
                
        }
        
                     return p;
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}
      
    }

 
 
 public List<Produit> DisplayAllProdIfPremium (){
        
        List<Produit> listeProd = new ArrayList<Produit>();

        String requete = "SELECT * FROM `produit` WHERE `idPrest` = (select `idPrest` FROM `prestataire` WHERE `premium` = true)";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);

            
            
            while(resultat.next()){
            
                Produit p = new Produit();
                
                /*SELECT `idProd`, `idPrest`, `nomProd`, `descProd`, `shortDescProd`, `categorieProd`, 
                `dateAjoutProd`, `prixProd`, `exclusifPaquet`, `imgProd_P`, `imgProd_1`, `imgProd_2`, `imgProd_3`, `imgProd_4`
                */
                p.setIdProd(resultat.getInt(1));
                p.setIdPrest(resultat.getInt(2));
                p.setNomProd(resultat.getString(3));
                p.setDescProd(resultat.getString(4));
                p.setShortDescProd(resultat.getString(5));
                p.setCategorieProd(resultat.getString(6));
                p.setDateAjoutProd(resultat.getString(7));
                p.setPrixProd(resultat.getDouble(8));
                p.setExclusifPaquet(resultat.getBoolean(9));
                p.setImgProd_P(resultat.getString(10));
                p.setImgProd_1(resultat.getString(11));
                p.setImgProd_2(resultat.getString(12));
                p.setImgProd_3(resultat.getString(13));
                p.setImgProd_4(resultat.getString(14));
                
               listeProd.add(p);
        }
        
                     return listeProd;
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}
      
    }
 
   public String DisplayNameProd(int id){
        
       String requete = "select nomProd from Produit where idProd ="+id+""; 
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);
            String s = null;
            resultat.next();
            
                
                s = resultat.getString(1);
            
            return s;
            
            
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;
}
        
        
}

 
}
