/*
 * Copyright (C) 2014 omar
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

import java.awt.Dimension;
import javax.swing.JOptionPane;
import tn.mariages.dao.PaquetDAO;

/**
 *
 * @author omar
 */
public class ListePaquets_client extends javax.swing.JFrame {

    /**
     * Creates new form ListePaquets_client
     */
    public ListePaquets_client() {
        initComponents();
        paquet_table.getColumnModel().getColumn(0).setMinWidth(1);
        paquet_table.getColumnModel().getColumn(0).setMaxWidth(1);
        paquet_table.getColumnModel().getColumn(0).setWidth(1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        paquet_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        produit_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paquet_table.setModel(new TableListPaquetModel());
        paquet_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paquet_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(paquet_table);

        produit_table.setModel(new TableProduitPaquetModel());
        produit_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produit_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(produit_table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Liste Paquets");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paquet_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paquet_tableMouseClicked
        if (paquet_table.getSelectedRow() != -1) {
            PaquetDAO pdao = new PaquetDAO();
            int id = (Integer) paquet_table.getValueAt(paquet_table.getSelectedRow(), 0);
            String nom = (String) pdao.FindPaquetById(id).getNomPaquet();
            //labelpaquet.setText(labelpaquet.getText()+nom);
            TableProduitPaquetModel Mod = new TableProduitPaquetModel(id);
            produit_table.setModel(Mod);
            Mod.fireTableDataChanged();
            Dimension d = new Dimension(648, 570);
            this.setSize(d);
            //jPanel3.setVisible(true);

        } else {
            int dialogButton = JOptionPane.CANCEL_OPTION;
            JOptionPane.showConfirmDialog(null, "Vous n'avez selectionné aucun paquet", "Warning", dialogButton);
        }
    }//GEN-LAST:event_paquet_tableMouseClicked

    private void produit_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produit_tableMouseClicked
        if (evt.getClickCount() == 2) {

            int id = (int) produit_table.getModel().getValueAt(produit_table.getSelectedRow(), 0);

            int idclient = 1;

            ListeCommentaires c = new ListeCommentaires(idclient, id);

            c.setVisible(true);

        }
    }//GEN-LAST:event_produit_tableMouseClicked

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
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListePaquets_client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
try {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            //TODO exception
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListePaquets_client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable paquet_table;
    private javax.swing.JTable produit_table;
    // End of variables declaration//GEN-END:variables
}
