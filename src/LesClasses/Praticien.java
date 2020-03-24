package LesClasses;

import java.sql.SQLException;

import javax.print.DocFlavor.STRING;

import DAO.Connect;

/**
 * 
 * @author François
 */
public class Praticien {

    private String praNum;
    private String praNom;
    private String praPrenom;
    private String praAdresse;
    private String praCP;
    private String praVille;
    private float praCoefnotoriete;
    private String typeCode;

    public Praticien(String num, String nom, String prenom, String adresse,String  cp,String  ville, float coef, String type) throws ClassNotFoundException, SQLException {
        praNum = num;
        praNom = nom;
        praPrenom = prenom;
        praAdresse = adresse;
        praCP = cp;
        praVille = ville;
        praCoefnotoriete = coef;
        typeCode = type;
        System.out.println("Nouveau praticien !");
    }

    public String getNom() {
        return this.praNom;
    }
}
