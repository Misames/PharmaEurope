package IHM;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.*;

import DAO.LaboDAO;
import DAO.SecteurDAO;
import DAO.VisiteurDAO;
import LesClasses.Labo;
import LesClasses.Secteur;
import LesClasses.Visiteur;

/**
 *
 * @author François
 */
public class VueVisiteur extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 3275827967950383805L;
    private Visiteur unVis;
    private VisiteurDAO visiteurDAO;

    /**
     * Creates new form Visiteur
     */
    public VueVisiteur() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\dispensary.png");
        this.setIconImage(icon);
        setLocationRelativeTo(null);
        LstLabo.removeAllItems();
        LstSecteur.removeAllItems();
        LstVis.removeAllItems();

        LstLabo.addItem("");
        LstSecteur.addItem("");
        LstVis.addItem("");

        LstLabo.setEnabled(false);
        LstSecteur.setEnabled(false);
        BtnEnregistre.setEnabled(false);
        BtnAjout.setEnabled(false);

        try {
            visiteurDAO = new VisiteurDAO();
            int i = 0;
            for (Visiteur unVisiteur : visiteurDAO.getLesVisiteurs()) {
                LstVis.insertItemAt(unVisiteur.getVisNom() + " " + unVisiteur.getVisPrenom(), ++i);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnOk = new javax.swing.JButton();
        LblChercher = new javax.swing.JLabel();
        Titre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        LblNom = new javax.swing.JLabel();
        LblPrenom = new javax.swing.JLabel();
        LblAdresse = new javax.swing.JLabel();
        LblVille = new javax.swing.JLabel();
        LblSecteur = new javax.swing.JLabel();
        LblLabo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNom = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtPrenom = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtAdresse = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtCp = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        TxtVille = new javax.swing.JTextPane();
        LstSecteur = new javax.swing.JComboBox<>();
        LstLabo = new javax.swing.JComboBox<>();
        LstVis = new javax.swing.JComboBox<>();
        BtnAjout = new javax.swing.JButton();
        BtnEnregistre = new javax.swing.JButton();
        javax.swing.JToggleButton Btnretour = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visiteurs");
        setAlwaysOnTop(true);
        BtnOk.setText("OK");
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    BtnOkActionPerformed(evt);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        LblChercher.setLabelFor(LstVis);
        LblChercher.setText("Chercher :");

        Titre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titre.setText("Visiteur");
        Titre.setVerifyInputWhenFocusTarget(false);

        LblNom.setText("Nom");

        LblPrenom.setText("Prénom");

        LblAdresse.setText("Adresse");

        LblVille.setText("Ville");

        LblSecteur.setText("Secteur");

        LblLabo.setText("Labo");

        jScrollPane1.setViewportView(TxtNom);

        jScrollPane2.setViewportView(TxtPrenom);

        jScrollPane3.setViewportView(TxtAdresse);

        jScrollPane4.setViewportView(TxtCp);

        jScrollPane5.setViewportView(TxtVille);

        LstSecteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LstLabo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LstVis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        LstVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LstVisActionPerformed(evt);
            }
        });

        BtnAjout.setText("Ajouter");
        BtnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjoutActionPerformed(evt);
            }
        });

        BtnEnregistre.setText("Enregistrer");
        BtnEnregistre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    BtnEnregistreActionPerformed(evt);
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        Btnretour.setText("Retour");
        Btnretour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnretourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LblChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LstVis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(BtnOk)
                .addGap(162, 162, 162))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPrenom)
                            .addComponent(LblNom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblAdresse)
                            .addComponent(LblSecteur)
                            .addComponent(LblLabo)
                            .addComponent(LblVille))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(LstSecteur, 0, 127, Short.MAX_VALUE)
                                .addComponent(LstLabo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEnregistre)
                        .addGap(177, 177, 177)
                        .addComponent(BtnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(Titre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btnretour)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Titre)
                            .addComponent(Btnretour))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LstVis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LblNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addGap(23, 23, 23)
                                .addComponent(LblPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LblAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LblVille)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblSecteur)
                    .addComponent(LstSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(LblLabo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LstLabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAjout)
                            .addComponent(BtnEnregistre))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_BtnOkActionPerformed
        String name = (String) LstVis.getSelectedItem();
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selectionner un visiteur");
        } else {
            String[] fullName = name.split(" ");
            try {
                unVis = new VisiteurDAO().getLeVis(fullName[0], fullName[1]);
                if (unVis == null)
                    JOptionPane.showMessageDialog(this, "Personne inconnue");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            TxtNom.setText(unVis.getVisNom());
            TxtPrenom.setText(unVis.getVisPrenom());
            TxtAdresse.setText(unVis.getVisAdresse());
            TxtCp.setText(unVis.getVisCP());
            TxtVille.setText(unVis.getVisVille());

            LstLabo.setEnabled(true);
            LstSecteur.setEnabled(true);
            LstLabo.removeAllItems();
            LstSecteur.removeAllItems();

            for (Secteur unSecteur : new SecteurDAO().getLesSecteur()) {
                LstSecteur.addItem(unSecteur.getSecLibelle());
                if(unSecteur.getSecCode().equals(unVis.getVisSecteur().getSecCode())){
                    LstSecteur.setSelectedItem(unVis.getVisSecteur().getSecLibelle());
                }
            }

            for (Labo unLab : new LaboDAO().getLesLabo()) {;
                    LstLabo.addItem(unLab.getLabNom());
                    if(unLab.getLabCode().equals(unVis.getVisLabo().getLabCode())) {
                        LstLabo.setSelectedItem(unLab.getLabNom());
                    }
            }
            BtnEnregistre.setEnabled(true);
        }
    }

    private void BtnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjoutActionPerformed
        
    }//GEN-LAST:event_BtnAjoutActionPerformed


    private void LstVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LstVisActionPerformed

    }//GEN-LAST:event_LstVisActionPerformed

    private void BtnretourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnretourActionPerformed
        Accueil accueil = new Accueil();
        accueil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnretourActionPerformed

    private void BtnEnregistreActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_BtnEnregistreActionPerformed
        // save visiteur
        int lol = visiteurDAO.setVisiteur(unVis.getVisMatricule() ,TxtNom.getText(), TxtPrenom.getText(), TxtAdresse.getText(), TxtVille.getText(), TxtCp.getText(), (String) LstLabo.getSelectedItem(),(String) LstSecteur.getSelectedItem());
        System.out.println(lol);
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
            java.util.logging.Logger.getLogger(Visiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visiteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueVisiteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAjout;
    private javax.swing.JButton BtnEnregistre;
    private javax.swing.JButton BtnOk;
    private javax.swing.JLabel LblAdresse;
    private javax.swing.JLabel LblChercher;
    private javax.swing.JLabel LblLabo;
    private javax.swing.JLabel LblNom;
    private javax.swing.JLabel LblPrenom;
    private javax.swing.JLabel LblSecteur;
    private javax.swing.JLabel LblVille;
    private javax.swing.JComboBox<String> LstLabo;
    private javax.swing.JComboBox<String> LstSecteur;
    private javax.swing.JComboBox<String> LstVis;
    private javax.swing.JLabel Titre;
    private javax.swing.JTextPane TxtAdresse;
    private javax.swing.JTextPane TxtCp;
    private javax.swing.JTextPane TxtNom;
    private javax.swing.JTextPane TxtPrenom;
    private javax.swing.JTextPane TxtVille;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
