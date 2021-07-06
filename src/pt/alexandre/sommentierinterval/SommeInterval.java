package pt.alexandre.sommentierinterval;

import java.util.Scanner;

public class SommeInterval
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nombre1, nombre2, resultat, affich;
        System.out.println("Entrez votre premier nombre :");
        nombre1 = sc.nextInt();
        System.out.println("entrez votre deuxieme nombre : ");
        nombre2 = sc.nextInt();
        if (nombre2 > nombre1) {
            affich = nombre1;
            resultat = nombre1;
            for (int i = nombre1; i < nombre2; i++) {
                nombre1++;
                resultat += nombre1;
            }
            System.out.println("La somme des entiers de " + affich + " jusqu'a " + nombre2 + " est de : " + resultat);
        }else{
            affich = nombre1;
            resultat = nombre1;
            for (int i = nombre1; i > nombre2; i--) {
                nombre1--;
                resultat += nombre1;
            }
            System.out.println("La somme des entiers de " + affich + " jusqu'a " + nombre2 + " est de : " + resultat);
        }
    }

}
