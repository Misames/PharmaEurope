package IHM;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import DAO.Connect;

/**
 *
 * @author François
 */
public class Menu extends javax.swing.JFrame {

     // data
    private Connection connexion;

    /**
     * Creates new form Menu
     * 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Menu() throws ClassNotFoundException, SQLException {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            connexion = Connect.getConnexion();
        } catch (SQLException e1) {
            System.out.println(e1.getMessage());
        }

        Valider = new javax.swing.JButton();
        ChampIdentifiant = new javax.swing.JTextField();
        LabelIdentifient = new javax.swing.JLabel();
        LabelMdp = new javax.swing.JLabel();
        ChampMdp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu  - PharmaEurope");

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    ValiderActionPerformed(evt);
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        LabelIdentifient.setText("Identifiant");

        LabelMdp.setText("Code secret");

        ChampMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChampMdpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Valider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChampIdentifiant)
                    .addComponent(LabelIdentifient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelMdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ChampMdp))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(LabelIdentifient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChampIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(LabelMdp)
                .addGap(38, 38, 38)
                .addComponent(ChampMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Valider)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChampMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChampMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChampMdpActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_ValiderActionPerformed

        System.out.println("log : clic");

        // recup data des form
        String mdp = ChampMdp.getText();
        String id = ChampIdentifiant.getText();
        System.out.println("log : Mdp : " + mdp.toString() + " / id :" + id);

        try {
            // tester les identifiants
            if (!Connect.connexion(id, mdp)) {
                System.out.println("log : erreur dans l'autentification");
                JOptionPane.showMessageDialog(this, "erreur dans l'autentification");
            } else {
                System.out.println("log : Menu principale");
                Accueil accueil = new Accueil();
                accueil.setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Saisir un le bon mot de passe");
        }

        System.out.println("log : fin clic");

    }// GEN-LAST:event_ValiderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Menu().setVisible(true);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ChampIdentifiant;
    private javax.swing.JTextField ChampMdp;
    private javax.swing.JLabel LabelIdentifient;
    private javax.swing.JLabel LabelMdp;
    private javax.swing.JButton Valider;
    // End of variables declaration//GEN-END:variables
}
