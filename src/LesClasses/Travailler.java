package LesClasses;

import java.util.Date;

/**
 * Travailler
 */
public class Travailler {

    private Date dateTrvailler;
    private Region region;
    private Visiteur visiteur;
    private String traRole;

    public Travailler(Region reg, Visiteur vis, String role) {
        dateTrvailler = new Date();
        region = reg;
        visiteur = vis;
        traRole = role;
    }

    public Date getDateTrvailler() {
        return dateTrvailler;
    }

    public void setDateTrvailler(Date dateTrvailler) {
        this.dateTrvailler = dateTrvailler;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public String getTraRole() {
        return traRole;
    }

    public void setTraRole(String traRole) {
        this.traRole = traRole;
    }
}