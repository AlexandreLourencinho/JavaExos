package pt.alexobjets.cercles;

public class Cercles
{
    private double rayon;

    private double PI = 3.1416;

    public Cercles(double rayon)
    {
        this.rayon = rayon;
    }


    public double caclSurface()
    {
        return PI*rayon*rayon;
    }


    public double calcPerimetre()
    {
        return 2*PI*rayon;
    }
}
