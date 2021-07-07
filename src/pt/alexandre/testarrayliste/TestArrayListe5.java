package pt.alexandre.testarrayliste;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayListe5
{
    public static void main(String[] args) {
        ArrayList<String> maliste = new ArrayList<String>();

        maliste.add("Wayne Kramer");
        maliste.add("The Fleshtones");
        maliste.add("Hoodoo Gurus");
        maliste.add("The Bad Seeds");

        Collections.sort(maliste);  // Tri de la liste

        for (String i : maliste) {
            System.out.println(i);
        }
    }
}
