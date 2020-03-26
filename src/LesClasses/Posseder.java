package LesClasses;

/**
 * Posseder
 */
public class Posseder {

    private Specialite spePosseder;
    private Praticien lePraticien;
    private String posDiplome;
    private float posCoefPrescription;

    public Posseder(Specialite spe, Praticien pra, String diplome, float coef) {
        spePosseder = spe;
        lePraticien = pra;
        posDiplome = diplome;
        posCoefPrescription = coef;
    }
}