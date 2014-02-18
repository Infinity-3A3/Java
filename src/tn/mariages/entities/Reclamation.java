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
public class Reclamation {

    public Reclamation() {
    }

    public Reclamation(String mailRec, String dateRec, String objRec, String texteRec) {
        this.mailRec = mailRec;
        this.dateRec = dateRec;
        this.objRec = objRec;
        this.texteRec = texteRec;
    }

    public Reclamation(int idRec, String mailRec, String dateRec, String objRec, String texteRec) {
        this.idRec = idRec;
        this.mailRec = mailRec;
        this.dateRec = dateRec;
        this.objRec = objRec;
        this.texteRec = texteRec;
    }
    
    
    
    private int idRec;
    private String mailRec;
    private String dateRec;
    private String objRec;
    private String texteRec;
/* A ajouter un bool qui verifie la lecture+ rep de la réclamation */
    public int getIdRec() {
        return idRec;
    }

    public void setIdRec(int idRec) {
        this.idRec = idRec;
    }

    public String getMailRec() {
        return mailRec;
    }

    public void setMailRec(String mailRec) {
        this.mailRec = mailRec;
    }

    public String getDateRec() {
        return dateRec;
    }

    public void setDateRec(String dateRec) {
        this.dateRec = dateRec;
    }

    public String getObjRec() {
        return objRec;
    }

    public void setObjRec(String objRec) {
        this.objRec = objRec;
    }

    public String getTexteRec() {
        return texteRec;
    }

    public void setTexteRec(String texteRec) {
        this.texteRec = texteRec;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Reclamation other = (Reclamation) obj;
        if (this.idRec != other.idRec) {
            return false;
        }
        return true;
    }
    
    
}
