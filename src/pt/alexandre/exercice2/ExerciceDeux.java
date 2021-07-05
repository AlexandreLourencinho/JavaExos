package pt.alexandre.exercice2;

import java.util.Scanner;

public class ExerciceDeux {

    public static void main(String[] args)
    {
        System.out.println("***** C'est pas vraiment un exercice mais ça affiche des trucs qu'on tape *****");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un entier");
        n = sc.nextInt();
        System.out.println(n);
        byte nOctet;
        System.out.println("entrez un byte");
        nOctet = sc.nextByte();
        System.out.println(nOctet);
        System.out.println("c’est fini. Tapez <ret>");
        System.out.println("vous avez taper la chaine " + n + " et le byte " + nOctet);
    }

}
