package pt.alexandre.exercice1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("***** Programme de politesse élémentaire V1.0.0 05/07/2021 *****");
        String texte = " bonjour, " +
                "quel est ton nom ?";
        System.out.println(texte);
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        System.out.println("Bonjour " + nom);
    }
}
