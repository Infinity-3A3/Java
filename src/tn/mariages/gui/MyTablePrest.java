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
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.entities.Prestataire;

/**
 *
 * @author cyrine
 */
public class MyTablePrest extends AbstractTableModel{
    
    
    List <Prestataire> ListePrest=new ArrayList<Prestataire>();
String [] Column ={"idprest","Nom","Adresse","Ville","Categorie","Speialite","Supprimer"};
    Boolean rowlist[][] = new Boolean[50][50];
    
    
    
    public MyTablePrest(){
        PrestataireDAO prestDAO=new PrestataireDAO();
        ListePrest =prestDAO.DisplayAllPrestataire();
       for (int i = 0; i < getRowCount(); i++) {
        rowlist[i][6]=Boolean.FALSE;
       
       
            }
       
    }
    
    @Override
    public int getRowCount() {

     return ListePrest.size();
    }

    @Override
    public int getColumnCount() {
            return Column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

             switch(columnIndex){
                  case 0:return ListePrest.get(rowIndex).getIdPrest();
            case 1:return ListePrest.get(rowIndex).getNomPrest();
           
            case 2:return ListePrest.get(rowIndex).getAdrPrest();
            case 3:return ListePrest.get(rowIndex).getVillePrest();
          
            case 4:return ListePrest.get(rowIndex).getCategorie();
            case 5:return ListePrest.get(rowIndex).getSpecialite();
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
        return Column[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
}