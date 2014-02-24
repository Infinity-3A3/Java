/*
 * Copyright (C) 2014 Karim
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

/**
 *
 * @author Karim
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import tn.mariages.entities.ToDo;
import tn.mariages.util.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karray
 */
public class ToDoDAO {

     public void insertToDo(ToDo t){

        String requete = "insert into todo (idClient,titreToDo,descToDo,dateToDo,labelUrgent,labelRDV,labelPayement) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, t.getIdClient());
            ps.setString(2, t.getTitreToDo());
             ps.setString(3,t.getDescToDo());
            ps.setString(4,t.getDateToDo() );
            ps.setBoolean(5, t.isLabelUrgent());
               ps.setBoolean(6, t.isLabelRDV());
                  ps.setBoolean(7, t.isLabelPayement());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion "+ex.getMessage());
        }
    }


    public void updateToDo(ToDo t){
        String requete = "update todo  set idClient=?,titreToDo=?,descToDo=?,dateToDo=?,labelUrgent=?,labelRDV=?,labelPayement=? where idToDo=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
              ps.setInt(1, t.getIdClient());
            ps.setString(2, t.getTitreToDo());
             ps.setString(3,t.getDescToDo());
            ps.setString(4,t.getDateToDo() );
            ps.setBoolean(5, t.isLabelUrgent());
               ps.setBoolean(6, t.isLabelRDV());
                  ps.setBoolean(7, t.isLabelPayement());
                  ps.setInt(8, t.getIdToDo());
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }

    public void deleteToDo(int id){
        String requete = "delete from todo where idToDo=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ps.executeUpdate();
         
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }


    public ToDo findToDoById(int id){
    ToDo todo=new ToDo();
     String requete = "select * from todo where idToDo=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setInt(1, id);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                todo.setIdToDo(resultat.getInt(1));
                todo.setIdClient(resultat.getInt(2));
              todo.setTitreToDo(resultat.getString(3));
              todo.setDescToDo(resultat.getString(4));
              todo.setDateToDo(resultat.getString(5));
              todo.setLabelUrgent(resultat.getBoolean(6));
               todo.setLabelRDV(resultat.getBoolean(7));
                todo.setLabelPayement(resultat.getBoolean(8));
              

            }
            return todo;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
    }
    
    
       public ToDo findtodoByTitle(String title){
    ToDo todo=new ToDo();
     String requete = "select * from todo where titreToDo=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().cnx.prepareStatement(requete);
            ps.setString(1, title);
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                todo.setIdToDo(resultat.getInt(1));
                todo.setIdClient(resultat.getInt(2));
              todo.setTitreToDo(resultat.getString(3));
              todo.setDescToDo(resultat.getString(4));
              todo.setDateToDo(resultat.getString(5));
              todo.setLabelUrgent(resultat.getBoolean(6));
               todo.setLabelRDV(resultat.getBoolean(7));
                todo.setLabelPayement(resultat.getBoolean(8));

            }
            return todo;

        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la recherche du depot "+ex.getMessage());
            return null;
        }
    }

 
    public List<ToDo> DisplayAllToDo (){


        List<ToDo> listetodo = new ArrayList<ToDo>();

        String requete = "select * from todo";
        try {
           Statement statement = MyConnection.getInstance().cnx
                   .createStatement();
            ResultSet resultat = statement.executeQuery(requete);

            while(resultat.next()){
              ToDo todo=new ToDo();
                todo.setIdToDo(resultat.getInt(1));
                todo.setIdClient(resultat.getInt(2));
              todo.setTitreToDo(resultat.getString(3));
              todo.setDescToDo(resultat.getString(4));
              todo.setDateToDo(resultat.getString(5));
              todo.setLabelUrgent(resultat.getBoolean(6));
               todo.setLabelRDV(resultat.getBoolean(7));
                todo.setLabelPayement(resultat.getBoolean(8));

                listetodo.add(todo);
            }
            return listetodo;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des depots "+ex.getMessage());
            return null;
        }
    }

}
