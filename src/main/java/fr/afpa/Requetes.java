package fr.afpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Requetes {

    public List<Contact> getAllContacts() {

        ArrayList<Contact> SqlAllContacts = new ArrayList<Contact>();

        try {
            // chaîne de connexion à la base de données
            String url = "jdbc:postgresql://localhost:3155/Contacts";
            // création d'un objet de la classe "Connection" en utilisant DriverManager
            Connection con = DriverManager.getConnection(url, "postgres", "B@nLgU4qz*9?D~3n83");
            // création d'un "Statement" (objet qui permet d'exéctuer une requête SQL)
            Statement stm = con.createStatement();
            // récupération de toutes les lignes de résultat (objet de la classe
            // "ResultSet")
            ResultSet result = stm.executeQuery("SELECT * FROM Contacts");
            // on passe en revue toutes les lignes
            while (result.next()) {
                // récupération des valeurs des colonnes
                int id = result.getInt("id");
                String nom = result.getString("nom");
                String prenom = result.getString("prenom");
                String genre = result.getString("genre");
                LocalDate dateDeNaissance = LocalDate.parse(result.getString("date_de_naissance"));
                String pseudo = result.getString("pseudo");
                String adresse = result.getString("adresse");
                String telPerso = result.getString("tel_perso");
                String telPro = result.getString("tel_pro");
                String mail = result.getString("mail");
                String codePostale = result.getString("code_postale");
                String gitLink = result.getString("git_link");
                // affichage du résultat
                System.out.format("[%d] %s %s\n", id, nom, prenom, genre, dateDeNaissance, pseudo, adresse,
                        telPerso, telPro, mail, codePostale, gitLink);

                // Contact contact = new Contact(id, nom, prenom, genre, dateDeNaissance,
                // pseudo, adresse, telPerso, telPro, mail, codePostale, gitLink);
                // SqlallContacts.add(contact);
            }
            // fermeture des ressources
            stm.close();
            result.close();
            con.close();
        } catch (Exception e) {
            System.err.println("Error");
            System.err.println(e.getMessage());
        }
        return SqlAllContacts;
    }

    public List<Contact> insertContact() {

        try {
            String url = "jdbc:postgresql://localhost:3155/Contacts";
            Connection con = DriverManager.getConnection(url, "postgres", "B@nLgU4qz*9?D~3n83");
            PreparedStatement stm = con.prepareStatement(
                    "INSERT INTO contacts (id, nom,prenom ,genre ,date_de_naissance , pseudo, addresse, tel_perso, tel_pro, mail, code_postale, git_link) VALUES(123, 'zbape', 'blorp','homme' , '2012-05-25', 'robou', '1 allée de la bulle' ,'0605589463','0121010101','ddfgfd@yaho.fr','41000','rzjfze.fr' )");
            stm.setString(1, "Ada");
            stm.setString(2, "Lovelace");
            stm.setString(3, "ada@computing.co.uk");
            stm.execute();
            stm.close();
            con.close();
        } catch (

        Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }

        return null;

    }

}