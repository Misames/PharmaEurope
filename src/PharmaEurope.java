import java.sql.SQLException;

import pharmaeurope.Connect;

/**
 *
 * @author François Bouscaillou
 */
public class PharmaEurope {

    /**
     * @param args the command line arguments
     * @throws SQLException
     */
    public static void main(final String[] args) throws SQLException {
        System.out.println("Hello world");
        Connect MySQL = new Connect();
        MySQL.ping();
    }
}
