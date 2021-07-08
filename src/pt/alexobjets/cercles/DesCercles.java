package pt.alexobjets.cercles;

import java.util.Scanner;

public class DesCercles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;
        char rep;

        do {

            System.out.println("Entrez le rayon du cercle dont vous souhaiter connaitre le périmètre et la surface(en cm) : ");
            Cercles cercles = new Cercles(sc.nextDouble());
            System.out.println("************************************************************");
            System.out.printf("Périmetre du cercle : %.2f cm \nSurface du cercle : %.2f cm²", cercles.calcPerimetre(), cercles.caclSurface());
            System.out.println("************************************************************");
            System.out.println("\nvoulez vous calculer un autre couple surface / périmètre?");

            System.out.println("Y/N");
            rep = sc.next().toUpperCase().charAt(0);
            if(rep == 'N')
            {
                continuer = false;
            }
        }
        while(continuer);




    }
}
