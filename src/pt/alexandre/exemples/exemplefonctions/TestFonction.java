package pt.alexandre.exemples.exemplefonctions;


import java.util.Scanner;
import static pt.alexandre.exemples.exemplefonctions.ExempleFonction1.calculeCarre;

public class TestFonction
{

    public static void main(String[] args)
    {
        double dPar;
        Scanner sc = new Scanner(System.in);
        double dCarre;
        System.out.println("Entrez le nombre dont vous voulez le carré (²) :");
        dPar=sc.nextDouble();
        ExempleFonction1 FuncUn = new ExempleFonction1();
        double result= calculeCarre(dPar);
        System.out.println(result);
    }




}
