package pt.alexandre.diviseur;

import java.util.Scanner;

public class ExoDiviseur
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float chiffreUn;
        float chiffreDeux;
        float resultat;
        System.out.println("Entrez votre premier chiffre : ");
        chiffreUn = sc.nextFloat();
        System.out.println("Entrez votre deuxième chiffre : ");
        chiffreDeux = sc.nextFloat();
        resultat = chiffreUn/chiffreDeux;
        System.out.println(chiffreUn + " + " + chiffreDeux + " = " + resultat);
    }
}
