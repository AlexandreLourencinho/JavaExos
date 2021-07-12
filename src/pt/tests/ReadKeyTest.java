package pt.tests;


import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import org.junit.Assert;
import org.junit.Test;
import pt.alextd1.tools.Transcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class ReadKeyTest
{
    /**
     * exemple
     */
    @Test
    public void readKeyTest()
    {
        // La clé cryptée donnée plus haut
        String keyCrypted = "6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==";
        // La clé décryptée que nous devrions obtenir
        String keyDecrypted = "CFfrkowl.aDzyS:eHjsGPZgMApWvRYVmtnK!BuU IQiEXTxbqhLdNJO,'c";
        // le test d'égalité entre la clé attendue et la sortie de la méthode de la librairie. Si le décryptage ne fonctionne pas nous aurons le message définit ici
        Assert.assertEquals("La librairie de décryptage est mal installée", keyDecrypted, ManaBox.decrypt(keyCrypted));
    }

    @Test
    public void lissageTest()
    {
        String messaga = "çéàçèéè";
        String messageLisse = "ceaceee";

        Assert.assertEquals(messageLisse, StringUtils.stripAccents(messaga));
    }

    @Test
    public void classeTranscoderTest()
    {
        Transcoder test = new Transcoder("tet");
        Assert.assertNotNull(test);
        System.out.println(test);
    }

    @Test
    public void stringToList()
    {
        String test = "test bidule truc";
        ArrayList<String> ar = new ArrayList<String>(Arrays.asList(test.split("")));
        System.out.println(ar);
    }


}
