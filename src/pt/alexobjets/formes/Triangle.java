package pt.alexobjets.formes;

public class Triangle extends Forme
{
    private float base;

    private float hauteur;

    private String nom = " Triangle ";

    public Triangle(float base, float hauteur)
    {
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public String getNom()
    {
        return nom;
    }

    @Override
    public float Aire()
    {
        return (float) (0.5*base*hauteur);
    }


}
