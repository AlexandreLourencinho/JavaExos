package pt.alexandre.sommeentierinf;

import java.util.Scanner;

public class ExoSommeEntierInf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nombre,i,u=0;
        System.out.println("Entrez votre nombre : ");
        nombre = sc.nextInt();
        for (i=0; i<=nombre; i++){
            u+=i;
        }
        System.out.println("la somme des entiers de 0 a " + nombre+" est égal a : " + u);
    }
}
