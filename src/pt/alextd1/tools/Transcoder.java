package pt.alextd1.tools;

import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;

import java.util.HashMap;

public class Transcoder
{

    private HashMap<String, Character> tableauDecode = new HashMap<>();
    private HashMap<Character, String> tableauEncode = new HashMap<>();

//    private ArrayList<String> phraseDansTableau = new ArrayList<>();


    public Transcoder(String clef)
    {
        char tempchar;
        String clearKey = ManaBox.decrypt(clef);
        String debut = "AA";
        for (char c : clearKey.toCharArray()) {
            tableauDecode.put(debut, c);
            tableauEncode.put(c, debut);
            if (debut.charAt(1) != 'Z') {
                tempchar = debut.charAt(1);
                tempchar++;
                debut = "" + debut.charAt(0) + tempchar;
            } else {
                tempchar = debut.charAt(0);
                tempchar++;
                debut = "" + tempchar + "A";
            }
        }
    }


    public HashMap<String, Character> getTableauDecode()
    {
        return tableauDecode;
    }

    public HashMap<Character, String> getTableauEncode()
    {
        return tableauEncode;
    }

    public String encode(String phrase)
    {
        String encoded="";
        phrase = StringUtils.stripAccents(phrase);
        for(char ch : phrase.toCharArray()){
            encoded+=tableauEncode.get(ch);
        }
        return encoded;
    }

    public String decode(String phrase)
    {
        String decoded="";
        int taille = phrase.length();
//        System.out.println(taille);
        for(int i=0;i<=taille-2; i=i+2){
//            System.out.println(phrase.substring(i,i+2));
            decoded+=tableauDecode.get(phrase.substring(i,i+2));
        }
        return decoded;
    }
}
