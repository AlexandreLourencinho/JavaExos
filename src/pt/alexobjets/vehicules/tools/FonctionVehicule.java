package pt.alexobjets.vehicules.tools;

import pt.alexobjets.vehicules.model.*;

import java.util.ArrayList;

import static pt.alexobjets.vehicules.tools.BuildVehicule.*;

public class FonctionVehicule
{
    public static void choixe(int n)
    {
        switch (n){
            case 1:
                Avion avi = (Avion) creatAvion();
                leSout(avi);
            break;
            case 2:
                Motocyclette moto = (Motocyclette) creatMotocyclette();
                leSout(moto);
                break;
            case 3:
                Camion cam = creatCamion();
                leSout(cam);
                break;
            case 4:
                Bateau bat = (Bateau) creatBateau();
                leSout(bat);
                break;
            case 0:
                break;
            default:
                System.out.println("La commande n'est pas reconnue");
        }
    }

    public static Vehicule creatAvion()
    {
        ArrayList<Double> info = vitEtPrix("Avion");
        return new Avion(info.get(0), info.get(1));
    }

    public static Vehicule creatMotocyclette()
    {
        ArrayList<Double> info = vitEtPrix("Motocyclette");
        return new Motocyclette(info.get(0), info.get(1));
    }

    public static Vehicule creatBateau()
    {
        ArrayList<Double> info = vitEtPrix("Bâteau");
        return new Bateau(info.get(0), info.get(1));
    }

    public static Camion creatCamion()
    {
        ArrayList<Double> info = vitEtPrix("Camion");
        return new Camion(info.get(0), info.get(1));
    }



}
