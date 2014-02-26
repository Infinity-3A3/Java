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

import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
      String[]header = {"Par :","Objet","Date d'envoi","id"};
      
      public TableReclamationModel()
      {
          listeReclamations = new ReclamationDAO().DisplayAllReclamations();
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
                default:return null;
        }
                        
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    
    
    
   
    
    
    
}
