package LesClasses;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Offrir
 */
public class Offrir {
    private ArrayList<RapportVisite> lesRapport;
    private HashMap<Medicament, Integer> lesMedoc;
    private String visMatricule;

    public Offrir(ArrayList<RapportVisite> rapports, HashMap<Medicament, Integer> medicaments, String matricule) {
        lesRapport = rapports;
        lesMedoc = medicaments;
        visMatricule = matricule;
    }

    public ArrayList<RapportVisite> getLesRapport() {
        return lesRapport;
    }

    public void setLesRapport(ArrayList<RapportVisite> lesRapport) {
        this.lesRapport = lesRapport;
    }

    public HashMap<Medicament, Integer> getLesMedoc() {
        return lesMedoc;
    }

    public void setLesMedoc(HashMap<Medicament, Integer> lesMedoc) {
        this.lesMedoc = lesMedoc;
    }

    public String getVisMatricule() {
        return visMatricule;
    }

    public void setVisMatricule(String visMatricule) {
        this.visMatricule = visMatricule;
    }
}