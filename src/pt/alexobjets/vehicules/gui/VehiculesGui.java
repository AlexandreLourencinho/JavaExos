package pt.alexobjets.vehicules.gui;

import java.util.Scanner;

import static pt.alexobjets.vehicules.tools.FonctionVehicule.*;

public class VehiculesGui
{
    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        int choix;
        boolean continuer = true;
        char cont;

        do {
            System.out.println("Nous allons créer des instances de véhicules");
            System.out.println("Selectionnez le Véhicule à créer :");
            System.out.println(" créer : ");
            System.out.println(" 1) avion ");
            System.out.println(" 2) Motocyclette");
            System.out.println(" 3) Camion");
            System.out.println(" 4) Bateau");
            System.out.println(" 0) Quitter ");
            choix = sc.nextInt();
            choixe(choix);
            System.out.println("Voulez vous créer un autre véhicule ? O/N");
            sc.nextLine();
            cont = sc.nextLine().toLowerCase().charAt(0);
            if(cont != 'o'){
                continuer = false;
            }
        }while(continuer);
        System.out.println("merci d'avoir utiliser ce programme de LouAl industries ! ");
        System.out.println(" à la prochaine !");
    }
}
