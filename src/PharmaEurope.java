import java.sql.SQLException;

/**
 *
 * @author François Bouscaillou
 */
public class PharmaEurope {

    /**
     * @param args the command line arguments
     * @throws SQLException
     */
    public static void main(final String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Appli principale");
        Connect t1 = new Connect();
        t1.pingBdd();
    }
}
