package LesClasses;

import java.util.Date;

import javax.swing.plaf.synth.Region;

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
}