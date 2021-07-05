package pt.alexandre.conversion;

import java.util.Scanner;

public class ExoConversion {
    public static void main(String[] args) {
        int secondes;
        int sec,heur,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de secondes(un entier) à convertir : ");
        secondes = sc.nextInt();
        heur = secondes/3600;
        min = (secondes/60);
        while(min>=60){
            heur+=1;
            min-=60;
        }
        sec = secondes % 60;
        System.out.println(heur + " heures " + min + " minutes " + sec + " secondes ");
//        System.out.println(secondes/60);
    }
}
