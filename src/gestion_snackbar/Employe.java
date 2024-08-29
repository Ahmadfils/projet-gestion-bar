/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_snackbar;

import ConnectionBD.Connexion;
import ConnectionBD.connectDatabase;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Employe extends javax.swing.JFrame {
    Connexion con=new Connexion();
    connectDatabase con2=new connectDatabase();
    ResultSet rs;
    Statement st;
    DefaultTableModel de=new DefaultTableModel();
    int selected;
  public Employe() {
       initComponents();
       de=(DefaultTableModel)jTable1.getModel();
       updatetable();
       combodata();
       Imagetitle();
       inpnumF.setEditable(false);
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        inputrech = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        inputNom = new javax.swing.JTextField();
        inputAge = new javax.swing.JTextField();
        inputTelephone = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        inputnomf = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        inputAdresse = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        inpnumF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rechft = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Table des Employes");
        setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom ", "Nom du Fonction", "Age", "Etat-Civil", "Adresse", "Téléphone", "Date d'enregistrement"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        inputrech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputrechActionPerformed(evt);
            }
        });
        inputrech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputrechKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 78, 78));
        jLabel1.setText("Liste des Employes et leur Fonction");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel2.setText("Filtrer ");

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel3.setText("Id");

        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel4.setText("Nom du fonction");

        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel5.setText("Age");

        jLabel6.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel6.setText("Etat civil");

        inputNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomActionPerformed(evt);
            }
        });

        inputAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAgeActionPerformed(evt);
            }
        });

        inputTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelephoneActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celibataire", "Marie", "Divorce" }));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 1, 14)); // NOI18N
        jLabel8.setText("Insertion");
        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel9.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel9.setText("Numéro du Fonction");

        jLabel10.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel10.setText("Téléphone");

        inputnomf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                inputnomfItemStateChanged(evt);
            }
        });
        inputnomf.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                inputnomfPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        inputnomf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnomfActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\edit_add16.png")); // NOI18N
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\open.png")); // NOI18N
        jButton2.setText("Exporter");
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

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\new1.png")); // NOI18N
        jButton4.setText("Modifier");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel7.setText("Adresse");

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

        inpnumF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        inpnumF.setForeground(new java.awt.Color(153, 0, 0));
        inpnumF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inpnumFMouseClicked(evt);
            }
        });
        inpnumF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpnumFActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel11.setText("Nom");

        rechft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechftActionPerformed(evt);
            }
        });
        rechft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechftKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel12.setText("Recherche par Nº");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rechft, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputrech, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputId, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputnomf, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addComponent(inpnumF, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(inputNom, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 159, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputAdresse, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputTelephone, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rechft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputrech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(inputnomf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inpnumF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(inputAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(inputAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(inputTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAgeActionPerformed

    private void inputnomfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnomfActionPerformed
        
      /* 
        String query="select nomFx from fonction where numFx="+inputNumF.getSelectedItem()+"";
        try {
            
            st=con.connecion().prepareStatement(query);
            rs=st.executeQuery(query);
           if(rs.next())
            {
                
                inpFx.setText(rs.getString("nomFx"));
            }
           else
                JOptionPane.showMessageDialog(null,"Erreur s'est reproduit,réessayer plus tard !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Echec !");
        }*/
        
        
        
        
    }//GEN-LAST:event_inputnomfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
      String E="insert into employe (id,numFx,nomEmploye,age,adresse,etatCivil,telephone) values ('"+this.inputId.getText()+"','"+this.inpnumF.getText()+"','"+this.inputNom.getText().toUpperCase()+"','"+this.inputAge.getText()+"','"+this.inputAdresse.getText().toUpperCase()+"','"+this.jComboBox1.getSelectedItem()+"','"+this.inputTelephone.getText()+"')";
     try {
            st=con.connecion().createStatement();
            if(JOptionPane.showConfirmDialog(null,"Voulez_vous insérer ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
            {
                st.executeUpdate(E);
               // ajout();
                vider();
                //effacer();
                updatetable();
            
             }
                
        
       } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputrechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputrechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputrechActionPerformed

    private void inputTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelephoneActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=(jTable1.getModel().getValueAt(selected,0).toString());
        String sup="delete from employe where id="+cli+"";    
        try {
            st=con.connecion().createStatement();
            if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous supprimer ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
            { 
                st.executeUpdate(sup);
                //effacer();
                updatetable();
              JOptionPane.showMessageDialog(rootPane,"Suppression réussie !");
                vider();
            }
            
             
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        selected=jTable1.getSelectedRow();
        String cli;
        cli=(String)jTable1.getModel().getValueAt(selected,0);
        try {
            st=con.connecion().createStatement();
            rs=st.executeQuery("select * from employe,fonction where id="+cli+" and employe.numFx=fonction.numFx");
            if(rs.next())
            {
                String a=rs.getString("id");
                inputId.setText(a);
                String s=rs.getString("nomFx");
                inputnomf.setSelectedItem(s);
                String b=rs.getString("numFx");
                inpnumF.setText(b);
                String c=rs.getString("nomEmploye");
                inputNom.setText(c);
                String d=rs.getString("age");
                inputAge.setText(d);
                String e=rs.getString("etatCivil");
                jComboBox1.setSelectedItem(e);
                String f=rs.getString("adresse");
                inputAdresse.setText(f);
                String h=rs.getString("telephone");
                inputTelephone.setText(h);
                                                
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
       Employe e=new Employe();
       e.setVisible(rootPaneCheckingEnabled);
       setVisible(false);
       
               
    }//GEN-LAST:event_jButton5ActionPerformed

    private void inpnumFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpnumFActionPerformed
       
    }//GEN-LAST:event_inpnumFActionPerformed

    private void inpnumFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inpnumFMouseClicked
        
    }//GEN-LAST:event_inpnumFMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(selected,0).toString();
        
        String sd="update employe set id="+inputId.getText()+",numFx="+inpnumF.getText()+",nomEmploye='"+inputNom.getText().toUpperCase()+"',age="+inputAge.getText()+",adresse='"+inputAdresse.getText().toUpperCase()+"',etatCivil='"+jComboBox1.getSelectedItem()+"',telephone="+inputTelephone.getText()+" where id="+cli+"";
        try {
              st=con.connecion().createStatement();
              if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous modifier ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                  st.executeUpdate(sd);
                   //effacer();
                   updatetable();
                  JOptionPane.showMessageDialog(null," Modification réussie !");
                  vider();
              }
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void inputrechKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputrechKeyReleased
       
    }//GEN-LAST:event_inputrechKeyReleased

    private void inputNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String y=inputrech.getText();
       for(int i=0;i<jTable1.getRowCount();i++)
       {
           if (jTable1.getValueAt(i,0).equals(y))
           {
               jTable1.setRowSelectionInterval(i, i);
           }
       }
        
        String s="select nomFx,id,fonction.numFx,nomEmploye,age,etatCivil,adresse,telephone from employe,fonction where id="+y+" and employe.numFx=fonction.numFx";
        try {
            st=con.connecion().prepareStatement(s);
            rs=st.executeQuery(s);
            if(rs.next())
            {
                inputId.setText(rs.getString("id"));
                inputNom.setText(rs.getString("nomEmploye"));
                inputnomf.setSelectedItem(rs.getString("nomFx"));
                inpnumF.setText(rs.getString("numFx"));
                inputTelephone.setText(rs.getString("telephone"));
                inputAge.setText(rs.getString("age"));
                inputAdresse.setText(rs.getString("adresse"));
                jComboBox1.setSelectedItem(rs.getString("etatCivil"));
            }
            else
            JOptionPane.showMessageDialog(null,"N'existe pas !");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Echec !");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void rechftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechftActionPerformed

    private void rechftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechftKeyReleased
        String e=rechft.getText().toUpperCase();
        filter(e);
    }//GEN-LAST:event_rechftKeyReleased

    private void inputnomfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_inputnomfItemStateChanged
       /* String fo="select * from fonction where nomFx='"+inputnomf.getSelectedItem()+"'";
        try {
            rs=con2.extaireData(fo);
            while(rs.next())
                inpnumF.setText(rs.getString("numFx"));
        } catch (Exception e) {
        }*/
    }//GEN-LAST:event_inputnomfItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Export_Excel f=new Export_Excel(jTable1, this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void inputnomfPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_inputnomfPopupMenuWillBecomeInvisible
         String query="select numFx from fonction where nomFx='"+inputnomf.getSelectedItem()+"'";
        try {
            
            st=con.connecion().prepareStatement(query);
            rs=st.executeQuery(query);
           if(rs.next())
            {
                
                inpnumF.setText(rs.getString("numFx"));
            }
           else
                JOptionPane.showMessageDialog(null,"Erreur s'est reproduit,réessayer plus tard !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Echec !");
        }
    }//GEN-LAST:event_inputnomfPopupMenuWillBecomeInvisible
public void updatetable()
{  
    
    try {
            String upd="select * from fonction,employe where fonction.numfx=employe.numFx ";
            st=con.connecion().prepareStatement(upd);
            rs=st.executeQuery(upd);
            de.setRowCount(0);
            while(rs.next())
            {
              de.addRow(new Object[]{
                rs.getString("id"),                 
                rs.getString("nomEmploye"),
                rs.getString("nomFx"),
                rs.getString("age"),
                rs.getString("etatCivil"),
                rs.getString("adresse"),
                rs.getString("telephone"),
                rs.getString("date")
                 
            });
        }  
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null,ex);
        }
      //jTable1.setModel(de);  
}
      public void combodata()
      {
          String sql="select * from fonction";
           try {
              
              inputnomf.setSelectedItem(0);
              st=con.connecion().createStatement();  
              rs=st.executeQuery(sql);
              while(rs.next())
              inputnomf.addItem(rs.getString("nomFx"));
              
              }catch (Exception ex) {
              //JOptionPane.showMessageDialog(null,ex);  
        }
      }
    public void vider()
    {
           inputAdresse.setText("");
            inputAge.setText("");
            inputId.setText("");
            inputNom.setText("");
            inputTelephone.setText("");
    }
    public void ajout()
    {
         String id,numf,nom,ag,etc,ad,tel;
            id=this.inputId.getText();
            numf=(String) this.inputnomf.getSelectedItem();
            nom=this.inputNom.getText();
            ag=this.inputAge.getText();
            etc=(String) this.jComboBox1.getSelectedItem();
            ad=this.inputAdresse.getText();
            tel=this.inputTelephone.getText();
            String[] ligne=new String[]{id,numf,nom,ag,etc,ad,tel};
            de.addRow(ligne);
    }
public void filter(String rech){
    TableRowSorter<DefaultTableModel> em=new TableRowSorter<DefaultTableModel>(de);
    jTable1.setRowSorter(em);
    em.setRowFilter(RowFilter.regexFilter(rech));

}
public void effacer()
{
    while(de.getRowCount()>0)
    {
        for(int i=0;i<de.getRowCount();i++)
            de.removeRow(0);
    }
}
  public void Imagetitle()
  {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("title.png")));
  }  
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
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inpnumF;
    private javax.swing.JTextField inputAdresse;
    private javax.swing.JTextField inputAge;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputNom;
    private javax.swing.JTextField inputTelephone;
    private javax.swing.JComboBox<String> inputnomf;
    private javax.swing.JTextField inputrech;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rechft;
    // End of variables declaration//GEN-END:variables
}
