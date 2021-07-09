package pt.alexobjets.vehicules.model;

public abstract class Vehicule
{
    private double vitesseMax;

    private double prix;

    private String nom = "Véhicule";

    public Vehicule()
    {
    }

    public Vehicule(double vitesseMax, double prix)
    {
        this.vitesseMax = vitesseMax;
        this.prix = prix;
    }


    public double getVitesseMax()
    {
        return vitesseMax;
    }


    public double getPrix()
    {
        return prix;
    }

    public String getNom()
    {
        return nom;
    }


    public String marche()
    {
        return "0";
    }

}
