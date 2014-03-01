/*
 * Copyright (C) 2014 Youssef
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
import tn.mariages.util.MyConnection;

/**
 *
 * @author Youssef
 */
public class panierPaquetDAO {

        public void insertPanierPaquet(PanierPaquet p) {

        String req = "INSERT INTO `panierpaquet`(`idClient`, `idPaquet`, `dateAjout`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(req);
            ps.setInt(1, p.getIdClient());
            ps.setInt(2, p.getIdPaquet());
            ps.setString(3, p.getDateAjout());
            ps.executeUpdate();
            System.out.println("Ajout Paquet au panier effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }

        public void deletePanierAlLPaquetByClient(int idclient) {
        String req = "delete from panierpaquet where idclient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(req);
            ps.setInt(1, idclient);
            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de le la suppression  " + ex.getMessage());
        }
    }
    
        public void deletePaniePaquet(int idclient,int idpaquet) {
        String req = "delete from panierpaquet where idclient= ? and idPaquet = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(req);
            ps.setInt(1, idclient);
            ps.setInt(2, idpaquet);

            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de le la suppression  " + ex.getMessage());
        }
    }

        public List<PanierPaquet> DisplayAllPanierPaquet(){
        
        List<PanierPaquet> listeProd = new ArrayList<PanierPaquet>();

        String requete = "SELECT `idClient`, `idPaquet`, `dateAjout` FROM `panierpaquet`";

        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                   PanierPaquet p = new PanierPaquet(resultat.getInt(1), resultat.getInt(2), resultat.getString(3));
                
                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }
    }

       public List<PanierPaquet> DisplayPanierPaquetByClient(int id_client){
        
        List<PanierPaquet> listeProd = new ArrayList<PanierPaquet>();

        String requete = "SELECT `idClient`, `idPaquet`, `dateAjout` FROM `panierpaquet` where  idClient="+id_client;

        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                   PanierPaquet p = new PanierPaquet(resultat.getInt(1), resultat.getInt(2), resultat.getString(3));
                
                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }
    }

       public static void main(String[] args) {
      //  PanierPaquet pp = new PanierPaquet(1, 1, "2004/06/01");
      panierPaquetDAO ppDAO = new panierPaquetDAO();
            //  ppDAO.insertPanierPaquet(pp);
            List<PanierPaquet> DisplayPanierPaquetByClient = ppDAO.DisplayPanierPaquetByClient(1);
           for (int i = 0; i < DisplayPanierPaquetByClient.size(); i++) {
               PanierPaquet panierPaquet = DisplayPanierPaquetByClient.get(i);
               System.out.println(panierPaquet.getIdClient()+" "+panierPaquet.getIdPaquet()+" "+panierPaquet.getDateAjout());
           }
       
       //ppDAO.deletePaniePaquet(1, 1);
       
       }
       
}
