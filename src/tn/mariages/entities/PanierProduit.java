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

import java.sql.Date;

/**
 *
 * @author RAED
 */
public class PanierProduit {

    public PanierProduit() {
    }

    public PanierProduit(int idClient, int idProd, String dateAjout) {
        this.idClient = idClient;
        this.idProd = idProd;
        this.dateAjout = Date.valueOf(dateAjout);
    }
    
    
    
    private int idClient;
    private int idProd;
    private Date dateAjout;    

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(String dateAjout) {
        this.dateAjout = Date.valueOf(dateAjout);
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final PanierProduit other = (PanierProduit) obj;
        if (this.idClient != other.idClient) {
            return false;
        }
        if (this.idProd != other.idProd) {
            return false;
        }
        return true;
    }

   
    
}
