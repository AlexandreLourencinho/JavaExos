package pt.alexandre.exemples.exempletableaux;

public class ExempleTablo
{
    public static void main(String[] args)
    {
        char[] cNiveaux = {'A', 'B', 'C', 'D', 'F'};
        char[] cTableau = {'Z', 'Y', 'X', 'W', 'V'};
        int i;
        cTableau = cNiveaux ;
        for (i = 0; i < 5; i++)
            System.out.print(cNiveaux[i]);
        System.out.println();
        for (i = 0; i < 5; i++)
            System.out.print(cTableau[i]);
        System.out.println();
        cNiveaux[3]='R';
        System.out.println(cTableau[3]);
    }
}
