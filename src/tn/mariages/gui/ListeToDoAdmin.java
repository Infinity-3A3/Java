/*
 * Copyright (C) 2014 Karim
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


import javax.swing.JOptionPane;
import tn.mariages.dao.PaquetDAO;
import tn.mariages.entities.ToDo;
import tn.mariages.dao.ToDoDAO;
import tn.mariages.gui.AjoutToDo;
/**
 *
 * @author Karim
 */
public class ListeToDoAdmin extends javax.swing.JFrame {

    /**
     * Creates new form ListeToDoAdmin
     */
    public ListeToDoAdmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableListeToDO = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        AjouterToDo = new javax.swing.JButton();
        ModifierToDo = new javax.swing.JButton();
        SupprimerToDo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableListeToDO.setModel(new TableListeToDoModel());
        jScrollPane1.setViewportView(tableListeToDO);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Liste des ToDo");

        AjouterToDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circle_plus.png"))); // NOI18N
        AjouterToDo.setText("Ajouter");
        AjouterToDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterToDoActionPerformed(evt);
            }
        });

        ModifierToDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Modify-icon.png"))); // NOI18N
        ModifierToDo.setText("Modifier");
        ModifierToDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierToDoActionPerformed(evt);
            }
        });

        SupprimerToDo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circle_delete.png"))); // NOI18N
        SupprimerToDo.setText("Supprimer");
        SupprimerToDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerToDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(AjouterToDo)
                                .addGap(69, 69, 69)
                                .addComponent(ModifierToDo)
                                .addGap(67, 67, 67)
                                .addComponent(SupprimerToDo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjouterToDo)
                    .addComponent(ModifierToDo)
                    .addComponent(SupprimerToDo))
                .addGap(28, 28, 28))
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

    private void ModifierToDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierToDoActionPerformed
        if(tableListeToDO.getSelectedRow()!=-1){
        ToDo t = new ToDo();
        ToDoDAO todoDAO=new ToDoDAO();
        t=todoDAO.findToDoById((int)tableListeToDO.getValueAt(tableListeToDO.getSelectedRow(), 0));
       
        AjoutToDo modifierToDo = new AjoutToDo(t);
        modifierToDo.setVisible(true);
        }
        else
        {
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
                JOptionPane.showConfirmDialog (null, "Vous n'avez selectionné aucune todo","Warning",dialogButton);
        }
    }//GEN-LAST:event_ModifierToDoActionPerformed

    private void AjouterToDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterToDoActionPerformed
AjoutToDo ajoutertodo=new AjoutToDo();

ajoutertodo.setVisible(true);
    }//GEN-LAST:event_AjouterToDoActionPerformed

    private void SupprimerToDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerToDoActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog (null, "Voulez vous supprimer tous les todo selectionnés?","Warning",dialogButton);

                if(dialogButton == JOptionPane.YES_OPTION){ //The ISSUE is here
                    
                    ToDoDAO todoDAO=new ToDoDAO();
                    int id[]=new int[50];
                    int j=-1;
                    System.out.println(tableListeToDO.getRowCount());
                    for(int i=0;i<tableListeToDO.getRowCount();i++){
                    Boolean test =(Boolean)tableListeToDO.getValueAt(i,4);
                        System.out.println(test);
                    if(test)
                    {
                        j++;
                        id[j]=(int)tableListeToDO.getValueAt(i, 0);
                    }
                      
                      
                    }
                    while(j!=-1)
                    {
                        todoDAO.deleteToDo(id[j]);
                        j--;
                    }
                    TableListeToDoModel model = new TableListeToDoModel();
                    tableListeToDO.setModel(model);
                }
    }//GEN-LAST:event_SupprimerToDoActionPerformed

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
            java.util.logging.Logger.getLogger(ListeToDoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListeToDoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListeToDoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListeToDoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListeToDoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterToDo;
    private javax.swing.JButton ModifierToDo;
    private javax.swing.JButton SupprimerToDo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableListeToDO;
    // End of variables declaration//GEN-END:variables
}
