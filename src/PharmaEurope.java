import IHM.*;
import java.sql.SQLException;

/**
 * App PharmaEurope
 * @author François Bouscaillou
 */
public class PharmaEurope {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws SQLException
     */
    public static void main(final String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Application PharmaEurope");
        Menu login = new Menu();
        login.setVisible(true);
    }
}
