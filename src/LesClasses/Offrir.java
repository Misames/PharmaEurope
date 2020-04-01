package LesClasses;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Offrir
 */
public class Offrir {
    private ArrayList<RapportVisite> lesRapport;
    private HashMap<Medicament, Integer> lesMedoc;
    private Visiteur offrirVisiteur;

    /**
     * 
     * @param rapports
     * @param medicaments
     * @param leVisiteur
     */
    public Offrir(ArrayList<RapportVisite> rapports, HashMap<Medicament, Integer> medicaments, Visiteur leVisiteur) {
        lesRapport = rapports;
        lesMedoc = medicaments;
        offrirVisiteur= leVisiteur;
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

    public Visiteur getOffrirVisiteur() {
        return offrirVisiteur;
    }

    public void setOffrirVisiteur(Visiteur offrirVisiteur) {
        this.offrirVisiteur = offrirVisiteur;
    }
}