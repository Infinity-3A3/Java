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
public class Client {
    
    private int idClient;
    private String nomMari;
    private String nomMarie;
    private String prenom;
    
    private String emailClient;
    private String pwdClient;
    private String saltClient; // à voir
    
    private boolean cmptValide;
    
    private String villeClient;
    private String telClient;
    private String dateDebut; // a rajouter dates clés
    private String dateFin;
    private double budget;
    
}
