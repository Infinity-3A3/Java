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
public class Produit {

    public Produit() {
    }

    public Produit(int idPrest, String nomProd, String descProd, String shortDescProd, String categorieProd, String dateAjoutProd, double prixProd, boolean exclusifPaquet, String imgProd_P, String imgProd_1, String imgProd_2, String imgProd_3, String imgProd_4) {
        this.idPrest=idPrest;
        this.nomProd = nomProd;
        this.descProd = descProd;
        this.shortDescProd = shortDescProd;
        this.categorieProd = categorieProd;
        this.dateAjoutProd = dateAjoutProd;
        this.prixProd = prixProd;
        this.exclusifPaquet = exclusifPaquet;
        this.imgProd_P = imgProd_P;
        this.imgProd_1 = imgProd_1;
        this.imgProd_2 = imgProd_2;
        this.imgProd_3 = imgProd_3;
        this.imgProd_4 = imgProd_4;
    }

    public Produit(int idProd,int idPrest , String nomProd, String descProd, String shortDescProd, String categorieProd, String dateAjoutProd, double prixProd, boolean exclusifPaquet, String imgProd_P, String imgProd_1, String imgProd_2, String imgProd_3, String imgProd_4) {
        this.idProd = idProd;
        this.idPrest=  idPrest;
        this.nomProd = nomProd;
        this.descProd = descProd;
        this.shortDescProd = shortDescProd;
        this.categorieProd = categorieProd;
        this.dateAjoutProd = dateAjoutProd;
        this.prixProd = prixProd;
        this.exclusifPaquet = exclusifPaquet;
        this.imgProd_P = imgProd_P;
        this.imgProd_1 = imgProd_1;
        this.imgProd_2 = imgProd_2;
        this.imgProd_3 = imgProd_3;
        this.imgProd_4 = imgProd_4;
    }
    
    
    
    private int idProd;
    private int idPrest;
  
    private String nomProd;
    
    private String descProd;
    private String shortDescProd;
    
    private String categorieProd;
   
    private String dateAjoutProd;
    private double prixProd;
    
    private boolean exclusifPaquet;
    /*
     * A voir ajouter un nbr de liens des images
     */
    private String imgProd_P;
    
    private String imgProd_1;
    private String imgProd_2;
    private String imgProd_3;
    private String imgProd_4;

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomProd() {
        return nomProd;
    }
    
     public int getIdPrest() {
        return idPrest;
    }

    public void setIdPrest(int idPrest) {
        this.idPrest = idPrest;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getShortDescProd() {
        return shortDescProd;
    }

    public void setShortDescProd(String shortDescProd) {
        this.shortDescProd = shortDescProd;
    }

    public String getCategorieProd() {
        return categorieProd;
    }

    public void setCategorieProd(String categorieProd) {
        this.categorieProd = categorieProd;
    }

    public String getDateAjoutProd() {
        return dateAjoutProd;
    }

    public void setDateAjoutProd(String dateAjoutProd) {
        this.dateAjoutProd = dateAjoutProd;
    }

    public double getPrixProd() {
        return prixProd;
    }

    public void setPrixProd(double prixProd) {
        this.prixProd = prixProd;
    }

    public boolean isExclusifPaquet() {
        return exclusifPaquet;
    }

    public void setExclusifPaquet(boolean exclusifPaquet) {
        this.exclusifPaquet = exclusifPaquet;
    }

    public String getImgProd_P() {
        return imgProd_P;
    }

    public void setImgProd_P(String imgProd_P) {
        this.imgProd_P = imgProd_P;
    }

    public String getImgProd_1() {
        return imgProd_1;
    }

    public void setImgProd_1(String imgProd_1) {
        this.imgProd_1 = imgProd_1;
    }

    public String getImgProd_2() {
        return imgProd_2;
    }

    public void setImgProd_2(String imgProd_2) {
        this.imgProd_2 = imgProd_2;
    }

    public String getImgProd_3() {
        return imgProd_3;
    }

    public void setImgProd_3(String imgProd_3) {
        this.imgProd_3 = imgProd_3;
    }

    public String getImgProd_4() {
        return imgProd_4;
    }

    public void setImgProd_4(String imgProd_4) {
        this.imgProd_4 = imgProd_4;
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
        final Produit other = (Produit) obj;
        if (this.idProd != other.idProd) {
            return false;
        }
        return true;
    }
    
    
    
}
