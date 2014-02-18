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
public class Client {
    
    private int idClient;
    private String prenomMari;
    private String prenomEpouse;
    private String nomDeFamille;
    
    private String imgClient;

    private String emailClient;
    private String pwdClient;
    
    private boolean cmptValide;
    
    private String villeClient;
    private String telClient;
    
    private String dateDebut;
    private String dateFin;
    
    private double budget;

    public Client() {
    }

    public Client(String prenomMari, String prenomEpouse, String nomDeFamille, String imgClient, String emailClient, String pwdClient, boolean cmptValide, String villeClient, String telClient, String dateDebut, String dateFin, double budget) {
        this.prenomMari = prenomMari;
        this.prenomEpouse = prenomEpouse;
        this.nomDeFamille = nomDeFamille;
        this.imgClient = imgClient;
        this.emailClient = emailClient;
        this.pwdClient = pwdClient;
        this.cmptValide = cmptValide;
        this.villeClient = villeClient;
        this.telClient = telClient;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.budget = budget;
    }

    public Client(int idClient, String prenomMari, String prenomEpouse, String nomDeFamille, String imgClient, String emailClient, String pwdClient, boolean cmptValide, String villeClient, String telClient, String dateDebut, String dateFin, double budget) {
        this.idClient = idClient;
        this.prenomMari = prenomMari;
        this.prenomEpouse = prenomEpouse;
        this.nomDeFamille = nomDeFamille;
        this.imgClient = imgClient;
        this.emailClient = emailClient;
        this.pwdClient = pwdClient;
        this.cmptValide = cmptValide;
        this.villeClient = villeClient;
        this.telClient = telClient;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.budget = budget;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getPrenomMari() {
        return prenomMari;
    }

    public void setPrenomMari(String prenomMari) {
        this.prenomMari = prenomMari;
    }

    public String getPrenomEpouse() {
        return prenomEpouse;
    }

    public void setPrenomEpouse(String prenomEpouse) {
        this.prenomEpouse = prenomEpouse;
    }

    public String getNomDeFamille() {
        return nomDeFamille;
    }

    public void setNomDeFamille(String nomDeFamille) {
        this.nomDeFamille = nomDeFamille;
    }

    public String getImgClient() {
        return imgClient;
    }

    public void setImgClient(String imgClient) {
        this.imgClient = imgClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getPwdClient() {
        return pwdClient;
    }

    public void setPwdClient(String pwdClient) {
        this.pwdClient = pwdClient;
    }

    public boolean isCmptValide() {
        return cmptValide;
    }

    public void setCmptValide(boolean cmptValide) {
        this.cmptValide = cmptValide;
    }

    public String getVilleClient() {
        return villeClient;
    }

    public void setVilleClient(String villeClient) {
        this.villeClient = villeClient;
    }

    public String getTelClient() {
        return telClient;
    }

    public void setTelClient(String telClient) {
        this.telClient = telClient;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.emailClient);
        hash = 79 * hash + Objects.hashCode(this.pwdClient);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.emailClient, other.emailClient)) {
            return false;
        }
        return true;
    }
    
}
