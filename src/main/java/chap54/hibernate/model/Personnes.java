package chap54.hibernate.model;

import java.util.Date;

/**
 * Created by franck on 22/03/16.
 */
public class Personnes {

    private Integer id;
    private String nom;
    private String prenom;
    private Date dateNaissance;

    public Personnes(Integer id, String nom, String prenom, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date datenaissance) {
        this.dateNaissance = datenaissance;
    }
}
