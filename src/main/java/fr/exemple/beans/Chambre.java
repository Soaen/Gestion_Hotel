package fr.exemple.beans;

import java.util.Scanner;

public class Chambre{
    static Scanner sc = new Scanner(System.in);




    private int nbChamb, categorie, nbPers;

    public int donnerNumero(){
        return nbChamb;
    }

    public int donnerCateg(){
        return categorie;
    }

    public int donnerNbPers(){
        return nbPers;
    }

    public int donnerPrix(int[][] t){
        int j, i = 1;
        System.out.println("Combien de personne êtes-vous ? Max: 4");
        int nbPerso = sc.nextInt();
        while (nbPerso > 4 || nbPerso < 1){
            System.out.println("Vous devez au minimum être 1 et au maximum 4 !");
            System.out.println("Combien de personne êtes-vous ? Max: 4");
            nbPerso = sc.nextInt();
        }

        for (int[] tab1D : t) {
            j = 1;
            for (int val : tab1D) {
                if(i == nbPerso){
                    return val;
                }
                j++;
            }
            i++;
        }
        return 0;
    }
    public String affichDescript(String[] tab){
        for (String val : tab) {
            return val;
        }
        return "Fin";
    }
}
