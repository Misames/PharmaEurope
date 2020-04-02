package LesClasses;

/**
 * Offrir
 */
public class Offrir {
    private Medicament leMedoc;
    private RapportVisite leRapport;
    private Visiteur offrirVisiteur;
    private int qte;

    /**
     * 
     * @param rapports
     * @param medicaments
     * @param leVisiteur
     */
    public Offrir(RapportVisite rapport, Medicament medicaments, int qte, Visiteur leVisiteur) {
        leRapport = rapport;
        leMedoc = medicaments;
        offrirVisiteur = leVisiteur;
        this.qte = qte;

    }

    public RapportVisite getleRapport() {
        return leRapport;
    }

    public void setleRapport(RapportVisite leRapport) {
        this.leRapport = leRapport;
    }

    public Medicament getLesMedoc() {
        return leMedoc;
    }

    public void setLesMedoc(Medicament lesMedoc) {
        this.leMedoc = lesMedoc;
    }

    public Visiteur getOffrirVisiteur() {
        return offrirVisiteur;
    }

    public void setOffrirVisiteur(Visiteur offrirVisiteur) {
        this.offrirVisiteur = offrirVisiteur;
    }

    public RapportVisite getLeRapport() {
        return leRapport;
    }

    public void setLeRapport(RapportVisite leRapport) {
        this.leRapport = leRapport;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
}