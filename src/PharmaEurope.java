import IHM.*;
/**
 * App PharmaEurope
 * @author François Bouscaillou
 */
public class PharmaEurope {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(final String[] args) throws ClassNotFoundException {
        System.out.println("Application PharmaEurope");
        Menu login = new Menu();
        login.setVisible(true);
    }
}
