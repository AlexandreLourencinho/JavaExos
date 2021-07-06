package pt.alexandre.putainlindrome;

import java.util.Scanner;

public class ExoPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i =0;
        int nblettre;
        boolean rep = true;
        String phrase;
        System.out.println("entrez votre mot pour vérifier si cest un palindrome :");
        phrase = sc.nextLine();
        nblettre= phrase.length()-1;
        while(i<nblettre){
            if(phrase.charAt(i) != phrase.charAt(nblettre)){
                rep = false;
            }
            i++;
            nblettre--;
        }
        if(rep){
            System.out.println(phrase + " est un palindrome");
        }else{
            System.out.println(phrase + " n'est pas un palindrome");
        }
    }
}
