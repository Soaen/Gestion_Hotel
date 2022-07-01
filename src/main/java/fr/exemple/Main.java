package fr.exemple;

import fr.exemple.services.ConnectPostgreSQL;
import fr.exemple.services.ServiceExecutor;
import fr.exemple.services.ServiceMenu;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ConnectPostgreSQL.postgreConnection();

        ServiceExecutor se = new ServiceExecutor();
        ServiceMenu sm = new ServiceMenu();
        se.createCSV();
        sm.startingMenu();
        ConnectPostgreSQL.postgreDisconnect();

    }
}