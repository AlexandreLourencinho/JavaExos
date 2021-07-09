package pt.alexobjets.vehicules.model;

public class Camion extends Vehicule
{
    private String nom = "Camion";

    public Camion(double vitesseMax, double prix)
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
        return "POUET POUET";
    }
}
