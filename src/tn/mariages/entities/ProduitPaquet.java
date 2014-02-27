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
public class ProduitPaquet {

    public ProduitPaquet() {
    }

    public ProduitPaquet(int idProd, int idPaquet, String dateAjout) {
        this.idProd = idProd;
        this.idPaquet = idPaquet;
        this.dateAjout = dateAjout;
    }

    @Override
    public String toString() {
        return "ProduitPaquet{" + "idProd=" + idProd + ", idPaquet=" + idPaquet + ", dateAjout=" + dateAjout + '}';
    }
    
    
    private int idProd;
    private int idPaquet;
    private String dateAjout;    

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public int getIdPaquet() {
        return idPaquet;
    }

    public void setIdPaquet(int idPaquet) {
        this.idPaquet = idPaquet;
    }

    public String getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(String dateAjout) {
        this.dateAjout = dateAjout;
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
        final ProduitPaquet other = (ProduitPaquet) obj;
        if (this.idProd != other.idProd) {
            return false;
        }
        if (this.idPaquet != other.idPaquet) {
            return false;
        }
        return true;
    }
    
    
    
}
