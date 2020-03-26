package LesClasses;

import java.util.ArrayList;

/**
 * Offrir
 */
public class Offrir {
    private ArrayList<RapportVisite> lesRapport;
    private ArrayList<Medicament> lesMedoc;
    private int offQte;

    public Offrir(ArrayList<RapportVisite> rapports, ArrayList<Medicament> medicaments, int qte) {
        lesRapport = rapports;
        lesMedoc = medicaments;
        offQte = qte;
    }
}