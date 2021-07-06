package pt.alexandre.paritey;

import java.util.Scanner;

public class ExoParitey
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float nombre;
        System.out.println("Entrez un nombre");
        nombre = scanner.nextFloat();
        if(nombre%2!=0){
            System.out.println("Le nombre est impair");
        }else{
            System.out.println("le nombre est pair");
        }

    }
}
