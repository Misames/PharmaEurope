package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LesClasses.Labo;

/**
 * LaboDAO
 */
public class LaboDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public LaboDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Labo> getLesLabo() throws SQLException {
        ArrayList<Labo> res = new ArrayList<Labo>();
        Labo monLab = null;
        String sql = "SELECT * FROM Labo";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String code = rs.getString("LAB_CODE");
            String nom = rs.getString("LAB_NOM");
            String chef = rs.getString("LAB_CHEFVENTE");
            monLab = new Labo(code, nom, chef);
            res.add(monLab);
        }
        return res;
    }
}