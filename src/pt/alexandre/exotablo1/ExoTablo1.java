package pt.alexandre.exotablo1;

import java.util.Arrays;
import java.util.Scanner;

public class ExoTablo1
{
    public static void main(String[] args)
    {
        float[] tabloExo;
        int taille;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille de votre tableau :");
        taille = sc.nextInt();
        tabloExo = new float[taille];
        for(int i = 0; i<= taille-1;i++){
            System.out.println("Entrez la valeur " + (i+1) + " à l'index " + i +" du tableau.");
            tabloExo[i]= sc.nextInt();
        }
        System.out.println("voici votre tableau : "+ Arrays.toString(tabloExo));
    }
}
