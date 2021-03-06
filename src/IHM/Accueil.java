package IHM;

import javax.swing.JOptionPane;
import java.awt.*;

/**
 *
 * @author François
 */
public class Accueil extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(".\\src\\img\\dispensary.png");
        this.setIconImage(icon);
        this.setDefaultCloseOperation(Accueil.DO_NOTHING_ON_CLOSE);

        /* Some piece of code */
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(windowEvent.getWindow(), "Sût de vouloir fermer l'application ?",
                        "Fermer la fenêtre ?", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCompteRendu = new javax.swing.JButton();
        BtnVisiteur = new javax.swing.JButton();
        BtnPraticien = new javax.swing.JButton();
        BtnMedicament = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Gestion des comptes");
        setResizable(false);
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                ancestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });

        BtnCompteRendu.setText("Compte-rendus");
        BtnCompteRendu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCompteRenduActionPerformed(evt);
            }
        });

        BtnVisiteur.setText("Visiteurs");
        BtnVisiteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVisiteurActionPerformed(evt);
            }
        });

        BtnPraticien.setText("Praticiens");
        BtnPraticien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPraticienActionPerformed(evt);
            }
        });

        BtnMedicament.setText("Médicaments");
        BtnMedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMedicamentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnMedicament, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCompteRendu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnVisiteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnPraticien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BtnCompteRendu)
                .addGap(43, 43, 43)
                .addComponent(BtnVisiteur)
                .addGap(40, 40, 40)
                .addComponent(BtnPraticien)
                .addGap(36, 36, 36)
                .addComponent(BtnMedicament)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCompteRenduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCompteRenduActionPerformed
        VueRapportVis vueRapport = new VueRapportVis();
        vueRapport.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCompteRenduActionPerformed

    private void BtnMedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMedicamentActionPerformed
        VueMedicament vueMedic = new VueMedicament();
        vueMedic.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMedicamentActionPerformed

    private void BtnPraticienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPraticienActionPerformed
        VuePraticien vuePrat = new VuePraticien();
        vuePrat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnPraticienActionPerformed

    private void BtnVisiteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVisiteurActionPerformed
        VueVisiteur vueVisiteur = new VueVisiteur();
        vueVisiteur.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BtnVisiteurActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCompteRendu;
    private javax.swing.JButton BtnMedicament;
    private javax.swing.JButton BtnPraticien;
    private javax.swing.JButton BtnVisiteur;
    // End of variables declaration//GEN-END:variables
}
