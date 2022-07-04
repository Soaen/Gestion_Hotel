package fr.exemple.services;

import java.sql.*;
public class SelectTableNb {
    public static void searchChamber(int id) {
        try {
            //étape 1 : charger la classe driver
            Class.forName("org.postgresql.Driver");
            //étape 2 : créer l'objet de connexion
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "password");
            //étape 3 : créer l'objet statement
            Statement stmt = conn.createStatement();
            String sql = "SELECT numero, categorie, nbpersonne, prix FROM categories WHERE numero = " + id;
            ResultSet res = stmt.executeQuery(sql);
            //étape 5 : extraire les données
            while(res.next()){
                //Récupérer par nom de colonne
                int numero = res.getInt("numero");
                String categorie = res.getString("categorie");
                int nbpersonne = res.getInt("nbpersonne");
                String prix = res.getString("prix");
                //Afficher les valeurs
                System.out.println("Numéro de Chambre: " + numero);
                System.out.println("Catégorie: " + categorie);
                System.out.println("Nombre de personne: " + nbpersonne);
                System.out.println("Prix: " + prix);
            }

            //étape 6 : fermez l'objet de connexion
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}