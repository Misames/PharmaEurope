import IHM.*;

/**
 * App PharmaEurope
 * 
 * @author François Bouscaillou
 */
public class PharmaEurope {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Application PharmaEurope");
        try {
            Menu login = new Menu();
            login.setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
