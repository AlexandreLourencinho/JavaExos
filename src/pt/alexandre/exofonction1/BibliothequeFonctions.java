package pt.alexandre.exofonction1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BibliothequeFonctions
{

    public static void calculer()
    {
        System.out.println("*****************************");
        System.out.println("*** fonction calculatrice ***");
        System.out.println("*****************************");
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
        resultat = calculette(nombre1, nombre2, operande);
        System.out.println(resultat);
    }

    public static String concat()
    {
        System.out.println("****************************************");
        System.out.println("*** fonction concaténation de chaine ***");
        System.out.println("****************************************");
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
        System.out.println("****************************************");
        System.out.println("*** fonction table de multiplication ***");
        System.out.println("****************************************");
        Scanner sc = new Scanner(System.in);
        double nombre;

        System.out.println("Entrez le nombre dont vous voulez la table de multiplication : ");
        nombre = sc.nextDouble();
        for (int i = 1; i <= 10; i++) {
            System.out.println(nombre + "x" + i + "=" + (i * nombre));
        }
    }

    public static double calculette(double nb1, double nb2, char ope)
    {
        double resultat = 0;

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
                    "ce qu'on est des machines, j'ai le droit au respect aussi un peu non? Sans déconner," + "\n" + " tu veux qu'on se tape? \" gna gna gna c'est une machine ça " +
                    "n'a pas d'âme\" je t'en foutrai moi ! ok j'suis ptete programmé que pour faire UN truc mais je le fais bien, est-ce que c'est vraiment la peine " +
                    "de te foutre de ma gueule" + "\n" + " comme ça ? franchement tu me dégoûte sale fachiste.");
        }
        return resultat;
    }

    public static void nombreMots()
    {
        System.out.println("********************************************************");
        System.out.println("**** fonction calcul nombre de mots dans une phrase ****");
        System.out.println("********************************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre phrase : ");
        String phrase = sc.nextLine();
        System.out.println(phrase.split(" ").length);
    }

    public static int fibonCtion(int nombre)
    {
        if (nombre == 0) {
            return 0;
        } else if (nombre == 1) {
            return 1;
        } else {
            return fibonCtion(nombre - 1) + fibonCtion(nombre - 2);
        }
    }

    public static void compterLettre()
    {
        System.out.println("*********************************************************************************");
        System.out.println("**** fonction calcul nombre d'occurence de la lettre choisie dans une phrase ****");
        System.out.println("*********************************************************************************");
        Scanner sc = new Scanner(System.in);
        String phrase;
        char lettre, voy;
        int count = 0, i;
        System.out.println("Entrez votre phrase");
        phrase = sc.nextLine().toLowerCase();
        System.out.println("Entrez la lettre recherchée dans la phrase");
        lettre = sc.next().charAt(0);
        for (i = 0; i < phrase.length(); i++) {
            voy = phrase.charAt(i);
            if (voy == lettre) {
                count++;
            }
        }
        System.out.printf("le nombre de fois où %c apparaît dans %s est de %d.", lettre, phrase, count);
    }


    public static void additionneur()
    {
        System.out.println("****************************************************");
        System.out.println("************** fonction additionneur ***************");
        System.out.println("*** permet simplement d'additionner deux nombres ***");
        System.out.println("****************************************************");
        Scanner sc = new Scanner(System.in);
        float chiffreUn;
        float chiffreDeux;
        float resultat;
        System.out.println("Entrez votre premier chiffre : ");
        chiffreUn = sc.nextFloat();
        System.out.println("Entrez votre deuxième chiffre : ");
        chiffreDeux = sc.nextFloat();
        resultat = chiffreUn + chiffreDeux;
        System.out.println(chiffreUn + " + " + chiffreDeux + " = " + resultat);

    }


    public static void codascii()
    {
        System.out.println("********************************************************");
        System.out.println("**** fonction de conversion d'un caractère en ASCII ****");
        System.out.println("****************** vers l'unicode **********************");
        System.out.println("*******************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre caractère unicode : ");
        int ask = sc.nextInt();
        char askc = (char) ask;
        String asks = Character.toString(askc);
        System.out.println(asks);
    }


    public static void convertir()
    {
        System.out.println("****************************************************************");
        System.out.println("***fonction de conversion d'un nombre de secondes en HH:MM:SS***");
        System.out.println("*****************************************************************");
        int secondes;
        int sec, heur, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de secondes(un entier) à convertir : ");
        secondes = sc.nextInt();
        heur = secondes / 3600;
        min = (secondes % 3600) / 60;
        sec = secondes % 60;
        System.out.println(heur + " heures " + min + " minutes " + sec + " secondes ");
    }

    public static void triangle()
    {
        System.out.println("*******************************************************");
        System.out.println("*** Fonction de création de triangle via la console ***");
        System.out.println("*******************************************************");
        int nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le nombre de lignes de votre triangle : ");
        nombre = sc.nextInt();
        for (int i = 1; i <= nombre; i++) {
            for (int a = 1; a <= nombre - i; a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * i - 1; b++) {
                System.out.print("✡");
            }
            System.out.println();
        }
    }

    public static void diviseur()
    {
        System.out.println("*************************************************************");
        System.out.println("*** Fonction permettant de diviser un nombre par un autre ***");
        System.out.println("*************************************************************");
        Scanner sc = new Scanner(System.in);
        float chiffreUn;
        float chiffreDeux;
        float resultat;
        System.out.println("Entrez votre premier chiffre : ");
        chiffreUn = sc.nextFloat();
        System.out.println("Entrez votre deuxième chiffre : ");
        chiffreDeux = sc.nextFloat();
        resultat = chiffreUn / chiffreDeux;
        System.out.println(chiffreUn + " + " + chiffreDeux + " = " + resultat);
    }


    public static void entierinf()
    {
        System.out.println("***************************************************");
        System.out.println("**** Fonction d'affichage des entiers de 0 à N ****");
        System.out.println("***************************************************");
        int nombre;
        int u = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nombre : ");
        nombre = sc.nextInt();
        for (int i = 0; i < nombre; i++) {
            u++;
            System.out.println(u);
        }
    }

    public static void majeurOuNon()
    {
        System.out.println("****************************************************************************************************");
        System.out.println("*** Fonction déterminant si vous êtes majeur ou mineur en se basant sur votre année de naissance ***");
        System.out.println("****************************************************************************************************");
        Scanner sc = new Scanner(System.in);
        int annee;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Entrez votre année de naissance :");
        annee = sc.nextInt();
        if (year - annee > 18) {
            System.out.println("Vous êtes majeur");
        } else {
            System.out.println("Vous êtes mineur");
        }
    }

    public static void tableauValeurs()
    {
        System.out.println("**************************************************************************************************");
        System.out.println("*** Fonction permettant de créer un tableau de la taille souhaitée et de le remplir de données ***");
        System.out.println("**************************************************************************************************");
        int taille;
        int valeur;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();
        System.out.println("Entrez la taille que vous voulez pour le tableau (en int) :");
        taille = sc.nextInt();
        for (int i = 0; i <= taille - 1; i++) {
            System.out.println("Entrez la valeur " + (i + 1) + " à l'index " + i + " du tableau");
            valeur = sc.nextInt();
            liste.add(valeur);
        }
        System.out.println(liste);
    }

    public static void tableauPrenoms()
    {
        System.out.println("****************************************************************************************");
        System.out.println("*** Fonction permettant d'afficher et de supprimer un prénom d'un tableau de prénoms ***");
        System.out.println("****************************************************************************************");
        Scanner sc = new Scanner(System.in);
        String prenom;
        ArrayList<String> prenomTab = new ArrayList<>();
        prenomTab.add("Alex");
        prenomTab.add("Juliette");
        prenomTab.add("Anais");
        prenomTab.add("Fabien");
        prenomTab.add("Noé");
        prenomTab.add("Hocine");
        prenomTab.add("Sana");
        prenomTab.add("Behzad");
        prenomTab.add("François");
        prenomTab.add("Germain");
        System.out.println("Voici les prénoms rangés dans le tableau : " + prenomTab);
        System.out.println("Entrez le prénom a supprimer du tableau :");
        prenom = sc.next();
        if (prenomTab.contains(prenom)) {
            prenomTab.remove(prenomTab.indexOf(prenom));
            System.out.println("Les étudiants restants seront donc : " + prenomTab);
        } else {
            System.out.println("Le prénom n'est pas dans le tableau !");
        }
    }


    public static void moyenne()
    {
        System.out.println("****************************************************************************");
        System.out.println("*** Fonction permettant de calculer la moyenne de 3 notes à coefficients ***");
        System.out.println("****************************************************************************");
        float noteCoeff3;
        float noteCoeff2;
        float noteCoeff1;
        float moyenne;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la note coefficient 3 :");
        noteCoeff3 = sc.nextFloat();
        System.out.println("Entrez la note coefficient 2 :");
        noteCoeff2 = sc.nextFloat();
        System.out.println("Entrez la note coefficient 1 :");
        noteCoeff1 = sc.nextFloat();
        moyenne = (noteCoeff1 * 3 + noteCoeff2 * 2 + noteCoeff3) / 6;
        System.out.println("La moyenne est de : " + moyenne);
    }

    public static void nbvoyelles()
    {
        System.out.println("*************************************************************************************");
        System.out.println("*** Fonction permettant de compter le nombre de voyelles d'un mot ou d'une phrase ***");
        System.out.println("*************************************************************************************");
        Scanner sc = new Scanner(System.in);
        String phrase;
        char voy;
        int count = 0, i;
        System.out.println("Entrez votre phrase");
        phrase = sc.nextLine();
        for (i = 0; i < phrase.length(); i++) {
            voy = phrase.charAt(i);
            if (voy == 'a' || voy == 'y' || voy == 'o' || voy == 'e' || voy == 'i' || voy == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void parite()
    {
        System.out.println("****************************************************************************");
        System.out.println("*** Fonction permettant de tester la parité d'un nombre (pair ou impair) ***");
        System.out.println("****************************************************************************");
        Scanner scanner = new Scanner(System.in);
        float nombre;
        System.out.println("Entrez un nombre");
        nombre = scanner.nextFloat();
        if (nombre % 2 != 0) {
            System.out.println("Le nombre est impair");
        } else {
            System.out.println("le nombre est pair");
        }
    }


    public static void palindrome()
    {
        System.out.println("****************************************************************************************");
        System.out.println("*** Fonction permettant de détecter si un mot ou une phrase est un palindrome ou non ***");
        System.out.println("****************************************************************************************");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int nblettre;
        boolean rep = true;
        String phrase;
        System.out.println("entrez votre mot pour vérifier si cest un palindrome :");
        phrase = sc.nextLine().toLowerCase();
        nblettre = phrase.length() - 1;
        while (i < nblettre) {
            if (phrase.charAt(i) != phrase.charAt(nblettre)) {
                rep = false;
            }
            i++;
            nblettre--;
        }
        if (rep) {
            System.out.println(phrase + " est un palindrome");
        } else {
            System.out.println(phrase + " n'est pas un palindrome");
        }
    }

    public static void sommeEntier()
    {
        System.out.println("*********************************************");
        System.out.println("*** Calcul la somme  des entiers de 0 a N ***");
        System.out.println("*********************************************");

        Scanner sc = new Scanner(System.in);
        int nombre, i, u = 0;
        System.out.println("Entrez votre nombre : ");
        nombre = sc.nextInt();
        for (i = 0; i <= nombre; i++) {
            u += i;
        }
        System.out.println("la somme des entiers de 0 a " + nombre + " est égal a : " + u);
    }


    public static void sommeEntierInterval()
    {
        System.out.println("**********************************************");
        System.out.println("*** Calcul la somme des entiers de N1 à N2 ***");
        System.out.println("**********************************************");
        Scanner sc = new Scanner(System.in);
        int nombre1, nombre2, resultat, affich;
        System.out.println("Entrez votre premier nombre :");
        nombre1 = sc.nextInt();
        System.out.println("entrez votre deuxieme nombre : ");
        nombre2 = sc.nextInt();
        if (nombre2 > nombre1) {
            affich = nombre1;
            resultat = nombre1;
            for (int i = nombre1; i < nombre2; i++) {
                nombre1++;
                resultat += nombre1;
            }
            System.out.println("La somme des entiers de " + affich + " jusqu'a " + nombre2 + " est de : " + resultat);
        } else {
            affich = nombre1;
            resultat = nombre1;
            for (int i = nombre1; i > nombre2; i--) {
                nombre1--;
                resultat += nombre1;
            }
            System.out.println("La somme des entiers de " + affich + " jusqu'a " + nombre2 + " est de : " + resultat);
        }
    }

    public static void conversionTemp()
    {
        System.out.println("***********************************************************************");
        System.out.println("*** Convertit une température donnée en farenheit en degrés celcius ***");
        System.out.println("***********************************************************************");


        Scanner sc = new Scanner(System.in);
        float celcius;
        float faren;
        System.out.println("Entrez votre temperature en farenheit :");
        faren = sc.nextFloat();
        celcius = ((5f / 9f) * (faren - 32));
        System.out.println("La temperature correspondante en Celcius est de : " + celcius + "°C");
    }

}
