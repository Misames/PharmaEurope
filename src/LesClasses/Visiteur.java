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

    public Visiteur(String matricule, String nom, String prenom, String adresse, String cp, String ville, Date dateEnbauche,
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
            visDateEnBauche = dateEnbauche;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Secteur getVisSecteur() {
        return visSecteur;
    }

    public void setVisSecteur(Secteur visSecteur) {
        this.visSecteur = visSecteur;
    }

    public Labo getVisLabo() {
        return visLabo;
    }

    public void setVisLabo(Labo visLabo) {
        this.visLabo = visLabo;
    }

    public Date getVisDateEnBauche() {
        return visDateEnBauche;
    }

    public void setVisDateEnBauche(Date visDateEnBauche) {
        this.visDateEnBauche = visDateEnBauche;
    }

    public String getVisMatricule() {
        return visMatricule;
    }

    public void setVisMatricule(String visMatricule) {
        this.visMatricule = visMatricule;
    }

    public String getVisNom() {
        return visNom;
    }

    public void setVisNom(String visNom) {
        this.visNom = visNom;
    }

    public String getVisPrenom() {
        return visPrenom;
    }

    public void setVisPrenom(String visPrenom) {
        this.visPrenom = visPrenom;
    }

    public String getVisAdresse() {
        return visAdresse;
    }

    public void setVisAdresse(String visAdresse) {
        this.visAdresse = visAdresse;
    }

    public String getVisCP() {
        return visCP;
    }

    public void setVisCP(String visCP) {
        this.visCP = visCP;
    }

    public String getVisVille() {
        return visVille;
    }

    public void setVisVille(String visVille) {
        this.visVille = visVille;
    }
}
