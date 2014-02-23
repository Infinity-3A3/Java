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
import tn.mariages.entities.FeaturedProd;
import tn.mariages.entities.Produit;
import tn.mariages.util.MyConnection;

/**
 *
 * @author RAED
 */
public class FeaturedProdDAO {
    
    public void InsertFeatProduit(FeaturedProd fp){
        
        String requete="INSERT INTO `featuredprod`(`dateFeat`, `widget`, `idProd`) VALUES (?,?,?,?)";
   
        try {
           
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
           
            ps.setString(1, fp.getDateFeat());
            ps.setString(2, fp.getWidget());
            ps.setInt(3, fp.getIdProd());
            
            ps.executeUpdate();
            System.out.println("Ajout FEATURE effectuée avec succées");
            
        } catch (SQLException ex) {
              System.out.println("erreur lors de l'insertion "+ex.getMessage());        }
    
    }

    public void  UpdateFeatProd(FeaturedProd p ){
        
        String requete="UPDATE `featuredprod` SET `widget`=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            
            ps.setString(1, p.getWidget());
            ps.executeUpdate();
            System.out.println("mise à jour effectué avecc succees");
        } catch (SQLException ex) {
               System.out.println("erreur lors de la mise à jour "+ex.getMessage());      
        }
     }

    public void  DeleteFeatProd (int id){
        String requete = "delete from client where idFeat=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Ft supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
       
        
    }
    
    
    
    public List<FeaturedProd> DisplayAllFeatProd (){
        
        List<FeaturedProd> listeFeatProd = new ArrayList<FeaturedProd>();

        String requete = "SELECT * FROM `featuredprod`";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);

            
            
            while(resultat.next()){

                
                FeaturedProd fp = new FeaturedProd();
                fp.setIdFeat(resultat.getInt(1));
                fp.setDateFeat(resultat.getString(2));
                fp.setWidget(resultat.getString(3));
                fp.setIdProd(resultat.getInt(4));
                /* `idFeat`, `dateFeat`, `widget`, `idProd`  */
               
              listeFeatProd.add(fp);
              
        }
        
                     return listeFeatProd;
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}
      
    }

    
    
        public FeaturedProd DisplayFeatProdByID (int id){
        
        FeaturedProd fp = new FeaturedProd();
        
            fp.setIdFeat(-1);
        
        String requete = "SELECT * FROM `featuredprod` where IdFeat = "+id;
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);

            
            
            while(resultat.next()){

                
                fp.setIdFeat(resultat.getInt(1));
                fp.setDateFeat(resultat.getString(2));
                fp.setWidget(resultat.getString(3));
                fp.setIdProd(resultat.getInt(4));
                /* `idFeat`, `dateFeat`, `widget`, `idProd`  */
               
              
        }
        
                     return fp;
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}
      
    }

    
}
