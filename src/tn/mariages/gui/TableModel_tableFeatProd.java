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

package tn.mariages.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.FeaturedProdDAO;
import tn.mariages.entities.FeaturedProd;

/**
 *
 * @author RAED
 */
@SuppressWarnings("serial")
public class TableModel_tableFeatProd extends AbstractTableModel {

    FeaturedProd fp = new FeaturedProd();
    FeaturedProdDAO fpDAO = new FeaturedProdDAO();
    
    List<FeaturedProd> listFp = new ArrayList<FeaturedProd>();
    
    String [] header={"IdFeat","Widget","Supprimer"};
    Boolean rowlist[][] = new Boolean[3][3];

    
    public TableModel_tableFeatProd() {
        listFp = fpDAO.DisplayAllFeatProd();
        for(int i =0;i< getRowCount();i++){
            rowlist[i][2]=Boolean.TRUE;
        }
        
    }
    
    @Override
    public int getRowCount() {

    return listFp.size();
    }

    @Override
    public int getColumnCount() {

    return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         //   fp=fpDAO.DisplayFeatProdByID(listFp.get(rowIndex).getIdFeat());
        //fp=fpDAO.DisplayFeatProdByID(listFp.get(rowIndex).getIdFeat());
    switch(columnIndex){
        case 0: return listFp.get(rowIndex).getIdFeat();
        case 1: return listFp.get(rowIndex).getWidget();
        case 2: return rowlist[rowIndex][2];
    
                            default:return null;

    }
    
    }
    
    
     @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         
         
        boolean b = (Boolean) aValue;
            if(columnIndex==2) {
                rowlist[rowIndex][2]=b;
        }
            
        fireTableCellUpdated(rowIndex, columnIndex);
    
    }
    
     @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==2){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    
   @Override
    public boolean isCellEditable(int row, int column) {
    return (column > 1);
  }
   
    
    
}
