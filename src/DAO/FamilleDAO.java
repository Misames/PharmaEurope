package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LesClasses.Famille;

/**
 * FamilleDAO
 */
public class FamilleDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public FamilleDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Famille getFamilles() {
        ArrayList<Famille> res = new ArrayList<Famille>();
        String sql = "SELECT * FROM famille";
        return null;
    }

}