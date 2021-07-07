package pt.alexandre.exofonction1;

import java.util.Scanner;

import static pt.alexandre.exofonction1.BibliothequeFonctions.*;

public class ExosFonction
{
    public static void main(String[] args)
    {
        System.out.println("****** Exercices sur les fonctions ******");
        Scanner sc = new Scanner(System.in);
        int choix;
        boolean continuer = true;
        do {
            System.out.println("\n ** choisissez la fonction à utiliser **");
            System.out.println("1 : fonction calculatrice.");
            System.out.println("2 : fonction concaténation.");
            System.out.println("3 : fonction table de multiplication.");
            System.out.println("4 : fonction calcul nombre de mots.");
            System.out.println("5 : fonction fibonassuite. /// /!\\ en construction /!\\");
            System.out.println("6 : fonction compter le nombre d'occurence d'une lettre");
            System.out.println("0 : Terminer le programme.");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    calculer();
                case 2:
                    String result = concat();
                    System.out.println(result);
                    break;
                case 3:
                    tableMult();
                    break;
                case 4:
                    nombreMots();
                    break;
//                case 5 :
//                    System.out.println("*** Fonction calculant les deux premiers termes de la suite de Fibonacci  ***");
//                    System.out.println("*** à partir de l'indice que vous aurez définit !***");
//                    Scanner sc2 = new Scanner(System.in);
//                    int nombre;
//                    System.out.println("Entrez l'indice à partir duquel vous désirez avoir le début de la suite :");
//                    nombre = sc.nextInt();
//                    int resultat =fibonCtion(nombre);
//                    System.out.println("resultat =" + resultat);
//                    break;
                case 6:
                    compterLettre();
                    break;
                case 0:
                    continuer = false;
                    System.out.println("*** Merci d'avoir utilisé LouAl industries pour vos exercices sur les fonctions.***");
                    System.out.println("*** Nous espérons vous revoir très vite !***");
                    System.out.println("*** ***");
                    break;
                default:
                    System.out.println("aucune fonction n'a été choisie.");
            }
        } while (continuer);
    }


}
