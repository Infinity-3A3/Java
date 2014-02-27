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
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.dao.ProduitPaquetDAO;
import tn.mariages.entities.Prestataire;
import tn.mariages.entities.Produit;
import tn.mariages.entities.ProduitPaquet;

/**
 *
 * @author khaled
 */
public class TableProduitPaquetModel extends AbstractTableModel {

    List<ProduitPaquet> listeproduits = new ArrayList<ProduitPaquet>();
    ProduitPaquetDAO pdao = new ProduitPaquetDAO();
    String[] header = {"ID Produit", "Nom prestataire", "Nom du produit", "Categorie", "Prix Hors paquet", "Supprimer"};
    Boolean data[][] = new Boolean[20][10];
    int id_paq;
    public TableProduitPaquetModel() {
        for (int i = 0; i < getRowCount(); i++) {
            data[i][5] = Boolean.FALSE;
        }
    }

    public TableProduitPaquetModel(int id) {
        listeproduits = pdao.DisplayAllProduitsbyPaquet(id);
        for (int i = 0; i < getRowCount(); i++) {
            data[i][5] = Boolean.FALSE;
        }
        this.id_paq=id;
    }

    @Override
    public int getRowCount() {
        return listeproduits.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<Produit> listeProduit = new ArrayList<Produit>();
        ProduitDAO prodDAO = new ProduitDAO();
        for(int i = 0;i<listeproduits.size();i++){
            Produit P=new Produit();
            P=prodDAO.DisplayProdById(listeproduits.get(i).getIdProd());
            listeProduit.add(P);
        }
                
        PrestataireDAO prestDAO = new PrestataireDAO();
//        prestDAO.findPrestById(listeProduit.get(rowIndex).getIdPrest()).getNomPrest();
        switch (columnIndex) {
            case 0:
                return listeProduit.get(rowIndex).getIdProd();
            case 1:
                return  prestDAO.findPrestById(listeProduit.get(rowIndex).getIdPrest()).getNomPrest();
            case 2:    
                return  listeProduit.get(rowIndex).getNomProd();
            case 3:
                return listeProduit.get(rowIndex).getCategorieProd();
            case 4:
                return listeProduit.get(rowIndex).getPrixProd();
            case 5:
                return data[rowIndex][5];
            default:
                return null;

        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 5) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 5) {
            data[rowIndex][5] = (Boolean) aValue;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return (columnIndex == 5);
    }
   /* public static void main(String[] args) {
        List<ProduitPaquet> listeproduits = new ArrayList<ProduitPaquet>();
    ProduitPaquetDAO pdao = new ProduitPaquetDAO();
    listeproduits = pdao.DisplayAllProduitsbyPaquet(6);
        System.out.println(listeproduits);
    List<Produit> listeProduit = new ArrayList<Produit>();
        ProduitDAO prodDAO = new ProduitDAO();
//        for(int i = 0;i<listeproduits.size();i++){
            Produit P=new Produit();
            P=prodDAO.DisplayProdById(listeproduits.get(0).getIdProd());
            //listeProduit=prodDAO.DisplayProdByCategorie("zeaezaeza");
            System.out.println(P);
//            listeProduit.add(P);
        }*/
    }


