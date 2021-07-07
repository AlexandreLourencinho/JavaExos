package pt.alexandre.exofonction1;

import java.util.Scanner;

import static pt.alexandre.exofonction1.BibliothequeFonctions.*;

public class ExosFonction
{
    public static void main(String[] args)
    {
        System.out.println("\n ****** Exercices sur les fonctions ******");
        Scanner sc = new Scanner(System.in);
        int choix;
        boolean continuer = true;
        do {
            System.out.println("\n ** choisissez la fonction à utiliser **");
            System.out.println("1 : fonction additionneur");
            System.out.println("2 : fonction concaténation.");
            System.out.println("3 : fonction table de multiplication.");
            System.out.println("4 : fonction calcul nombre de mots.");
            System.out.println("5 : fonction fibonassuite. /// /!\\ en construction /!\\");
            System.out.println("6 : fonction compter le nombre d'occurence d'une lettre");
            System.out.println("7 : fonction calculatrice.");
            System.out.println("8 : fonction conversion ascii en unicode.");
            System.out.println("9 : fonction nombre de secondes en heures minutes secondes.");
            System.out.println("10 : fonction dessin d'un triangle du nombre de lignes souhaité");
            System.out.println("11 : fonction de division de deux nombres");
            System.out.println("12 : fonction donnant les entiers allant de 0 au nombre souhaité");
            System.out.println("0 : Terminer le programme.");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    additionneur();
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
                case 7:
                    calculer();
                case 8 :
                    codascii();
                case 9 :
                    convertir();
                case 10:
                    triangle();
                case 11:
                    diviseur();
                case 12:
                    entierinf();
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
