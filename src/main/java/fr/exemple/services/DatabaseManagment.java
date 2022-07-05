package fr.exemple.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;

public class DatabaseManagment {
    public static String getURL(){
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

                Properties prop = new Properties();

                // load a properties file
                prop.load(input);

                // get the property value and print it out
                return prop.getProperty("DB_URL");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        return null;
    }
    public static String getPSWD(){
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            return prop.getProperty("DB_PASSWORD");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public static String getUSRN(){
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            return prop.getProperty("DB_USER");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void dbInfo() {
        try (InputStream input = new FileInputStream("./resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("db.url"));
            System.out.println(prop.getProperty("db.user"));
            System.out.println(prop.getProperty("db.password"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void searchChamberNumber(int id) {
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getURL()), Objects.requireNonNull(getUSRN()),Objects.requireNonNull(getPSWD()));
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM categories WHERE numero = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while (res.next()) {
                //Récupérer par nom de colonne
                int numero = res.getInt("numero");
                int categorie = res.getInt("categorie");
                int nbpersonne = res.getInt("nbpersonne");
                int prix = res.getInt("prix");
                //Afficher les valeurs
                System.out.println("Numéro de Chambre: " + numero);
                cate(categorie);
                System.out.println("Nombre de personne: " + nbpersonne);
                System.out.println("Prix: " + prix);
                System.out.println(" ");
            }
            //étape 6 : fermez l'objet de connexion
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchChamberDesc(int id) {
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getURL()), Objects.requireNonNull(getUSRN()),Objects.requireNonNull(getPSWD()));
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM categories WHERE categorie = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while (res.next()) {
                //Récupérer par nom de colonne
                int numero = res.getInt("numero");
                int categorie = res.getInt("categorie");
                int nbpersonne = res.getInt("nbpersonne");
                int prix = res.getInt("prix");
                //Afficher les valeurs
                System.out.println("Numéro de Chambre: " + numero);
                cate(categorie);
                System.out.println("Nombre de personne: " + nbpersonne);
                System.out.println("Prix: " + prix);
                System.out.println(" ");
            }
            //étape 6 : fermez l'objet de connexion
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchChamberNbPersonne(int id) {
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getURL()), Objects.requireNonNull(getUSRN()),Objects.requireNonNull(getPSWD()));
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM categories WHERE nbpersonne = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while (res.next()) {
                //Récupérer par nom de colonne
                int numero = res.getInt("numero");
                int categorie = res.getInt("categorie");
                int nbpersonne = res.getInt("nbpersonne");
                int prix = res.getInt("prix");
                //Afficher les valeurs
                System.out.println("Numéro de Chambre: " + numero);
                cate(categorie);
                System.out.println("Nombre de personne: " + nbpersonne);
                System.out.println("Prix: " + prix);
                System.out.println(" ");
            }
            //étape 6 : fermez l'objet de connexion
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cate(int id) {

        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getURL()), Objects.requireNonNull(getUSRN()),Objects.requireNonNull(getPSWD()));
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT descstring FROM tabdescript WHERE numero = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while (res.next()) {
                //Récupérer par nom de colonne
                String descstring = res.getString("descstring");
                System.out.println("Catégories: " + descstring);
            }
            //étape 6 : fermez l'objet de connexion
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Sans BDD Catégorie

//        String temp;
//        switch (i) {
//            case 1:
//                temp = "Lavabo";
//                break;
//            case 2:
//                temp = "WC, Télévision";
//                break;
//            case 3:
//                temp = "Cabine Douche, Télévision";
//                break;
//            case 4:
//                temp = "WC, Cabine Douche, Télévision";
//                break;
//            case 5:
//                temp = "WC, Salle de bain + Douche, Télévision";
//                break;
//            case 6:
//                temp = "2 pièces, WC, Salle de bain + Douche, Télévision";
//                break;
//            default:
//                temp = "Erreur";
//                break;
//        }
//        System.out.println("Catégorie : " + temp);
//    }
    }


    public static void showCate(){
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getURL()), Objects.requireNonNull(getUSRN()),Objects.requireNonNull(getPSWD()));
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM tabdescript";
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while (res.next()) {
                //Récupérer par nom de colonne
                int nb = res.getInt("numero");
                String descstring = res.getString("descstring");
                System.out.println(nb + " : " + descstring);
            }
            //étape 6 : fermez l'objet de connexion
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}