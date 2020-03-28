package LesClasses;

import java.util.ArrayList;

/**
 * Constituer
 */
public class Constituer {

    private int cstQte;
    private ArrayList<Medicament> lesMedoc;
    private ArrayList<Composant> lesComposants;

    public Constituer(ArrayList<Medicament> medoc, ArrayList<Composant> composants, int qte) {
        lesMedoc = medoc;
        lesComposants = composants;
        cstQte = qte;
    }

    public int getCstQte() {
        return cstQte;
    }

    public void setCstQte(int cstQte) {
        this.cstQte = cstQte;
    }

    public ArrayList<Medicament> getLesMedoc() {
        return lesMedoc;
    }

    public void setLesMedoc(ArrayList<Medicament> lesMedoc) {
        this.lesMedoc = lesMedoc;
    }

    public ArrayList<Composant> getLesComposants() {
        return lesComposants;
    }

    public void setLesComposants(ArrayList<Composant> lesComposants) {
        this.lesComposants = lesComposants;
    }
}