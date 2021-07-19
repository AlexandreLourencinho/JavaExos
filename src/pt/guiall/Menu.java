package pt.guiall;

import pt.alexandre.exofonction1.ExosFonction;
import pt.alexobjets.gui.GuiMenuClass;
import pt.alextd1.Main;

import java.util.Scanner;

public class Menu
{
    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        int choix;
        boolean continuer = true;

        System.out.println("""
                Quelle partie des exercices Java voulez-vous lancer ?
                (1) Evaluation partie 1
                (2) Exercices sur les fonctions
                (3) exercices sur les classes
                (0) Quitter
                """);
        try {


            do {
                choix = sc.nextInt();
                switch (choix) {
                    case 1 -> Main.main(new String[]{});
                    case 2 -> ExosFonction.main(new String[]{});
                    case 3 -> GuiMenuClass.menu();
                    case 0 -> {
                        continuer = false;
                        System.out.println("""
                                       
                                ────────────────────────────────
                                ───────────────██████████───────
                                ──────────────████████████────── * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
                                ──────────────██────────██────── *                                                                 *
                                ──────────────██▄▄▄▄▄▄▄▄▄█────── *                        Hey à la prochaine bg                    *
                                ──────────────██▀███─███▀█────── *                                                                 *
                                █─────────────▀█────────█▀────── * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
                                ██──────────────────█───────────
                                ─█──────────────██──────────────
                                █▄────────────████─██──████
                                ─▄███████████████──██──██████ ──
                                ────█████████████──██──█████████
                                ─────────────████──██─█████──███
                                ──────────────███──██─█████──███
                                ──────────────███─────█████████
                                ──────────────██─────████████▀
                                ────────────────██████████
                                ────────────────██████████
                                ─────────────────████████
                                ──────────────────██████████▄▄
                                ────────────────────█████████▀
                                ─────────────────────████──███
                                ────────────────────▄████▄──██
                                ────────────────────██████───▀
                                ────────────────────▀▄▄▄▄▀                   
                                                                """);
                        System.out.println("""
                                                            
                                               ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒█▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒█▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒████████▒█▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒██▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒█▒█▒▒▒▒▒▒█▒▒██▒▒▒▒▒▒▒█▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒█▒█▒▒▒▒▒▒█▒▒█▒▒▒▒▒▒▒▒██▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒█▒█▒▒▒▒▒▒█▒▒█▒▒▒▒▒▒▒▒▒█▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒██████████▒▒█████████▒████████▒▒█▒▒▒▒▒▒▒▒▒█▒▒██████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒▒████████▒▒██▒▒▒█▒███████▒▒▒█▒▒▒▒█▒▒████████▒████████▒██████▒████████▒███████▒████████▒▒▒▒
                                               ▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒███▒▒█▒█▒▒▒▒▒▒█▒▒█▒▒▒▒█▒▒█▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒█▒▒▒▒█▒▒▒▒█▒▒▒▒▒█▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒█▒██▒█▒█▒▒▒▒▒▒█▒▒█▒▒▒▒█▒▒████████▒▒▒▒█▒▒▒▒▒█████▒▒▒▒▒█▒▒▒▒▒████▒▒▒▒████████▒▒▒▒
                                               ▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒█▒▒▒██▒█▒▒▒▒▒▒█▒▒█▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒█▒▒▒▒▒█▒██▒▒▒▒▒▒█▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒
                                               ▒▒▒▒▒▒▒▒████████▒▒█▒▒▒██▒███████▒▒▒██████▒▒████████▒▒▒▒█▒▒▒▒▒█▒▒▒██▒████████▒███████▒████████▒▒▒▒
                                               ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                                               ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒
                      
                            """);
                        System.out.println("""
                                                                                ╔═══════════════════════════╗
                                                                                ║  Merci d'avoir utilisé ce ║
                                                                                ║        programme          ║
                                                                                ╠═══════════════════════════╣
                                                                                ║Copyright LouAl industries ║
                                                                                ║   tous droits réservés    ║
                                                                                ║   Le java c'est rigolo    ║
                                                                                ╚═══════════════════════════╝
                            """);
                    }


                    default -> System.out.println("Votre choix ne figure pas dans le menuu");
                }

            } while (continuer);
        }
        catch (Exception e) {
            menu();
        }
    }
}