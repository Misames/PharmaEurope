package DAO;

import java.sql.*;
import java.util.ArrayList;
import LesClasses.Praticien;

/**
 * PraticienDAO
 */
public class PraticienDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public PraticienDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Praticien> getLesPraticien() throws SQLException {
        ArrayList<Praticien> res = new ArrayList<Praticien>();
        String sql = "SELECT * FROM praticien";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String num = rs.getString("PRA_NUM");
            String nom = rs.getString("PRA_NOM");
            String prenom = rs.getString("PRA_PRENOM");
            String adresse = rs.getString("PRA_ADRESSE");
            String cp = rs.getString("PRA_CP");
            String ville = rs.getString("PRA_VILLE");
            float coef = rs.getFloat("PRA_COEFNOTORIETE");
            String type = rs.getString("TYP_CODE");
            res.add(new Praticien(num, nom, prenom, adresse, cp, ville, coef, type));
        }
        return res;
    }

    /**
     * Retourne le premier Praticien de la liste ou null si la table est vide
     * 
     * @return Praticien | null
     * @throws SQLException
     */
    public Praticien getFirstPra() throws SQLException {
        Praticien res = null;
        String sql = "SELECT * FROM praticien";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        if (rs.next()) {
            String num = rs.getString("PRA_NUM");
            String nom = rs.getString("PRA_NOM");
            String prenom = rs.getString("PRA_PRENOM");
            String adresse = rs.getString("PRA_ADRESSE");
            String cp = rs.getString("PRA_CP");
            String ville = rs.getString("PRA_VILLE");
            float coef = rs.getFloat("PRA_COEFNOTORIETE");
            String type = rs.getString("TYP_CODE");
            res = new Praticien(num, nom, prenom, adresse, cp, ville, coef, type);
        }
        return res;
    }

}