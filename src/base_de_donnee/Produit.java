
package base_de_donnee;

import application.BDD;
import application.ResultSetTableModel;
import application.parametre;

import java.sql.*;


public class Produit extends javax.swing.JFrame {

    //declaration
    ResultSet rs;
    BDD db;
    
    public Produit() {
        db =new BDD (new parametre().HOST_DB, new parametre().USERNAME_BD,
                new parametre().PASSWORD_DB, new parametre().IPHOST, new parametre().PORT);
        initComponents() ;
        table();
    }
        //tableau
        public void table() {
            
            String a[] ={"id", "nom", "description", "prix", "status", "quantite","categorie_id" };
            rs= db.querySelect(a,"produit");
            Tableprod.SetModel(new ResultSetTableModel(rs));
        }
        void actualiser(){
            txt_id.setText("");
            txt_nom.setText("");
            txt_description.setText("");
            txt_prix.setText("");
            txt_status.setText("");
            txt_quantite.setText("");
            txt_categ.setText("");
           
            
        }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_catag = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tableprod = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_description = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_quantite = new javax.swing.JTextField();
        txt_categ = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txt_prix = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtdescription = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("les categories");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 250, 170, 30);

        table_catag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "nom", "description", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(table_catag);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 290, 510, 90);

        Tableprod.setForeground(new java.awt.Color(0, 0, 102));
        Tableprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nom", "description", "prix", "status", "quantite", "id_categorie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tableprod);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(240, 50, 500, 100);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("les Produits");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 10, 170, 30);

        jButton1.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 380, 75, 25);

        jButton2.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Desactiver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 160, 90, 20);

        jButton3.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Modifier");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(670, 160, 80, 20);

        jButton4.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 0));
        jButton4.setText("Ajouter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(490, 160, 70, 20);

        jButton5.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 0));
        jButton5.setText("Ajouter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(640, 380, 80, 25);

        jLabel2.setText("Recherche par categorie");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(470, 450, 140, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "id", "nom", "description", "status" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(630, 450, 77, 20);

        jToggleButton1.setText("Recherche");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(490, 490, 83, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(620, 490, 90, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("prix");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 34, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("status");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 380, 50, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("id_categorie");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 180, 80, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("id");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 280, 14, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("nom");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 310, 40, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("description");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 340, 70, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("quantite");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 160, 50, 17);

        txt_nom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_nom);
        txt_nom.setBounds(60, 50, 90, 20);

        txt_description.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_description);
        txt_description.setBounds(70, 80, 90, 20);

        txt_status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_status);
        txt_status.setBounds(60, 130, 90, 20);

        txt_quantite.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_quantite);
        txt_quantite.setBounds(70, 160, 90, 20);

        txt_categ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_categ);
        txt_categ.setBounds(100, 180, 90, 20);

        txtid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtid);
        txtid.setBounds(70, 280, 80, 20);

        txt_prix.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_prix);
        txt_prix.setBounds(60, 110, 90, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("id");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 10, 14, 22);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("nom");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 50, 40, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("description");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 80, 70, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 255));
        jLabel14.setText("status");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 130, 50, 17);

        txtnom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtnom);
        txtnom.setBounds(70, 320, 80, 10);

        txtdescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtdescription);
        txtdescription.setBounds(90, 350, 80, 10);

        txtstatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtstatus);
        txtstatus.setBounds(80, 390, 80, 10);

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_id);
        txt_id.setBounds(50, 20, 80, 10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // modifier
    if (txtid.getText().equals("")||txtnom.getText().equals("")||txtdescription.getText().equals("")||
txtstatus.getText().equals("")){
JOptionPane.showMessageDialog(this,"SVP Entrer tout les informations .");
} else{ 
  String[] colon{"id","nom","description","status"};
   String[] inf = {txtid.getText(),txtnom.getText(),txtdescription.getText(),txtstatus.getText()};
   String id = String.ValueOf(table_catag.getValueAT(table_catag.getSelectedRow(), 0));
    System.out.println(db.queryUpdate("categorie",colon,inf,"id='" + id + "'"));
    table();
actualiser();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // modifier
    if (txt_id.getText().equals("")||txt_nom.getText().equals("")||txt_description.getText().equals("")||txt_prix.getText().equals("")||
txt_status.getText().equals("")||txt_quantite.getText().equals("")||txt_categ.getText().equals("")){
JOptionPane.showMessageDialog(this,"SVP Entrer tout les informations .");
} else{ 
  String[] colon{"id","nom","description","prix","status","quantite","id_categorie"};
   String[] inf = {txt_id.getText(),txt_nom.getText(),txt_description.getText(),txt_prix.getText(),txt_status.getText(),txt_quantite.getText(),txt_categ.getText()};
   String id = String.ValueOf(tableprod.getValueAT(tableprod.getSelectedRow(), 0));
    System.out.println(db.queryUpdate("produit",colon,inf,"id='" + id + "'"));
    table();
actualiser();
}

    }//GEN-LAST:event_jButton3ActionPerformed
//ajouter
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     if (txt_id.getText().equals("")||txt_nom.getText().equals("")||txt_description.getText().equals("")||txt_prix.getText().equals("")||
txt_status.getText().equals("")||txt_quantite.getText().equals("")||txt_categ.getText().equals("")){
JOptionPane.showMessageDialog(this,"SVP Entrer tout les informations .");
}
else {
   String[] colon{"id","nom","description","prix","status","quantite","id_categorie"};
   String[] inf = {txt_id.getText(), txt_nom.getText(), txt_description.getText(), txt_prix.getText(),txt_status.getText(),txt_quantite.getText(),txt_categ.getText()};
   System.out.println(db.queryInsert("produit",colon,inf));
   table();
actualiser();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
   if (txtid.getText().equals("")||txtnom.getText().equals("")||txtdescription.getText().equals("")||txtstatus.getText().equals("")){
JOptionPane.showMessageDialog(this,"SVP Entrer tout les informations .");
}
else {
   String[] colon{"id","nom","description","status"};
   String[] inf = {txtid.getText(), txtnom.getText(), txtdescription.getText(),txtstatus.getText()};
   System.out.println(db.queryInsert("categorie",colon,inf));
   table();
actualiser();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tableprod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable table_catag;
    private javax.swing.JTextField txt_categ;
    private javax.swing.JTextField txt_description;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prix;
    private javax.swing.JTextField txt_quantite;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
