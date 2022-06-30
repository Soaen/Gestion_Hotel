package fr.exemple;

import fr.exemple.services.ServiceExecutor;
import fr.exemple.services.ServiceMenu;

public class Main {
    public static void main(String[] args) {
        ServiceExecutor se = new ServiceExecutor();
        ServiceMenu sm = new ServiceMenu();
        se.createCSV();
        sm.startingMenu();
    }
}