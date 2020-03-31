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

    public ArrayList<Famille> getFamilles() throws SQLException {
        ArrayList<Famille> res = new ArrayList<Famille>();
        String sql = "SELECT * FROM famille";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String code = rs.getString("FAM_CODE");
            String libelle = rs.getString("FAM_LIBELLE");
            Famille fam = new Famille(code, libelle);
            res.add(fam);
        }
        return res;
    }

}