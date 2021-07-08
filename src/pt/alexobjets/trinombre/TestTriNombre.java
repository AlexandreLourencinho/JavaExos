package pt.alexobjets.trinombre;

import java.util.Scanner;

public class TestTriNombre
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TriNombre tab,tab2;
        int nombre;
        System.out.println("Combien de tableaux voulez vous saisir et trier ?");
        nombre = sc.nextInt();
        for(int i=1; i<=nombre; i++){
            System.out.println("Entrez la taille du tableau souhaité :");
            tab = new TriNombre(sc.nextInt());
            System.out.println("Saisissez les données du tableau :");
            tab.saisiTab();
            tab.triTab();
            System.out.println("tableaux trié : ");
            tab.afficherTablo();
        }
//        System.out.println("Entrez la taille du tableau souhaité :");
//        tab = new TriNombre(sc.nextInt());
//        System.out.println("Saisissez les données du tableau :");
//        tab.saisiTab();
//        tab.triTab();
//        System.out.println("Saisissez la taille du second tableau :");
//        tab2 = new TriNombre(sc.nextInt());
//        System.out.println("Saisissez les données du second tableau :");
//        tab2.saisiTab();
//        tab2.triTab();
//        System.out.println("tableaux trié : ");
//        System.out.println("tableau 1 :");
//        tab.afficherTablo();
//        System.out.println("tableau 2 :");
//        tab2.afficherTablo();
    }
}
