package pt.alexobjets.vehicules.model;

import pt.alexobjets.vehicules.model.Vehicule;

public class Velo extends Vehicule
{
    private String nom = "Velo";

    @Override
    public String getNom()
    {
        return nom;
    }


    @Override
    public String marche()
    {
        return "C'est l'étape du Ventoux là ptin !";
    }
}
