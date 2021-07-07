package pt.alexandre.exemplefonctions;

import java.util.Scanner;

public class ExempleFonction2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double dPar;
        double dCarre;
        System.out.println("Entrez un nombre dont vous voulez calculer le carré :");
        dPar= sc.nextDouble();
        calculeCarre(dPar) ;
        System.out.println("fin exec main");
    }

    public static void calculeCarre(double dd)
    {
        double result ;
        result = dd*dd ;
        System.out.println(result) ;
        System.out.println("fin exec calculecarre");
    }
}
