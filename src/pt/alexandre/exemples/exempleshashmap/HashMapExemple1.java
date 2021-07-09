package pt.alexandre.exemples.exempleshashmap;

import java.util.HashMap;

public class HashMapExemple1
{
    public static void main(String[] args)
    {
        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("France", "Paris");
        capitales.put("Angleterre", "Londres");
        capitales.put("Allemagne", "Berlin");

        capitales.put("USA", "Washington DC");

        System.out.println(capitales);
        // Afficher les clés
        for (String i : capitales.keySet()) {
            System.out.println(i);
        }
        // Afficher les valeurs
        for (String i : capitales.values()) {
            System.out.println(i);
        }
        // Afficher les deux
        for (String i : capitales.keySet()) {
            System.out.println("clef: " + i + " valeur: " + capitales.get(i));
        }
        // Créons un HashMap appelé people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("clef : " + i + " valeur: " + people.get(i));
        }
    }
}
