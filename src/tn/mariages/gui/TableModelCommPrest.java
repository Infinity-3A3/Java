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
import tn.mariages.dao.ClientDAO;
import tn.mariages.dao.CommentaireDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.entities.Commentaire;

/**
 *
 * @author omar
 */
public class TableModelCommPrest extends AbstractTableModel {

    List<Commentaire> listeCom = new ArrayList<Commentaire>();
    String[] header = {"Id client","Nom Client","Date", "Commentaire"};

    int id_prod;

    ClientDAO cDAO = new ClientDAO();
    
    public TableModelCommPrest() {
        listeCom = new CommentaireDAO().DisplayAllCommentaires();

    }

    public TableModelCommPrest(int id) {
        listeCom = new CommentaireDAO().DisplayAllCommentairesbyIdProd(id);
        this.id_prod = id;

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
        switch (columnIndex) {
            case 0:
                return listeCom.get(rowIndex).getIdClient();
            case 1:
                return cDAO.findClientById(listeCom.get(rowIndex).getIdClient()).getNomDeFamille();
            case 2 :
                return listeCom.get(rowIndex).getDateCom();
            case 3:
                return listeCom.get(rowIndex).getTexteCom();

            default:
                return null;
        }

    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }

}
