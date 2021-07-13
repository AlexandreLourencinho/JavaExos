package pt.tests;


import org.apache.commons.lang3.StringUtils;
import org.germain.tool.ManaBox;
import org.junit.Assert;
import org.junit.Test;
import pt.alextd1.model.Message;
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
        Transcoder test = new Transcoder("6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==");
        Assert.assertNotNull(test);
        System.out.println(test);
    }

    @Test
    public void messagefab()
    {
        Transcoder trans = new Transcoder("6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==");
        System.out.println(trans.decode("CCBHBNAPASBGBNAPBHBNBZAPBLBUBNBFBQAHAHAPBNBBBQBHAWBGBNAPBGBNBLBHCDBGAFBLBGBNAHAPBNBFAFBHBZAPBNAJBNAHAPBNBZADAFBQBGBNAJBNBLBHAPBNBZAPBLBUBQAPBFAPBNCFBXAJBHCFAP"));
    }
    @Test
    public void stringToList()
    {
        String test = "test bidule truc";
        ArrayList<String> ar = new ArrayList<String>(Arrays.asList(test.split("")));
        System.out.println(ar);
    }

    @Test
    public void testcharstring()
    {
        Transcoder trans = new Transcoder("6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==");
        Assert.assertNotNull(trans);
        Assert.assertNotNull(trans.getTableauDecode());
        System.out.println(trans.getTableauDecode());
        Assert.assertNotNull(trans.getTableauEncode());
        System.out.println(trans.getTableauEncode());
    }

    @Test
    public void funcEncode()
    {
        Transcoder trans = new Transcoder("6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==");
        String test;
        Assert.assertNotNull(trans.encode("j'aime bien le java"));
        System.out.println(trans.encode("j'aime bien le java"));
    }

    @Test
    public void funcDecode()
    {
        Transcoder trans = new Transcoder("6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==");
        System.out.println(trans.decode("ARCEAJBQBFAPBNBVBQAPBHBNAHAPBNARAJBBAJ"));

    }


    @Test
    public void decodGermain()
    {
        Transcoder trans = new Transcoder("Z/YsEClWF0UqFYP8eds3sNHbY+wHVf7fZUmzsC8L/WdV1egGct3p6Bnm4hyx9XwMjyoQHPIMRrJ8G5mNsf0qtA==");
        System.out.println(trans.decode("AOAWCACBAKAYAKCAAXBSAWBVALCAAHAKBVCAAEAWCAAEAKAXAUAKAUAWCAAEAWCAAHAEACBVCABVCCBAAHAEAWAFBLAWAXAWAVCABTBXAXBGCABFACAKAXAMCABXAXCAAHAKBVBVAWCAAEAWBVCAAMCCBRBRCCAGACAEALAWBVBGCAAGBSAWBVALCAACAXCAAEAKAXAUAKAUAWCAARCCAGBYAWCAAWALCAAHACCCBVBVAKAXALAFBCBXAXCAAGBXACARAKAUAWCAAWALCABAAWARAGCCCAAMBSAKAYBXCCARCABRAKCCALCAAGAWCABLBIAFCDAWARBAAKCCAXAF"));
    }

//    @Test
//    public void testresultboolmessage()
//    {
//        Message mess = new Message("6Qe0IsEEH1utWRe7UKzGMiDTytOB3HS1dEfIB4imna3IRHXHRn5ZrvKFEcPjmPgKYGuytG+gDAl1m2DdHalJQg==");
//        System.out.println(mess.encoded("je suis un aigle !"));
//        System.out.println(mess.encoded("ARCEAJBQBFAPBNBVBQAPBHBNAHAPBNARAJBBAJ"));
//        Assert.assertFalse(mess.encoded("je suis un aigle !"));
//        Assert.assertTrue(mess.encoded("ARCEAJBQBFAPBNBVBQAPBHBNAHAPBNARAJBBAJ"));
//    }

    @Test
    public void testediter()
    {
        Message mess = new Message();
        mess.editer();
    }



}
