package pt.alexandre.exemplefonctions;

import java.util.Scanner;

public class ExempleFonction4
{

    public static void main(String args[])
    {
        long nL;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un nombre entier");
        nL= sc.nextLong();
        System.out.println(fact(nL));
    }

    public static long fact(long n)
    {
        if (n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}
