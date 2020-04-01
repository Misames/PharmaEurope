package LesClasses;

/**
 * Labo
 */
public class Labo {

    private String labCode;
    private String labNom;
    private String labChefVente;

    /**
     * 
     * @param code
     * @param nom
     * @param chef
     */
    public Labo(String code, String nom, String chef) {
        labCode = code;
        labNom = nom;
        labChefVente = chef;
    }

    public String getLabCode() {
        return labCode;
    }

    public void setLabCode(String labCode) {
        this.labCode = labCode;
    }

    public String getLabNom() {
        return labNom;
    }

    public void setLabNom(String labNom) {
        this.labNom = labNom;
    }

    public String getLabChefVente() {
        return labChefVente;
    }

    public void setLabChefVente(String labChefVente) {
        this.labChefVente = labChefVente;
    }

}