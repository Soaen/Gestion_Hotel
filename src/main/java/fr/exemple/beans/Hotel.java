package fr.exemple.beans;

import java.util.Scanner;

public class Hotel {
    private Chambre tabCh[];
    Scanner sc = new Scanner(System.in);
    Chambre ch = new Chambre();


    public void affichCh(int nbPers, int[][] tab, String[] tabDescript){

        int i = 1;
        int v = 0;

        for (int[] tab1D : tab) {
            for (int val : tab1D) {
                if(i == nbPers){
                    if(val != 0){
                        System.out.println("N°" + ch.donnerNumero() + " Catégorie: " + ch.donnerCateg() + " Description : " + ch.affichDescript(tabDescript) + " Prix: " + val + "€ !");
                        v++;
                    }
                }
            }
            i++;
        }
        if(v == 0){
            System.out.println("Aucune chambre n'a été trouvé !");
        }
        System.out.println("Nombre de chambre trouvé(s) : " + v);
    }
}
