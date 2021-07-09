package pt.alexobjets.formes;

public class Carre extends Forme
{
    private float cotey;

    private String nom="Carré";

    public Carre(float cotey)
    {
        this.cotey = cotey;
    }
    @Override
    public String getNom()
    {
        return nom;
    }


    @Override
    public float Aire()
    {
        return (float) Math.pow(cotey, 2);
    }
}
