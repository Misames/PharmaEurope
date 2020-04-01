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

    private Connection connexion;

    /**
     * Creates new form Menu
     * 
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Menu() throws ClassNotFoundException, SQLException {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Valider = new javax.swing.JButton();
        ChampIdentifiant = new javax.swing.JTextField();
        LabelIdentifient = new javax.swing.JLabel();
        LabelMdp = new javax.swing.JLabel();
        ChampMdp = new javax.swing.JTextField();

        try {
            new Connect();
            connexion = Connect.getConnexion();
        } catch (SQLException e1) {
            System.out.println(e1.getMessage());
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - PharmaEurope");

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

        LabelIdentifient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelIdentifient.setText("Identifiant");

        LabelMdp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMdp.setText("Code secret");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                        .createSequentialGroup().addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ChampMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(LabelIdentifient, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelMdp, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(ChampIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGroup(layout.createSequentialGroup().addGap(140, 140, 140).addComponent(Valider,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap(58, Short.MAX_VALUE).addComponent(LabelIdentifient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChampIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(LabelMdp)
                        .addGap(18, 18, 18)
                        .addComponent(ChampMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12).addComponent(Valider).addGap(83, 83, 83)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_ValiderActionPerformed

        System.out.println("log : clic");

        // recup data des form
        String mdp = ChampMdp.getText();
        String id = ChampIdentifiant.getText();
        System.out.println("log : Mdp : " + mdp + " / id :" + id);

        try {
            // tester les identifiants
            if (!Connect.connexion(id, mdp)) {
                System.out.println("log : erreur dans l'autentification");
                JOptionPane.showMessageDialog(this, "erreur dans l'autentification");
            } else {
                System.out.println("log : Menu principale");
                Accueil accueil = new Accueil();
                accueil.setVisible(true);
                this.dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Saisir un le bon mot de passe");
            System.out.println(e.getMessage());
        }
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
                } catch (ClassNotFoundException | SQLException e) {
                    System.out.println(e.getMessage());
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
