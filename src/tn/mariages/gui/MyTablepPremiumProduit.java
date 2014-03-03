/*
 * Copyright (C) 2014 Raed
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
 * @author Raed
 */
public class MyTablepPremiumProduit extends AbstractTableModel{
    
    List<Produit> mylist = new ArrayList<>();
    String [] headers  = {"Id Prod","Nom Produit ","Nom Prestataire","Categorie","Date d'ajout","Prix (DT)"};

    public MyTablepPremiumProduit() {
        mylist = new ProduitDAO().DisplayAllProdIfPremium();
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
                return mylist.get(rowIndex).getIdProd();
                
            case 1 : 
                return mylist.get(rowIndex).getNomProd();
            case 2 :
                return  pres.getNomPrest();
            case 3 :
                return mylist.get(rowIndex).getCategorieProd();
            case 4:
                return mylist.get(rowIndex).getDateAjoutProd();
            case 5 :
                return mylist.get(rowIndex).getPrixProd();
            default :
        return null;
        }
    }
    
    
    @Override
    public String getColumnName(int column) {
        return headers[column];//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}