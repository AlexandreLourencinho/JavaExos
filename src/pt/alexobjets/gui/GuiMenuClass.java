package pt.alexobjets.gui;

import pt.alexobjets.cercles.DesCercles;
import pt.alexobjets.clients.Main;
import pt.alexobjets.formes.DesFormes;
import pt.alexobjets.trinombre.TestTriNombre;
import pt.guiall.Menu;

import java.util.Scanner;

public class GuiMenuClass
{
    public static void menu()
    {
        Scanner sc = new Scanner(System.in);
        int choix;
        boolean continuer = true;

        try {
            do {
                System.out.println("""
                        Choisissez l'exercice sur les classes que vous désirez lancer :
                        (1) les Cercles
                        (2) les clients
                        (3) les formes
                        (4) trinombre
                        (5) les véhicules
                        """);

                choix = sc.nextInt();
                switch (choix) {
                    case 1:
                        DesCercles.main(new String[]{});
                        break;
                    case 2:
                        Main.main(new String[]{});
                        break;
                    case 3:
                        DesFormes.main(new String[]{});
                        break;

                    case 4:
                        TestTriNombre.main(new String[]{});
                        break;
                    case 5:
                        pt.alexobjets.vehicules.Main.main(new String[]{});
                        break;
                    case 0:
                        continuer = false;
                        System.out.println("retour à l'accueil");
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
                                                                                ║ Merci d'avoir utilisé cet ║
                                                                                ║ utilitaire d'utilisations ║
                                                                                ║ de classes pour débutant  ║
                                                                                ╠═══════════════════════════╣
                                                                                ║Copyright LouAl industries ║
                                                                                ║   tous droits réservés    ║
                                                                                ║   Le java c'est rigolo    ║
                                                                                ╚═══════════════════════════╝
                            """);
                        Menu.menu();
                    default:
                        System.out.println("Vous n'avez pas entré de chiffres correspondant au menu");

                }
            } while (continuer);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            menu();
        }

    }


}