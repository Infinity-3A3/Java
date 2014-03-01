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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import tn.mariages.entities.PanierProduit;
import tn.mariages.util.MyConnection;

/**
 *
 * @author Youssef
 */
public class panierProduitDAO {

    public void insertPanierProduit(PanierProduit p) {

        String req = "INSERT INTO `panierproduit`(`idClient`, `idProd`, `dateAjout`) VALUES (?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(req);
            ps.setInt(1, p.getIdClient());
            ps.setInt(2, p.getIdProd());
            ps.setString(3, p.getDateAjout());
            ps.executeUpdate();
            System.out.println("Ajout Produit au panier effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }

    }

    public void deletePanierAlLProduitByClient(int idclient) {
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
         

    public void deletePanierProduit(int idclient,int idprod) {
        String req = "delete from panierproduit where idclient= ? and idProd = ?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(req);
            ps.setInt(1, idclient);
            ps.setInt(2, idprod);

            ps.executeUpdate();
            System.out.println("Suppression effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de le la suppression  " + ex.getMessage());
        }
    }
         
    public void updateDatePanierProduit(PanierProduit p ) {
        String requete = "update panierproduit set date_panierProd=? where idclient=? and idProd =? ";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
 
            ps.setString(1, p.getDateAjout());
            ps.setInt(2, p.getIdClient());
            ps.setInt(3, p.getIdProd());

            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }

    }

    
    public List<PanierProduit> DisplayALLPanierProduit(){
        
        List<PanierProduit> listeProd = new ArrayList<PanierProduit>();

        String requete = "SELECT `idClient`, `idProd`, `dateAjout` FROM `panierproduit`";

        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                   PanierProduit p = new PanierProduit(resultat.getInt(1), resultat.getInt(2), resultat.getString(3));
                
                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }
    }
        
    public List<PanierProduit> DiplayPanierProduitByClient(int id_client){
        
        List<PanierProduit> listeProd = new ArrayList<PanierProduit>();

        String requete = "SELECT `idClient`, `idProd`, `dateAjout` FROM `panierproduit` where  idClient="+id_client;

        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while (resultat.next()) {

                   PanierProduit p = new PanierProduit(resultat.getInt(1), resultat.getInt(2), resultat.getString(3));
                
                listeProd.add(p);
            }

            return listeProd;
        } catch (SQLException ex) {
            System.out.println("erreur lors du chargement des depots " + ex.getMessage());
            return null;

        }
    }

    public int[] getSellsByMonth(){
        
    int[] ventes = new int[12];
        
        String requete = "SELECT count(`idClient`), extract(month from dateAjout) FROM `panierproduit` group by MONTH(`dateAjout`)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
        int i =0;
            while (resultat.next())
            {
                ventes[resultat.getInt(2)]=resultat.getInt(1);
            }
            return ventes;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
        
        
        
    }
    
    public HashMap<Integer, Integer> getTop10BestSeller(){
        
    
        HashMap<Integer, Integer> bestSeller = new HashMap<Integer, Integer>();
    
   String requete = "SELECT `idProd`, COUNT(`idProd`) FROM `panierproduit` group by `idProd` order by COUNT(`idProd`)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ResultSet resultat = ps.executeQuery();
      int i = 0;
            while (resultat.next() && i<10)
            {
                    bestSeller.put(resultat.getInt(1), resultat.getInt(2));
            i++;
            }
            return bestSeller;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
   }

    
    
    
    
    public static void main(String[] args) {
        
        panierProduitDAO pn = new panierProduitDAO();
       /* HashMap<Integer, Integer> bestSeller = pn.getTop10BestSeller();
        Iterator<Integer> i = bestSeller.keySet().iterator();

    while(i.hasNext()){
  Integer key = i.next();
  System.out.println("key: " + key + " value: " + bestSeller.get(key));*/
       
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        
        PanierProduit p = new PanierProduit(2, 1, ""+dateFormat.format(date));
        pn.insertPanierProduit(p);
        
               }
    
    
    }
    
