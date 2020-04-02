package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import LesClasses.Medicament;
import LesClasses.Offrir;
import LesClasses.RapportVisite;
import LesClasses.Visiteur;

public class OffrirDAO {

    private Connection connexion = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    private MedicamentDAO mediDAO;
    private VisiteurDAO visDAO;
    private RapportVisiteDAO rapportDAO;

    public OffrirDAO() {
        try {
            connexion = Connect.getConnexion();
            mediDAO = new MedicamentDAO();
            visDAO = new VisiteurDAO();
            rapportDAO = new RapportVisiteDAO();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Crée une ArrayList des medicaments offer en fonction d'un rapport
     * 
     * @param rap
     * @throws SQLException
     */
    public ArrayList<Offrir> getMedicOffer(RapportVisite rap) throws SQLException {
        ArrayList<Offrir> lesCadeaux = new ArrayList<Offrir>();
        String sql = "SELECT * FROM offrir WHERE RAP_NUM = '" + rap.getRapNum() + "'";
        stmt = connexion.createStatement();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int qte = rs.getInt("OFF_QTE");
            String visMat = rs.getString("VIS_MATRICULE");
            String rapNum = rs.getString("RAP_NUM");
            String mediDepot = rs.getString("MED_DEPOTLEGAL");

            Visiteur vis = visDAO.getLeVis(visMat);
            RapportVisite rapport = rapportDAO.getLeRapport(rapNum);
            Medicament medic = mediDAO.getLeMedoc(mediDepot);

            Offrir res = new Offrir(rapport, medic, qte, vis);
            lesCadeaux.add(res);
        }
        return lesCadeaux;
    }

}