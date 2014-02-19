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
public class FeaturedProd {
    
   

    public FeaturedProd() {
    }

    public FeaturedProd(String dateFeat, String widget, int idProd) {
        this.dateFeat = dateFeat;
        this.widget = widget;
        this.idProd = idProd;
    }

    public FeaturedProd(int idFeat, String dateFeat, String widget, int idProd) {
        this.idFeat = idFeat;
        this.dateFeat = dateFeat;
        this.widget = widget;
        this.idProd = idProd;
    }
    
     private int idFeat;
    private String dateFeat;    
    private String widget;
    private int idProd;

    public int getIdFeat() {
        return idFeat;
    }

    public void setIdFeat(int idFeat) {
        this.idFeat = idFeat;
    }

    public String getDateFeat() {
        return dateFeat;
    }

    public void setDateFeat(String dateFeat) {
        this.dateFeat = dateFeat;
    }

    public String getWidget() {
        return widget;
    }

    public void setWidget(String widget) {
        this.widget = widget;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
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
        final FeaturedProd other = (FeaturedProd) obj;
        if (this.idFeat != other.idFeat) {
            return false;
        }
        if (this.idProd != other.idProd) {
            return false;
        }
        return true;
    }





}
