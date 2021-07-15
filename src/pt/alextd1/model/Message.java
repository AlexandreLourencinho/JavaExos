package pt.alextd1.model;

import pt.alextd1.tools.Transcoder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Message
{
    // déclaration des membres utilisés pour encoder et décoder des messages
    // ici le boolean qui déterminera si le message est codé ou non, et donc s'il faut le coder ou le décoder
    private boolean encoded;

    // liste des lignes du message non codé - inutilisé car récupéré directement
    private List<String> msgClear;

    // pareil qu'au dessus pour le message décodé
    private List<String> msgEncodded;

    // chemin du fichier copntenant le message décodé
    private Path msgClearPath;


    // chemin du fichier copntenant le message encodé
    private Path msgEncodedPath;

    // chemin de la clef de décryptage
    private Path keyPath;


    // clef de décryptage
    private String key;

    // transcoder
    private Transcoder transCoder;


    // constructeur qui prend en param le booléan et les différents chemins
    public Message(Boolean bool, Path cheminMessageDecode, Path cheminMessageEncode, Path cheminClef)
    {
        this.encoded = bool;
        this.keyPath = cheminClef;
        this.msgClearPath = cheminMessageDecode;
        this.msgEncodedPath = cheminMessageEncode;
    }


    // fonction permettant l'écriture et le décodage
    public void editer()
    {
        // si encoded est a true, le message est donc codé, donc on le décode
        if(encoded){
            try {
                // on déclare une nouvelle liste qui sotckera toutes les lignes du fichier contenant le message codé
                List<String> lireCode = Files.readAllLines(msgEncodedPath);
                //on récupère la clef
                key = Files.readString(keyPath);
                // on instancie le transcoder avec la clef récupérée juste au dessus
                transCoder = new Transcoder(key);

                // pour chaque chaine de caractère de la liste, chaque ligne de message codé
                for(String chaine : lireCode){

                    // écrire dans le fichier de décodage le message décodé. s'ajoute ligne par ligne grace au  APPEND.
                    Files.writeString(msgClearPath, transCoder.decode(chaine)+System.lineSeparator(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
                }

            }
            catch (IOException e) {
                // récupère les erreurs et affiche les différentes données pour la localiser si besoin
                System.out.println("erreur " + e.getMessage()+" \n "+e.getCause());
                System.out.println(msgClearPath);
                System.out.println(key);
                System.out.println(keyPath);
                System.out.println(msgEncodedPath);
            }


        }else{
            // sinon encodé est false : donc le message n'est pas codé et il faut l'encoder
            try {
                // déclaration d'une liste contenant toutes les lignes de message non codé
                List<String> lireDecode = Files.readAllLines(msgClearPath);

                // récupération de la clef, comme au dessus
                key = Files.readString(keyPath);
                // instanciation du transcoder
                transCoder = new Transcoder(key);

                // pour chaque ligne de message non codé
                for(String chaine : lireDecode){
                    //écrire la version codé dans un fichier
                    Files.writeString(msgEncodedPath, transCoder.encode(chaine)+System.lineSeparator(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
                }

            }
            catch (IOException e) {
                // erreurs + données, cf au dessus
                System.out.println("erreur" + e.getMessage()+"\n"+e.getCause());
                System.out.println(msgClearPath);
                System.out.println(key);
                System.out.println(keyPath);
                System.out.println(msgEncodedPath);
            }

        }
    }




}
