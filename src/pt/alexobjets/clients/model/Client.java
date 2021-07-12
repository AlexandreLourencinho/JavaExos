package pt.alexobjets.clients.model;

import java.util.ArrayList;

public class Client
{
    private String nom;

    private String prenom;

    private String adresse;

    private String ville;

    public Client()
    {

    }

    public Client(String nom, String prenom, String adresse, String ville)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
    }


    public String toString()
    {
        int diff;
        int taille = 30;
        String result="";
        ArrayList<String> donnee = new ArrayList<>();

        donnee.add(nom);
        donnee.add(prenom);
        donnee.add(adresse);
        donnee.add(ville);
        for(String don : donnee){
            don = "|"+don;
            diff = taille - don.length();
            for(int i = 1; i<=diff; i++){
                    don = don + " ";
            }
            result = result + don;
        }
        result = result + "|\n";
        for(int u = 0; u<= taille*4; u++){
            result = result + "_";
        }
        return result;
    }



}
