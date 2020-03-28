package LesClasses;

/**
 * Secteur
 */
public class Secteur {

    private String secCode;
    private String secLibelle;

    public Secteur(String code, String libelle) {
        secCode = code;
        secLibelle = libelle;
    }

    public String getSecCode() {
        return secCode;
    }

    public void setSecCode(String secCode) {
        this.secCode = secCode;
    }

    public String getSecLibelle() {
        return secLibelle;
    }

    public void setSecLibelle(String secLibelle) {
        this.secLibelle = secLibelle;
    }

}