package fr.exemple.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectPostgreSQL {
    public static void postgreConnection()
    {
        try
        {
            //étape 1: charger la classe de driver
            Class.forName("org.postgresql.Driver");
            //étape 2: créer l'objet de connexion
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/","postgres","197532486a");
            //étape 3: créer l'objet statement
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM categories");
            //étape 4: exécuter la requête
            while(res.next())
                System.out.println(res.getInt(1)+"  "+res.getString(2)
                        +"  "+res.getString(3));
            //étape 5: fermez l'objet de connexion
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
