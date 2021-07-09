package pt.alexobjets.formes;

import java.util.ArrayList;
import java.util.Scanner;

public class DesFormes
{
    public static void main(String[] args)
    {
        int i=0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Forme> tabForme = new ArrayList<Forme>();
        tabForme.add(new Carre(4));
        tabForme.add(new Triangle(4,6));
        tabForme.add(new Cercle(8));
        tabForme.add(new Triangle(10,20));
        tabForme.add(new Cercle(2));
        tabForme.add(new Carre(16));
//        System.out.println(tabForme);
        for(Forme form : tabForme){
            i++;
            System.out.printf("aire de la forme %d , un %s : %.2f \n",i,form.getNom(),form.Aire());
        }
    }
}
