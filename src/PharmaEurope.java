import IHM.Menu;
import DAO.*;
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
        Connect t1 = new Connect();
        t1.pingBdd();
        Menu menu = new Menu();
        menu.setVisible(true);
    }
}
