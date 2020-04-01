package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LesClasses.Praticien;
import LesClasses.TypePracticien;

/**
 * PraticienDAO
 */
public class PraticienDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public PraticienDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 
     * @return la liste complete des praticiens
     * @throws SQLException
     */
    public ArrayList<Praticien> getLesPraticien() throws SQLException {
        ArrayList<Praticien> res = new ArrayList<Praticien>();
        String sql = "SELECT * FROM praticien "
                + "INNER JOIN type_praticien ON praticien.TYP_CODE = type_praticien.TYP_CODE";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            String num = rs.getString("PRA_NUM");
            String nom = rs.getString("PRA_NOM");
            String prenom = rs.getString("PRA_PRENOM");
            String adresse = rs.getString("PRA_ADRESSE");
            String cp = rs.getString("PRA_CP");
            String ville = rs.getString("PRA_VILLE");
            float coef = rs.getFloat("PRA_COEFNOTORIETE");
            String typeCode = rs.getString("TYP_CODE");
            String typeLibellle = rs.getString("TYP_LIBELLE");
            String typeLieu = rs.getString("TYP_LIEU");
            TypePracticien typePracticien = new TypePracticien(typeCode, typeLibellle, typeLieu);
            res.add(new Praticien(num, nom, prenom, adresse, cp, ville, coef, typePracticien));
        }
        return res;
    }

    public Praticien getLePra(String nom, String prenom) throws SQLException {
        Praticien res = null;
        String sql = "SELECT * FROM praticien "
                + "INNER JOIN type_praticien ON praticien.TYP_CODE = type_praticien.TYP_CODE " + "WHERE PRA_NOM = '"
                + nom + "' AND PRA_PRENOM = '" + prenom + "'";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        if (rs.next()) {
            String num = rs.getString("PRA_NUM");
            String sonNom = rs.getString("PRA_NOM");
            String sonPrenom = rs.getString("PRA_PRENOM");
            String adresse = rs.getString("PRA_ADRESSE");
            String cp = rs.getString("PRA_CP");
            String ville = rs.getString("PRA_VILLE");
            float coef = rs.getFloat("PRA_COEFNOTORIETE");
            String typeCode = rs.getString("TYP_CODE");
            String typeLibellle = rs.getString("TYP_LIBELLE");
            String typeLieu = rs.getString("TYP_LIEU");
            TypePracticien typePracticien = new TypePracticien(typeCode, typeLibellle, typeLieu);
            res = new Praticien(num, sonNom, sonPrenom, adresse, cp, ville, coef, typePracticien);
        }
        return res;
    }

    public int setPraticien(String num, String nom, String prenom, String adresse, String cp, String ville, String coef,
            String lieu) throws SQLException {
        String sql = "UPDATE praticien SET PRA_NOM = '" + nom + "', " + "PRA_PRENOM = '" + prenom + "', "
                + "PRA_ADRESSE = '" + adresse + "', " + "PRA_CP = '" + cp + "', " + "PRA_VILLE = '" + ville + "', "
                + "PRA_COEFNOTORIETE = " + Float.parseFloat(coef) + ", " + "TYP_CODE = '" + lieu + "' "
                + "WHERE PRA_NUM = '" + num + "'";
        stmt = connexion.createStatement();
        return stmt.executeUpdate(sql);
    }

}