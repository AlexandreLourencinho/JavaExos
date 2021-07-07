package pt.alexandre.testarrayliste;

import java.util.ArrayList;

public class TestArrayListe3
{
    public static void main(String[] args) {
        ArrayList<String> maliste = new ArrayList<String>();

        maliste.add("The Fleshtones");
        maliste.add("Hoodoo Gurus");
        maliste.add("The Bad Seeds");
        maliste.add("Wayne Kramer");

        maliste.forEach( (i)-> {System.out.println(i);}); //Syntaxe fonction
    }
}
