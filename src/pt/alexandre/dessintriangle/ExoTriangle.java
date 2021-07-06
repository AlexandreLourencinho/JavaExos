package pt.alexandre.dessintriangle;

import java.util.Scanner;

public class ExoTriangle
{
    public static void main(String[] args)
    {

        int nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le nombre de lignes de votre triangle : ");
        nombre = sc.nextInt();
        for(int i=1; i<=nombre; i++){
            for(int a=1; a<=nombre-i;a++){
                System.out.print(" ");
            }
            for(int b=1;b<= 2*i-1; b++){
                System.out.print("✡");
            }
            System.out.println();
        }
    }
}
