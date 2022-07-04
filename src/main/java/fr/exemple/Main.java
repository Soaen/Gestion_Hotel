package fr.exemple;

import fr.exemple.services.ConnectPostgreSQL;
import fr.exemple.services.ServiceExecutor;
import fr.exemple.services.ServiceMenu;

import java.sql.SQLException;

public class Main {
//    static ServiceExecutor se = new ServiceExecutor();
    static ServiceMenu sm = new ServiceMenu();
    public static void main(String[] args) {
        sm.startingMenu();
//        ConnectPostgreSQL.postgreConnection();
//        se.createCSV();
//        ConnectPostgreSQL.postgreDisconnect();

    }
}