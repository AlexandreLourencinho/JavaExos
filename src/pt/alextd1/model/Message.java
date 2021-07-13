package pt.alextd1.model;

import pt.alextd1.tools.Transcoder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Message
{
    private boolean encoded;

    private List<String> msgClear;

    private List<String> msgEncodded;

    private Path msgClearPath;

    private Path msgEncodedPath;

    private Path keyPath;

    private String key;

    private Transcoder transCoder;

    public Message()
    {

    }

    public Message(Boolean bool, Path cheminMessageDecode, Path cheminMessageEncode, Path cheminClef)
    {
        this.encoded = bool;
        this.keyPath = cheminClef;
        this.msgClearPath = cheminMessageDecode;
        this.msgEncodedPath = cheminMessageEncode;
    }

    public void editer()
    {
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        Path path = Paths.get(dir,"unfichier.txt");
        if(Files.exists(path)){
            System.out.println("deja là ");
        }else{
            System.out.println("pas deja là");
        }

        String test = "exemple un";
ArrayList<String> testt = new ArrayList<>();
        for(int i=0; i<=10;i++){
            testt.add("bonjour " + i + " fois");
        }
        for(String chaine : testt) {
            try {
                Files.writeString(path, chaine + System.lineSeparator(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        List<String> testtt = new ArrayList<>();
        try {
            testtt =  Files.readAllLines(path);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for(String line : testtt){
            System.out.println(line);
        }
    }



}
