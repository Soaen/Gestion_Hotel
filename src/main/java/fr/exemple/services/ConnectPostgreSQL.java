package fr.exemple.services;

import java.sql.*;

public class ConnectPostgreSQL {


    //étape 2: créer l'objet de connexion
    static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/","postgres","197532486a");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ConnectPostgreSQL() {
    }

    public static void postgreConnection()
    {
        try
        {
            //étape 1: charger la classe de driver
            Class.forName("org.postgresql.Driver");
            //étape 3: créer l'objet statement
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM categories");

            //étape 4: exécuter la requête
            while(res.next())
                System.out.println(res.getInt(1) +
                        "  "+res.getString(2) +
                        "  "+res.getString(3) +
                        "  "+res.getString(4));

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void postgreDisconnect() throws SQLException {
        conn.close();
    }
}
