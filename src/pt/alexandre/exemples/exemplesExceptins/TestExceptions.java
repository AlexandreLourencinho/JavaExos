package pt.alexandre.exemples.exemplesExceptins;

import java.util.Scanner;

public class TestExceptions
{
    public static void main(String[] args)
    {
//        int nX = 3;
//        int nY = 0;
//        System.out.print( nX + " / " + nY + " = ");
//        System.out.println(nX/nY); // !
        int nX = 3;
        int nY = 0;
        try
        {
            System.out.print( nX + " / " + nY + " = ");
            System.out.println(nX/nY);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Erreur!");
            System.out.println("Exception ArithmeticException interceptee ");
                    System.out.println(e);
        }
        System.out.println("Ouf,le programme n'est pas plante...");
        testeuh();
    }

    public static void testeuh()
    {
        Scanner sc = new Scanner(System.in);
        boolean bSaisieOK;
        byte nX = 0;
        do
        {
            bSaisieOK = true;
            try
            {
                System.out.println("Saisissez un byte au clavier");
                nX = sc.nextByte();
            }
            catch (KbdException e)
            {
                System.out.println(e.getMessage());
                bSaisieOK = false;
            }
        } while (!bSaisieOK);
        System.out.print("Vous avez saisi le nombre ");
        System.out.println(nX);
        Clavier.lireC();
    }
}
