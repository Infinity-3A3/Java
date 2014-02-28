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
public class Admin {
    
    private int idAdmin;
    private String nomAdmin;
    private String mailAdmin;
    private String pwdAdmin;

    public Admin() {
    }

    public Admin(String nomAdmin, String mailAdmin, String pwdAdmin) {
        this.nomAdmin = nomAdmin;
        this.mailAdmin = mailAdmin;
        this.pwdAdmin = pwdAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNomAdmin() {
        return nomAdmin;
    }

    public void setNomAdmin(String nomAdmin) {
        this.nomAdmin = nomAdmin;
    }

    public String getMailAdmin() {
        return mailAdmin;
    }

    public void setMailAdmin(String mailAdmin) {
        this.mailAdmin = mailAdmin;
    }

    public String getPwdAdmin() {
        return pwdAdmin;
    }

    public void setPwdAdmin(String pwdAdmin) {
        this.pwdAdmin = pwdAdmin;
    }
/*
 * Comparer mail + pwd (login)
 */
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.mailAdmin);
        hash = 97 * hash + Objects.hashCode(this.pwdAdmin);
        return hash;
    }
/*
 * Comparer les email
 */
    @Override 
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        if (!Objects.equals(this.mailAdmin, other.mailAdmin)) {
            return false;
        }
        return true;
    }
  
    
}
