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
import org.eclipse.persistence.jpa.config.Column;
import tn.mariages.dao.CommentaireDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.entities.Commentaire;

/**
 *
 * @author omar
 */
public class TableModelCommentaire extends AbstractTableModel{
    
            List<Commentaire> listeCom = new ArrayList<Commentaire>();
      String[]header = {"id client","idprod","Nom Produit","Date","Commentaire","Supprimer"};
      Boolean rowlist[][] = new Boolean[50][50];
    
      
              
      
      
      public TableModelCommentaire()
      {
          listeCom = new CommentaireDAO().DisplayAllCommentaires();
          
        for (int i = 0; i < getRowCount(); i++) {
        rowlist[i][5]=Boolean.FALSE;
            }
      }

    

    @Override
    public int getRowCount() {
       return listeCom.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return listeCom.get(rowIndex).getIdClient();
            case 1:return listeCom.get(rowIndex).getIdProd(); 
            case 2:return new ProduitDAO().DisplayNameProd(listeCom.get(rowIndex).getIdProd());
            case 3:return listeCom.get(rowIndex).getDateCom();
            case 4:return listeCom.get(rowIndex).getTexteCom();
            case 5: return rowlist[rowIndex][4];
                default:return null;
        }
                        
    }
    
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         
         
        boolean b = (Boolean) aValue;
            if(columnIndex==5)
                rowlist[rowIndex][5]=b;
            
        fireTableCellUpdated(rowIndex, columnIndex);
    
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
        @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==5){
            
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
    
    
        

    @Override
    public boolean isCellEditable(int row, int column) {
    return (column > 3);
  }

    
    
    
   
    
    
    
}

