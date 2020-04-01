package LesClasses;

/**
 * Composant
 */
public class Composant {

    private String cmpCode;
    private String cmpLibelle;

    /**
     * 
     * @param code
     * @param libelle
     */
    public Composant(String code, String libelle) {
        cmpCode = code;
        cmpLibelle = libelle;
    }

    public String getCmpCode() {
        return cmpCode;
    }

    public void setCmpCode(String cmpCode) {
        this.cmpCode = cmpCode;
    }

    public String getCmpLibelle() {
        return cmpLibelle;
    }

    public void setCmpLibelle(String cmpLibelle) {
        this.cmpLibelle = cmpLibelle;
    }

}