package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Class de connection à la bdd MySQL
 * 
 * @author François
 */
public class Connect {

    protected String url = "jdbc:mysql://localhost:3306/pharmaeurope?serverTimezone=UTC";
    protected String utilisateur = "root";
    protected String motDePasse = "root";

    protected Connection connexion = null;
    protected Statement stmt = null;
    protected ResultSet rs = null;

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
}
