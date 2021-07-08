package pt.alexobjets.formes;

public class Carre extends Forme
{
    private float cotey;


    public Carre(float cotey,String nom)
    {
        super(nom);
        this.cotey = cotey;
    }


    @Override
    public float Aire()
    {
        return (float) Math.pow(cotey, 2);
    }
}
