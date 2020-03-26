package LesClasses;

import java.sql.Date;

/**
 *
 * @author François Bouscaillou
 */
public class Visiteur {

    private Secteur visSecteur;
    private Labo visLabo;
    private Date visDateEnBauche;

    private String visMatricule;
    private String visNom;
    private String visPrenom;
    private String visAdresse;
    private String visCP;
    private String visVille;

    public Visiteur(String matricule, String nom, String prenom, String adresse, String cp, String ville, Date enbauche,
            Secteur secteur, Labo lab) {
        try {
            visSecteur = secteur;
            visLabo = lab;
            visMatricule = matricule;
            visNom = nom;
            visPrenom = prenom;
            visAdresse = adresse;
            visCP = cp;
            visVille = ville;
            visDateEnBauche = enbauche;
            System.out.println("log : nouveau visiteur");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
