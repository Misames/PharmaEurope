package LesClasses;

/**
 * Specialite
 */
public class Specialite {

    private String speCode;
    private String speLibelle;

    /**
     * 
     * @param code
     * @param libelle
     */
    public Specialite(String code, String libelle) {
        speCode = code;
        speLibelle = libelle;
    }

    public String getSpeCode() {
        return speCode;
    }

    public void setSpeCode(String speCode) {
        this.speCode = speCode;
    }

    public String getSpeLibelle() {
        return speLibelle;
    }

    public void setSpeLibelle(String speLibelle) {
        this.speLibelle = speLibelle;
    }

}