package LesClasses;

import java.util.Date;

/**
 * RapportVisite
 */
public class RapportVisite {

    private Visiteur visiteur;
    private Praticien praticien;
    private int rapNum;
    private Date rapDate;
    private String rapBilan;
    private String rapMotif;

    public RapportVisite(Visiteur vis, Praticien pra, int num, String bilan, String motif) {
        rapDate = new Date();
        visiteur = vis;
        praticien = pra;
        rapNum = num;
        rapBilan = bilan;
        rapMotif = motif;
    }
}