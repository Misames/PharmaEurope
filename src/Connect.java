
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
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
        } catch (SQLException ex) {
            /* Gérer les éventuelles erreurs ici */
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public void pingBdd() throws SQLException {
        String sql = "SELECT * FROM pharmaeurope.visiteur";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        rs.next();
        String cp = rs.getString("VIS_CP");
        System.out.println(cp);
    }
}
