package pt.alexandre.exoage;

import java.util.Calendar;
import java.util.Scanner;

public class ExoAge
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int annee;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Entrez votre année de naissance :");
        annee = sc.nextInt();
        if(year-annee>18){
            System.out.println("Vous êtes majeur");
        }else{
            System.out.println("Vous êtes mineur");
        }
    }
}
