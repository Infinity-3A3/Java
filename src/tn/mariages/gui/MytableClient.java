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
package tn.mariages.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.ClientDAO;
import tn.mariages.entities.Client;



public class MytableClient extends AbstractTableModel{
 List <Client> listClient=new ArrayList<Client>();
 String [] header={"idclient","Prenom du mari","Prenom de l'épouse","Nom de famille","Date début","Date fin","Supprimer"};
   Boolean rowlist[][] = new Boolean[50][50];
 
 public MytableClient(){
     
     ClientDAO clientDAO=new ClientDAO();
     listClient=clientDAO.DisplayAllClients();
       
     for (int i = 0; i < getRowCount(); i++) {
        rowlist[i][6]=Boolean.FALSE;
    
       
            }
 }
 
    @Override
    public int getRowCount() {
return listClient.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

     switch(columnIndex){
         case 0:return listClient.get(rowIndex).getIdClient();
            case 1:return listClient.get(rowIndex).getPrenomMari();
           
            case 2:return listClient.get(rowIndex).getPrenomEpouse();
            case 3:return listClient.get(rowIndex).getNomDeFamille();
            
           case 4:return listClient.get(rowIndex).getDateDebut();
            case 5:return listClient.get(rowIndex).getDateFin();
            case 6:return rowlist[rowIndex][6];
           
          
                default:return null;
    
    }

 
}
    
 @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
      boolean b = (Boolean) aValue;
            if(columnIndex==6)
                rowlist[rowIndex][6]=b;
           
        fireTableCellUpdated(rowIndex, columnIndex);
      
  }
  
 
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==6 ){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public boolean isCellEditable(int row, int column) {
    return (column > 5);
  }
  
    

public String getColumnName(int column) {
        return header[column]; //To change body of generated methods, choose Tools | Templates.
    }

}