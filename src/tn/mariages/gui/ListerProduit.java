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
package tn.mariages.gui;

import aurelienribon.dialogdemo.MyDialog;
import aurelienribon.dialogdemo.SwingUtils;
import com.alee.extended.image.WebImage;
import com.alee.laf.WebLookAndFeel;
import com.alee.laf.label.WebLabel;
import com.alee.managers.notification.NotificationManager;
import com.alee.managers.notification.WebNotificationPopup;
import com.alee.managers.tooltip.TooltipManager;
import com.alee.managers.tooltip.TooltipWay;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import tn.mariages.dao.PaquetDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.dao.ProduitPaquetDAO;
import tn.mariages.entities.Paquet;
import tn.mariages.entities.Produit;

/**
 *
 * @author RAED
 */
public class ListerProduit extends javax.swing.JFrame {

    String[] Categories = {"Tous", "Salles de Fetes", "Centres de Coiffures", "Troupe Musical", "Photographe", "Agence de voyages de noces", "Restaurant", "Decorateur", "Fleuriste"};
    private static final Map<String, ImageIcon> iconsCache = new HashMap<String, ImageIcon>();

    /**
     * Creates new form Lister_Prod
     */
    public ListerProduit() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProduits = new javax.swing.JPanel();
        btnAjoutProd = new javax.swing.JButton();
        btnModifProd = new javax.swing.JButton();
        btnSuppProd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cmbCategorieProduit = new javax.swing.JComboBox();
        btnAffImg = new com.alee.laf.button.WebButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlProduits.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produits", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Meiryo UI", 0, 24))); // NOI18N

        btnAjoutProd.setText("Ajouter Produit");
        btnAjoutProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutProdActionPerformed(evt);
            }
        });

        btnModifProd.setText("Modifier Produit");
        btnModifProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifProdActionPerformed(evt);
            }
        });

        btnSuppProd.setText("Supprimer Produit");
        btnSuppProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppProdActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new MyTableProduit()
        );
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowSorter(null);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Filtrer par categories : ");

        cmbCategorieProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategorieProduitActionPerformed(evt);
            }
        });

        btnAffImg.setText("Afficher Image Produit");
        btnAffImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAffImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAffImg, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbCategorieProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCategorieProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAffImg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout pnlProduitsLayout = new javax.swing.GroupLayout(pnlProduits);
        pnlProduits.setLayout(pnlProduitsLayout);
        pnlProduitsLayout.setHorizontalGroup(
            pnlProduitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProduitsLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnAjoutProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModifProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSuppProd)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlProduitsLayout.setVerticalGroup(
            pnlProduitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProduitsLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProduitsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutProd)
                    .addComponent(btnModifProd)
                    .addComponent(btnSuppProd)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProduits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProduits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        for (int i = 0; i < 7; i++) {
            cmbCategorieProduit.addItem(Categories[i]);
        }
        // TODO add your handling code here:
 jTable1.getColumnModel().getColumn(0).setMinWidth(0);
 jTable1.getColumnModel().getColumn(0).setMaxWidth(0);

    }//GEN-LAST:event_formWindowOpened

    private void btnAjoutProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutProdActionPerformed
        AjoutProduit myAjoutProduit = new AjoutProduit();
        myAjoutProduit.setVisible(true);

    }//GEN-LAST:event_btnAjoutProdActionPerformed

    private void cmbCategorieProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategorieProduitActionPerformed
        if (cmbCategorieProduit.getSelectedIndex() == 0) {
            jTable1.setModel(new MyTableProduit());
        }
        if (cmbCategorieProduit.getSelectedIndex() == 1) {
            jTable1.setModel(new MyTableProduitByCat(Categories[1]));
        }
        if (cmbCategorieProduit.getSelectedIndex() == 2) {
            jTable1.setModel(new MyTableProduitByCat(Categories[2]));
        }
        if (cmbCategorieProduit.getSelectedIndex() == 3) {
            jTable1.setModel(new MyTableProduitByCat(Categories[3]));
        }
        if (cmbCategorieProduit.getSelectedIndex() == 4) {
            jTable1.setModel(new MyTableProduitByCat(Categories[4]));
        }
        if (cmbCategorieProduit.getSelectedIndex() == 5) {
            jTable1.setModel(new MyTableProduitByCat(Categories[5]));
        }
        if (cmbCategorieProduit.getSelectedIndex() == 6) {
            jTable1.setModel(new MyTableProduitByCat(Categories[6]));
        }
        if (cmbCategorieProduit.getSelectedIndex() == 7) {
            jTable1.setModel(new MyTableProduitByCat(Categories[7]));
        }

    }//GEN-LAST:event_cmbCategorieProduitActionPerformed

    private void btnSuppProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppProdActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Voulez vous supprimer tous les produits selectionnés?", "Warning", dialogButton);

        if (dialogButton == JOptionPane.YES_OPTION) { //The ISSUE is here
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                Boolean b = (Boolean) jTable1.getValueAt(i, 6);
                if (b) {
                    new ProduitDAO().DeleteProd((int) jTable1.getValueAt(i, 0));
                    WebNotificationPopup pop = new WebNotificationPopup();
                    pop.setContent("Le Produit a ete supprimer avec succes");
                    pop.setDisplayTime(5000);

                    NotificationManager.showNotification(pop);

                }
            }
            MyTableProduit model = new MyTableProduit();
            jTable1.setModel(model);
            cmbCategorieProduit.setSelectedIndex(0);
        }


    }//GEN-LAST:event_btnSuppProdActionPerformed

    private void btnModifProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifProdActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            Produit p = new Produit();

            p = new ProduitDAO().DisplayProdByID((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
          ModifierProduit MP = new ModifierProduit(p.getIdProd());
        MP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        MP.setVisible(true);
        } else {
            int dialogButton = JOptionPane.CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez selectionné aucun paquet", "Warning", dialogButton);
        }
    }//GEN-LAST:event_btnModifProdActionPerformed

    private void btnAffImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAffImgActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            Produit p = new Produit();

            p = new ProduitDAO().DisplayProdByID((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            ImageIcon img;
            try {
                img = new ImageIcon(new URL(p.getImgProd_P().toString()));
                img = new ImageIcon(img.getImage().getScaledInstance(150, 150, BufferedImage.SCALE_SMOOTH));
                jLabel3.setIcon(img);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ListerProduit.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                img = new ImageIcon(new URL(p.getImgProd_1().toString()));
                img = new ImageIcon(img.getImage().getScaledInstance(150, 150, BufferedImage.SCALE_SMOOTH));
                jLabel4.setIcon(img);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ListerProduit.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                img = new ImageIcon(new URL(p.getImgProd_2().toString()));
                img = new ImageIcon(img.getImage().getScaledInstance(150, 150, BufferedImage.SCALE_SMOOTH));
                jLabel5.setIcon(img);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ListerProduit.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                img = new ImageIcon(new URL(p.getImgProd_3().toString()));
                img = new ImageIcon(img.getImage().getScaledInstance(150, 150, BufferedImage.SCALE_SMOOTH));
                jLabel6.setIcon(img);
            } catch (MalformedURLException ex) {
                Logger.getLogger(ListerProduit.class.getName()).log(Level.SEVERE, null, ex);
            }
//            
//            ImageIcon img1 = new ImageIcon(p.getImgProd_1());
//            img1 = new ImageIcon(img1.getImage().getScaledInstance(180, 180, BufferedImage.SCALE_SMOOTH));
//            ImageIcon img2 = new ImageIcon(p.getImgProd_1());
//            img2 = new ImageIcon(img2.getImage().getScaledInstance(180, 180, BufferedImage.SCALE_SMOOTH));
//            ImageIcon img3 = new ImageIcon(p.getImgProd_1());
//            img3 = new ImageIcon(img3.getImage().getScaledInstance(180, 180, BufferedImage.SCALE_SMOOTH));
//            ImageIcon img4 = new ImageIcon(p.getImgProd_1());
//            img4 = new ImageIcon(img4.getImage().getScaledInstance(180, 180, BufferedImage.SCALE_SMOOTH));
//            System.out.println(p.getImgProd_1());
//            
//            
//            jLabel4.setIcon(img1);
//            jLabel5.setIcon(img2);
//            jLabel6.setIcon(img3);
        } else {
            int dialogButton = JOptionPane.CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez selectionné aucun paquet", "Warning", dialogButton);
        }
    }//GEN-LAST:event_btnAffImgActionPerformed

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
//                if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
//                    break;
//                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListerProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListerProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListerProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListerProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            //TODO exception
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                WebLookAndFeel.install();
//                WebLookAndFeel.setDecorateAllWindows(true);
                new ListerProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.button.WebButton btnAffImg;
    private javax.swing.JButton btnAjoutProd;
    private javax.swing.JButton btnModifProd;
    private javax.swing.JButton btnSuppProd;
    private javax.swing.JComboBox cmbCategorieProduit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlProduits;
    // End of variables declaration//GEN-END:variables
}
