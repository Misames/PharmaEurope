package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LesClasses.Secteur;

/**
 * SecteurDAO
 */
public class SecteurDAO {
    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public SecteurDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Secteur> getLesSecteur() throws SQLException {
        ArrayList<Secteur> res = new ArrayList<Secteur>();

        String sql = "SELECT * FROM secteur";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String secCode = rs.getString("SEC_CODE");
            String secLibelle = rs.getString("SEC_LIBELLE");
            Secteur unSecteur = new Secteur(secCode, secLibelle);
            res.add(unSecteur);
        }
        return res;
    }

}