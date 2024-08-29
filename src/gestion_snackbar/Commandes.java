
package gestion_snackbar;

import ConnectionBD.Connexion;
import ConnectionBD.connectDatabase;
import java.awt.Container;
import java.sql.Statement;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Timer;
import javax.swing.FocusManager;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Commandes extends javax.swing.JFrame {
    Connexion con=new Connexion();
    ConnectionBD.connectDatabase con2=new connectDatabase();
    Statement st;
    ResultSet rs;
    DefaultTableModel t1=new DefaultTableModel();
    DefaultTableModel t2=new DefaultTableModel();
    DefaultTableModel t3=new DefaultTableModel();
    
    public Commandes() {
        initComponents();
        combUpt();
        t1=(DefaultTableModel)jTable1.getModel();
        t2=(DefaultTableModel)jTable2.getModel();
        updateT1();
        updateT2();
        detcomb();
        procomb();
        factcomb();
        Imagetitle();
        inputsolde.setEditable(false);
        inputprise.setEditable(false);
        inputfacture.setEditable(false);
        numprod.setEditable(false);
        nomcorre.setEditable(false);
        fxcorre.setEditable(false);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputcmdId = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        nomcorre = new javax.swing.JTextField();
        fxcorre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rech = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        filt1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nomprod = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        rechd = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        numprod = new javax.swing.JTextField();
        cmdetai = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        filt2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Cmf = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        printer = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        inputdate = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputprise = new javax.swing.JTextArea();
        inputsolde = new javax.swing.JTextField();
        inputfacture = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Commandes");

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel1.setText("Table des Commandes");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jToggleButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\edit_add16.png")); // NOI18N
        jToggleButton1.setText("Ajouter");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\new1.png")); // NOI18N
        jToggleButton2.setText("Modifier");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\close_hover.png")); // NOI18N
        jToggleButton3.setText("Supprimer");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\open.png")); // NOI18N
        jToggleButton4.setText("Exporter");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "  Nº commande", "Id Commandeur", "Durée d'enregistrement"
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

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabel8.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Commandes");

        jLabel5.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel5.setText("Id Commandeur");

        inputcmdId.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                inputcmdIdPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel7.setText("Nom correspondant");

        nomcorre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomcorre.setForeground(new java.awt.Color(153, 0, 0));
        nomcorre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomcorreMouseClicked(evt);
            }
        });

        fxcorre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fxcorre.setForeground(new java.awt.Color(153, 0, 0));
        fxcorre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fxcorreMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel9.setText("Fonction correspodant");

        rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechActionPerformed(evt);
            }
        });

        jButton3.setText("Recherher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel2.setText("Recherche par Nº ");

        filt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filt1KeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel18.setText("Filtrer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputcmdId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fxcorre)
                                .addGap(48, 48, 48)))
                        .addComponent(rech, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomcorre, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(filt1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(inputcmdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel18))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomcorre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fxcorre)
                    .addComponent(jButton3)
                    .addComponent(rech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Nº du commande", " Nom  du produit", "Quantité", "Durée du commande"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.setBackground(new java.awt.Color(66, 143, 109));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Details");

        jLabel4.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel4.setText("Numéro du commande");

        jLabel6.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel6.setText("Quantité");

        nomprod.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                nomprodPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        nomprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomprodActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel11.setText("Nom du produit");

        jButton4.setText("Rechercher");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel13.setText("Recherche par Nº ");

        numprod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        numprod.setForeground(new java.awt.Color(153, 0, 0));
        numprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numprodMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel14.setText(" Nº");

        jLabel19.setFont(new java.awt.Font("Poor Richard", 1, 11)); // NOI18N
        jLabel19.setText("Filtrer");

        filt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filt2ActionPerformed(evt);
            }
        });
        filt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filt2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rechd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmdetai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nomprod, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numprod, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(filt2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(45, 45, 45)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdetai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(rechd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(qt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\close_hover.png")); // NOI18N
        jButton7.setText("Supprimer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\edit_add16.png")); // NOI18N
        jButton5.setText("Ajouter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\open.png")); // NOI18N
        jButton9.setText("Exporter");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\printer (2)user.png")); // NOI18N
        jButton12.setText("Imprimer");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\Viewer2.png")); // NOI18N
        jButton13.setText("Voir table Facture");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setForeground(new java.awt.Color(181, 117, 117));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\refresh1.png")); // NOI18N
        jButton2.setText("Actualiser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Facture");

        Cmf.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                CmfPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel15.setFont(new java.awt.Font("Vani", 1, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Entrer  NºCommande pour ajouter le Facture dans le table");

        jLabel12.setFont(new java.awt.Font("Vani", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ou pour générer le Facture");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Cmf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(42, 42, 42)))
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cmf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\Gestion_SnackBar\\src\\gestion_snackbar\\new1.png")); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        printer.setBackground(new java.awt.Color(204, 204, 204));

        jLabel20.setFont(new java.awt.Font("Monospaced", 3, 12)); // NOI18N
        jLabel20.setText("Les produits prises :");
        jLabel20.setOpaque(true);

        jLabel38.setFont(new java.awt.Font("Monospaced", 3, 12)); // NOI18N
        jLabel38.setText("Total (BIF):");
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel38.setOpaque(true);

        inputdate.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        inputdate.setText("Date :");
        inputdate.setOpaque(true);

        inputprise.setColumns(20);
        inputprise.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        inputprise.setRows(5);
        inputprise.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(inputprise);

        inputsolde.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        inputsolde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputfacture.setBackground(new java.awt.Color(0, 0, 0));
        inputfacture.setFont(new java.awt.Font("Monospaced", 3, 24)); // NOI18N
        inputfacture.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout printerLayout = new javax.swing.GroupLayout(printer);
        printer.setLayout(printerLayout);
        printerLayout.setHorizontalGroup(
            printerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(printerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(printerLayout.createSequentialGroup()
                        .addGroup(printerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(printerLayout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputsolde))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inputdate, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(printerLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(inputfacture)
        );
        printerLayout.setVerticalGroup(
            printerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputfacture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(printerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputsolde, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_snackbar/download1.png"))); // NOI18N
        jButton6.setText("Générer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion_snackbar/edit_add16.png"))); // NOI18N
        jButton11.setText("Ajouter ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4)
                        .addGap(2, 2, 2)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButton12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(printer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jToggleButton1)
                        .addComponent(jToggleButton3)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5)
                        .addComponent(jButton7))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String qw="insert into detail (numCommande,numProduit,quantite) values ("+cmdetai.getSelectedItem()+","+numprod.getText()+","+qt.getText()+")";
            st=(Statement) con.connecion().createStatement();
            st.executeUpdate(qw);
            actuel();
            //dispm();
             //JOptionPane.showMessageDialog(rootPane," Insertion réussie !");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane,ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     String aj="insert into commande (idCommande) values ("+this.inputcmdId.getSelectedItem()+")";
        try {
               st=(Statement) con.connecion().createStatement();
               st.executeUpdate(aj);               
               //actuel();
               dispm();
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         dispm();
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String ty=rech.getText();
       for(int i=0;i<jTable1.getRowCount();i++)
       {
           if(jTable1.getValueAt(i,0).equals(ty))
           {
               jTable1.setRowSelectionInterval(i, i);
           } 
       }
       String ok="select * from employe,fonction,commande where  numCommande="+rech.getText()+" and idCommande=id and employe.numFx=fonction.numFx";
        try {
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery(ok);
            if(rs.next())
            {
                inputcmdId.setSelectedItem(rs.getString("idCommande"));
                nomcorre.setText(rs.getString("employe.nomEmploye"));
                fxcorre.setText(rs.getString("nomFx"));
            }
            else
                JOptionPane.showMessageDialog(rootPane, "N'existe pas !");
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane,ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(selected,0).toString();
        String su="delete from commande where numCommande="+cli+"";
        try {
              st=(Statement) con.connecion().createStatement();
               if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous supprimer ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
               {
                 st.executeUpdate(su);
                 dispm();
                 //actuel();
                 //detcomb();
                 //cf();
                 //factcomb();
                 JOptionPane.showMessageDialog(rootPane,"Suppression réussie !");
               }
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        int selected=jTable1.getSelectedRow();
        String cli=jTable1.getModel().getValueAt(selected,0).toString();
        String ds="update commande set idCommande="+inputcmdId.getSelectedItem()+" where numCommande="+cli+"";
        try {
            st=(Statement) con.connecion().createStatement();
            if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous modifier ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
            { 
                st.executeUpdate(ds);
                 dispm();
                 //actuel();
               //detcomb();
               //cf();
               //factcomb();
              
             JOptionPane.showMessageDialog(rootPane," Modification réussie !");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane," Errreur s'est reproduit,réessayer plus tard !");
        }
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void numprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numprodMouseClicked
      
    }//GEN-LAST:event_numprodMouseClicked

    private void nomprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomprodActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String is=rechd.getText();
       for(int i=0;i<jTable2.getRowCount();i++)
       {
           if (jTable2.getValueAt(i,0).equals(is))
           {
               jTable2.setRowSelectionInterval(i, i);
           }
       }
        int selected=jTable2.getSelectedRow();
         String cli=jTable2.getModel().getValueAt(selected,0).toString();
         String cli2=jTable2.getModel().getValueAt(selected,1).toString();
         String cli3=jTable2.getModel().getValueAt(selected,2).toString();
         String cli4=jTable2.getModel().getValueAt(selected,3).toString();
        rs=con2.extaireData("select numCommande,detail.numProduit,nomProduit,quantite from detail,produit where numcommande="+cli+" and nomProduit='"+cli2+"' and quantite="+cli3+" and date='"+cli4+"' and detail.numProduit=produit.numProduit");
        try {
            if(rs.next())
            {
                cmdetai.setSelectedItem(rs.getString("numCommande"));
                nomprod.setSelectedItem(rs.getString("nomProduit"));
                numprod.setText(rs.getString("numProduit"));
                qt.setText(rs.getString("quantite"));
            }
        } catch (SQLException ex) {
            
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int selected=jTable2.getSelectedRow();
        String cli=jTable2.getModel().getValueAt(selected,0).toString();
        String cli2=jTable2.getModel().getValueAt(selected,1).toString();
        String cli3=jTable2.getModel().getValueAt(selected,2).toString();
        String cli4=jTable2.getModel().getValueAt(selected,3).toString();
        String sy="delete from detail where numCommande="+cli+"  and quantite="+cli3+" and date='"+cli4+"'";
        try {
              st=(Statement) con.connecion().createStatement();
               if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous supprimer ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
               {
                  st.executeUpdate(sy);
                  //dispm();
                  actuel();
                  JOptionPane.showMessageDialog(null,"Suppression réussie !");
               }
              
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null,ex); 
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
      Export_Excel f=new Export_Excel(jTable1,this);
      
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
      String fs="insert into facture (numCommande) values ("+Cmf.getSelectedItem()+")";
        try {
              st= con.connecion().createStatement();
              st.executeUpdate(fs);             
              JOptionPane.showMessageDialog(null," Insertion réussie !"); 
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);  
        }              
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        Facture pst=new Facture();
        pst.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
      /*Toolkit tk=printer.getToolkit();
        PrintJob pj=tk.getPrintJob(this,null,null);
       Graphics g=pj.getGraphics();
       printer.print(g);
       g.dispose();
       pj.end();*/
      
        PrinterJob pj=PrinterJob.getPrinterJob();
        pj.setJobName("Imprimer");
        pj.setPrintable(new Printable() {
            @Override
            public int print(Graphics pg, PageFormat pf, int pageIndex){
             if(pageIndex>0)
             {
                 return Printable.NO_SUCH_PAGE;
             }
                Graphics2D g2=(Graphics2D) pg;
                g2.translate(pf.getImageableX(),pf.getImageableY());
                printer.paint(g2);
                return Printable.PAGE_EXISTS;
            }
                });
        if(pj.printDialog()==false)
            return;
        try {
            pj.print();
            JOptionPane.showMessageDialog(rootPane,"Impression réussie avec succès  !");
        } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane,e); 
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int row=jTable1.getSelectedRow();
      String cli=(jTable1.getModel().getValueAt(row,0).toString()); 
          try {
              rs=con2.extaireData("select id,nomEmploye,nomFx from employe,fonction,commande where numCommande="+cli+" and idCommande=id and employe.numFx=fonction.numFx");
              if(rs.next())
              {  
                  inputcmdId.setSelectedItem(rs.getString("id"));
                  nomcorre.setText(rs.getString("nomEmploye"));
                  fxcorre.setText(rs.getString("nomFx"));
                  
              } 
          } catch (SQLException ex) {
              
          }
  
      
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int selected=jTable2.getSelectedRow();
         String cli=jTable2.getModel().getValueAt(selected,0).toString();
         String cli2=jTable2.getModel().getValueAt(selected,1).toString();
         String cli3=jTable2.getModel().getValueAt(selected,2).toString();
         String cli4=jTable2.getModel().getValueAt(selected,3).toString();
        rs=con2.extaireData("select numCommande,detail.numProduit,nomProduit,quantite from detail,produit where numcommande="+cli+" and nomProduit='"+cli2+"' and quantite="+cli3+" and date='"+cli4+"' and detail.numProduit=produit.numProduit");
        try {
            if(rs.next())
            {
                cmdetai.setSelectedItem(rs.getString("numCommande"));
                nomprod.setSelectedItem(rs.getString("nomProduit"));
                numprod.setText(rs.getString("numProduit"));
                qt.setText(rs.getString("quantite"));
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex); 
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void filt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filt2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int selected=jTable2.getSelectedRow();
   String cli=jTable2.getModel().getValueAt(selected,0).toString();
   String cli2=jTable2.getModel().getValueAt(selected,2).toString();
   String cli3=jTable2.getModel().getValueAt(selected,3).toString();
   
   String query="update detail set numCommande="+cmdetai.getSelectedItem()+",numProduit="+numprod.getText()+",quantite="+qt.getText()+" where numCommande="+cli+" and date='"+cli3+"' and quantite="+cli2+"";
        try {
            if(JOptionPane.showConfirmDialog(rootPane,"Voulez-vous modifier ?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION)
               {
                  st=(Statement) con.connecion().createStatement();
                  st.executeUpdate(query);
                  actuel();
                  JOptionPane.showMessageDialog(null,"Modification réussie !");
               }
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null,ex);   
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void filt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filt1KeyReleased
        String a=filt1.getText();
        filtra1(a);
    }//GEN-LAST:event_filt1KeyReleased

    private void filt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filt2KeyReleased
        String a=filt2.getText();
        filtra2(a); 
    }//GEN-LAST:event_filt2KeyReleased

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void fxcorreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fxcorreMouseClicked
       
    }//GEN-LAST:event_fxcorreMouseClicked

    private void nomcorreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomcorreMouseClicked

    }//GEN-LAST:event_nomcorreMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         Export_Excel f=new Export_Excel(jTable2,this);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void inputcmdIdPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_inputcmdIdPopupMenuWillBecomeInvisible
        String se="select nomEmploye from employe where id="+inputcmdId.getSelectedItem()+"";
        try {
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery(se);
            while(rs.next())
            {
                nomcorre.setText(rs.getString("nomEmploye"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
        fx();
    }//GEN-LAST:event_inputcmdIdPopupMenuWillBecomeInvisible

    private void nomprodPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_nomprodPopupMenuWillBecomeInvisible
         String fd="select * from produit where nomProduit='"+nomprod.getSelectedItem()+"'";
        try {
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery(fd);
            while(rs.next())
            {
                numprod.setText(rs.getString("numProduit"));
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_nomprodPopupMenuWillBecomeInvisible

    private void CmfPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_CmfPopupMenuWillBecomeInvisible
       
             
    }//GEN-LAST:event_CmfPopupMenuWillBecomeInvisible

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        String f="select numFacture,facture.numCommande,nomProduit,sum(quantite*prixVenteUnitaire) as 'total',left(facture.date,10) as date from produit,detail,facture where facture.numCommande="+Cmf.getSelectedItem()+" and facture.numCommande=detail.numCommande and detail.numProduit=produit.numProduit";   
        try {
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery(f);
            
            while(rs.next())
            {
              inputsolde.setText(rs.getString("total"));
              inputfacture.setText("   Facture Nº"+rs.getString("numFacture"));
              inputdate.setText("Date:"+rs.getString("date"));
            }
            aff();
           
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane,ex);   
        }
         //if(inputfacture.getText().equals("   Facture Nºnull"))
                //JOptionPane.showMessageDialog(null,"Oops! Vous devez d'abord l'ajouter dans la table Facture" );
           
    }//GEN-LAST:event_jButton6ActionPerformed
     public void aff()
     {
         try {
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery("select concat(quantite,' ',nomProduit) as 'resu' from detail,produit where numCommande="+Cmf.getSelectedItem()+" and detail.numProduit=produit.numProduit");
            String g="";
            while(rs.next())
            {   
                String a=rs.getString("resu");
                g+=a+"\n";
            }
            inputprise.setText(g);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
    
    public void combUpt()
    {
        String co="select id from employe order by id asc";
        inputcmdId.setSelectedItem(0);
        try {
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery(co);
            while(rs.next())
            inputcmdId.addItem(rs.getString("id"));
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(rootPane,ex);
        }
    }
 
    public void dispm()
    {
                 
                 Commandes com=new Commandes();
                 com.setVisible(rootPaneCheckingEnabled);
                 setVisible(false);
    }
    public void detcomb()
    {
        String fg="select * from commande order by numCommande desc";
        cmdetai.setSelectedItem(0);
        try {            
            st=(Statement) con.connecion().prepareStatement(fg);
            rs=st.executeQuery(fg);
            while(rs.next())
           
                cmdetai.addItem(rs.getString("numCommande"));
            
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(rootPane,ex);
            
        }
        
    }
    public void procomb()
    {
        String hj="select * from produit";
        nomprod.setSelectedItem(0);
        try {
            
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery(hj);
            while(rs.next())
            {
                nomprod.addItem(rs.getString("nomProduit"));
            }
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(rootPane,ex);
            
        }
    }
   
     public void factcomb()
    {
        String f="select distinct numCommande from detail order by numCommande desc";
        Cmf.setSelectedItem(0);
        try {
             st=(Statement) con.connecion().createStatement();
             rs=st.executeQuery(f);
             while(rs.next())
                 Cmf.addItem(rs.getString("numCommande"));
            
        } catch (Exception e) {
           //JOptionPane.showMessageDialog(rootPane,e);
        }
        
    }
   
    public void effacert1()
    {
        while(t1.getRowCount()>0)
        {
            for(int i=0;i<t1.getRowCount();i++)
                
            t1.removeRow(i);
            
        }
    }
    public void effacert2()
    {
        while(t2.getRowCount()>0)
        {
            for(int i=0;i<t2.getRowCount();i++)
                
            t2.removeRow(i);
            
        }
    }
   
   
    public void updateT2()
    {
        try {
            t2.setRowCount(0);
            rs=con2.extaireData("select * from detail,produit where produit.numProduit=detail.numProduit order by date desc");
            while(rs.next())
            {
                t2.addRow(new Object[]{
                rs.getString("numCommande"),
                    rs.getString("nomProduit"),
                    rs.getString("quantite"),
                    rs.getString("date")
                
                });
                
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(rootPane,e);
        }
        
    }
    public void updateT1()
    {
        try {
            t1.setRowCount(0);
            rs=con2.extaireData("select * from commande order by numCommande desc");
            while(rs.next())
            {
                t1.addRow(new Object[]{
                rs.getString("numCommande"),
                rs.getString("idCommande"),
                rs.getString("date")
                
                });
                
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(rootPane,e);
        }
        
    }
    public void actuel()
    {
        //effacert1();
        updateT1();
        //effacert2();
        updateT2();
    }
    public void filtra1(String write)
    {
     TableRowSorter<DefaultTableModel> fi=new TableRowSorter<DefaultTableModel>(t1);
       jTable1.setRowSorter(fi);
       fi.setRowFilter(RowFilter.regexFilter(write));
   
    }
    public void filtra2(String write)
    {
     TableRowSorter<DefaultTableModel> fi=new TableRowSorter<DefaultTableModel>(t2);
       jTable2.setRowSorter(fi);
       fi.setRowFilter(RowFilter.regexFilter(write));
   
    }
     public void Imagetitle()
  {
      setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("title.png")));
  }
     public void fx()
     {
          String se="select nomFx from fonction,employe where fonction.numFx=employe.numFx and id="+inputcmdId.getSelectedItem()+"";
        try {
            st=(Statement) con.connecion().createStatement();
            rs=st.executeQuery(se);
            while(rs.next())
            {
                fxcorre.setText(rs.getString("nomFx"));

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
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
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Commandes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Commandes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cmf;
    private javax.swing.JComboBox<String> cmdetai;
    private javax.swing.JTextField filt1;
    private javax.swing.JTextField filt2;
    private javax.swing.JTextField fxcorre;
    private javax.swing.JComboBox<String> inputcmdId;
    private javax.swing.JLabel inputdate;
    private javax.swing.JTextField inputfacture;
    private javax.swing.JTextArea inputprise;
    private javax.swing.JTextField inputsolde;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField nomcorre;
    private javax.swing.JComboBox<String> nomprod;
    private javax.swing.JTextField numprod;
    private javax.swing.JPanel printer;
    private javax.swing.JTextField qt;
    private javax.swing.JTextField rech;
    private javax.swing.JTextField rechd;
    // End of variables declaration//GEN-END:variables
}
