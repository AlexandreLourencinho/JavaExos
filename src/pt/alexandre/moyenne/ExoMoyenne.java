package pt.alexandre.moyenne;

import java.util.Scanner;

public class ExoMoyenne
{

    public static void main(String[] args)
    {
        float noteCoeff3;
        float noteCoeff2;
        float noteCoeff1;
        float moyenne;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la note coefficient 3 :");
        noteCoeff3 = sc.nextFloat();
        System.out.println("Entrez la note coefficient 2 :");
        noteCoeff2 = sc.nextFloat();
        System.out.println("Entrez la note coefficient 1 :");
        noteCoeff1 = sc.nextFloat();
        moyenne = (noteCoeff1*3+noteCoeff2*2+noteCoeff3)/6;
        System.out.println("La moyenne est de : " + moyenne);

    }



}
