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

package tn.mariages.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.ReclamationDAO;
import tn.mariages.entities.Reclamation;

/**
 *
 * @author omar
 */
public class TableReclamationModel extends AbstractTableModel{
    
            List<Reclamation> listeReclamations = new ArrayList<Reclamation>();
      String[]header = {"Client","Objet","Date d'envoi","Id","Supprimer"};
      Boolean rowlist[][] = new Boolean[50][50];
    
      
              
      
      
      public TableReclamationModel()
      {
          listeReclamations = new ReclamationDAO().DisplayAllReclamations();
          
        for (int i = 0; i < getRowCount(); i++) {
        rowlist[i][4]=Boolean.FALSE;
            }
      }

    @Override
    public int getRowCount() {
       return listeReclamations.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return listeReclamations.get(rowIndex).getMailRec();
            case 1:return listeReclamations.get(rowIndex).getObjRec();    
            case 2:return listeReclamations.get(rowIndex).getDateRec();
            case 3:return listeReclamations.get(rowIndex).getIdRec();
            case 4: return rowlist[rowIndex][4];
                default:return null;
        }
                        
    }
    
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         
         
        boolean b = (Boolean) aValue;
            if(columnIndex==4)
                rowlist[rowIndex][4]=b;
            
        fireTableCellUpdated(rowIndex, columnIndex);
    
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
        @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==4){
            
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
    
    
        

    @Override
    public boolean isCellEditable(int row, int column) {
    return (column > 3);
  }

    
    
    
   
    
    
    
}
