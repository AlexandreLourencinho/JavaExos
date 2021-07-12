package pt.alexobjets.clients;

import pt.alexobjets.clients.model.Client;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("veuillez tapez les information du client que vous souhaiter entrer :");
        String nom, prenom, adresse,ville, result="";
        boolean continuer = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Entrez le nom du client :");
            nom = sc.nextLine();
            System.out.println("Entrez le prénom du client :");
            prenom = sc.nextLine();
            System.out.println("Entrez la ville du client :");
            ville = sc.nextLine();
            System.out.println("Entrez l'adresse du client :");
            adresse = sc.nextLine();
            Client cli = new Client(nom, prenom, adresse, ville);
            result = result +"\n"+ cli.toString();
            System.out.println("Voici le tableau des clients que vous avez rentré pour l'instant :");
            System.out.println(result);
            System.out.println("voulez vous continuer? O/N");
            if(sc.nextLine().toLowerCase().charAt(0)!='o'){
                continuer = false;
            }
        }while(continuer);
    }
}