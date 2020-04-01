package LesClasses;

/**
 * TypePracticien
 */
public class TypePracticien {

    private String typeCode;
    private String typLibelle;
    private String typLieu;

    /**
     * 
     * @param code
     * @param libelle
     * @param lieu
     */
    public TypePracticien(String code, String libelle, String lieu) {
        typeCode = code;
        typLibelle = libelle;
        typLieu = lieu;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypLibelle() {
        return typLibelle;
    }

    public void setTypLibelle(String typLibelle) {
        this.typLibelle = typLibelle;
    }

    public String getTypLieu() {
        return typLieu;
    }

    public void setTypLieu(String typLieu) {
        this.typLieu = typLieu;
    }

}