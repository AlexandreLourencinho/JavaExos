package pt.alexandre.nbvoyelle;

import java.util.Scanner;

public class NbVoyelles
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String phrase;
        char voy;
        int count = 0,i;
        System.out.println("Entrez votre phrase");
        phrase = sc.nextLine();
        for(i = 0 ; i< phrase.length(); i++){
            voy = phrase.charAt(i);
            if(voy=='a' || voy== 'y' || voy== 'o' || voy=='e' ||voy=='i' ||voy=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

}

