package DAO;

import java.sql.*;

/**
 * MedicamentDAO
 */
public class MedicamentDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public MedicamentDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}