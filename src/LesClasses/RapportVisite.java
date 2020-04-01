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

    /**
     * 
     * @param vis
     * @param pra
     * @param num
     * @param bilan
     * @param motif
     */
    public RapportVisite(Visiteur vis, Praticien pra, int num, String bilan, String motif) {
        rapDate = new Date();
        visiteur = vis;
        praticien = pra;
        rapNum = num;
        rapBilan = bilan;
        rapMotif = motif;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public Praticien getPraticien() {
        return praticien;
    }

    public void setPraticien(Praticien praticien) {
        this.praticien = praticien;
    }

    public int getRapNum() {
        return rapNum;
    }

    public void setRapNum(int rapNum) {
        this.rapNum = rapNum;
    }

    public Date getRapDate() {
        return rapDate;
    }

    public void setRapDate(Date rapDate) {
        this.rapDate = rapDate;
    }

    public String getRapBilan() {
        return rapBilan;
    }

    public void setRapBilan(String rapBilan) {
        this.rapBilan = rapBilan;
    }

    public String getRapMotif() {
        return rapMotif;
    }

    public void setRapMotif(String rapMotif) {
        this.rapMotif = rapMotif;
    }
}