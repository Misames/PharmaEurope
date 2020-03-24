package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import LesClasses.Praticien;

import java.sql.ResultSet;

/**
 * Class de connection à la bdd MySQL
 * 
 * @author François
 */
public class Connect {

    String url = "jdbc:mysql://localhost:3306/pharmaeurope?serverTimezone=UTC";
    String utilisateur = "root";
    String motDePasse = "root";

    Connection connexion = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Connect() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("MySQL connecté ...");
        } catch (SQLException ex) {
            /* Gérer les éventuelles erreurs ici */
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    // En attendant les class DAO

    public Praticien getFirstPra() throws SQLException, ClassNotFoundException {
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

    /**
     * Méthode de test de la bdd
     * 
     * @throws SQLException
     */
    public void pingBdd() throws SQLException {
        String sql = "SELECT * FROM pharmaeurope.visiteur";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        rs.next();
        String cp = rs.getString("VIS_VILLE");
        System.out.println(cp);
    }
}
