package pt.alexobjets.formes;

import java.util.ArrayList;
import java.util.Scanner;

public class DesFormes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Forme> tabForme = new ArrayList<Forme>();
        tabForme.add(new Carre(4,"carré 1"));
        tabForme.add(new Triangle(4,6,"triangle 1"));
        tabForme.add(new Cercle(8,"cercle 1"));
        tabForme.add(new Triangle(10,20,"triangle 2"));
        tabForme.add(new Cercle(2, "cercle 2"));
        tabForme.add(new Carre(16, "carré 2 "));
//        System.out.println(tabForme);
        for(Forme form : tabForme){
            System.out.printf("aire de %s : %.2f \n",form.getNom(),form.Aire());
        }
    }
}
