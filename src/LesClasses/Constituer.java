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
}