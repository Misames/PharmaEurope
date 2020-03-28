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

    public Specialite getSpePosseder() {
        return spePosseder;
    }

    public void setSpePosseder(Specialite spePosseder) {
        this.spePosseder = spePosseder;
    }

    public Praticien getLePraticien() {
        return lePraticien;
    }

    public void setLePraticien(Praticien lePraticien) {
        this.lePraticien = lePraticien;
    }

    public String getPosDiplome() {
        return posDiplome;
    }

    public void setPosDiplome(String posDiplome) {
        this.posDiplome = posDiplome;
    }

    public float getPosCoefPrescription() {
        return posCoefPrescription;
    }

    public void setPosCoefPrescription(float posCoefPrescription) {
        this.posCoefPrescription = posCoefPrescription;
    }
}