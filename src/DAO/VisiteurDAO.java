package DAO;

import java.sql.*;
import java.util.ArrayList;

import LesClasses.Labo;
import LesClasses.Secteur;
import LesClasses.Visiteur;

/**
 * VisiteurDAO
 */
public class VisiteurDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public VisiteurDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Visiteur> getLesVisiteurs() throws SQLException {
        ArrayList<Visiteur> res = new ArrayList<Visiteur>();
        Labo unLab = null;
        Secteur unSecteur = null;

        String sql = "SELECT * FROM visiteur " +
                     "LEFT JOIN labo ON visiteur.LAB_CODE = labo.LAB_CODE " +
                     "LEFT JOIN secteur ON secteur.SEC_CODE = visiteur.SEC_CODE " +
                     "ORDER BY VIS_NOM";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);

        while(rs.next()) {
            String mat = rs.getString("VIS_MATRICULE");
            String nom = rs.getString("VIS_NOM");
            String prenom = rs.getString("VIS_PRENOM");
            String adresse = rs.getString("VIS_ADRESSE");
            String cp = rs.getString("VIS_CP");
            String ville = rs.getString("VIS_VILLE");
            Date dateEnbauche = rs.getDate("VIS_DATEEMBAUCHE");
            
            
            String labCode = rs.getString("LAB_CODE");
            String nomLabo = rs.getString("LAB_NOM");
            String chef = rs.getString("LAB_CHEFVENTE");

            String secCode = rs.getString("SEC_CODE");
            String secLibelle = rs.getString("SEC_LIBELLE");

            unLab = new Labo(labCode, nomLabo, chef);
            unSecteur = new Secteur(secCode, secLibelle);
            Visiteur vis = new Visiteur(mat, nom, prenom, adresse, cp, ville, dateEnbauche, unSecteur, unLab);
            res.add(vis);
        }
        return res;
    }

    public int deleteVisiteur(String matricule) throws SQLException {
        String sql = "DELETE FROM visiteur WHERE VIS_MATRICULE = '" + matricule + "'";
        stmt = connexion.createStatement();
        return stmt.executeUpdate(sql);
    }

    public Visiteur getLeVis(String nom, String prenom) throws SQLException {
        Visiteur res = null;
        Labo unLab = null;
        Secteur unSecteur = null;

        String sql = "SELECT * FROM visiteur " +
                     "LEFT JOIN labo ON visiteur.LAB_CODE = labo.LAB_CODE " +
                     "LEFT JOIN secteur ON secteur.SEC_CODE = visiteur.SEC_CODE " +
                     "WHERE VIS_NOM = '" + nom + "' AND VIS_PRENOM = '" + prenom + "'";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
            String mat = rs.getString("VIS_MATRICULE");
            String sonNom = rs.getString("VIS_NOM");
            String sonPrenom = rs.getString("VIS_PRENOM");
            String adresse = rs.getString("VIS_ADRESSE");
            String cp = rs.getString("VIS_CP");
            String ville = rs.getString("VIS_VILLE");
            Date dateEnbauche = rs.getDate("VIS_DATEEMBAUCHE");

            String labCode = rs.getString("LAB_CODE");
            String nomLabo = rs.getString("LAB_NOM");
            String chef = rs.getString("LAB_CHEFVENTE");

            String secCode = rs.getString("SEC_CODE");
            String secLibelle = rs.getString("SEC_LIBELLE");

            unLab = new Labo(labCode, nomLabo, chef);
            unSecteur = new Secteur(secCode, secLibelle);
            res = new Visiteur(mat, sonNom, sonPrenom, adresse, cp, ville, dateEnbauche, unSecteur, unLab);
        }

        return res;
    }

    public int setVisiteur(String matricule, String nom, String prenom, String adresse, String ville, String cp,
            String labo, String secteur) throws SQLException {

        if (labo.equals("Swiss"))
            labo = "SW";
        else if (labo.equals("Bichat"))
            labo = "BC";
        else
            labo = "GY";

        String sql = "UPDATE visiteur "
                    + "INNER JOIN labo ON visiteur.LAB_CODE = labo.LAB_CODE "
                    + "SET VIS_NOM = '" + nom
                    + "', VIS_PRENOM = '" + prenom + "', VIS_ADRESSE = '" + adresse + "', VIS_VILLE = '" + ville
                    + "', VIS_CP = '" + cp + "', SEC_CODE = '" + secteur.charAt(0) + "', visiteur.LAB_CODE = '" + labo
                    + "' WHERE VIS_MATRICULE = '" + matricule + "'";
        stmt = connexion.createStatement();
        return stmt.executeUpdate(sql);
    }
}