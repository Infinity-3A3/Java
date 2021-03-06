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
import javax.swing.UIManager;
import tn.mariages.dao.ClientDAO;
import tn.mariages.dao.ToDoDAO;
import tn.mariages.entities.Client;
import tn.mariages.entities.ToDo;

/**
 *
 * @author Karim
 */
public class AjouterToDoClient extends javax.swing.JFrame {
ToDo todo1=new ToDo();
    /**
     * Creates new form AjouterToDoClient
     */
    public AjouterToDoClient() {
        initComponents();
        btnModifier.setVisible(false);
         jLabel4.setText("AJouter une todo");
       
    }
public AjouterToDoClient(int id) {
        initComponents();
        btnModifier.setVisible(false);
         jLabel4.setText("AJouter une todo");
         idcl.setText(id+"");
         idcl.setVisible(false);
    }
    
     public AjouterToDoClient(ToDo t) {
        initComponents();
           jLabel4.setText("Modifier le paquet "+t.getIdToDo());
     btnAjouter.setVisible(false);
     tfTitre.setText(t.getTitreToDo());
     tfDescription.setText(t.getDescToDo());
    
     cbUrgent.setSelected(t.isLabelUrgent());
     cbRDV.setSelected(t.isLabelRDV());
     cbPayement.setSelected(t.isLabelPayement());
     todo1=t;
  
        
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
        jLabel1 = new javax.swing.JLabel();
        tfTitre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateToDo = new com.toedter.calendar.JDateChooser();
        cbUrgent = new javax.swing.JCheckBox();
        cbRDV = new javax.swing.JCheckBox();
        cbPayement = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescription = new javax.swing.JTextArea();
        btnAjouter = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idcl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Titre :");

        jLabel2.setText("Description :");

        jLabel3.setText("Date :");

        cbUrgent.setText("Urgent");

        cbRDV.setText("Rendez-vous");

        cbPayement.setText("Payement");

        tfDescription.setColumns(20);
        tfDescription.setRows(5);
        jScrollPane1.setViewportView(tfDescription);

        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/circle_plus.png"))); // NOI18N
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/Modify-icon.png"))); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Ajouter une ToDo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateToDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addComponent(tfTitre)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(cbUrgent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbRDV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAjouter)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModifier)
                            .addComponent(cbPayement))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dateToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUrgent)
                    .addComponent(cbRDV)
                    .addComponent(cbPayement))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnAjouter))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idcl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idcl))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        ToDo todo=new ToDo();
 Client client=new Client();
        
 
  if(tfTitre.getText().equals("") || tfDescription.getText().equals("") || tfDescription.getText().length()<10){
      
    
           String ch="";
           if(tfTitre.getText().equals(""))
               ch+="Veuillez saisir le titre de la todo \n";
           
            
            if(tfDescription.getText().equals(""))
               ch+="Veuillez donner une description de votre todo  \n";
             if(tfDescription.getText().length()<10)
                ch+="La description de votre todo doit contenir au moins 10 caracteres \n";
            
            
            
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
                JOptionPane.showConfirmDialog (null,ch,"Warning",dialogButton);
 
 
  }
  else{
 
  java.util.Date date =dateToDo.getDate();
     java.sql.Date  date1=new java.sql.Date(date.getTime());
       
      ToDoDAO todoDAO=new ToDoDAO();
     
      todo.setIdClient(Integer.parseInt(idcl.getText()));
      todo.setTitreToDo(tfTitre.getText());
      todo.setDescToDo(tfDescription.getText());
   todo.setDateToDo(date1.toString());
      todo.setLabelUrgent(cbUrgent.isSelected());
      todo.setLabelRDV(cbRDV.isSelected());
      todo.setLabelPayement(cbPayement.isSelected());
        System.out.println(todo.getDateToDo());
        
         todoDAO.insertToDo(todo);
            this.dispose();     
  }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        ToDo todo=new ToDo();
 Client client=new Client();
 
 
   if(tfTitre.getText().equals("") || tfDescription.getText().equals("") ||tfDescription.getText().length()<10 ){
      
    
           String ch="";
           if(tfTitre.getText().equals(""))
               ch+="Veuillez saisir le titre de la todo \n";
           
            
            if(tfDescription.getText().equals(""))
               ch+="Veuillez donner une description de votre todo  \n";
             if(tfDescription.getText().length()<10)
                ch+="La description de votre todo doit contenir au moins 10 caracteres \n";
            
            
            
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
                JOptionPane.showConfirmDialog (null,ch,"Warning",dialogButton);
 
 
  }
 
   else{
       java.util.Date date =dateToDo.getDate();
     java.sql.Date  date1=new java.sql.Date(date.getTime());
     
      ToDoDAO todoDAO=new ToDoDAO();
    todo.setIdToDo(todo1.getIdToDo());
      todo.setIdClient(todo1.getIdClient());
      todo.setTitreToDo(tfTitre.getText());
      todo.setDescToDo(tfDescription.getText());
      todo.setDateToDo(date1.toString());
      todo.setLabelUrgent(cbUrgent.isSelected());
      todo.setLabelRDV(cbRDV.isSelected());
      todo.setLabelPayement(cbPayement.isSelected());
        System.out.println(todo.getDateToDo());
         todoDAO.updateToDo(todo);
         
  
         this.dispose();
   }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AjouterToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterToDoClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 try {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
            UIManager.put("RootPane.setupButtonVisible", false);

        } catch (Exception e) {
            //TODO exception
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterToDoClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JCheckBox cbPayement;
    private javax.swing.JCheckBox cbRDV;
    private javax.swing.JCheckBox cbUrgent;
    private com.toedter.calendar.JDateChooser dateToDo;
    private javax.swing.JLabel idcl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tfDescription;
    private javax.swing.JTextField tfTitre;
    // End of variables declaration//GEN-END:variables
}
