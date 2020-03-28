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

    public ArrayList<RapportVisite> getLesRapport() {
        return lesRapport;
    }

    public void setLesRapport(ArrayList<RapportVisite> lesRapport) {
        this.lesRapport = lesRapport;
    }

    public ArrayList<Medicament> getLesMedoc() {
        return lesMedoc;
    }

    public void setLesMedoc(ArrayList<Medicament> lesMedoc) {
        this.lesMedoc = lesMedoc;
    }

    public int getOffQte() {
        return offQte;
    }

    public void setOffQte(int offQte) {
        this.offQte = offQte;
    }
}