package pt.alexandre.exemplefonctions;

public class ExempleFonction3
{
    public static void main(String args[])
    {
        int tab[]={1,2,3,4,5,6,7,8};
        int i;
        System.out.println("avant l'appel de fonction");
        for (i=0;i<8;i++)
        {
            System.out.print(tab[i]);
            System.out.print('\t');
        }
        System.out.println();
        System.out.println(calculeMoyenne(tab,8));
        System.out.println("apres l'appel de fonction");
        for (i=0;i<8;i++)
        {
            System.out.print(tab[i]);
            System.out.print('\t');
        }
        System.out.println();
    }

    public static double calculeMoyenne(int tableau[], int nb)
    {
        int i;
        double dMoyenne=0.0;
        for (i=0;i<nb;i++)
        {
            dMoyenne+=tableau[i];
            tableau[i]++;
        }
        return dMoyenne/i;
    }
}
