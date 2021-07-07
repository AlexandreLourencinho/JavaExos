package pt.alexandre.exotablo3;

import java.util.Arrays;

public class ExoTablo3
{
    public static void main(String[] args)
    {

        int[] tablo = {8, 6, 9, 9, 5, 0, 3, 1, 2, 7};
        System.out.println(Arrays.toString(tablo));
        int longueur = tablo.length, temp;
        for (int j = 0; j <= 10; j++) {
            for (int i = 0; i <= longueur - 2; i++) {
                if (tablo[i] > tablo[i + 1]) {
                    temp = tablo[i];
                    tablo[i] = tablo[i + 1];
                    tablo[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tablo));
    }
}
