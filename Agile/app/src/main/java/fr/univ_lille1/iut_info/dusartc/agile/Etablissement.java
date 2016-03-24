package fr.univ_lille1.iut_info.dusartc.agile;

/**
 * Created by dusartc on 24/03/16.
 */
public class Etablissement {

    private String ville;
    private String nom;

    public Etablissement(String ville, String nom){
        this.nom = nom;
        this.ville = ville;
    }

    public String getVille() {
        return ville;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "ville: "+ville+", nom: "+nom+"\n";
    }
}