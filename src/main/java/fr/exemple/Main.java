package fr.exemple;

import fr.exemple.beans.Chambre;
import fr.exemple.beans.Hotel;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Hotel ho = new Hotel();
    public static void main(String[] args) {
        int[][] tp = new int[4][6] ;
        tp[0][0] = 100; tp[0][1]=120 ; tp[0][2] = 130; tp[0][3]=150; tp[0][4] = 0;  tp[0][5]=0;
        tp[1][0] = 130; tp[1][1]=160 ; tp[1][2] = 170; tp[1][3]=190; tp[1][4] = 0;  tp[1][5]=0;
        tp[2][0] = 170; tp[2][1]=200 ; tp[2][2] = 210; tp[2][3]=230; tp[2][4] = 270;  tp[2][5]=350;
        tp[3][0] = 200; tp[3][1]=230 ; tp[3][2] = 240; tp[3][3]=260; tp[3][4] = 300;  tp[3][5]=400;

        String[] td = {"Lavabo","WC, television","Cabine douche, television","WC, cabine douche, Television","WC, Salle de bain + douche, Television","2 pièces, WC, Salle de bain + douche, Television" } ;



//
//      Recherche de chambre par numéro
//
//        System.out.println("Quel est le numéro de la chambre que vous cherchez ?");
//        int tempNbChambr = sc.nextInt();
//
//        ho.searchCh(tempNbChambr, tp);


//
//      Recherche de chambre par Description
//
        for (int i = 0; i < td.length; i++) {
            System.out.println( i+1 + " : "+ td[i]);
        }
        System.out.println("Quel sont les options que vous souhaitez ?");
        int tempDesc = sc.nextInt();
        ho.searchDesc(tempDesc, tp);



//        Chambre c = new Chambre(1,1,4);
//        System.out.println("Categorie : "+c.donnerCateg());
//        System.out.println("Capacité : "+c.donnerNbPers());
//        System.out.println("Prix : "+c.donnerPrix(tp));
//        c.affichDescript(td);
//        System.out.println(" ");



//      Recherche de Chambre par nombre de personnes


//        Hotel h = new Hotel();
//
//        System.out.println("Vous cherchez une chambre de combien de personne ? Max: 4");
//        int tempNbPers = sc.nextInt();
//        while(tempNbPers < 0 ||tempNbPers > 4){
//            System.out.println("Il n'y a que des chambres comprises entre 1 et 4 personnes !");
//            System.out.println("Vous cherchez une chambre de combien de personne ? Max: 4");
//            tempNbPers = sc.nextInt();
//        }
//
//
//        h.affichCh(tempNbPers,tp,td);
    }
}