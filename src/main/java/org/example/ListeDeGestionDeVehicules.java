package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListeDeGestionDeVehicules {
    List<Vehicule> listeDeVehicules = new ArrayList<>();

    // Méthode ajouterVehicule
    public void ajouterVehicule(Vehicule vehicule){
        listeDeVehicules.add(vehicule);
    }


    // Méthode tailleDeVehicule
    public int tailleDeVehicule(){
        return listeDeVehicules.size();
    }

    //Méthode compterVoiture
    public int compterVoitures(){
        int i = 0;
        int conteurDeVoitures = 0;
        while (i < listeDeVehicules.size()){
            Vehicule currentVehicule = listeDeVehicules.get(i);
            if (currentVehicule instanceof Voiture) {
                conteurDeVoitures++;
            }

            i++;
        }

        return conteurDeVoitures;
    }

    //Méthode compterVelo
    public int compterVelos(){
        int i = 0;
        int conteurDeVelos = 0;
        while (i < listeDeVehicules.size()){
            Vehicule currentVehicule = listeDeVehicules.get(i);
            if (currentVehicule instanceof Velo) {
                conteurDeVelos++;
            }

            i++;
        }

        return conteurDeVelos;
    }

    //Méthode compterCamion
    public int compterCamions(){
        int i = 0;
        int conteurDeCamions = 0;
        while (i < listeDeVehicules.size()){
            Vehicule currentVehicule = listeDeVehicules.get(i);
            if (currentVehicule instanceof Camion) {
                conteurDeCamions++;
            }

            i++;
        }

        return conteurDeCamions;
    }



}
