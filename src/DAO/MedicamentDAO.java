package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LesClasses.Famille;
import LesClasses.Medicament;

/**
 * MedicamentDAO
 */
public class MedicamentDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public MedicamentDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Medicament> getLesMedoc() throws SQLException {
        ArrayList<Medicament> res = new ArrayList<Medicament>();
        String sql = "SELECT * FROM medicament " + "INNER JOIN famille ON medicament.FAM_CODE = famille.FAM_CODE";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String depot = rs.getString("MED_DEPOTLEGAL");
            String nom = rs.getString("MED_NOMCOMMERCIAL");
            String famCode = rs.getString("FAM_CODE");
            String compo = rs.getString("MED_COMPOSITION");
            String effets = rs.getString("MED_EFFETS");
            String contreIndic = rs.getString("MED_CONTREINDIC");
            float prix = rs.getFloat("MED_PRIXECHANTILLON");

            String libelle = rs.getString("FAM_LIBELLE");
            Famille laFamille = new Famille(famCode, libelle);
            Medicament medic = new Medicament(depot, nom, compo, effets, contreIndic, prix, laFamille);
            res.add(medic);
        }
        return res;
    }

    /**
     * 
     * @param depo
     * @param nom
     * @param codeFam
     * @param compo
     * @param effets
     * @param contreIndic
     * @param prix
     * @return nombre de modification
     * @throws SQLException
     */
    public int setMedic(String depo, String nom, String codeFam, String compo, String effets, String contreIndic,
            float prix) throws SQLException {
        String sql = "UPDATE medicament " + "SET MED_NOMCOMMERCIAL = '" + nom + "', FAM_CODE = '" + codeFam
                + "', MED_COMPOSITION = '" + compo + "', MED_EFFETS = '" + effets + "', MED_CONTREINDIC = '"
                + contreIndic + "', MED_PRIXECHANTILLON = " + prix + " WHERE MED_DEPOTLEGAL = '" + depo + "'";
        stmt = connexion.createStatement();
        return stmt.executeUpdate(sql);
    }

}