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
import java.util.logging.Logger;
import tn.mariages.entities.Client;
import tn.mariages.util.MyConnection;

/**
 *
 * @author cyrine
 */
public class ClientDAO {
    

    
    public void insertClient(Client c){
        
        String requete="insert into client (prenomMari,prenomEpouse,nomDeFamille,imgClient,emailClient,pwdClient,cmptValide,villeClient,telClient,dateDebut,dateFin,budget) values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, c.getPrenomMari());
            ps.setString(2, c.getPrenomEpouse());
            ps.setString(3, c.getNomDeFamille());
            ps.setString(4, c.getImgClient());
            ps.setString(5, c.getEmailClient());
            ps.setString(6, c.getPwdClient());
            ps.setBoolean(7, c.isCmptValide());
            ps.setString(8, c.getVilleClient());
            ps.setString(9, c.getTelClient());
            ps.setString(10, c.getDateDebut());
            ps.setString(11, c.getDateFin());
            ps.setDouble(12, c.getBudget());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succées");
            
            
            
        } catch (SQLException ex) {
              System.out.println("erreur lors de l'insertion "+ex.getMessage());        }
    
    }
   
    public void  updateClient(Client c ){
        
        String requete="update client set prenomMari=?,prenomEpouse=?,nomDeFamille=?,imgClient=?,emailClient=?,pwdClient=?,cmptValide=?,villeClient=?,telClient=?,dateDebut=?,dateFin=?,budget=? where idClient=?  ";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, c.getPrenomMari());
            ps.setString(2, c.getPrenomEpouse());
            ps.setString(3, c.getNomDeFamille());
            ps.setString(4, c.getImgClient());
            ps.setString(5, c.getEmailClient());
            ps.setString(6, c.getPwdClient());
            ps.setBoolean(7, c.isCmptValide());
            ps.setString(8, c.getVilleClient());
            ps.setString(9, c.getTelClient());
            ps.setString(10, c.getDateDebut());
            ps.setString(11, c.getDateFin());
            ps.setDouble(12, c.getBudget());
            ps.setInt(13,c.getIdClient());
            ps.executeUpdate();
            System.out.println("mise à jour effectué avecc succees");
        } catch (SQLException ex) {
               System.out.println("erreur lors de la mise à jour "+ex.getMessage());      
        }
          
        
    
    
    }
    
    public void  deleteClient (int id){
        String requete = "delete from client where idClient=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Client supprimée");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
       
        
    }
    
    public Client findClientById(int id){
        Client client=new Client();
        String requete="select * from client where idClient=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat=ps.executeQuery();
            while(resultat.next()){
                
                client.setIdClient(resultat.getInt(1));
                 client.setPrenomMari(resultat.getString(2));
                client.setPrenomEpouse(resultat.getString(3));
                 client.setNomDeFamille(resultat.getString(4));
                  client.setImgClient(resultat.getString(5));
                 client.setEmailClient(resultat.getString(6));
                  client.setPwdClient(resultat.getString(7));
                  client.setCmptValide(resultat.getBoolean(8));
                  client.setVilleClient(resultat.getString(9));
                  client.setTelClient(resultat.getString(10));
                   client.setDateDebut(resultat.getString(11));
                   client.setDateFin(resultat.getString(12));
                   client.setBudget(resultat.getInt(13));
            }
            return client;

            
        } catch (SQLException ex) {
System.out.println("erreur lors de la recherche du client "+ex.getMessage());
      return null;        }
        
        
        
        
    }
    
     public Client findClientByNomFamille(String NomDeFamille){
         Client client=new Client();
        String requete="select * from client where nomDeFamille=?";
        try {
            PreparedStatement ps=MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, NomDeFamille);
            ResultSet resultat=ps.executeQuery();
            while (resultat.next())
            {
                client.setIdClient(resultat.getInt(1));
                 client.setPrenomMari(resultat.getString(2));
                client.setPrenomEpouse(resultat.getString(3));
                 client.setNomDeFamille(resultat.getString(4));
                  client.setImgClient(resultat.getString(5));
                 client.setEmailClient(resultat.getString(6));
                  client.setPwdClient(resultat.getString(7));
                  client.setCmptValide(resultat.getBoolean(8));
                  client.setVilleClient(resultat.getString(9));
                  client.setTelClient(resultat.getString(10));
                   client.setDateDebut(resultat.getString(11));
                   client.setDateFin(resultat.getString(12));
                   client.setBudget(resultat.getInt(13));
                
            }
            return client;
            
            
        } catch (SQLException ex) {
               System.out.println("erreur lors de la recherche du client "+ex.getMessage());
               return null; 
        }
        
         
         
         
     }
    
    public List<Client> DisplayAllClients (){
        
        List<Client> listeClients = new ArrayList<Client>();

        String requete = "select * from client";
        
        Statement statement;
        try {
            statement = MyConnection.getInstance().cnx.createStatement();
            ResultSet resultat=statement.executeQuery(requete);
        while(resultat.next()){
            Client client=new Client();
            client.setIdClient(resultat.getInt(1));
                 client.setPrenomMari(resultat.getString(2));
                client.setPrenomEpouse(resultat.getString(3));
                 client.setNomDeFamille(resultat.getString(4));
                  client.setImgClient(resultat.getString(5));
                 client.setEmailClient(resultat.getString(6));
                  client.setPwdClient(resultat.getString(7));
                  client.setCmptValide(resultat.getBoolean(8));
                  client.setVilleClient(resultat.getString(9));
                  client.setTelClient(resultat.getString(10));
                   client.setDateDebut(resultat.getString(11));
                   client.setDateFin(resultat.getString(12));
                   client.setBudget(resultat.getInt(13));
                   listeClients.add(client);
        }
        
                     return listeClients;
        }
catch (SQLException ex) {
System.out.println("erreur lors du chargement des depots "+ex.getMessage());
return null;

}
      
    }
     
     
     
    
}