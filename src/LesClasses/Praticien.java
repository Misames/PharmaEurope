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
        return getPraNom();
    }

    /**
     * @return the praNum
     */
    public String getPraNum() {
        return praNum;
    }

    /**
     * @param praNum the praNum to set
     */
    public void setPraNum(String praNum) {
        this.praNum = praNum;
    }

    /**
     * @return the praNom
     */
    public String getPraNom() {
        return praNom;
    }

    /**
     * @param praNom the praNom to set
     */
    public void setPraNom(String praNom) {
        this.praNom = praNom;
    }

    /**
     * @return the praPrenom
     */
    public String getPraPrenom() {
        return praPrenom;
    }

    /**
     * @param praPrenom the praPrenom to set
     */
    public void setPraPrenom(String praPrenom) {
        this.praPrenom = praPrenom;
    }

    /**
     * @return the praAdresse
     */
    public String getPraAdresse() {
        return praAdresse;
    }

    /**
     * @param praAdresse the praAdresse to set
     */
    public void setPraAdresse(String praAdresse) {
        this.praAdresse = praAdresse;
    }

    /**
     * @return the praCP
     */
    public String getPraCP() {
        return praCP;
    }

    /**
     * @param praCP the praCP to set
     */
    public void setPraCP(String praCP) {
        this.praCP = praCP;
    }

    /**
     * @return the praVille
     */
    public String getPraVille() {
        return praVille;
    }

    /**
     * @param praVille the praVille to set
     */
    public void setPraVille(String praVille) {
        this.praVille = praVille;
    }

    /**
     * @return the praCoefnotoriete
     */
    public float getPraCoefnotoriete() {
        return praCoefnotoriete;
    }

    /**
     * @param praCoefnotoriete the praCoefnotoriete to set
     */
    public void setPraCoefnotoriete(float praCoefnotoriete) {
        this.praCoefnotoriete = praCoefnotoriete;
    }

    /**
     * @return the typeCode
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * @param typeCode the typeCode to set
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}
