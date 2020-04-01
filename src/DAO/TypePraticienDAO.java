package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LesClasses.TypePracticien;

/**
 * TypePraticienDAO
 */
public class TypePraticienDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public TypePraticienDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<TypePracticien> getlesType() throws SQLException {
        ArrayList<TypePracticien> res = new ArrayList<TypePracticien>();
        String sql = "SELECT * FROM type_praticien";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String code = rs.getString("TYP_CODE");
            String libelle = rs.getString("TYP_LIBELLE");
            String lieu = rs.getString("TYP_LIEU");
            TypePracticien type = new TypePracticien(code, libelle, lieu);
            res.add(type);
        }
        return res;
    }

    public String getlTypePracticien(String nomType) throws SQLException {
        String sql = "SELECT TYP_CODE FROM type_praticien WHERE TYP_LIBELLE = '" + nomType + "'";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        String res = rs.next() == true ? rs.getString(1) : null;
        return res;
    }

}