package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import LesClasses.Praticien;

/**
 * Class de connection à la bdd MySQL
 * 
 * @author François
 */
public class Connect {

    private String url = "jdbc:mysql://localhost:3306/pharmaeurope?serverTimezone=UTC";
    private String utilisateur = "root";
    private String motDePasse = "root";

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public Connect() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("log : MySQL connecté");
        } catch (SQLException ex) {
            /* Gérer les éventuelles erreurs ici */
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    // En attendant les class DAO
    public boolean connexion(String id, String mdp) throws SQLException {
        String sql = "SELECT * FROM pharmaeurope.visiteur WHERE VIS_NOM = '" + id + "' AND VIS_DATEEMBAUCHE = '" + mdp
                + "'";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        return rs.next();
    }

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
