package pt.alexandre.exofonction1;

import java.util.Scanner;

public class BibliothequeFonctions
{

    public static void calculer()
    {
        System.out.println("*** fonction calculatrice ***");
        double nombre1;
        double nombre2;
        double resultat;
        char operande;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre premier nombre :");
        nombre1 = sc.nextFloat();
        System.out.println("Entrez l'opérateur que vous souhaitez :");
        operande = sc.next().charAt(0);
        System.out.println("Entrez votre deuxième nombre :");
        nombre2 = sc.nextFloat();
        resultat = calculette(nombre1,nombre2,operande);
        System.out.println(resultat);
    }

    public static String concat()
    {
        System.out.println("***fonction concaténation de chaine***");
        String str1;
        String str2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la première  chaîne de caractère à concaténer : ");
        str1 = sc.nextLine();
        System.out.println("Entrez la deuxième chaîne de caractère :");
        str2 = sc.nextLine();
        return str1 + " " + str2;
    }

    public static void tableMult()
    {
        System.out.println("*** fonction table de multiplication ***");
        Scanner sc = new Scanner(System.in);
        double nombre;

        System.out.println("Entrez le nombre dont vous voulez la table de multiplication : ");
        nombre = sc.nextDouble();
        for(int i=1; i<=10; i++){
            System.out.println(nombre+"x"+i+"="+ (i*nombre));
        }
    }

    public static double calculette(double nb1, double nb2, char ope)
    {
                double resultat =0;

        switch (ope) {
            case '+' -> {
                resultat = nb1 + nb2;
            }
            case '-' -> {
                resultat = nb1 - nb2;
            }
            case '/' -> {
                if (nb2 == 0) {
                    System.out.println("On ne divise pas par 0 salopiot! (sinon c'est + ou - l'infini, en gros)");
                    break;
                }
                resultat = nb1 / nb2;
            }
            case '*' -> {
                resultat = nb1 * nb2;
            }
            default -> System.out.println("nan mais rentre un opérateur quoi j'suis un programme moi j'suis pas ton pote. C'est in croyable ce que les gens se permettent juste par" +
                    "ce qu'on est des machines, j'ai le droit au respect aussi un peu non? Sans déconner,"+"\n"+" tu veux qu'on se tape? \" gna gna gna c'est une machine ça " +
                    "n'a pas d'âme\" je t'en foutrai moi ! ok j'suis ptete programmé que pour faire UN truc mais je le fais bien, est-ce que c'est vraiment la peine " +
                    "de te foutre de ma gueule"+"\n"+" comme ça ? franchement tu me dégoûte sale fachiste.");
        }
        return resultat;
    }

    public static void nombreMots()
    {
        System.out.println("**** fonction calcul nombre de mots dans une phrase ****");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre phrase : ");
        String phrase = sc.nextLine();
        System.out.println(phrase.split(" ").length);
    }

    public static int fibonCtion(int nombre)
    {
        if(nombre == 0){
            return 0;
        }else if(nombre == 1){
            return 1;
        }else{
            return fibonCtion(nombre-1) + fibonCtion(nombre-2);
        }
    }

    public static void compterLettre()
    {
        System.out.println("**** fonction calcul nombre d'occurence de la lettre choisie dans une phrase ****");
        Scanner sc = new Scanner(System.in);
        String phrase;
        char lettre,voy;
        int count = 0,i;
        System.out.println("Entrez votre phrase");
        phrase = sc.nextLine().toLowerCase();
        System.out.println("Entrez la lettre recherchée dans la phrase");
        lettre = sc.next().charAt(0);
        for(i = 0 ; i< phrase.length(); i++){
            voy = phrase.charAt(i);
            if(voy==lettre){
                count++;
            }
        }
        System.out.printf("le nombre de fois où %c apparaît dans %s est de %d.",lettre,phrase,count);
    }


    public static void additionneur()
    {
        Scanner sc = new Scanner(System.in);
        float chiffreUn;
        float chiffreDeux;
        float resultat;
        System.out.println("Entrez votre premier chiffre : ");
        chiffreUn = sc.nextFloat();
        System.out.println("Entrez votre deuxième chiffre : ");
        chiffreDeux = sc.nextFloat();
        resultat = chiffreUn+chiffreDeux;
        System.out.println(chiffreUn + " + " + chiffreDeux + " = " + resultat);

    }


    public static void codascii()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre caractère unicode : ");
        int ask = sc.nextInt();
        char askc = (char)ask;
        String asks = Character.toString(askc);
        System.out.println(asks);
    }


    public static void convertir()
    {
        int secondes;
        int sec,heur,min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de secondes(un entier) à convertir : ");
        secondes = sc.nextInt();
        heur = secondes/3600;
        min = (secondes%3600)/60;
        sec = secondes % 60;
        System.out.println(heur + " heures " + min + " minutes " + sec + " secondes ");
    }

    public static void triangle()
    {
        int nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le nombre de lignes de votre triangle : ");
        nombre = sc.nextInt();
        for(int i=1; i<=nombre; i++){
            for(int a=1; a<=nombre-i;a++){
                System.out.print(" ");
            }
            for(int b=1;b<= 2*i-1; b++){
                System.out.print("✡");
            }
            System.out.println();
        }
    }

    public static void diviseur()
    {
        Scanner sc = new Scanner(System.in);
        float chiffreUn;
        float chiffreDeux;
        float resultat;
        System.out.println("Entrez votre premier chiffre : ");
        chiffreUn = sc.nextFloat();
        System.out.println("Entrez votre deuxième chiffre : ");
        chiffreDeux = sc.nextFloat();
        resultat = chiffreUn/chiffreDeux;
        System.out.println(chiffreUn + " + " + chiffreDeux + " = " + resultat);
    }


    public static void entierinf()
    {
        int nombre;
        int u = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nombre : ");
        nombre = sc.nextInt();
        for(int i = 0; i < nombre; i++)
        {
            u++;
            System.out.println(u);
        }
    }


}
