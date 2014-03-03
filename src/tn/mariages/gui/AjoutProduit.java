/*
 * Copyright (C) 2014 Youssef
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
import com.alee.laf.WebLookAndFeel;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import tn.mariages.dao.PrestataireDAO;
import tn.mariages.dao.ProduitDAO;
import tn.mariages.entities.Prestataire;
import tn.mariages.entities.Produit;

/**
 *
 * @author Youssef
 */
public class AjoutProduit extends javax.swing.JFrame {

    String[] Categories = {"Salles de Fetes", "Centres de Coiffures", "Troupe Musical", "Photographe", "Agence de voyages de noces", "Restaurant", "Decorateur", "Fleuriste"};

    /**
     *
     * Creates new form AjoutProduit
     */
    public AjoutProduit() {
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

        ImgChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfnomProduit = new javax.swing.JTextField();
        tfPrixProduit = new javax.swing.JTextField();
        btnAjoutImage = new javax.swing.JButton();
        cmbCategorieProduit = new javax.swing.JComboBox();
        btnAjoutProduit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        tfImgProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescProduit = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        cmbPrestataire = new javax.swing.JComboBox();
        btnAjoutimg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(32750, 32750));

        jLabel1.setText("Nom Du Produit :");

        jLabel2.setText("Description : ");

        jLabel3.setText("Categorie :");

        jLabel4.setText("Prix");

        jLabel5.setText("Images");

        tfnomProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnomProduitActionPerformed(evt);
            }
        });

        tfPrixProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrixProduitActionPerformed(evt);
            }
        });

        btnAjoutImage.setText("Parcourir");
        btnAjoutImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutImageActionPerformed(evt);
            }
        });

        cmbCategorieProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategorieProduitActionPerformed(evt);
            }
        });

        btnAjoutProduit.setText("Ajouter");
        btnAjoutProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutProduitActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tfDescProduit.setColumns(20);
        tfDescProduit.setRows(5);
        jScrollPane1.setViewportView(tfDescProduit);

        jLabel6.setText("Prestataire :");

        cmbPrestataire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrestataireActionPerformed(evt);
            }
        });

        btnAjoutimg.setText("Ajouter une autre image");
        btnAjoutimg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutimgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfnomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnAjoutProduit)
                                .addGap(147, 147, 147)
                                .addComponent(btnReset))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnAjoutimg, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAjoutImage))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbPrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbCategorieProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfPrixProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfImgProd, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfnomProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbPrestataire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbCategorieProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrixProduit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfImgProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutImage)
                    .addComponent(btnAjoutimg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjoutProduit)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnomProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnomProduitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnomProduitActionPerformed

    
    
    
    private void tfPrixProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrixProduitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrixProduitActionPerformed

    private void btnAjoutImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutImageActionPerformed
        ImgChooser = new JFileChooser();
        ImgChooser.showOpenDialog(this);
        tfImgProd.setText(ImgChooser.getSelectedFile().getAbsolutePath());

    }//GEN-LAST:event_btnAjoutImageActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed


    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAjoutProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutProduitActionPerformed
        ProduitDAO myDAO = new ProduitDAO();
        PrestataireDAO myDAO1 = new PrestataireDAO();
        Produit p = new Produit();
        Date myDate = new Date();
        p.setNomProd(tfnomProduit.getText());
        p.setCategorieProd(cmbCategorieProduit.getSelectedItem().toString());
        p.setPrixProd(Integer.parseInt(tfPrixProduit.getText()));
        p.setDescProd(tfDescProduit.getText());
        p.setShortDescProd(tfDescProduit.getText().substring(0, 10) + "...");
        p.setDateAjoutProd(myDate.toString());
        p.setIdPrest(myDAO1.findPrestByNomPrest(cmbPrestataire.getSelectedItem().toString()).getIdPrest());
        p.setImgProd_1(tfImgProd.getText());
        myDAO.InsertProduit(p);

         
    }//GEN-LAST:event_btnAjoutProduitActionPerformed

    private void cmbCategorieProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategorieProduitActionPerformed


    }//GEN-LAST:event_cmbCategorieProduitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (int i = 0; i < 7; i++) {
            cmbCategorieProduit.addItem(Categories[i]);
        }
        PrestataireDAO myAO = new PrestataireDAO();
        List<Prestataire> myList = new ArrayList<>();
        myList = myAO.DisplayAllPrestataire();
        for (int i = 0; i < myList.size(); i++) {
            cmbPrestataire.addItem(myList.get(i).getNomPrest());

        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbPrestataireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrestataireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPrestataireActionPerformed

    private void btnAjoutimgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutimgActionPerformed
     
    }//GEN-LAST:event_btnAjoutimgActionPerformed

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
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                javax.swing.UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install();
                WebLookAndFeel.setDecorateAllWindows(true);
              new AjoutProduit().setVisible(true);

            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser ImgChooser;
    private javax.swing.JButton btnAjoutImage;
    private javax.swing.JButton btnAjoutProduit;
    private javax.swing.JButton btnAjoutimg;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox cmbCategorieProduit;
    private javax.swing.JComboBox cmbPrestataire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfDescProduit;
    private javax.swing.JTextField tfImgProd;
    private javax.swing.JTextField tfPrixProduit;
    private javax.swing.JTextField tfnomProduit;
    // End of variables declaration//GEN-END:variables

}
