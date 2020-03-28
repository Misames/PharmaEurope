package LesClasses;

/**
 * Region
 */
public class Region {

    private Secteur regSecteur;
    private String regCode;
    private String regNom;

    public Region(Secteur secteur, String code, String nom) {
        regSecteur = secteur;
        regCode = code;
        regCode = nom;
    }

    public Secteur getRegSecteur() {
        return regSecteur;
    }

    public void setRegSecteur(Secteur regSecteur) {
        this.regSecteur = regSecteur;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getRegNom() {
        return regNom;
    }

    public void setRegNom(String regNom) {
        this.regNom = regNom;
    }
}