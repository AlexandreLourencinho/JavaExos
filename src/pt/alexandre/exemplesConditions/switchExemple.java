package pt.alexandre.exemplesConditions;

import java.util.Scanner;

public class switchExemple
{
    public static void main(String[] args)
    {
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez votre CHIFFRE :");
        c = sc.next().charAt(0);
        switch (c) {
            case '1', '3', '5', '7', '9' -> System.out.println("c est un chiffre impair");
            case '0', '2', '4', '6', '8' -> System.out.println("c est un chiffre pair");
            case ' ' -> System.out.println("c est un espace");
            default -> System.out.println("ce n'est ni un chiffre ni un espace");
        }
    }
}
