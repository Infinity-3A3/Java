/*
 * Copyright (C) 2014 Karim
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
import tn.mariages.dao.ToDoDAO;
import tn.mariages.entities.ToDo;
import tn.mariages.dao.AdminDAO;
import tn.mariages.entities.Admin;
/**
 *
 * @author Karim
 */
public class TableListeAdminsModel extends AbstractTableModel {
      AdminDAO adminDAO=new AdminDAO();
      Admin admin=new Admin();
    
    List<Admin> listAdmins = new ArrayList<Admin>();
    String [] header={"ID Administrateur","Nom","Email","Supprimer"};
    //List<Boolean> rowList=new ArrayList<Boolean>(getRowCount());
    Boolean rowlist[][] = new Boolean[50][50];
    public TableListeAdminsModel(){
    listAdmins=new AdminDAO().DisplayAllAdmins();
    for (int i = 0; i < getRowCount(); i++) {
        rowlist[i][3]=Boolean.FALSE;
      
            }
}

    @Override
    public int getRowCount() {
        return listAdmins.size();   
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        admin=adminDAO.findAdminById(listAdmins.get(rowIndex).getIdAdmin());
switch(columnIndex){
            case 0:return listAdmins.get(rowIndex).getIdAdmin();
            
            case 1:return listAdmins.get(rowIndex).getNomAdmin();
            case 2:return listAdmins.get(rowIndex).getMailAdmin();
            
          
            case 3:return rowlist[rowIndex][3];
            
                
                default:return null;
                
        }
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         
         
        boolean b = (Boolean) aValue;
            if(columnIndex==3)
                rowlist[rowIndex][3]=b;
            
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
    public String getColumnName(int column) {
        return header[column];
    }
    @Override
    public boolean isCellEditable(int row, int column) {
    return (column > 2);
  }
    
    
}
