package pt.alexobjets.formes;

public abstract class Forme
{
    private String nom;


    public Forme(String nom)
    {
        this.nom = nom;
    }

    public float Aire()
    {
        return 0;
    }

    public String getNom()
    {
        return nom;
    }
}
