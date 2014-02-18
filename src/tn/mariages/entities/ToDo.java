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
package tn.mariages.entities;

/**
 *
 * @author RAED
 */
public class ToDo {

    public ToDo() {
    }

    public ToDo(String titreToDo, String descToDo, String dateToDo, boolean labelUrgent, boolean labelRDV, boolean labelPayement) {
        this.titreToDo = titreToDo;
        this.descToDo = descToDo;
        this.dateToDo = dateToDo;
        this.labelUrgent = labelUrgent;
        this.labelRDV = labelRDV;
        this.labelPayement = labelPayement;
    }

    public ToDo(int idToDo, int idClient, String titreToDo, String descToDo, String dateToDo, boolean labelUrgent, boolean labelRDV, boolean labelPayement) {
        this.idToDo = idToDo;
        this.idClient = idClient;
        this.titreToDo = titreToDo;
        this.descToDo = descToDo;
        this.dateToDo = dateToDo;
        this.labelUrgent = labelUrgent;
        this.labelRDV = labelRDV;
        this.labelPayement = labelPayement;
    }
    
    
    
    
    private int idToDo;
    private int idClient; /* FK*/
    
    private String titreToDo;
    private String descToDo;
    
    private String dateToDo;
    
    private boolean labelUrgent;
    private boolean labelRDV;
    private boolean labelPayement;

    public int getIdToDo() {
        return idToDo;
    }

    public void setIdToDo(int idToDo) {
        this.idToDo = idToDo;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getTitreToDo() {
        return titreToDo;
    }

    public void setTitreToDo(String titreToDo) {
        this.titreToDo = titreToDo;
    }

    public String getDescToDo() {
        return descToDo;
    }

    public void setDescToDo(String descToDo) {
        this.descToDo = descToDo;
    }

    public String getDateToDo() {
        return dateToDo;
    }

    public void setDateToDo(String dateToDo) {
        this.dateToDo = dateToDo;
    }

    public boolean isLabelUrgent() {
        return labelUrgent;
    }

    public void setLabelUrgent(boolean labelUrgent) {
        this.labelUrgent = labelUrgent;
    }

    public boolean isLabelRDV() {
        return labelRDV;
    }

    public void setLabelRDV(boolean labelRDV) {
        this.labelRDV = labelRDV;
    }

    public boolean isLabelPayement() {
        return labelPayement;
    }

    public void setLabelPayement(boolean labelPayement) {
        this.labelPayement = labelPayement;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idToDo;
        hash = 89 * hash + this.idClient;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ToDo other = (ToDo) obj;
        if (this.idToDo != other.idToDo) {
            return false;
        }
        if (this.idClient != other.idClient) {
            return false;
        }
        return true;
    }
    
    
}
