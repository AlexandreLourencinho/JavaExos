package pt.alexobjets.trinombre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TriNombre
{

    private ArrayList tablo;

    private int tailletab;

    public TriNombre(int tailletab)
    {
        this.tailletab = tailletab;
    }

    public void saisiTab()
    {
        Scanner sc = new Scanner(System.in);
        tablo = new ArrayList<Integer>();
        for(int i =0; i <= tailletab-1; i++){
            tablo.add(sc.nextInt());
        }
    }


    public void triTab()
    {
        Collections.sort(tablo);
    }


    public void afficherTablo()
    {
        System.out.println(tablo);
    }
}
