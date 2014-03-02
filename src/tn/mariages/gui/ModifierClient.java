package tn.mariages.gui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tn.mariages.dao.ClientDAO;
import tn.mariages.entities.Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karim
 */
public class ModifierClient extends javax.swing.JFrame {

    
    public ModifierClient() {
        initComponents();
    }
      public ModifierClient(Client c) {
        initComponents();
        Client client=new Client();
        client=c;
        int budget=  client.getBudget();
         labelid.setText(""+client.getIdClient());
         tfNom.setText(client.getNomDeFamille());
         tfPrenomMari.setText(client.getPrenomMari());
         tfPrenomEpouse.setText(client.getPrenomEpouse());
         tfEmail.setText(client.getEmailClient());
         tfMotDePasse.setText(client.getPwdClient());
         tfNumTelClient.setText(client.getTelClient());
         SpinBudget.setText(String.valueOf(budget).toString());
         tfDateDebut.setText(client.getDateDebut());
         tfDateFin.setText(client.getDateFin()); 
         cmbvilleclient.addItem(client.getVilleClient());
         tfimgclient.setText(client.getImgClient());
        
    }
      public ModifierClient(int id) {
        initComponents();
        Client client=new Client();
       ClientDAO clientDao=new ClientDAO();
        client=clientDao.findClientById(id);
        int budget=  client.getBudget();
         labelid.setText(""+client.getIdClient());
         tfNom.setText(client.getNomDeFamille());
         tfPrenomMari.setText(client.getPrenomMari());
         tfPrenomEpouse.setText(client.getPrenomEpouse());
         tfEmail.setText(client.getEmailClient());
         tfMotDePasse.setText(client.getPwdClient());
         tfNumTelClient.setText(client.getTelClient());
         SpinBudget.setText(String.valueOf(budget).toString());
         tfDateDebut.setText(client.getDateDebut());
         tfDateFin.setText(client.getDateFin()); 
         cmbvilleclient.addItem(client.getVilleClient());
         tfimgclient.setText(client.getImgClient());
        
    }
    
    Client cl=new Client();
     ClientDAO clientDao=new ClientDAO();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNom = new javax.swing.JTextField();
        tfPrenomMari = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfMotDePasse = new javax.swing.JTextField();
        btnModifierClient = new javax.swing.JButton();
        btnAnnulerModificationClient = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfPrenomEpouse = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfNumTelClient = new javax.swing.JTextField();
        tfDateDebut = new javax.swing.JTextField();
        tfDateFin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfimgclient = new javax.swing.JTextField();
        btnParcourir = new javax.swing.JButton();
        cmbvilleclient = new javax.swing.JComboBox();
        SpinBudget = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modifier Client");

        jLabel1.setText("Nom de famille:");

        jLabel2.setText("Prenom mari:");

        jLabel3.setText("Email :");

        jLabel4.setText("Mot de passe");

        jLabel5.setText("Ville:");

        jLabel6.setText("Budget");

        jLabel7.setText(" Date marriage:");

        tfNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomActionPerformed(evt);
            }
        });

        btnModifierClient.setText("Modifer");
        btnModifierClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierClientActionPerformed(evt);
            }
        });

        btnAnnulerModificationClient.setText("Annuler");
        btnAnnulerModificationClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerModificationClientActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Modifier client:");

        labelid.setText("00");

        jLabel10.setText("Prenom epouse:");

        jLabel11.setText("Num de télephone:");

        jLabel12.setText("Debut");

        jLabel13.setText("Fin:");

        jLabel9.setText("Image:");

        tfimgclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfimgclientActionPerformed(evt);
            }
        });

        btnParcourir.setText("Parcourir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnModifierClient)
                        .addGap(55, 55, 55)
                        .addComponent(btnAnnulerModificationClient))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(tfMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(cmbvilleclient, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelid))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfPrenomEpouse, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPrenomMari, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNumTelClient, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(SpinBudget)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(83, 83, 83)
                        .addComponent(tfimgclient, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnParcourir)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfDateDebut, tfDateFin});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labelid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPrenomMari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfPrenomEpouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbvilleclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfNumTelClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpinBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(tfDateDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfDateFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfimgclient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParcourir))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnnulerModificationClient)
                    .addComponent(btnModifierClient)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void btnModifierClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierClientActionPerformed
        Pattern pattern2 = Pattern.compile("(?:\\w|[\\-_])+(?:\\.(?:\\w|[\\-_])+)*\\@(?:\\w|[\\-_])+(?:\\.(?:\\w|[\\-_])+)+" );  
    Pattern pattern = Pattern.compile("^\\d+$");
    Matcher matcher3 = pattern2.matcher(tfEmail.getText());
      Matcher matcher = pattern.matcher(tfNumTelClient.getText());
         Matcher matcher2 = pattern.matcher(SpinBudget.getText());   
        
        if(tfPrenomMari.getText().equals("")|| tfPrenomEpouse.getText().equals("")|| tfNom.getText().equals("") ||tfDateDebut.getText().equals("")|| tfDateFin.getText().equals("")|| tfimgclient.getText().equals("") || tfEmail.getText().equals("") || tfMotDePasse.getText().equals("")||!matcher.matches()||!matcher2.matches()||!matcher3.matches() ){
    
     String ch="";
           if(tfPrenomMari.getText().equals(""))
               ch+="Veuillez saisir le Prenom du mari \n";
           
            if(tfPrenomEpouse.getText().equals(""))
               ch+="Veuillez saisir le Prenom de l'epouse  \n";
            if(tfNom.getText().equals(""))
               ch+="Veuillez saisir le nom de famille  \n";
            if(cmbvilleclient.getSelectedItem().toString().equals(""))
               ch+="Veuillez donner la ville du client  \n";
             if(tfDateDebut.getText().equals(""))
               ch+="Veuillez saisir la date début de la période de mariage  \n";
            if(tfEmail.getText().equals(""))
               ch+="Veuillez donner l'adresse email   du client  \n";
             else if(!matcher3.matches())
                  ch+="Veuillez donner l'adresse email du client \n";
             
             
             if(SpinBudget.getText().equals(""))
               ch+="Veuillez donner le budget du client  \n";
             else if(!matcher2.matches())
                  ch+="Veuiller bien remplir le champ du budget du client  du client  \n";
             if(tfNumTelClient.getText().equals(""))
               ch+="Veuillez donner le numero de telephone   du client  \n";
             else if(!matcher.matches())
                  ch+="Veuiller bien remplir le champ du numero de telephone mobile  du prestataire  \n";
              if(tfMotDePasse.getText().equals(""))
               ch+="Veuillez saisir votre mot de pasee  \n";
              
              if(tfDateFin.getText().equals(""))
               ch+="Veuillez saisir la date fin de la période de mariage  \n";
             if(tfimgclient.getText().equals(""))
               ch+="Veuillez donner un chemin correct de votre photo  \n";
              
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
                JOptionPane.showConfirmDialog (null,ch,"Warning",dialogButton);
     
     
     
     
     
     
 }else{
     
     
     
   
          cl.setIdClient(Integer.parseInt(labelid.getText()));
     
          cl.setPrenomMari(tfPrenomMari.getText());
          cl.setPrenomEpouse(tfPrenomEpouse.getText());
          cl.setNomDeFamille(tfNom.getText());
         cl.setEmailClient(tfEmail.getText());
         cl.setPwdClient(tfMotDePasse.getText());
           cl.setVilleClient(cmbvilleclient.getSelectedItem().toString());
         cl.setTelClient(tfNumTelClient.getText());
         cl.setBudget(Integer.parseInt(SpinBudget.getText()));
         cl.setDateDebut(tfDateDebut.getText());
         cl.setDateFin(tfDateFin.getText());
         cl.setImgClient(tfimgclient.getText());
        
         clientDao.updateClient(cl);
            this.dispose();
          
 }             
           

    }//GEN-LAST:event_btnModifierClientActionPerformed

    private void tfNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomActionPerformed

    private void btnAnnulerModificationClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerModificationClientActionPerformed

       this.dispose();
    }//GEN-LAST:event_btnAnnulerModificationClientActionPerformed

    private void tfimgclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfimgclientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfimgclientActionPerformed

    private void SpinBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpinBudgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpinBudgetActionPerformed

    private void btnParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcourirActionPerformed
     String chemin="";
        
       JFileChooser fc = new JFileChooser();
       
                int retval = fc.showOpenDialog(null);
                
                if (retval == JFileChooser.APPROVE_OPTION) {
                    
                    chemin = fc.getSelectedFile().getAbsolutePath();
                    
                    chemin = chemin.replace("\\", "/");    }                                            
    
                   tfimgclient.setText(chemin);

    }//GEN-LAST:event_btnParcourirActionPerformed

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
            java.util.logging.Logger.getLogger(ModifierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifierClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModifierClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SpinBudget;
    private javax.swing.JButton btnAnnulerModificationClient;
    private javax.swing.JButton btnModifierClient;
    private javax.swing.JButton btnParcourir;
    private javax.swing.JComboBox cmbvilleclient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelid;
    private javax.swing.JTextField tfDateDebut;
    private javax.swing.JTextField tfDateFin;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfMotDePasse;
    private javax.swing.JTextField tfNom;
    private javax.swing.JTextField tfNumTelClient;
    private javax.swing.JTextField tfPrenomEpouse;
    private javax.swing.JTextField tfPrenomMari;
    private javax.swing.JTextField tfimgclient;
    // End of variables declaration//GEN-END:variables
}
