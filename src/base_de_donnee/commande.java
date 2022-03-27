
package base_de_donnee;

import Application.BDD ;
import application.ResultSetTableModel;
import application.parametre;

import java.sql.*;
public class commande extends javax.swing.JFrame {

    //declaration
    ResultSet rs;
    BDD db;
    public commande() {
          db =new BDD (new parametre().HOST_DB, new parametre().USERNAME_BD,
                new parametre().PASSWORD_DB, new parametre().IPHOST, new parametre().PORT);
        initComponents();
         table();
    }

     //tableau
        public void table() {
            
            String a[] ={"id", "total", "status", "prix", "status", "id_agent" };
            rs= db.querySelect(a,"Produit");
            // table  produit(produit)
            commande.setModel(new ResultSetTableModel(rs));
        }
        void actualiser(){
            txt_id.setText("");
            txt_total.setText("");
            txt_status.setText("");
            txt_agent.setText("");
            
        }
            private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_utilisateur = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_commande = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_agent = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtprenom = new javax.swing.JTextField();
        txtpseudo = new javax.swing.JTextField();
        txtmdp = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        txtrole = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        txt_id8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        table_utilisateur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nom", "prenom", "pseudo", "mdp", "telephone", "role", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_utilisateur);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 240, 430, 90);

        table_commande.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "total", "status", "id_agent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_commande);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(200, 50, 510, 100);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("les commandes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 10, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("les utilisateurs");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 210, 170, 30);

        jButton2.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(390, 170, 80, 20);

        jButton3.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Annuler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(580, 170, 80, 20);

        jButton4.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("créer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 170, 80, 20);

        jButton5.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("Confirmer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(480, 170, 90, 20);

        jButton6.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 0));
        jButton6.setText("Ajouter");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(520, 350, 90, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("total");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 60, 40, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 90, 40, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("id_agent");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 120, 60, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("id");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 250, 40, 17);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid);
        txtid.setBounds(120, 250, 90, 20);

        txt_total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_total);
        txt_total.setBounds(50, 60, 90, 20);

        txt_status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_status);
        txt_status.setBounds(60, 90, 90, 20);

        txt_agent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_agent);
        txt_agent.setBounds(70, 120, 90, 20);

        txtnom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtnom);
        txtnom.setBounds(120, 280, 90, 20);

        txtprenom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtprenom);
        txtprenom.setBounds(120, 320, 90, 20);

        txtpseudo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtpseudo);
        txtpseudo.setBounds(130, 360, 90, 20);

        txtmdp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtmdp);
        txtmdp.setBounds(130, 400, 90, 20);

        txttelephone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txttelephone);
        txttelephone.setBounds(140, 440, 90, 20);

        txtrole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtrole);
        txtrole.setBounds(140, 480, 90, 20);

        txtstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtstatus);
        txtstatus.setBounds(140, 510, 90, 20);

        txt_id8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_id8);
        txt_id8.setBounds(50, 20, 90, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("nom");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 280, 40, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("prenom");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 320, 40, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 255));
        jLabel14.setText("pseudo");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 350, 40, 17);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 153, 255));
        jLabel15.setText("mdp");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 400, 40, 17);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 153, 255));
        jLabel16.setText("telephone");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 430, 40, 17);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 153, 255));
        jLabel17.setText("role");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 470, 40, 17);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 153, 255));
        jLabel18.setText("status");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 510, 40, 17);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 255));
        jLabel19.setText("id");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 20, 40, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//modifier

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (txt_id.getText().equals("")||txt_total.getText().equals("")||txt_status.getText().equals("")||
           txt_agent.getText().equals(""))
{
JOptionPane.showMessageDialog(this,"SVP Entrer tout les informations .");
}   else{ 
     String[] colon{"id","total","status","id_agent"};
     String[] inf = {txt_id.getText(),txt_total.getText(),txt_status.getText(),txt_agent.getText());
     String id = String.ValueOf(commande.getValueAT(commande.getSelectedRow(),0)};
     System.out.println(db.queryUpdate("commande",colon,inf,"id='" + id + "'"));
    table();
    actualiser();
}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //supprimer=annuler
String id = String.valueOf(table_commande.getSelectedRow(), 0));
if(JOptionPane.showConfirmDialog(this, "est ce que tu veux vraiment   supprimer","attention!!", 
JOptionPane.OK_CANCEL_OPTION) ==  JOptionPane.OK_OPTION){
db.queryDelete("commande","id=" + id);
} else {
return;
}
table();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if (txt_id.getText().equals("")||txt_total.getText().equals("")||txt_status.getText().equals("")||txt_agent.getText().equals("")){
JOptionPane.showMessageDialog(this,"SVP Entrer tout les informations .");
}
else {
   String[] colon{"id","total","status","id_agent"};
   String[] inf = {txt_id.getText(), txt_total.getText(), txt_status.getText(), txt_agent.getText()};
   System.out.println(db.queryInsert("commande",colon,inf));
   table();
actualiser();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
               if (txtid.getText().equals("")||txt_total.getText().equals("")||txt_status.getText().equals("")||txt_agent.getText().equals("")){
JOptionPane.showMessageDialog(this,"SVP Entrer tout les informations .");
}
else {
   String[] colon{"id","nom","prenom","pseudo","mdp","telephone","role","status"};
   String[] inf = {txt_id.getText(), txtnom.getText(), txtprenom.getText(), txtpseudo.getText(), txtmdp.getText(), txttelephone.getText(), txtrolegetText(), txtstatus.getText()};
   System.out.println(db.queryInsert("utilisateurs",colon,inf));
   table();
actualiser();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
            java.util.logging.Logger.getLogger(commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(commande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new commande().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_commande;
    private javax.swing.JTable table_utilisateur;
    private javax.swing.JTextField txt_agent;
    private javax.swing.JTextField txt_id8;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmdp;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprenom;
    private javax.swing.JTextField txtpseudo;
    private javax.swing.JTextField txtrole;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}
