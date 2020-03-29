package LesClasses;

/**
 * Medicament
 * @author François
 */
public class Medicament {

    private String medDepotLegal;
    private String medNomCommercial;
    private String medComposition;
    private String medEffets;
    private String medContreIndic;
    private float medPrixEchantillon;

    public Medicament(String depot, String nom, String compo, String effet, String contreIndic, float prix) {
        medDepotLegal = depot;
        medNomCommercial = nom;
        medComposition = compo;
        medEffets = effet;
        medContreIndic = contreIndic;
        medPrixEchantillon = prix;
    }

    public String getMedDepotLegal() {
        return medDepotLegal;
    }

    public void setMedDepotLegal(String medDepotLegal) {
        this.medDepotLegal = medDepotLegal;
    }

    public String getMedNomCommercial() {
        return medNomCommercial;
    }

    public void setMedNomCommercial(String medNomCommercial) {
        this.medNomCommercial = medNomCommercial;
    }

    public String getMedComposition() {
        return medComposition;
    }

    public void setMedComposition(String medComposition) {
        this.medComposition = medComposition;
    }

    public String getMedEffets() {
        return medEffets;
    }

    public void setMedEffets(String medEffets) {
        this.medEffets = medEffets;
    }

    public String getMedContreIndic() {
        return medContreIndic;
    }

    public void setMedContreIndic(String medContreIndic) {
        this.medContreIndic = medContreIndic;
    }

    public float getMedPrixEchantillon() {
        return medPrixEchantillon;
    }

    public void setMedPrixEchantillon(float medPrixEchantillon) {
        this.medPrixEchantillon = medPrixEchantillon;
    }

}