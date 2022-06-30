package fr.exemple.services;

public class ServiceManagment {
    ServiceExecutor se = new ServiceExecutor();
    public void firstMenu(int choix) {
        switch (choix){
            case 1 :
                se.searchNumber();
                break;
            case 2:
                se.searchDesc();
                break;
            case 3:
                se.searchNbPers();
                break;
            case 4:
                System.out.println("Pas encore disponible !");
                break;
            case 5:
                System.out.println("Au revoir !");
                break;
            default:
                System.out.println("Le nombre doit être compris entre 1 et 3 !");
        }
    }
}
