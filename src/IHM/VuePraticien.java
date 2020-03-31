package IHM;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.PraticienDAO;
import DAO.TypePraticienDAO;
import LesClasses.Praticien;
import LesClasses.TypePracticien;

/**
 *
 * @author François Bouscaillou
 */
public class VuePraticien extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private ArrayList<Praticien> lesPrat;
    private ArrayList<TypePracticien> lesType;
    private PraticienDAO pratDAO;
    private TypePraticienDAO TypeDAO;
    private Praticien unPraticien;

    /**
     * Creates new form VuePraticien
     */
    public VuePraticien() {
        initComponents();
        LstLieu.removeAllItems();
        LstLieu.setEnabled(false);
        LstPra.removeAllItems();
        btnAdd.setEnabled(false);
        Btndelete.setEnabled(false);
        BtnSave.setEnabled(false);
        setLocationRelativeTo(null);

        try {
            pratDAO = new PraticienDAO();
            lesPrat = pratDAO.getLesPraticien();
            TypeDAO = new TypePraticienDAO();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        LstPra.addItem("");
        for (Praticien praticien : lesPrat) {
            LstPra.addItem(praticien.getNom() + " " + praticien.getPraPrenom());
        }
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        LstPra = new javax.swing.JComboBox<>();
        BtnOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LstLieu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        nbCoef = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtCp = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtVille = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtAdresse = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtPrenom = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtNom = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        BtnBack = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        Btndelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Praticien");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("framePraticien"); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Praticien");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Chercher");

        LstPra.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BtnOk.setText("OK");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });

        jLabel3.setText("Nom");

        jLabel4.setText("Prénom");

        jLabel5.setText("Adresse");

        jLabel6.setText("Ville");

        jLabel8.setText("Coeficient nautoriété");

        LstLieu.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Type de lieu");

        jScrollPane1.setViewportView(TxtCp);

        jScrollPane2.setViewportView(TxtVille);

        jScrollPane3.setViewportView(TxtAdresse);

        jScrollPane4.setViewportView(TxtPrenom);

        jScrollPane5.setViewportView(TxtNom);

        BtnBack.setText("Retour");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnSave.setText("Enregistrer");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                        BtnAddActionPerformed(evt);
                    }
        });

        Btndelete.setText("Supprimer");

        btnAdd.setText("Ajouter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        layout.createSequentialGroup().addContainerGap().addComponent(jSeparator1))
                                .addGroup(layout.createSequentialGroup().addGap(232, 232, 232)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnBack).addGap(16, 16, 16))
                                .addGroup(layout.createSequentialGroup().addGroup(layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(76, 76, 76).addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addComponent(jLabel8)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                                                                        jLabel7)
                                                                .addComponent(nbCoef,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 106,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup().addComponent(
                                                                jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LstLieu,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 175,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                70,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3).addComponent(jLabel4)
                                                                        .addComponent(jLabel5))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jScrollPane1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        73,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(27, 27, 27)
                                                                                .addComponent(jScrollPane2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        175,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jScrollPane5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                175,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                175,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                175,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(
                                                layout.createSequentialGroup().addGap(86, 86, 86)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(37, 37, 37)
                                                        .addComponent(LstPra, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(43, 43, 43).addComponent(BtnOk))
                                        .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(
                                                jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 618,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup().addGap(166, 166, 166)
                                                .addComponent(Btndelete).addGap(26, 26, 26).addComponent(BtnSave)
                                                .addGap(39, 39, 39).addComponent(btnAdd)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
                        .addComponent(BtnBack))
                .addGap(12, 12, 12)
                .addComponent(
                        jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
                        .addComponent(LstPra, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(
                        jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel3)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup().addGap(15, 15, 15).addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(50, 50, 50).addComponent(jLabel6,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 32,
                                                Short.MAX_VALUE)
                                        .addComponent(jScrollPane1))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(nbCoef, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout
                                                .createSequentialGroup().addGap(12, 12, 12).addComponent(jLabel7)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LstLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(BtnSave)
                        .addComponent(Btndelete).addComponent(btnAdd))
                .addGap(23, 23, 23)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnOkActionPerformed
        String name = (String) LstPra.getSelectedItem();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selectionner un Praticien disponible");
        } else {
            String[] fullName = name.split(" ");
            try {
                unPraticien = pratDAO.getLePra(fullName[0], fullName[1]);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                BtnSave.setEnabled(true);
                nbCoef.setText(Float.toString(unPraticien.getPraCoefnotoriete()));
                TxtNom.setText(unPraticien.getNom());
                TxtPrenom.setText(unPraticien.getPraPrenom());
                TxtAdresse.setText(unPraticien.getPraAdresse());
                TxtCp.setText(unPraticien.getPraCP());
                TxtVille.setText(unPraticien.getPraVille());
                LstLieu.setEnabled(true);
                LstLieu.removeAllItems();
                try {
                    lesType = TypeDAO.getlesType();
                } catch (SQLException e) {
                    System.out.println(e.getErrorCode());
                } finally {
                    for (TypePracticien unType : lesType) {
                        LstLieu.addItem(unType.getTypLibelle());
                        if (unType.getTypeCode().equals(unPraticien.getTypePracticien().getTypeCode())) {
                            LstLieu.setSelectedItem(unType.getTypLibelle());
                        }
                    }
                }
            }
        }
    }// GEN-LAST:event_BtnOkActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BtnBackActionPerformed
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_BtnBackActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VuePraticien.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VuePraticien.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VuePraticien.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VuePraticien.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VuePraticien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnOk;
    private javax.swing.JButton BtnSave;
    private javax.swing.JButton Btndelete;
    private javax.swing.JComboBox<String> LstLieu;
    private javax.swing.JComboBox<String> LstPra;
    private javax.swing.JTextPane TxtAdresse;
    private javax.swing.JTextPane TxtCp;
    private javax.swing.JTextPane TxtNom;
    private javax.swing.JTextPane TxtPrenom;
    private javax.swing.JTextPane TxtVille;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextPane nbCoef;
    // End of variables declaration//GEN-END:variables
}
