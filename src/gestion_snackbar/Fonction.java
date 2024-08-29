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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author pc
 */
public class Fonction extends javax.swing.JFrame {

    Connexion con=new Connexion();
    Statement stm;
    ResultSet flux;
    DefaultTableModel dfo=new DefaultTableModel();
    int selected;
    
   
  public Fonction() {
        initComponents();
        dfo=(DefaultTableModel)jTable1.getModel();
        updateTFonction();
        Imagetitle();
        paye();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputfiltr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        inputNumF = new javax.swing.JTextField();
        inputNf = new javax.swing.JTextField();
        inputsalaire = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        inputrech = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        payement = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fonction");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("  Les fonctions disponible pour l'entreprise");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel2.setText("Filtrer");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Nº du fonction", "Nom du fonction", "Salaire "
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel3.setText("Insertion");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel4.setText("Numéro du fonction");

        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel5.setText("Nom du fonction");

        jLabel7.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel7.setText("Salaire du fonction");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\edit_add16.png")); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\close_hover.png")); // NOI18N
        jButton2.setText("Supprimer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\new1.png")); // NOI18N
        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\open.png")); // NOI18N
        jButton5.setText("Exporter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        inputsalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputsalaireActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\refresh1.png")); // NOI18N
        jButton6.setText("Actualiser");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Rechercher");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        inputrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputrechActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel6.setText("Recherche par Nº");

        payement.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        payement.setText("12345");
        payement.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel9.setText("Solde Total qu'on paie tous les Employés  :");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(payement, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputfiltr, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputrech, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputNf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputsalaire, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(inputNumF, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNumF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputNf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputsalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputfiltr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(inputrech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputfiltrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputfiltrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputfiltrActionPerformed

    private void inputsalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputsalaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputsalaireActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(selected,0).toString();
        String s="update fonction set numFx="+this.inputNumF.getText()+",nomFx='"+this.inputNf.getText()+"',salaire="+this.inputsalaire.getText()+" where numFx="+cli+"";
        try {
              stm=(Statement) con.connecion().createStatement();
                if(JOptionPane.showConfirmDialog(this,"Voulez-vous modifier ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
               {
                  stm.executeUpdate(s);
                  //effacer();
                  updateTFonction();
                  JOptionPane.showMessageDialog(rootPane," Modification réussie !");
                   effC();
                }
             } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane,ex);
           
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String fo="insert into fonction values ("+this.inputNumF.getText()+",'"+this.inputNf.getText()+"',"+this.inputsalaire.getText()+")";
        try {
            stm=(Statement) con.connecion().createStatement();
            if(JOptionPane.showConfirmDialog(this,"Voulez-vous ajouter ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
            {
                
               stm.executeUpdate(fo);
               effacer();
               updateTFonction();
                //ajoutJ();
               JOptionPane.showMessageDialog(this,"Insertion reussie ");
               effC();
               
            
               
          }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex );
        }
        
        
        
        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

                  Fonction f=new Fonction();
                  f.setVisible(rootPaneCheckingEnabled);
                  dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(selected,0).toString();
        String sup="delete from fonction where numFx="+cli+"";
        try {
               stm=(Statement) con.connecion().createStatement();
                if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous supprimer ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
                { 
                    stm.executeUpdate(sup);
                    //effacer();
                    updateTFonction();
                    JOptionPane.showMessageDialog(rootPane,"Suppression réussie !");
                    effC();
                   
                }
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        selected=jTable1.getSelectedRow();
        String y=jTable1.getModel().getValueAt(selected,0).toString();
        String s="select * from fonction where numFx="+y+"";
        try {
            stm=(Statement) con.connecion().prepareStatement(s);
            flux=stm.executeQuery(s);
               if(flux.next())
               {       
                   inputNumF.setText(flux.getString("numFx"));
                   inputNf.setText(flux.getString("nomFx"));
                   inputsalaire.setText(flux.getString("salaire"));
                   
               }
               
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erreur s'est reproduite !"); 
        }
                                            
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
    }//GEN-LAST:event_jTable1KeyReleased

    private void inputfiltrKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputfiltrKeyReleased
        String qi=inputfiltr.getText();
        filterer(qi);
    }//GEN-LAST:event_inputfiltrKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      String y=inputrech.getText();
       for(int i=0;i<jTable1.getRowCount();i++)
       {
           if (jTable1.getValueAt(i,0).equals(y))
           {
               jTable1.setRowSelectionInterval(i, i);
           }
       }
        
        
        String s="select * from fonction where numFx="+y+"";
        try {
            stm=(Statement) con.connecion().prepareStatement(s);
            flux=stm.executeQuery(s);
               if(flux.next())
               {       
                   inputNumF.setText(flux.getString("numFx"));
                   inputNf.setText(flux.getString("nomFx"));
                   inputsalaire.setText(flux.getString("salaire"));
                   
               }
               else
               
                  JOptionPane.showMessageDialog(rootPane,"N'existe pas"); 
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex); 
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void inputrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputrechActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Export_Excel e=new Export_Excel(jTable1, this);
    }//GEN-LAST:event_jButton5ActionPerformed

   public void updateTFonction()
   {
       
        try {
            
            String fon="select * from fonction";
            stm=(Statement) con.connecion().createStatement();
            flux=stm.executeQuery(fon);
            dfo.setRowCount(0);
            while(flux.next())
            {
                dfo.addRow(new Object[]
                {
                    flux.getString("numFx"),
                    flux.getString("nomFx"),
                    flux.getString("salaire"),
                });
                
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(rootPane,ex); 
            
        }
        jTable1.setModel(dfo);
   }
   public void filterer(String rech)
   {
       TableRowSorter<DefaultTableModel> fi=new TableRowSorter<DefaultTableModel>(dfo);
       jTable1.setRowSorter(fi);
       fi.setRowFilter(RowFilter.regexFilter(rech));
       
   }
   public void effC()
   {
       this.inputNumF.setText("");
       this.inputNf.setText("");
       this.inputsalaire.setText("");
       //this.inputrech.setText("");
       
   }
   public void ajoutJ()
   {
        String num,nom,salaire;
               num=this.inputNumF.getText();
               nom=this.inputNf.getText();
               salaire=this.inputsalaire.getText();
               String[] ligne=new String[]{num,nom,salaire};
               dfo.addRow(ligne);
   }
   public void effacer()
   {
       while(dfo.getRowCount()>0)
        {
            for(int i=0;i<dfo.getRowCount();i++)
                
            dfo.removeRow(i);
            
        }
   }
   public void Imagetitle()
  {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("title.png")));
  }
   public void paye()
   {
        try {
            stm=con.connecion().createStatement();
            flux=stm.executeQuery("select sum(salaire) as 'resu' from employe,fonction where fonction.numFx=employe.numFx");
            while(flux.next())
                payement.setText(flux.getString("resu"));
        } catch (Exception ex) {
            
        }
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
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fonction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fonction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputNf;
    private javax.swing.JTextField inputNumF;
    private javax.swing.JTextField inputfiltr;
    private javax.swing.JTextField inputrech;
    private javax.swing.JTextField inputsalaire;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel payement;
    // End of variables declaration//GEN-END:variables
}
