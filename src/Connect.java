package pharmaeurope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

    Connection conn = null;
    Statement smt = null;
    ResultSet resultat = null;
    final String url = "jdbc:mysql://127.0.0.1:3306/pharmaeurope";
    final String user = "root";
    final String passwd = "root";

    public Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, passwd);
            smt = conn.createStatement();
        } catch (final ClassNotFoundException | SQLException e) {
            e.getMessage();
        }
    }

    public void ping() {
        resultat = smt.executeQuery("SELECT * FROM visiteur");
        resultat.next();
        System.out.println(resultat.getString("VIS_NOM"));
        System.out.println("klghgfhjgf");
    }
}