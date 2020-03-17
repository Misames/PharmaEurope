package pharmaeurope;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class Connect {
    private Connection conn;
    public Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            final String url = "jdbc:mysql://localhost:8080/";
            final String user = "root";
            final String passwd = "root";
            conn = DriverManager.getConnection(url, user, passwd);
        } catch (final Exception e) {
            e.getMessage();
        }

    }
}