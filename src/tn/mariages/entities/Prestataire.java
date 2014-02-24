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

import java.util.Objects;

/**
 *
 * @author RAED
 */
public class Prestataire {
     private int idPrest;
    
    private String nomPrest;
    private String descPrest;
    private String adrPrest;
    private String villePrest;

    
    private String imgPrest;
    
    private String telMobilePrest;
    private String telFixePrest;

    private String emailPrest;
    private String pwdPrest;
    
    private String categorie;
    private String specialite; // à voir
   
    private boolean mailValide;
    private boolean compteValide;
    
    private boolean premium;
    private String datePayement;

    public Prestataire() {
    }

    public Prestataire(String nomPrest, String descPrest, String adrPrest, String villePrest, String imgPrest, String telMobilePrest, String telFixePrest, String emailPrest, String pwdPrest, String categorie, String specialite, boolean mailValide, boolean compteValide, boolean premium, String datePayement) {
        this.nomPrest = nomPrest;
        this.descPrest = descPrest;
        this.adrPrest = adrPrest;
        this.villePrest = villePrest;
        this.imgPrest = imgPrest;
        this.telMobilePrest = telMobilePrest;
        this.telFixePrest = telFixePrest;
        this.emailPrest = emailPrest;
        this.pwdPrest = pwdPrest;
        this.categorie = categorie;
        this.specialite = specialite;
        this.mailValide = mailValide;
        this.compteValide = compteValide;
        this.premium = premium;
        this.datePayement = datePayement;
    }

    public Prestataire(int idPrest, String nomPrest, String descPrest, String adrPrest, String villePrest, String imgPrest, String telMobilePrest, String telFixePrest, String emailPrest, String pwdPrest, String categorie, String specialite, boolean mailValide, boolean compteValide, boolean premium, String datePayement) {
        this.idPrest = idPrest;
        this.nomPrest = nomPrest;
        this.descPrest = descPrest;
        this.adrPrest = adrPrest;
        this.villePrest = villePrest;
        this.imgPrest = imgPrest;
        this.telMobilePrest = telMobilePrest;
        this.telFixePrest = telFixePrest;
        this.emailPrest = emailPrest;
        this.pwdPrest = pwdPrest;
        this.categorie = categorie;
        this.specialite = specialite;
        this.mailValide = mailValide;
        this.compteValide = compteValide;
        this.premium = premium;
        this.datePayement = datePayement;
    }
    
  
    public int getIdPrest() {
        return idPrest;
    }

    public void setIdPrest(int idPrest) {
        this.idPrest = idPrest;
    }

    public String getNomPrest() {
        return nomPrest;
    }

    public void setNomPrest(String nomPrest) {
        this.nomPrest = nomPrest;
    }

    public String getDescPrest() {
        return descPrest;
    }

    public void setDescPrest(String descPrest) {
        this.descPrest = descPrest;
    }

    public String getAdrPrest() {
        return adrPrest;
    }

    public void setAdrPrest(String adrPrest) {
        this.adrPrest = adrPrest;
    }

    public String getVillePrest() {
        return villePrest;
    }

    public void setVillePrest(String villePrest) {
        this.villePrest = villePrest;
    }

    public String getImgPrest() {
        return imgPrest;
    }

    public void setImgPrest(String imgPrest) {
        this.imgPrest = imgPrest;
    }

    public String getTelMobilePrest() {
        return telMobilePrest;
    }

    public void setTelMobilePrest(String telMobilePrest) {
        this.telMobilePrest = telMobilePrest;
    }

    public String getTelFixePrest() {
        return telFixePrest;
    }

    public void setTelFixePrest(String telFixePrest) {
        this.telFixePrest = telFixePrest;
    }

    public String getEmailPrest() {
        return emailPrest;
    }

    public void setEmailPrest(String emailPrest) {
        this.emailPrest = emailPrest;
    }

    public String getPwdPrest() {
        return pwdPrest;
    }

    public void setPwdPrest(String pwdPrest) {
        this.pwdPrest = pwdPrest;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public boolean isMailValide() {
        return mailValide;
    }

    public void setMailValide(boolean mailValide) {
        this.mailValide = mailValide;
    }

    public boolean isCompteValide() {
        return compteValide;
    }

    public void setCompteValide(boolean compteValide) {
        this.compteValide = compteValide;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String getDatePayement() {
        return datePayement;
    }

    public void setDatePayement(String datePayement) {
        this.datePayement = datePayement;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.emailPrest);
        hash = 67 * hash + Objects.hashCode(this.pwdPrest);
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
        final Prestataire other = (Prestataire) obj;
        if (!Objects.equals(this.emailPrest, other.emailPrest)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
       return "Prestataire{"  + " nomPrest=" + nomPrest + ", descPrest=" + descPrest + ", adrPrest=" + adrPrest + ", villePrest=" + villePrest +  ", telMobilePrest=" + telMobilePrest + ", telFixePrest=" + telFixePrest + ", emailPrest=" + emailPrest +  ", categorie=" + categorie + ", specialite=" + specialite +   ", premium=" + premium + ", datePayement=" + datePayement + '}';
      }
   
}
