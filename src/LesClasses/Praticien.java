package LesClasses;

/**
 * 
 * @author François
 */
public class Praticien {

    private String praNum;
    private String praNom;
    private String praPrenom;
    private String praAdresse;
    private String praCP;
    private String praVille;
    private float praCoefnotoriete;
    private String typeCode;

    public Praticien(String num, String nom, String prenom, String adresse, String cp, String ville, float coef,
            String type) {

        try {
            praNum = num;
            praNom = nom;
            praPrenom = prenom;
            praAdresse = adresse;
            praCP = cp;
            praVille = ville;
            praCoefnotoriete = coef;
            typeCode = type;
            System.out.println("Nouveau praticien !");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public String getNom() {
        return praNom;
    }
}
