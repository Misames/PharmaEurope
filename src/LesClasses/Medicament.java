package LesClasses;

/**
 * Medicament
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

}