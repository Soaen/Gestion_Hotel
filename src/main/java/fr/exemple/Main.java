package fr.exemple;

import fr.exemple.services.ServiceExecutor;
import fr.exemple.services.ServiceMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://localhost/categories";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","197532486a");
        props.setProperty("ssl","true");
        Connection conn = DriverManager.getConnection(url, props);

        ServiceExecutor se = new ServiceExecutor();
        ServiceMenu sm = new ServiceMenu();
        se.createCSV();
        sm.startingMenu();
    }
}