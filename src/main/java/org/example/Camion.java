package org.example;

// "implements Vehicule" sert à dire que Camion EST UN Vehicule
public class Camion implements Vehicule{

    // Variables de l'objet Camion
    String maCouleur;
    int nbdeRoues;
    String typeDeMoteur;


    // Constructeur
    public Camion(String couleur, int nbDeRoues, String typeMoteur){
        this.maCouleur = couleur;
        this.nbdeRoues = nbDeRoues;
        this.typeDeMoteur = typeMoteur;
    }

    // Retourner les valeurs de Camion à l'interface Vehicule
    @Override
    public String getCouleur() {
        return maCouleur;
    }

    @Override
    public int getNbDeRoues() {
        return nbdeRoues;
    }
}
