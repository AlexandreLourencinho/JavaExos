package pt.alexobjets.formes;

public class Cercle extends Forme
{
    private float rayon;

    public Cercle(float rayon,String nom)
    {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    public float Aire()
    {
        return (float) (Math.PI*Math.pow(rayon,2));
    }
}
