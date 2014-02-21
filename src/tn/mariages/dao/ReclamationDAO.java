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

import tn.mariages.entities.Reclamation;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;
import tn.mariages.entities.Commentaire;
import tn.mariages.util.MyConnection;

/**
 *
 * @author omar
 */
public class ReclamationDAO {
    
    public void insertReclamation(Reclamation r)
    {
        try {
            String requete="insert into reclamation (idRec,mailRec,dateRec,objRec,texteRec) values (?,?,?,?,?)";
            
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, r.getIdRec());
            ps.setString(2, r.getMailRec());
            ps.setString(3, r.getDateRec());
            ps.setString(4, r.getObjRec());
            ps.setString(5, r.getTexteRec());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succées");
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ReclamationDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("pff");
        }
    }
    
          public void updateReclamation(Reclamation r)
        {
        try {
            String requete="update reclamation set idRec=?,mailRec=?,dateRec=?,objRec=?,texteRec=? ";
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, r.getIdRec());
            ps.setString(2, r.getMailRec());
            ps.setString(3, r.getDateRec());
            ps.setString(4, r.getObjRec());
            ps.setString(5, r.getTexteRec());
            ps.executeUpdate();
            System.out.println("mise à jour effectué avecc succees");
        } catch (SQLException ex) {
            Logger.getLogger(CommentaireDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
        
        
        public void deleteReclamation(int id)
        {
                    String requete = "delete from reclamation where idRec=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("reclamation supprimé");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }

        }
        
         public List<Reclamation> DisplayAllReclamations(){
        
        List<Reclamation> listeReclamation= new ArrayList<>();

        String requete = "select * from reclamation";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);
        while(resultat.next()){
            Reclamation reclamation=new Reclamation();
            reclamation.setIdRec(resultat.getInt(1));
            reclamation.setMailRec(resultat.getString(2));
            reclamation.setDateRec(resultat.getString(3));
            reclamation.setObjRec(resultat.getString(4));
            reclamation.setTexteRec(resultat.getString(5));
            

                   listeReclamation.add(reclamation);
                   System.out.println(reclamation.getTexteRec()+" "+reclamation.getDateRec());
        }
        
                     return listeReclamation;
                    
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}
        
        
}
    
    public static void main(String[] args) {
            Reclamation r=new Reclamation(1, "a@gmail", "2014-02-05","très cher", "brabi na9souna chwayya :D");
           
            ReclamationDAO dao=new ReclamationDAO();
            //dao.insertReclamation(r);
            //r.setTexteRec("barchaaa ghéééli");
            //dao.updateReclamation(r);
            List<Reclamation> listeReclamations=new ArrayList<Reclamation>();
            listeReclamations=dao.DisplayAllReclamations();
            
            
            
}
         
         
}
