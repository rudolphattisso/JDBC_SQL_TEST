package fr.afpa;

import java.time.LocalDate;

public class Contact {

    private int id;   
    private String nom;
    private String prenom;
    private String genre;
    private LocalDate dateDeNaissance;
    private String pseudo;
    private String adresse;
    private String telPerso;
    private String telPro;
    private String mail;
    private String codePostale;
    private String lienGit;

    // constructeur
    public Contact(int id, String nom, String prenom, String genre, LocalDate dateDeNaissance,
            String pseudo, String adresse, String telPerso, String telPro, String mail, String codePostale,
            String lienGit) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.dateDeNaissance = dateDeNaissance;
        this.pseudo = pseudo;
        this.adresse = adresse;
        this.telPerso = telPerso;
        this.telPro = telPro;
        this.mail = mail;
        this.codePostale = codePostale;
        this.lienGit = lienGit;
    }

    //toString

    @Override
    public String toString() {
        return "Contact\n [id=" + id + ", \nnom=" + nom + ", \nprenom=" + prenom + ", \ngenre=" + genre + ", \ndateDeNaissance="
                + dateDeNaissance + ", \npseudo=" + pseudo + ", \nadresse=" + adresse + ", \ntelPerso=" + telPerso
                + ", \ntelPro=" + telPro + ", \nmail=" + mail + ", \ncodePostale=" + codePostale + ", \nlienGit=" + lienGit
                + "\n]";
    }

    //getters

    public int getId() {
        return id;
    }


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGenre() {
        return genre;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelPerso() {
        return telPerso;
    }

    public String getTelPro() {
        return telPro;
    }

    public String getMail() {
        return mail;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public String getLienGit() {
        return lienGit;
    }



    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelPerso(String telPerso) {
        this.telPerso = telPerso;
    }

    public void setTelPro(String telPro) {
        this.telPro = telPro;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public void setLienGit(String lienGit) {
        this.lienGit = lienGit;
    } 



}
