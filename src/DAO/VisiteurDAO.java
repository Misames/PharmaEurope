package DAO;

import java.sql.*;

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

    public Visiteur getFirstVis() throws SQLException {
        Visiteur res = null;
        Labo unLab = null;
        Secteur unSecteur = null;

        String sql = "SELECT * FROM visiteur LEFT JOIN labo ON visiteur.LAB_CODE = labo.LAB_CODE LEFT JOIN secteur ON secteur.SEC_CODE = visiteur.SEC_CODE";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);

        if (rs.next()) {
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
            res = new Visiteur(mat, nom, prenom, adresse, cp, ville, dateEnbauche, unSecteur, unLab);
        }
        return res;
    }

}