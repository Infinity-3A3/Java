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
public class Mytableprod extends AbstractTableModel {

    List<Produit> mylist = new ArrayList<>();
    String[] header = {"idprod", "Nom Produit ", "Nom Prestataire", "Categorie", "Date d'ajout", "Prix"};
   

    public Mytableprod() {
        mylist = new ProduitDAO().DisplayAllProd();
        
    }
    
    public Mytableprod(String nom) {
        mylist = new ProduitDAO().DisplayAllProd( nom);
        
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
            
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return header[column];//To change body of generated methods, choose Tools | Templates.
    }

    

   

}
