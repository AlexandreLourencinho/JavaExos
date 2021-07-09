package pt.alexandre.exemples.exemplefonctions;

import java.util.Scanner;

public class ExempleFonction1
{
    public static void main (String[] args)
    {
        double dPar;
        Scanner sc = new Scanner(System.in);
        double dCarre;
        System.out.println("Entrez un nombre dont vous voulez calculer le carré :");
        dPar= sc.nextDouble();
        dCarre = calculeCarre(dPar) ;
        System.out.println(dCarre) ;
    }

    public static double calculeCarre(double dd)
    {
        double result ;
        result = dd*dd ;
        return result ;
    }
}
