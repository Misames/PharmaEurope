package LesClasses;

/**
 * Presentation
 */
public class Presentation {

    private String preCode;
    private String preLibelle;

    /**
     * 
     * @param code
     * @param libelle
     */
    public Presentation(String code, String libelle) {
        preCode = code;
        preLibelle = libelle;
    }

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode;
    }

    public String getPreLibelle() {
        return preLibelle;
    }

    public void setPreLibelle(String preLibelle) {
        this.preLibelle = preLibelle;
    }

}