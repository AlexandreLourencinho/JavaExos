package pt.alexandre.exosarraylistes;

import java.util.ArrayList;
import java.util.Scanner;

public class ExoArrayListe1
{
    public static void main(String[] args)
    {
        int taille;
        int valeur;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();
        System.out.println("Entrez la taille que vous voulez pour le tableau (en int) :");
        taille=sc.nextInt();
        for(int i=0; i<=taille-1;i++){
            System.out.println("Entrez la valeur " + (i+1) + " à l'index " + i + " du tableau");
            valeur = sc.nextInt();
            liste.add(valeur);
        }
        System.out.println(liste);
    }
}
