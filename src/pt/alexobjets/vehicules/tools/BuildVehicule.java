package pt.alexobjets.vehicules.tools;

import pt.alexobjets.vehicules.model.Vehicule;

import java.util.ArrayList;
import java.util.Scanner;

public class BuildVehicule
{
    public static void leSout(Vehicule vehic)
    {
        System.out.printf("Vous avez créé l' %s allant à la vitesse maximum de %.2f km/h et coutant %.2f €\n",vehic.getNom(),vehic.getVitesseMax(),vehic.getPrix());
        System.out.println(vehic.marche());
    }

    public static ArrayList<Double> vitEtPrix(String nom)
    {
        Scanner sc = new Scanner(System.in);
        double vitesse;
        double prix;
        ArrayList<Double> stock = new ArrayList<>();
        System.out.printf("Entrez la vitesse maximale de la %s :", nom);
        vitesse = sc.nextDouble();
        System.out.printf("Entrez le prix de la %s :", nom);
        prix = sc.nextDouble();
        stock.add(vitesse);
        stock.add(prix);
        return stock;
    }

}
