package pt.alexobjets.formes;

public class Cercle extends Forme
{
    private float rayon;

    private String nom = "Cercle";

    public Cercle(float rayon)
    {
        this.rayon = rayon;
    }

    @Override
    public String getNom()
    {
        return nom;
    }

    @Override
    public float Aire()
    {
        return (float) (Math.PI*Math.pow(rayon,2));
    }
}
