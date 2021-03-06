/*
 * Copyright (C) 2014 khaled
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
import tn.mariages.entities.Produit;
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.entities.Prestataire;

/**
 *
 * @author khaled
 */
public class TableListeAjoutProduitPaquet extends AbstractTableModel{
    
    List<Produit> mylist = new ArrayList<>();
    String [] headers  = {" ","Id Produit","Nom Produit ","Nom Prestataire","Categorie","Date d'ajout","Prix"};
    Boolean data[][] = new Boolean[20][20];
    public TableListeAjoutProduitPaquet(){
        mylist = new ProduitDAO().DisplayAllProd();
        for(int i=0;i<getRowCount();i++){
            data[i][0]=Boolean.FALSE;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if(columnIndex==0){
            data[rowIndex][0]=(Boolean)aValue;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex==0)
            return Boolean.class;
        return super.getColumnClass(columnIndex); 
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return (columnIndex < 1 );
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
        Prestataire pres ;
        PrestataireDAO presDAO = new PrestataireDAO();
        pres = presDAO.findPrestById(mylist.get(rowIndex).getIdPrest());
        switch(columnIndex){
            case 0 : 
                return data[rowIndex][0];
            case 1 : 
                return mylist.get(rowIndex).getIdProd();
            case 2 : 
                return mylist.get(rowIndex).getNomProd();
            case 3 :
                return pres.getNomPrest();
            case 4 :
                return mylist.get(rowIndex).getCategorieProd();
            case 5 :
                return mylist.get(rowIndex).getDateAjoutProd();
            case 6 :
                return mylist.get(rowIndex).getPrixProd();
            default :
        return null;
        }
    }
    
    
    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
}
