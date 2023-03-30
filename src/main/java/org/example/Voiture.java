package org.example;

// "implements Vehicule" sert à dire que Voiture EST UN Vehicule
public class Voiture implements Vehicule{

    // Variables de l'objet Voiture
    String maCouleur;
    int nbdeRoues;
    String typeDeMoteur;


    // Constructeur
    public Voiture(String couleur, int nbDeRoues, String typeMoteur){
        this.maCouleur = couleur;
        this.nbdeRoues = nbDeRoues;
        this.typeDeMoteur = typeMoteur;
    }

    // Retourner les valeurs de Voiture à l'interface Vehicule
    @Override
    public String getCouleur() {
        return maCouleur;
    }

    @Override
    public int getNbDeRoues() {
        return nbdeRoues;
    }
}
