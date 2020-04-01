package LesClasses;

/**
 * Famille
 */
public class Famille {

    private String famCode;
    private String famLibelle;

    /**
     * 
     * @param code
     * @param libelle
     */
    public Famille(String code, String libelle) {
        famCode = code;
        famLibelle = libelle;
    }

    public String getFamCode() {
        return famCode;
    }

    public void setFamCode(String famCode) {
        this.famCode = famCode;
    }

    public String getFamLibelle() {
        return famLibelle;
    }

    public void setFamLibelle(String famLibelle) {
        this.famLibelle = famLibelle;
    }

}