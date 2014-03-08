/*
 * Copyright (C) 2014 Youssef
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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import tn.mariages.entities.Produit;
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.dao.ProduitDAO;

/**
 *
 * @author Youssef
 */
public class MyTableProduit extends AbstractTableModel {

    List<Produit> mylist = new ArrayList<>();
    String[] header = {"idprod", "Nom Produit ", "Nom Prestataire", "Categorie", "Date d'ajout", "Prix", "Supprimer"};
    Boolean rowlist[][] = new Boolean[50][50];

    public MyTableProduit() {
        mylist = new ProduitDAO().DisplayAllProd();
        for (int i = 0; i < getRowCount(); i++) {
            rowlist[i][6] = Boolean.FALSE;
        }
    }

    @Override
    public int getRowCount() {
        return mylist.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        DecimalFormat f = new DecimalFormat("##");
        
        switch (columnIndex) {
            case 0:
                return mylist.get(rowIndex).getIdProd();
            case 1:
                return mylist.get(rowIndex).getNomProd();
            case 2:
                return new PrestataireDAO().findPrestById(mylist.get(rowIndex).getIdPrest()).getNomPrest();
            case 3:
                return mylist.get(rowIndex).getCategorieProd();
            case 4:
                return mylist.get(rowIndex).getDateAjoutProd();
            case 5:
                return f.format(mylist.get(rowIndex).getPrixProd());
            case 6:
                return rowlist[rowIndex][6];
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return header[column];//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        boolean b = (Boolean) aValue;
        if (columnIndex == 6) {
            rowlist[rowIndex][6] = b;
        }

        fireTableCellUpdated(rowIndex, columnIndex);

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 6) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return (column > 5);
    }

}
