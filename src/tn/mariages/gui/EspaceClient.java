/*
 * Copyright (C) 2014 cyrine
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
package tn.mariages.gui;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import tn.mariages.dao.ClientDAO;
import tn.mariages.dao.PaquetDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.dao.panierPaquetDAO;
import tn.mariages.dao.panierProduitDAO;
import tn.mariages.entities.Client;
import tn.mariages.entities.PanierPaquet;
import tn.mariages.entities.PanierProduit;
import tn.mariages.entities.Paquet;
import tn.mariages.entities.Produit;

/**
 *
 * @author cyrine
 */
public class EspaceClient extends javax.swing.JFrame {

    /**
     * Creates new form EspaceClient
     */
    int id;
    public EspaceClient() {
        
        
        initComponents();
        
         tablePaquet.getColumnModel().getColumn(0).setMinWidth(0);
        tablePaquet.getColumnModel().getColumn(0).setMaxWidth(0);
        
        
         tablePaquet.getColumnModel().getColumn(4).setMinWidth(0);
        tablePaquet.getColumnModel().getColumn(4).setMaxWidth(0);
        
        
         tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tablepanierproduit.getColumnModel().getColumn(0).setMinWidth(0);
        tablepanierproduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tablepanierproduit.getColumnModel().getColumn(1).setMinWidth(0);
        tablepanierproduit.getColumnModel().getColumn(1).setMaxWidth(0);
        
        tablePanier.getColumnModel().getColumn(0).setMinWidth(0);
        tablePanier.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tablePanier.getColumnModel().getColumn(1).setMinWidth(0);
        tablePanier.getColumnModel().getColumn(1).setMaxWidth(0);
        Client c=new Client ();
            ClientDAO clDAo=new ClientDAO();
            c=clDAo.findClientById(23);
            Idclient.setText(c.getIdClient()+"");
            Idclient.setVisible(false);
            NomClient.setText(c.getNomDeFamille()+ " "+c.getPrenomMari());
            labNomMari.setText(c.getPrenomMari());
            LabPrenomEpouse.setText(c.getPrenomEpouse());
            LabNom.setText(c.getNomDeFamille());
            labemail.setText(c.getEmailClient());
            LabVille.setText(c.getVilleClient());
            LabTel.setText(c.getTelClient());
            LabBudget.setText(c.getBudget()+"");
            LabDateDebut.setText(c.getDateDebut());
            LabDateFin.setText(c.getDateFin());
          this.id=c.getIdClient();
        
    }
     public EspaceClient(int id,String type) {
         
         try
    {
        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
            UIManager.put("RootPane.setupButtonVisible", false);

    }
    catch(Exception e)
    {
        //TODO exception
    }
         
        initComponents();
      if(type.equals("c")){
            Client c=new Client ();
            ClientDAO clDAo=new ClientDAO();
            c=clDAo.findClientById(id);
            Idclient.setText(c.getIdClient()+"");
            Idclient.setVisible(false);
            NomClient.setText(c.getNomDeFamille()+ " "+c.getPrenomMari());
            labNomMari.setText(c.getPrenomMari());
            LabPrenomEpouse.setText(c.getPrenomEpouse());
            LabNom.setText(c.getNomDeFamille());
            labemail.setText(c.getEmailClient());
            LabVille.setText(c.getVilleClient());
            LabTel.setText(c.getTelClient());
            LabBudget.setText(c.getBudget()+"");
            LabDateDebut.setText(c.getDateDebut());
            LabDateFin.setText(c.getDateFin());
            this.id=c.getIdClient();
            
             ImageIcon icon;
            try {
                icon = new ImageIcon(new URL(c.getImgClient().toString()));
                 icon = new ImageIcon(icon.getImage().getScaledInstance(180, 180, BufferedImage.SCALE_SMOOTH));
 LabImageClient.setIcon(icon);     

            } catch (MalformedURLException ex) {
                Logger.getLogger(ListeFeatProd.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                        Idclient.setVisible(false);
      }
        
        
    }
        String[] categorie = {"  ", "La mariée", "le mari", "Beauté", "La réception", "Gastronomie", "Annimation", "Voyages", "Photographe","prix total"};
         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AjouterPanier = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LabPrenomEpouse = new javax.swing.JLabel();
        labNomMari = new javax.swing.JLabel();
        LabNom = new javax.swing.JLabel();
        labemail = new javax.swing.JLabel();
        LabVille = new javax.swing.JLabel();
        LabDateDebut = new javax.swing.JLabel();
        LabBudget = new javax.swing.JLabel();
        LabTel = new javax.swing.JLabel();
        LabDateFin = new javax.swing.JLabel();
        BtnModifierProfil = new javax.swing.JButton();
        LabImageClient = new javax.swing.JLabel();
        ListToDo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePanier = new javax.swing.JTable();
        Supprimer = new javax.swing.JButton();
        Prixtotal = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablepanierproduit = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cmbCategorieProduit = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfNomProduit = new javax.swing.JTextField();
        btnAjoutProdPanier = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableProduit = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePaquet = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        TFnOMpaquet = new javax.swing.JTextField();
        btnAjoutPaquPanier = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Deconnexion = new javax.swing.JButton();
        Idclient = new javax.swing.JLabel();
        NomClient = new javax.swing.JLabel();
        btnRec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Profil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setText("Prenom du mari:");

        jLabel2.setText("Prenom de l'épouse:");

        jLabel3.setText("Nom de famille:");

        jLabel4.setText("E-mail:");

        jLabel5.setText("Ville:");

        jLabel6.setText("Téléphone:");

        jLabel7.setText("Budget:");

        jLabel8.setText("Date début mariage:");

        jLabel9.setText("Date fin  mariage:");

        LabPrenomEpouse.setText("jLabel10");

        labNomMari.setText("jLabel11");

        LabNom.setText("jLabel12");

        labemail.setText("jLabel13");

        LabVille.setText("jLabel14");

        LabDateDebut.setText("jLabel15");

        LabBudget.setText("jLabel16");

        LabTel.setText("jLabel17");

        LabDateFin.setText("jLabel18");

        BtnModifierProfil.setText("Modifier");
        BtnModifierProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifierProfilActionPerformed(evt);
            }
        });

        LabImageClient.setText("jLabel12");

        ListToDo.setText("Liste toDo");
        ListToDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListToDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labNomMari)
                            .addComponent(LabNom)
                            .addComponent(LabPrenomEpouse)))
                    .addComponent(LabImageClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtnModifierProfil)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabDateFin)
                                        .addComponent(LabBudget)
                                        .addComponent(LabDateDebut)
                                        .addComponent(LabTel)
                                        .addComponent(labemail)
                                        .addComponent(LabVille)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListToDo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labemail)
                            .addComponent(ListToDo))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LabVille))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(LabTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(LabBudget))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(LabDateDebut)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(LabImageClient, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(LabDateFin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labNomMari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LabPrenomEpouse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LabNom)
                            .addComponent(BtnModifierProfil))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panier", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tablePanier.setModel(new MyTablePanier());
        jScrollPane1.setViewportView(tablePanier);

        Supprimer.setText("Supprimer");
        Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerActionPerformed(evt);
            }
        });

        Prixtotal.setText("jLabel12");

        jLabel12.setText("Prix total:");

        tablepanierproduit.setModel(new MytablePanierProduitModel());
        jScrollPane2.setViewportView(tablepanierproduit);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(85, 85, 85)
                        .addComponent(Prixtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Supprimer)
                                .addGap(209, 209, 209))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prixtotal)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addComponent(Supprimer))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        cmbCategorieProduit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategorieProduitItemStateChanged(evt);
            }
        });
        cmbCategorieProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategorieProduitActionPerformed(evt);
            }
        });

        jLabel11.setText("Catégorie:");

        jLabel13.setText("Nom:");

        btnAjoutProdPanier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutProdPanierActionPerformed(evt);
            }
        });

        tableProduit.setModel(new MyTableProduit());
        tableProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProduitMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableProduit);

        jButton1.setText("Commentaires");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbCategorieProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(tfNomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAjoutProdPanier)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategorieProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(tfNomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjoutProdPanier, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Paquet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        tablePaquet.setModel( new TableListPaquetModel());
        tablePaquet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePaquetMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePaquet);

        jLabel16.setText("Nom:");

        btnAjoutPaquPanier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutPaquPanierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAjoutPaquPanier, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFnOMpaquet, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TFnOMpaquet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAjoutPaquPanier, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Espace client");

        Deconnexion.setText("Dec");
        Deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeconnexionActionPerformed(evt);
            }
        });

        Idclient.setText("jLabel14");

        NomClient.setText("jLabel14");

        btnRec.setText("Ajouter Reclamation");
        btnRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AjouterPanierLayout = new javax.swing.GroupLayout(AjouterPanier);
        AjouterPanier.setLayout(AjouterPanierLayout);
        AjouterPanierLayout.setHorizontalGroup(
            AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjouterPanierLayout.createSequentialGroup()
                .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(AjouterPanierLayout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Idclient)
                .addGap(53, 53, 53)
                .addComponent(btnRec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Deconnexion)
                .addContainerGap())
        );
        AjouterPanierLayout.setVerticalGroup(
            AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjouterPanierLayout.createSequentialGroup()
                .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AjouterPanierLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Idclient))
                            .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Deconnexion)
                                .addComponent(NomClient))))
                    .addComponent(btnRec, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AjouterPanierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AjouterPanier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(AjouterPanier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        
        
       
        
        for (int i = 0; i < categorie.length; i++) {
            cmbCategorieProduit.addItem(categorie[i]);

        }
        
        
        
        double prix=0;
        PaquetDAO pdao=new PaquetDAO();
          List<PanierPaquet> mylist=new panierPaquetDAO().DisplayPanierPaquetByClient(Integer.parseInt(Idclient.getText()));
          
              for(PanierPaquet p : mylist){
             
               Paquet paquet=pdao.FindPaquetById( p.getIdPaquet());
               prix+=paquet.getPrixPaquet();
               
              }
              ProduitDAO pd=new ProduitDAO();
              List<PanierProduit> mylist1=new panierProduitDAO().DiplayPanierProduitByClient(Integer.parseInt(Idclient.getText()));
              for(PanierProduit p1 : mylist1){
             
               Produit produit=pd.DisplayProdByID(p1.getIdProd());
               prix+=produit.getPrixProd();
               
              }
              
              Prixtotal.setText(prix+"");
          
        
        


    }//GEN-LAST:event_formWindowOpened

    private void btnAjoutProdPanierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutProdPanierActionPerformed
            
        if(tableProduit.getSelectedRow()!=-1){
            
            Produit  p=new Produit();
            PanierProduit   panierProd=new PanierProduit();
            ProduitDAO proddao=new ProduitDAO();
            panierProduitDAO panierproduitdao=new panierProduitDAO();
            p= proddao.DisplayProdByID((int) tableProduit.getValueAt(tableProduit.getSelectedRow(), 0));
            panierProd.setIdProd(p.getIdProd());
              panierProd.setIdClient(Integer.parseInt(Idclient.getText()));
             
            panierProd.setDateAjout(p.getDateAjoutProd());
           System.out.println("date"+panierProd.toString());
            panierproduitdao.insertPanierProduit(panierProd);
            
         MytablePanierProduitModel  model1 = new MytablePanierProduitModel();
                    tablepanierproduit.setModel(model1);
                    tablepanierproduit.getColumnModel().getColumn(0).setMinWidth(0);
        tablepanierproduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tablepanierproduit.getColumnModel().getColumn(1).setMinWidth(0);
        tablepanierproduit.getColumnModel().getColumn(1).setMaxWidth(0);
        double prix=0;
        PaquetDAO pdao=new PaquetDAO();
          List<PanierPaquet> mylist=new panierPaquetDAO().DisplayPanierPaquetByClient(Integer.parseInt(Idclient.getText()));
          
              for(PanierPaquet p1 : mylist){
             
               Paquet paquet=pdao.FindPaquetById( p1.getIdPaquet());
               prix+=paquet.getPrixPaquet();
               
              }
              
              ProduitDAO pd=new ProduitDAO();
              List<PanierProduit> mylist1=new panierProduitDAO().DiplayPanierProduitByClient(Integer.parseInt(Idclient.getText()));
              for(PanierProduit p1 : mylist1){
             
               Produit produit=pd.DisplayProdByID(p1.getIdProd());
               prix+=produit.getPrixProd();
               
              }
              Prixtotal.setText(prix+"");
           
        }else
        {
            int d=JOptionPane.OK_CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez pas sélectionnez un produit","erreur",d);
            
        }


    }//GEN-LAST:event_btnAjoutProdPanierActionPerformed

    private void btnAjoutPaquPanierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutPaquPanierActionPerformed

        
        if(tablePaquet.getSelectedRow()!=-1){
            
            Paquet  p=new Paquet();
            PanierPaquet   panierPaquet=new PanierPaquet();
            panierPaquetDAO panierpaquetddao=new panierPaquetDAO();
            PaquetDAO paquetdao=new PaquetDAO();
            p= paquetdao.FindPaquetById((int) tablePaquet.getValueAt(tablePaquet.getSelectedRow(), 0));
            panierPaquet.setIdPaquet(p.getIdPaquet());
              panierPaquet.setIdClient(Integer.parseInt(Idclient.getText()));
             
            panierPaquet.setDateAjout("2014-02-08");
        
            panierpaquetddao.insertPanierPaquet(panierPaquet);
            MyTablePanier  model = new MyTablePanier();
                    tablePanier.setModel(model);
                    tablePanier.getColumnModel().getColumn(0).setMinWidth(0);
        tablePanier.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tablePanier.getColumnModel().getColumn(1).setMinWidth(0);
        tablePanier.getColumnModel().getColumn(1).setMaxWidth(0);
                double prix=0;
        PaquetDAO pdao=new PaquetDAO();
          List<PanierPaquet> mylist=new panierPaquetDAO().DisplayPanierPaquetByClient(Integer.parseInt(Idclient.getText()));
          
              for(PanierPaquet p1 : mylist){
             
               Paquet paquet=pdao.FindPaquetById( p1.getIdPaquet());
               prix+=paquet.getPrixPaquet();
               
              }
              
              ProduitDAO pd=new ProduitDAO();
              List<PanierProduit> mylist1=new panierProduitDAO().DiplayPanierProduitByClient(Integer.parseInt(Idclient.getText()));
              for(PanierProduit p1 : mylist1){
             
               Produit produit=pd.DisplayProdByID(p1.getIdProd());
               prix+=produit.getPrixProd();
               
              }
              Prixtotal.setText(prix+"");
        
     
        }else
        {
            int d=JOptionPane.OK_CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez pas sélectionnez un paquet","erreur",d);
            
        }


                 

    }//GEN-LAST:event_btnAjoutPaquPanierActionPerformed

    private void cmbCategorieProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategorieProduitActionPerformed
if(cmbCategorieProduit.getSelectedIndex()==0){
            tableProduit.setModel(new MyTableProduit());
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
       
        }
        if(cmbCategorieProduit.getSelectedIndex()==1){
            tableProduit.setModel(new MyTableProduitByCat(categorie[1]));
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        }
        if(cmbCategorieProduit.getSelectedIndex()==2){
            tableProduit.setModel(new MyTableProduitByCat(categorie[2]));
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        }
        if(cmbCategorieProduit.getSelectedIndex()==3){
            tableProduit.setModel(new MyTableProduitByCat(categorie[3]));
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        }
        if(cmbCategorieProduit.getSelectedIndex()==4){
            tableProduit.setModel(new MyTableProduitByCat(categorie[4]));
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        }
        if(cmbCategorieProduit.getSelectedIndex()==5){
            tableProduit.setModel(new MyTableProduitByCat(categorie[5]));
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        }
        if(cmbCategorieProduit.getSelectedIndex()==6){
            tableProduit.setModel(new MyTableProduitByCat(categorie[6]));
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        }
        if(cmbCategorieProduit.getSelectedIndex()==7){
            tableProduit.setModel(new MyTableProduitByCat(categorie[7]));
             tableProduit.getColumnModel().getColumn(0).setMinWidth(0);
        tableProduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        }
                 
     
    }//GEN-LAST:event_cmbCategorieProduitActionPerformed

    private void cmbCategorieProduitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategorieProduitItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategorieProduitItemStateChanged

    private void SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerActionPerformed

         int dialogButton = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog (null, "Voulez vous supprimer tous les paquets selectionnés?","Warning",dialogButton);

                if(dialogButton == JOptionPane.YES_OPTION){ //The ISSUE is here
                    
                    panierProduitDAO produitDAO=new panierProduitDAO();
                    panierPaquetDAO paquetDAo = new panierPaquetDAO();
                    int id[]=new int[50];
                    int id1[]=new int[50];
                    int ids[]=new int[50];
                    int ids1[]=new int[50];
                    int j=-1;
                    int k=-1;
                    for(int i=0;i<tablePanier.getRowCount();i++){
                    Boolean b =(Boolean)tablePanier.getValueAt(i, 4);
                    
                    if(b)
                    {
                        j++;
                        k++;
                         ids[j]=(int)tablePanier.getValueAt(i, 0);
                         ids1[k]=(int)tablePanier.getValueAt(i, 1);
                    }
                      
                      
                    }
                    
                    for(int i=0;i<tablepanierproduit.getRowCount();i++){
                    Boolean b =(Boolean)tablepanierproduit.getValueAt(i, 4);
                    
                    if(b)
                    {
                        j++;
                        k++;
                         id[j]=(int)tablepanierproduit.getValueAt(i, 0);
                         id1[k]=(int)tablepanierproduit.getValueAt(i, 1);
                    }
                      
                      
                    }
                    
                    while(j!=-1 )
                    {
                        produitDAO.deletePanierProduit(id[j], id1[k]);
                        paquetDAo.deletePaniePaquet(ids[j],ids1[k]);
                        j--;
                        k--;
                    }
                   MyTablePanier  model = new MyTablePanier();
                    tablePanier.setModel(model);
                    tablePanier.getColumnModel().getColumn(0).setMinWidth(0);
        tablePanier.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tablePanier.getColumnModel().getColumn(1).setMinWidth(0);
        tablePanier.getColumnModel().getColumn(1).setMaxWidth(0);
                    
                    
                    MytablePanierProduitModel  model1 = new MytablePanierProduitModel();
                    tablepanierproduit.setModel(model1);
                    tablepanierproduit.getColumnModel().getColumn(0).setMinWidth(0);
        tablepanierproduit.getColumnModel().getColumn(0).setMaxWidth(0);
        
        tablepanierproduit.getColumnModel().getColumn(1).setMinWidth(0);
        tablepanierproduit.getColumnModel().getColumn(1).setMaxWidth(0);
                    double prix=0;
        PaquetDAO pdao=new PaquetDAO();
       ProduitDAO pd=new ProduitDAO();
          List<PanierPaquet> mylist=new panierPaquetDAO().DisplayPanierPaquetByClient(Integer.parseInt(Idclient.getText()));
          List<PanierProduit> mylist1=new panierProduitDAO().DiplayPanierProduitByClient(Integer.parseInt(Idclient.getText()));
              for(PanierPaquet p : mylist){
             
               Paquet paquet=pdao.FindPaquetById( p.getIdPaquet());
               prix+=paquet.getPrixPaquet();
               
              }
              
              for(PanierProduit p1 : mylist1){
             
               Produit produit=pd.DisplayProdByID(p1.getIdProd());
               prix+=produit.getPrixProd();
               
              }
              
              Prixtotal.setText(prix+"");
                }

    }//GEN-LAST:event_SupprimerActionPerformed

    private void tablePaquetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePaquetMouseClicked

        Paquet p=new Paquet();
        PaquetDAO pdao=new PaquetDAO();
        p=pdao.FindPaquetById((int)tablePaquet.getValueAt(tablePaquet.getSelectedRow(), 0));
        
               if(evt.getClickCount()==2){
                   
                   this.setVisible(true);
                   
                   DetailPaquet detailpaquet=new DetailPaquet(p);
                   detailpaquet.setVisible(true);
                   
               }
     
    }//GEN-LAST:event_tablePaquetMouseClicked

    private void tableProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProduitMouseClicked

          Produit p=new Produit();
          ProduitDAO pdao=new ProduitDAO();
          
          p=pdao.DisplayProdByID((int)tableProduit.getValueAt(tableProduit.getSelectedRow(), 0));
        
          if(evt.getClickCount()==2){
              
              this.setVisible(true);
              DetailsProduit detailproduit=new DetailsProduit(p);
              detailproduit.setVisible(true);
              
          }
          
                  

    }//GEN-LAST:event_tableProduitMouseClicked

    private void BtnModifierProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifierProfilActionPerformed
               
             this.setVisible(true);
             
             ModifierClient modifclient=new ModifierClient(Integer.parseInt(Idclient.getText()));
             modifclient.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             modifclient.setVisible(true);
    }//GEN-LAST:event_BtnModifierProfilActionPerformed

    private void btnRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecActionPerformed
        AjouterReclamation rec = new AjouterReclamation();
        rec.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        rec.setVisible(true);
    }//GEN-LAST:event_btnRecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
 if(tableProduit.getSelectedRow()!=-1){
            int id = (int) tableProduit.getModel().getValueAt(tableProduit.getSelectedRow(), 0);

            int idclient = Integer.parseInt(Idclient.getText());

            ListeCommentaires c = new ListeCommentaires(idclient, id);
            c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            c.setVisible(true);
 }else
        {
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
                JOptionPane.showConfirmDialog (null, "Vous n'avez selectionné aucun produit","Warning",dialogButton);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeconnexionActionPerformed
       this.setVisible(false);
          Authentication authen =new Authentication();
          authen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          authen.setVisible(true);

    }//GEN-LAST:event_DeconnexionActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
Client c=new Client ();
            ClientDAO clDAo=new ClientDAO();
            c=clDAo.findClientById(id);
            Idclient.setText(c.getIdClient()+"");
            Idclient.setVisible(false);
            NomClient.setText(c.getNomDeFamille()+ " "+c.getPrenomMari());
            labNomMari.setText(c.getPrenomMari());
            LabPrenomEpouse.setText(c.getPrenomEpouse());
            LabNom.setText(c.getNomDeFamille());
            labemail.setText(c.getEmailClient());
            LabVille.setText(c.getVilleClient());
            LabTel.setText(c.getTelClient());
            LabBudget.setText(c.getBudget()+"");
            LabDateDebut.setText(c.getDateDebut());
            LabDateFin.setText(c.getDateFin());        
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void ListToDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListToDoActionPerformed
                this.setVisible(true);
                ListeToDoClient lstToDoCl=new ListeToDoClient(id);
                lstToDoCl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               lstToDoCl.setVisible(true);
    }//GEN-LAST:event_ListToDoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EspaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspaceClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try
    {
        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
    }
    catch(Exception e)
    {
        //TODO exception
    }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EspaceClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AjouterPanier;
    private javax.swing.JButton BtnModifierProfil;
    private javax.swing.JButton Deconnexion;
    private javax.swing.JLabel Idclient;
    private javax.swing.JLabel LabBudget;
    private javax.swing.JLabel LabDateDebut;
    private javax.swing.JLabel LabDateFin;
    private javax.swing.JLabel LabImageClient;
    private javax.swing.JLabel LabNom;
    private javax.swing.JLabel LabPrenomEpouse;
    private javax.swing.JLabel LabTel;
    private javax.swing.JLabel LabVille;
    private javax.swing.JButton ListToDo;
    private javax.swing.JLabel NomClient;
    private javax.swing.JLabel Prixtotal;
    private javax.swing.JButton Supprimer;
    private javax.swing.JTextField TFnOMpaquet;
    private javax.swing.JButton btnAjoutPaquPanier;
    private javax.swing.JButton btnAjoutProdPanier;
    private javax.swing.JButton btnRec;
    private javax.swing.JComboBox cmbCategorieProduit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labNomMari;
    private javax.swing.JLabel labemail;
    private javax.swing.JTable tablePanier;
    private javax.swing.JTable tablePaquet;
    private javax.swing.JTable tableProduit;
    private javax.swing.JTable tablepanierproduit;
    private javax.swing.JTextField tfNomProduit;
    // End of variables declaration//GEN-END:variables
}
