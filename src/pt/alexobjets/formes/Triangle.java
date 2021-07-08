package pt.alexobjets.formes;

public class Triangle extends Forme
{
    private float base;

    private float hauteur;


    public Triangle(float base, float hauteur, String nom)
    {
        super(nom);
        this.base = base;
        this.hauteur = hauteur;
    }

    @Override
    public float Aire()
    {
        return (float) (0.5*base*hauteur);
    }


}
