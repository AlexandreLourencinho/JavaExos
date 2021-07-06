package pt.alexandre.exotablo2;

import java.util.Arrays;
import java.util.Scanner;

public class ExoTablo2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String prenom,temp;
        String[] prenomTab = {"Alex","Juliette","Anais","Fabien","Noé","Hocine","Sana","Behzad","François","Germain"};
        System.out.println("Cherchez un prénom dans le tableau! :");

        prenom = sc.nextLine();
        int index = Arrays.asList(prenomTab).indexOf(prenom);
        if(index!=(-1)){
            for(int i=index; i<= (prenomTab.length-2);i++){
                prenomTab[i]=prenomTab[i+1];
            }
            prenomTab[prenomTab.length-1]=" ";
        }
        System.out.println(Arrays.toString(prenomTab));
    }
}