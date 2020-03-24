package LesClasses;

import java.sql.Date;

/**
 *
 * @author François Bouscaillou
 */
public class Visiteur {

    private String visMatricule;
    private String visNom;
    private String visPrenom;
    private String visAdresse;
    private String visCP;
    private String visVille;
    private Date visDateEnBauche;
    private String secCODE;
    private String labCode;

    public Visiteur(String matricule, String nom, String prenom, String adresse, String cp, String ville, Date enbauche,
            String codeSec, String codeLab) {

        try {
            visMatricule = matricule;
            visNom = nom;
            visPrenom = prenom;
            visAdresse = adresse;
            visCP = cp;
            visVille = ville;
            visDateEnBauche = enbauche;
            secCODE = codeSec;
            labCode = codeLab;
            System.out.println("log : nouveau visiteur");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
