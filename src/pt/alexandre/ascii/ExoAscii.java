package pt.alexandre.ascii;

import java.util.Scanner;

public class ExoAscii
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre caractère unicode : ");
        int ask = sc.nextInt();
        char askc = (char)ask;
        String asks = Character.toString(askc);
        System.out.println(asks);
    }
}
