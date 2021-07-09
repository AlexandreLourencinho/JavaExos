package pt.alexobjets.vehicules.model;

public class Motocyclette extends Vehicule
{
    private String nom = "Motocyclette";

    public Motocyclette(double vitesseMax, double prix)
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
        return "Je suis vieux...";
    }
}
