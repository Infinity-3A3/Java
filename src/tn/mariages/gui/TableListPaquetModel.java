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
import javax.swing.table.AbstractTableModel;
import tn.mariages.dao.PaquetDAO;
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.entities.Paquet;
import tn.mariages.entities.Prestataire;

/**
 *
 * @author khaled
 */
public class TableListPaquetModel extends AbstractTableModel {

    PrestataireDAO presDAO = new PrestataireDAO();
    Prestataire prest = new Prestataire();

    List<Paquet> listPaquet = new ArrayList<Paquet>();
    String[] header = {"ID Paquet", "Nom Du Prestataire", "Nom Du Paquet", "Description", "Image", "Prix Du Paquet", "Supprimer"};
    
    Boolean rowlist[][] = new Boolean[50][50];

    public TableListPaquetModel() {
        listPaquet = new PaquetDAO().DisplayAllPaquets();
        for (int i = 0; i < getRowCount(); i++) {
            rowlist[i][6] = Boolean.FALSE;
        }
        
        
    }

    @Override
    public int getRowCount() {
        return listPaquet.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        prest = presDAO.findPrestById(listPaquet.get(rowIndex).getIdPrest());
        switch (columnIndex) {
            case 0:
                return listPaquet.get(rowIndex).getIdPaquet();
            case 1:
                return prest.getNomPrest();
            case 2:
                return listPaquet.get(rowIndex).getNomPaquet();
            case 3:
                return listPaquet.get(rowIndex).getDescPaquet();
            case 4:
                return listPaquet.get(rowIndex).getImgPaquet();
            case 5:
                return listPaquet.get(rowIndex).getPrixPaquet();
            case 6:
                return rowlist[rowIndex][6];

            default:
                return null;

        }

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
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return (column > 5);
    }

}
