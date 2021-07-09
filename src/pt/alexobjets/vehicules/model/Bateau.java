package pt.alexobjets.vehicules.model;

public class Bateau extends Vehicule
{
    private String nom = "Bâteau";


    public Bateau(double vitesseMax, double prix)
    {
        super(vitesseMax, prix);
    }

    @Override
    public String getNom()
    {
        return nom;
    }

    @Override
    public String marche()
    {
        return "bloup bloup bloup bloup bloup";
    }
}
