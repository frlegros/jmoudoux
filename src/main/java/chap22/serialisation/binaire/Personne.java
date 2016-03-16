package chap22.serialisation.binaire;

import java.io.Serializable;

/**
 * Created by frlegros on 16/03/16.
 */
public class Personne implements Serializable {


    private String nom ="";
    private String prenom ="";
    private int taille = 0;

    public Personne(String nom, String prenom, int taille) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
}
