package pt.alexandre.entierinferieursan;

import java.util.Scanner;

public class ExoEntierInf
{
    public static void main(String[] args)
    {
        int nombre;
        int u = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nombre : ");
        nombre = sc.nextInt();
        for(int i = 0; i < nombre; i++)
        {
            u++;
            System.out.println(u);
        }
    }
}
