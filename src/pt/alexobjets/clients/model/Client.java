package pt.alexobjets.clients.model;

public class Client
{
    private String nom;

    private String prenom;

    private String adresse;

    private String ville;

    private int taille = 30;

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
        int tail;
        // a faire dans fonctionsclient



        return "Client " + this.nom + this.prenom + " habitant au " + this.adresse + " a " + this.ville;
    }



}
