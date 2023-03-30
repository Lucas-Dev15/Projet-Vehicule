package org.example;

// "implements Vehicule" sert à dire que Velo EST UN Vehicule
public class Velo implements Vehicule{

    // Variables de l'objet Velo
    String maCouleur;
    int nbdeRoues;


    // Constructeur
    public Velo(String couleur, int nbDeRoues){
        this.maCouleur = couleur;
        this.nbdeRoues = nbDeRoues;
    }

    // Retourner les valeurs de Velo à l'interface Vehicule
    @Override
    public String getCouleur() {
        return maCouleur;
    }

    @Override
    public int getNbDeRoues() {
        return nbdeRoues;
    }
}
