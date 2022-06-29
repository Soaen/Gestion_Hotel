package fr.exemple;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] tabPrix ={
                {100,120,130,150,0,0},
                {130,160,170,190,0,0},
                {170,200,210,230,270,350},
                {200,230,240,260,300,400}
        };
        String[] tabDescript={
                "Lavabo","WC, Télévision", "Cabine Douche, Télévision", "WC, Cabine Douche, Télévision", "WC, Salle de bain + Douche, Télévision", "2 pièces, Salle de bain + douche, WC, Télévision"

        };
        int j, i = 0;
        System.out.println("Combien de personne êtes-vous ? Max: 4");
        int nbPerso = sc.nextInt();
        while (nbPerso > 4 || nbPerso < 1){
            System.out.println("Vous devez au minimum être 1 et au maximum 4 !");
            System.out.println("Combien de personne êtes-vous ? Max: 4");
            nbPerso = sc.nextInt();
        }

        for (int k = 0; k < tabDescript.length; k++) {
            System.out.println(k+1 + ": " + tabDescript[k]);
        }

        System.out.println("Quel type d'option voulez vous ? (Entrez le numéro)");
        int nbDesc = sc.nextInt();
        while (nbDesc > 6 || nbDesc < 1){
            System.out.println("Vous avez le choix uniquement entre les 6 options possible !");
            System.out.println("Quel type d'option voulez vous ? (Entrez le numéro)");
            nbDesc = sc.nextInt();
        }

        for (int[] tab1D : tabPrix) {
            j = 0;
            for (int val : tab1D) {
                i++;
                j++;
                if(i == nbPerso && j ==nbDesc){
                    if(val != 0){
                        System.out.println("Une chambre est disponible !");
                        System.out.println("Cette chambre coute " + val + "€ !");
                    }else{
                        System.out.println("Aucune chambre n'est disponible avec ces caractéristiques !");
                    }
                }
                i--;
            }
            i++;
        }
    }
}
