package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import LesClasses.Labo;
import LesClasses.Praticien;
import LesClasses.RapportVisite;
import LesClasses.Secteur;
import LesClasses.TypePracticien;
import LesClasses.Visiteur;

public class RapportVisiteDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public RapportVisiteDAO() {
        try {
            connexion = Connect.getConnexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<RapportVisite> getLesRapport() throws SQLException {
        ArrayList<RapportVisite> res = new ArrayList<RapportVisite>();
        
        String sql = "SELECT * FROM rapport_visite" +
                     " INNER JOIN visiteur ON visiteur.VIS_MATRICULE = rapport_visite.VIS_MATRICULE" + 
                     " INNER JOIN praticien ON praticien.PRA_NUM = rapport_visite.PRA_NUM " +
                     " INNER JOIN type_praticien ON praticien.TYP_CODE = type_praticien.TYP_CODE " +
                     " LEFT JOIN secteur ON secteur.SEC_CODE = visiteur.SEC_CODE " +
                     " LEFT JOIN labo ON visiteur.LAB_CODE = labo.LAB_CODE ";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);

        while (rs.next()) {
            String numRap = rs.getString("rapport_visite.RAP_NUM");
            Date dateRap = rs.getDate("rapport_visite.RAP_DATE");
            String bilanRap = rs.getString("rapport_visite.RAP_BILAN");
            String motifRap = rs.getString("rapport_visite.RAP_MOTIF");

            String PraNum = rs.getString("praticien.PRA_NUM");
            String PraNom = rs.getString("praticien.PRA_NOM");
            String PraPrenom = rs.getString("praticien.PRA_PRENOM");
            String PraAdresse = rs.getString("praticien.PRA_ADRESSE");
            String PraCp = rs.getString("praticien.PRA_CP");
            String PraVille = rs.getString("praticien.PRA_VILLE");
            float PraCoef = rs.getFloat("praticien.PRA_COEFNOTORIETE");
            String typeCode = rs.getString("type_praticien.TYP_CODE");
            String typeLibellle = rs.getString("type_praticien.TYP_LIBELLE");
            String typeLieu = rs.getString("type_praticien.TYP_LIEU");
            TypePracticien typePracticien = new TypePracticien(typeCode, typeLibellle, typeLieu);

            
            String labCode = rs.getString("labo.LAB_CODE");
            String nomLabo = rs.getString("labo.LAB_NOM");
            String chef = rs.getString("labo.LAB_CHEFVENTE");
            Labo unLab = new Labo(labCode, nomLabo, chef);
            
            String secCode = rs.getString("secteur.SEC_CODE");
            String secLibelle = rs.getString("secteur.SEC_LIBELLE");
            Secteur unSecteur = new Secteur(secCode, secLibelle);
            
            String VisMat = rs.getString("visiteur.VIS_MATRICULE");
            String VisNom = rs.getString("visiteur.VIS_NOM");
            String VisPrenom = rs.getString("visiteur.VIS_PRENOM");
            String VisAdresse = rs.getString("visiteur.VIS_ADRESSE");
            String VisCp = rs.getString("visiteur.VIS_CP");
            String VisVille = rs.getString("visiteur.VIS_VILLE");
            Date VisDateEnbauche = rs.getDate("visiteur.VIS_DATEEMBAUCHE");
            
            
            Visiteur visiteur = new Visiteur(VisMat, VisNom, VisPrenom, VisAdresse, VisCp, VisVille, (java.sql.Date) VisDateEnbauche,
                    unSecteur, unLab);
            Praticien praticien = new Praticien(PraNum, PraNom , PraPrenom, PraAdresse, PraCp, PraVille, PraCoef, typePracticien);
            RapportVisite rapport = new RapportVisite(visiteur, praticien, numRap, bilanRap, motifRap, dateRap);
            res.add(rapport);
        }
        return res;
    }

}