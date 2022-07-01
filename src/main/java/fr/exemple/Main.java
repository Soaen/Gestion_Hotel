package fr.exemple;

import fr.exemple.services.ConnectPostgreSQL;
import fr.exemple.services.ServiceExecutor;
import fr.exemple.services.ServiceMenu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {


        ConnectPostgreSQL.postgreConnection();



        ServiceExecutor se = new ServiceExecutor();
        ServiceMenu sm = new ServiceMenu();
        se.createCSV();
        sm.startingMenu();
    }
}