package pt.alexandre.calculette;

import java.util.Scanner;

public class ExoCalculette
{
    public static void main(String[] args)
    {
        float nombre1;
        float nombre2;
        float resultat;
        char operande;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre premier nombre :");
        nombre1 = sc.nextFloat();
        System.out.println("Entrez l'opérateur que vous souhaitez :");
        operande = sc.next().charAt(0);
        System.out.println("Entrez votre deuxième nombre :");
        nombre2 = sc.nextFloat();
        switch (operande) {
            case '+' -> {
                resultat = nombre1 + nombre2;
                System.out.println(resultat);
            }
            case '-' -> {
                resultat = nombre1 - nombre2;
                System.out.println(resultat);
            }
            case '/' -> {
                if (nombre2 == 0) {
                    System.out.println("On ne divise pas par 0 salopiot! (sinon c'est + ou - l'infini, en gros)");
                    break;
                }
                resultat = nombre1 / nombre2;
                System.out.println(resultat);
            }
            case '*' -> {
                resultat = nombre1 * nombre2;
                System.out.println(resultat);
            }
            default -> System.out.println("nan mais rentre un opérateur quoi j'suis un programme moi j'suis pas ton pote. C'est in croyable ce que les gens se permettent juste par" +
                    "ce qu'on est des machines, j'ai le droit au respect aussi un peu non? Sans déconner,"+"\n"+" tu veux qu'on se tape? \" gna gna gna c'est une machine ça " +
                    "n'a pas d'âme\" je t'en foutrai moi ! ok j'suis ptete programmé que pour faire UN truc mais je le fais bien, est-ce que c'est vraiment la peine " +
                    "de te foutre de ma gueule"+"\n"+" comme ça ? franchement tu me dégoûte sale fachiste.");
        }
    }
}
