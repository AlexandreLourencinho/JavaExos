package pt.alexandre.temperature;

import java.util.Scanner;

public class ExoTemperature
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        float celcius;
        float faren;
        System.out.println("Entrez votre temperature en farenheit :");
        faren = sc.nextFloat();
        celcius = ((5f/9f) * (faren-32));
        System.out.println("La temperature correspondante en Celcius est de : " + celcius + "°C");
    }
}
