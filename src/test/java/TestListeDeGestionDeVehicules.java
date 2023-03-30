import org.example.ListeDeGestionDeVehicules;
import org.example.Camion;
import org.example.Velo;
import org.example.Voiture;

import org.junit.Assert;
import org.junit.Test;

public class TestListeDeGestionDeVehicules {

    @Test
    public void AjouterVehicules_TailleListe_TailleEgalTrois(){

        // Préparation
        int resultatAttendu = 3;
        ListeDeGestionDeVehicules listeDeTroisVehicules = new ListeDeGestionDeVehicules();

        Velo velo1 = new Velo("Rouge", 2);
        listeDeTroisVehicules.ajouterVehicule(velo1);

        Voiture voiture1 = new Voiture("Vert", 4, "Thermique");
        listeDeTroisVehicules.ajouterVehicule(voiture1);

        Camion camion1 = new Camion("Blanc", 4, "Thermique");
        listeDeTroisVehicules.ajouterVehicule(camion1);

        // Exécution
        int resultatObtenu = listeDeTroisVehicules.tailleDeVehicule();

        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);

    }


    @Test
    public void compterVoiture_ConteurVoituresEgalUn(){

        // Préparation
        int resultatAttendu = 1;
        ListeDeGestionDeVehicules listeDeDeuxVehicules = new ListeDeGestionDeVehicules();

        Velo velo1 = new Velo("Rouge", 2);
        listeDeDeuxVehicules.ajouterVehicule(velo1);

        Voiture voiture1 = new Voiture("Vert", 4, "Thermique");
        listeDeDeuxVehicules.ajouterVehicule(voiture1);


        // Exécution
        int resultatObtenu = listeDeDeuxVehicules.compterVoitures();


        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }

    @Test
    public void compterVelo_ConteurVoituresEgalUn(){

        // Préparation
        int resultatAttendu = 1;
        ListeDeGestionDeVehicules listeDeDeuxVehicules = new ListeDeGestionDeVehicules();

        Velo velo1 = new Velo("Rouge", 2);
        listeDeDeuxVehicules.ajouterVehicule(velo1);

        Voiture voiture1 = new Voiture("Vert", 4, "Thermique");
        listeDeDeuxVehicules.ajouterVehicule(voiture1);


        // Exécution
        int resultatObtenu = listeDeDeuxVehicules.compterVelos();


        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }

    @Test
    public void compterCamion_ConteurVoituresEgalZero(){

        // Préparation
        int resultatAttendu = 0;
        ListeDeGestionDeVehicules listeDeDeuxVehicules = new ListeDeGestionDeVehicules();

        Velo velo1 = new Velo("Rouge", 2);
        listeDeDeuxVehicules.ajouterVehicule(velo1);

        Voiture voiture1 = new Voiture("Vert", 4, "Thermique");
        listeDeDeuxVehicules.ajouterVehicule(voiture1);


        // Exécution
        int resultatObtenu = listeDeDeuxVehicules.compterCamions();


        // Vérification
        Assert.assertEquals(resultatAttendu, resultatObtenu);
    }
}
