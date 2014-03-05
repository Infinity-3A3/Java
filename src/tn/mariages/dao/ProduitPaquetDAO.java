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
import tn.mariages.entities.PanierPaquet;
import tn.mariages.entities.Paquet;
import tn.mariages.entities.ProduitPaquet;
import tn.mariages.util.MyConnection;

/**
 *
 * @author khaled
 */
public class ProduitPaquetDAO {
    
    public Boolean insertProduitPaquet(ProduitPaquet p){

        String requete = "insert into produitpaquet (idProd,idPaquet,dateAjout) values (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, p.getIdProd());
            ps.setInt(2, p.getIdPaquet());
            ps.setString(3, p.getDateAjout());
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            return true;
        } catch (SQLException ex) {
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
            return false;
        }
    }
    
    public void deleteProduitPaquet(int idProd,int idPaquet){
        String requete = "delete from ProduitPaquet where idProd=? and idPaquet=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, idProd);
            ps.setInt(2, idPaquet);
            ps.executeUpdate();
            System.out.println(" suppression effectuée avec succés");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
    
    
    public List<ProduitPaquet> DisplayAllProduitsPaquets (){


        List<ProduitPaquet> listePaquets = new ArrayList<ProduitPaquet>();

        String requete = "select * from produitpaquet";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                ProduitPaquet p =new ProduitPaquet();
                p.setIdProd(resultat.getInt(1));
                p.setIdPaquet(resultat.getInt(2));
                p.setDateAjout(resultat.getString(3));
                

                listePaquets.add(p);
            }
            return listePaquets;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
    
    public List<ProduitPaquet> DisplayAllProduitsbyPaquet (int id){


        List<ProduitPaquet> listePaquets = new ArrayList<ProduitPaquet>();

        String requete = "select * from produitpaquet where idPaquet= "+id+";";
        try {
           Statement statement = MyConnection.getInstance()
                  .cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
                ProduitPaquet p =new ProduitPaquet();
                p.setIdProd(resultat.getInt(1));
                p.setIdPaquet(resultat.getInt(2));
                p.setDateAjout(resultat.getString(3));
                

                listePaquets.add(p);
            }
            return listePaquets;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des paquets "+ex.getMessage());
            return null;
        }
    }
    
    
    
}
