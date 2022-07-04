package fr.exemple.services;

import java.sql.*;
public class SelectTableNb {
    private static final String password = "password";
    public static void searchChamberNumber(int id) {
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", password);
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM categories WHERE numero = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while(res.next()){
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void searchChamberDesc(int id) {
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", password);
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM categories WHERE categorie = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while(res.next()){
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void searchChamberNbPersonne(int id) {
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", password);
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM categories WHERE nbpersonne = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while(res.next()){
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
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void cate(int i){
        String temp;
        switch (i) {
            case 1:
                temp = "Lavabo";
                break;
            case 2:
                temp = "WC, Télévision";
                break;
            case 3:
                temp = "Cabine Douche, Télévision";
                break;
            case 4:
                temp = "WC, Cabine Douche, Télévision";
                break;
            case 5:
                temp = "WC, Salle de bain + Douche, Télévision";
                break;
            case 6:
                temp = "2 pièces, WC, Salle de bain + Douche, Télévision";
                break;
            default:
                temp = "Erreur";
                break;
        }
        System.out.println("Catégorie : " + temp);
    }
}