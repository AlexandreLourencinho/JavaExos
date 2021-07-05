package pt.alexandre.exempleCalcul;

public class Comparaison
{
    public static void main(String[] args)
    {
        int nY = 2 ;
        nY *= 2 ; //identique à (nY = nY * 2)
        boolean b1 = true, b2 = false ;
        b1 &= b2 ; //identique à (b1 = b1 & b2)
        System.out.println(b1);     // donne false
        boolean b3 = true, b4 = false ;
        b3 |= b4 ; //identique à (b1 = b1 & b2)
        System.out.println(b3);
        boolean b5 = true, b6 = true ;
        b5 ^= b6 ; //identique à (b1 = b1 & b2)
        System.out.println(b5);
    }
}
