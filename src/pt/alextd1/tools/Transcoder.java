package pt.alextd1.tools;

import org.germain.tool.ManaBox;

import java.util.ArrayList;
import java.util.HashMap;

public class Transcoder
{

    private HashMap<String, Character> tableauMdp = new HashMap<>();

//    private ArrayList<String> phraseDansTableau = new ArrayList<>();


    public Transcoder(String clef)
    {
        String clearKey = ManaBox.decrypt(clef);
        String debut = "AA";
        ArrayList<Character> chouar = new ArrayList<Character>();
        for( char c : clearKey.toCharArray()){
            tableauMdp.put(debut,c);
        }
    }

    // CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c

    public void encode(String phrase)
    {


    }



}
