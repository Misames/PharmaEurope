/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import com.mysql.cj.log.Slf4JLogger;

/**
 *
 * @author François
 */
public class Test {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public Test() {
        /* Connexion à la base de données */
        String url = "jdbc:mysql://localhost:3306/pharmaeurope";
        String utilisateur = "root";
        String motDePasse = "root";
        Connection connexion = null;
        try {
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            /* Création de l'objet gérant les requêtes */
            stmt = connexion.createStatement();
        } catch (SQLException ex) {
            /* Gérer les éventuelles erreurs ici */
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test();
    }
}
