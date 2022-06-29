package fr.exemple.beans;

public class Chambre {
    // attributs de la classe
    private final int numero;
    private final int categorie;
    private final int nbPersonnes;

    public Chambre(int numero, int categorie, int nbPersonnes) {
        this.numero = numero;
        this.categorie = categorie;
        this.nbPersonnes = nbPersonnes;
    }

    public int donnerNumero() {
        return numero;
    }

    public int donnerCateg() {
        return categorie;
    }

    public int donnerNbPers() {
        return nbPersonnes;
    }

    public int donnerPrix(int[][] tabPrix) {
        return (tabPrix[nbPersonnes - 1][categorie - 1]);
    }

    public void affichDescript(String[] tabDescript) {
        System.out.println("Description : " + tabDescript[categorie - 1]);
    }
}