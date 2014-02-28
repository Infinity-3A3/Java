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
public class PanierPaquet {

    public PanierPaquet() {
    }


    public PanierPaquet(int idClient, int idPaquet, String dateAjout) {
        this.idClient = idClient;
        this.idPaquet = idPaquet;
        this.dateAjout = dateAjout;
    }
    
    
    
    private int idClient;
    private int idPaquet;
    private String dateAjout;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
        int hash = 5;
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
        final PanierPaquet other = (PanierPaquet) obj;
        if (this.idClient != other.idClient) {
            return false;
        }
        if (this.idPaquet != other.idPaquet) {
            return false;
        }
        return true;
    }
    
    
    
}
