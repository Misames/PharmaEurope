package LesClasses;

import java.util.ArrayList;

/**
 * Formuler
 */
public class Formuler {

    private ArrayList<Medicament> lesMedoc;
    private ArrayList<Presentation> lesPresentation;

    public Formuler(ArrayList<Medicament> medoc, ArrayList<Presentation> presentation) {
        lesMedoc = medoc;
        lesPresentation = presentation;
    }

    public ArrayList<Medicament> getLesMedoc() {
        return lesMedoc;
    }

    public void setLesMedoc(ArrayList<Medicament> lesMedoc) {
        this.lesMedoc = lesMedoc;
    }

    public ArrayList<Presentation> getLesPresentation() {
        return lesPresentation;
    }

    public void setLesPresentation(ArrayList<Presentation> lesPresentation) {
        this.lesPresentation = lesPresentation;
    }
}