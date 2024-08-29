/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_snackbar;

import ConnectionBD.Connexion;
import java.awt.Toolkit;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pc
 */
public class Fournisseur extends javax.swing.JFrame {

    Connexion con=new Connexion();
    ResultSet rs;
    Statement st;
    DefaultTableModel df=new DefaultTableModel();
    
    public Fournisseur() {
        initComponents();
        df=(DefaultTableModel)jTable1.getModel();
        updatetable();
        Imagetitle();    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inputfiltr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        inputTelFour = new javax.swing.JTextField();
        inputNumFour = new javax.swing.JTextField();
        inputNomFour = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        inputrech = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fournisseur");

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Liste de fournisseurs de l'Entreprise Snack-Bar");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        inputfiltr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputfiltrActionPerformed(evt);
            }
        });
        inputfiltr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputfiltrKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel2.setText("Filtrer");

        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel4.setText("Insertion");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_snackbar/edit_add16.png"))); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_snackbar/new1.png"))); // NOI18N
        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\close_hover.png")); // NOI18N
        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_snackbar/open.png"))); // NOI18N
        jButton4.setText("Exporter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Nº du fournisseur", "Nom", "Téléphone"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel5.setText("Numéro du fournisseur");

        jLabel6.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel6.setText("Nom du fournisseur");

        jLabel7.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel7.setText("Téléphone");

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\refresh1.png")); // NOI18N
        jButton5.setText("Actualiser");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Rechercher");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel3.setText("Recherchepar Nº");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputfiltr, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputrech, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputNomFour, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputTelFour, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(inputNumFour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNumFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNomFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputTelFour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputfiltr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputrech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputfiltrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputfiltrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputfiltrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
         
        String Fo="insert into fournisseur values ("+this.inputNumFour.getText()+",'"+this.inputNomFour.getText().toUpperCase()+"',"+this.inputTelFour.getText()+")";
        try {
              st=(Statement) con.connecion().createStatement();
             if (JOptionPane.showConfirmDialog(this,"Voulez_vous insérer ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
             {
                 st.executeUpdate(Fo);
                  //ajou();
                  //effacer();
                  updatetable();
                  JOptionPane.showMessageDialog(null," Insertion reussie !");
                  vid();
                
             }
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     /* dispose();
      Fournisseur f=new Fournisseur();
      f.setVisible(rootPaneCheckingEnabled);*/
      updatetable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(selected,0).toString();
        String k="delete from fournisseur where numFour="+cli+"";
        try {
            st=(Statement) con.connecion().createStatement();
           if(JOptionPane.showConfirmDialog(rootPane,"Voulez_vous supprimer",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
            st.executeUpdate(k);
           //effacer();
           updatetable();
           JOptionPane.showMessageDialog(rootPane,"suppression réussie !");
           vid();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String y=inputrech.getText();
     
       for(int i=0;i<jTable1.getRowCount();i++)
       {
           if (jTable1.getValueAt(i,0).equals(y))
           {
               jTable1.setRowSelectionInterval(i, i);
           }
       }
        
        
        String sr="select * from fournisseur where numfour="+y+"";
        
        try {
              st=(Statement) con.connecion().prepareStatement(sr);
              rs=st.executeQuery(sr);
               if(rs.next())
               {
                   inputNomFour.setText(rs.getString("nomFour"));
                   inputNumFour.setText(rs.getString("numFour"));
                   inputTelFour.setText(rs.getString("telephone"));
                   
               }
               
               else
                   JOptionPane.showMessageDialog(rootPane," N'existe pas");
                   
               
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
          
        }
        
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(selected,0).toString();
        String fo="update fournisseur set numFour="+inputNumFour.getText()+",nomFour='"+inputNomFour.getText().toUpperCase()+"',telephone="+inputTelFour.getText()+" where numFour="+cli+"";
        try {
            st=(Statement) con.connecion().createStatement();
            if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous modifier ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
            st.executeUpdate(fo);
            //effacer();
            updatetable();
            JOptionPane.showMessageDialog(null," Modification réussie !");
            vid();
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputfiltrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputfiltrKeyReleased
        String f=inputfiltr.getText();
        filter(f);
    }//GEN-LAST:event_inputfiltrKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         
        int row=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(row,0).toString(); 
        String sr="select * from fournisseur where numfour="+cli+"";
        
        try {
              st=(Statement) con.connecion().prepareStatement(sr);
              rs=st.executeQuery(sr);
               if(rs.next())
               {
                   inputNomFour.setText(rs.getString("nomFour"));
                   inputNumFour.setText(rs.getString("numFour"));
                   inputTelFour.setText(rs.getString("telephone"));
                   
               }
                   
               
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
          
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Export_Excel f=new Export_Excel(jTable1,this);
    }//GEN-LAST:event_jButton4ActionPerformed
   public void updatetable()
   {
      try 
      { 
          String sql="select * from fournisseur";
          df.setRowCount(0);
           st=(Statement) con.connecion().prepareStatement(sql);
            rs=st.executeQuery(sql);
            while(rs.next())
            {
               df.addRow(new Object[]{
               rs.getString("numFour"),
               rs.getString("nomFour"),
               rs.getString("telephone"),
               });
            }
        } catch (Exception ex) {
           //JOptionPane.showMessageDialog(rootPane,ex); 
        }
      jTable1.setModel(df);
   }
    public void ajou()
    {
          String num,nom,tel;
                 num=inputNumFour.getText();
                 nom=inputNomFour.getText();
                 tel=inputTelFour.getText();
                 
                 String[] ligne=new String[]{num,nom,tel};
                 df.addRow(ligne);
    }
    public void vid()
    {
         inputNumFour.setText("");
         inputNomFour.setText("");
         inputTelFour.setText("");

         
    }
    public void filter(String rech)
    {
        TableRowSorter<DefaultTableModel> fr=new TableRowSorter<>(df);
        jTable1.setRowSorter(fr);
        fr.setRowFilter(RowFilter.regexFilter(rech));
    }
    public void effacer()
    {
         while(df.getRowCount()>0)
        {
            for(int i=0;i<df.getRowCount();i++)
                
            df.removeRow(i);
            
        }
    }
     public void Imagetitle()
  {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("title.png")));
  }
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
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fournisseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fournisseur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputNomFour;
    private javax.swing.JTextField inputNumFour;
    private javax.swing.JTextField inputTelFour;
    private javax.swing.JTextField inputfiltr;
    private javax.swing.JTextField inputrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
