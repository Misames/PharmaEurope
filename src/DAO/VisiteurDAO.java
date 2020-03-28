package DAO;

import java.sql.*;
import LesClasses.Visiteur;

/**
 * VisiteurDAO
 */
public class VisiteurDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public VisiteurDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Visiteur getFirstVis() throws SQLException {
        Visiteur res = null;
        String sql = "SELECT * FROM visiteur";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        if (rs.next()) {
            String num = rs.getString("VIS_NUM");
            String nom = rs.getString("VIS_NOM");
            String prenom = rs.getString("VIS_PRENOM");
            String adresse = rs.getString("VIS_ADRESSE");
            String cp = rs.getString("VIS_CP");
            String ville = rs.getString("VIS_VILLE");
        }
        return res;
    }

}