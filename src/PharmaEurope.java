import java.sql.SQLException;

import DAO.PraticienDAO;
import IHM.*;
import LesClasses.Praticien;

/**
 * App PharmaEurope
 * 
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
        PraticienDAO praDAO = new PraticienDAO();
        Praticien praticien = praDAO.getFirstPra();
        System.out.println(praticien.getNom());
        /* Menu login = new Menu();
        login.setVisible(true); */
    }
}
