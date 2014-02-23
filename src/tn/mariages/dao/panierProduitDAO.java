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
import java.sql.SQLException;
import tn.mariages.entities.PanierProduit;
import tn.mariages.entities.Produit;
import tn.mariages.util.MyConnection;

/**
 *
 * @author Youssef
 */
public class panierProduitDAO {

    public void insertPanierProduit(PanierProduit p) {

        String req = "insert into produit values (?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(req);
            ps.setInt(1, p.getIdProd());
            ps.setInt(2, p.getIdClient());
            ps.setDate(3, p.getDateAjout());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }

    public void deletePanierProduit(int idclient) {
        String req = "delete from panierproduit where idclient=?";
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
         

    public void updatePanierProduit(PanierProduit p ) {
        String requete = "update panierproduit set date_panierProd=? where idclient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }

    }

}
