package fr.exemple;

import fr.exemple.beans.Chambre;
import fr.exemple.beans.Hotel;

public class Main {
    static Hotel ho = new Hotel();
    static int[][] tabPrix ={
            {100,120,130,150,0,0},
            {130,160,170,190,0,0},
            {170,200,210,230,270,350},
            {200,230,240,260,300,400}
    };
    static String[] tabDescript={
            "Lavabo",
            "WC, Télévision",
            "Cabine Douche, Télévision",
            "WC, Cabine Douche, Télévision",
            "WC, Salle de bain + Douche, Télévision",
            "2 pièces, Salle de bain + douche, WC, Télévision"
    };
    public static void main(String[] args) {

        ho.affichCh(1, tabPrix, tabDescript);

    }
}
