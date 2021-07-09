package pt.alexobjets.vehicules.model;

public class Avion extends Vehicule
{

    private String nom = "Avion";

    public Avion(double vitesse, double prix)
    {
        super(vitesse,prix);
    }

    @Override
    public String getNom()
    {
        return nom;
    }


    @Override
    public String marche()
    {
        return "JE SUIS UN AIIIIIIGLE";
    }


}
