package pt.alexandre.exosarraylistes;

import java.util.ArrayList;
import java.util.Scanner;

public class ExoArrayListe2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String prenom;
        ArrayList<String> prenomTab = new ArrayList<>();
        prenomTab.add("Alex");
        prenomTab.add("Juliette");
        prenomTab.add("Anais");
        prenomTab.add("Fabien");
        prenomTab.add("Noé");
        prenomTab.add("Hocine");
        prenomTab.add("Sana");
        prenomTab.add("Behzad");
        prenomTab.add("François");
        prenomTab.add("Germain");
        System.out.println("Voici les prénoms rangés dans le tableau : " + prenomTab);
        System.out.println("Entrez le prénom a supprimer du tableau :");
        prenom= sc.next();
        if(prenomTab.contains(prenom)){
            prenomTab.remove(prenomTab.indexOf(prenom));
            System.out.println("Les étudiants restants seront donc : " + prenomTab);
        }else{
            System.out.println("Le prénom n'est pas dans le tableau !");
        }
    }
}
