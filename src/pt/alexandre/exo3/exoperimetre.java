package pt.alexandre.exo3;

import java.util.Scanner;

public class exoperimetre {

    final static double PI = 3.1416;


    public static void main(String[] args)
    {
        double rayon;
        double aire;
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 05/07/2021) ****");
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le rayon :");
        rayon = sc.nextDouble();
        aire = PI * rayon * rayon;
        System.out.println("L'aire vaut :" + aire + " u²");
    }
}
