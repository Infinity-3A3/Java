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

import java.util.List;
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.dao.panierProduitDAO;
import tn.mariages.entities.PanierPaquet;
import tn.mariages.entities.PanierProduit;

/**
 *
 * @author cyrine
 */
public class MytablePanierProduitModel extends AbstractTableModel{
    
    
    List<PanierProduit> mylist;
    String [] headers  = {"idclient","idProduit","Nom Produit ","Prix produit","Supprimer"};
    Boolean rowlist[][] = new Boolean[50][50];

    public MytablePanierProduitModel(int id) {
        panierProduitDAO panierproddao= new panierProduitDAO();
                
        
        mylist=panierproddao.DiplayPanierProduitByClient(id);
         for (int i = 0; i < getRowCount(); i++) {
        rowlist[i][4]=Boolean.FALSE;
       
            }
        
    }

    @Override
    public int getRowCount() {
        return mylist.size();
    }

    @Override
    public int getColumnCount() {
     
       return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
    ProduitDAO pdao=new ProduitDAO();
         switch(columnIndex){
             case 0 : 
                
                return mylist.get(rowIndex).getIdClient();
            case 1 : 
                
                return mylist.get(rowIndex).getIdProd();
            case 2 :
                
                return pdao.DisplayProdByID(mylist.get(rowIndex).getIdProd()).getNomProd();
            case 3 :
                return pdao.DisplayProdByID(mylist.get(rowIndex).getIdProd()).getPrixProd();
            case 4 :
                return rowlist[rowIndex][4];
               
            default :
        return null;
    
    
    }}
         
         @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
      boolean b = (Boolean) aValue;
            if(columnIndex==4)
                rowlist[rowIndex][4]=b;
           
        fireTableCellUpdated(rowIndex, columnIndex);
      
  }
     
     
     @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==4 ){
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
     
      @Override
    public boolean isCellEditable(int row, int column) {
    return (column > 3);
  }
    
    @Override
         public String getColumnName(int column){
             
              return headers[column];
             
         }
    
    
    }
    
    
    
    
    
    
    
    

