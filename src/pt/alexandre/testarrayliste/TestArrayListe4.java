package pt.alexandre.testarrayliste;

import java.util.ArrayList;

public class TestArrayListe4
{
    public static void main(String[] args) {
        ArrayList<Integer> nombres = new ArrayList<Integer>();
        nombres.add(128);
        nombres.add(256);
        nombres.add(512);
        nombres.add(1024);

        for (int i : nombres) {
            System.out.println(i);
        }
        System.out.println(nombres);
        System.out.println(nombres.get(0));
    }
}
