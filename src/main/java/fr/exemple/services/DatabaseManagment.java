package fr.exemple.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Objects;
import java.util.Properties;

public class DatabaseManagment {
    public static String getDBInfo(String s) {
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            if (prop.getProperty(s) == null) {
                System.out.println("La valeur " + s + " n'existe pas !");
            }
            return prop.getProperty(s);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void searchDatabase(int id, String dataRecover) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getDBInfo("DB_URL")), Objects.requireNonNull(getDBInfo("DB_USER")), Objects.requireNonNull(getDBInfo("DB_PASSWORD")));
            Statement stmt = conn.createStatement();
            String sql = dataRecover + id;
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                int numero = res.getInt("numero");
                int categorie = res.getInt("categorie");
                int nbpersonne = res.getInt("nbpersonne");
                int prix = res.getInt("prix");
                if (prix != 0) {
                    System.out.println("Numéro de Chambre: " + numero);
                    cate(categorie);
                    System.out.println("Nombre de personne: " + nbpersonne);
                    System.out.println("Prix: " + prix);
                    System.out.println(" ");
                }
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cate(int id) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getDBInfo("DB_URL")), Objects.requireNonNull(getDBInfo("DB_USER")), Objects.requireNonNull(getDBInfo("DB_PASSWORD")));
            Statement stmt = conn.createStatement();
            String sql = "SELECT descstring FROM tabdescript WHERE numero = " + id;
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                String descstring = res.getString("descstring");
                System.out.println("Catégories: " + descstring);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showCate() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(Objects.requireNonNull(getDBInfo("DB_URL")), Objects.requireNonNull(getDBInfo("DB_USER")), Objects.requireNonNull(getDBInfo("DB_PASSWORD")));
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM tabdescript";
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                int nb = res.getInt("numero");
                String descstring = res.getString("descstring");
                System.out.println(nb + " : " + descstring);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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