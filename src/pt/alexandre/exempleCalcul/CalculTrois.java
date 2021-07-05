package pt.alexandre.exempleCalcul;

public class CalculTrois {
    public static void main(String[] args) {

        int nX = 8 ;
        System.out.println(nX) ;
        int nY = -nX ;
        System.out.println(nY) ;

        // important : incrémentation
        // a = ++i => i s'incrémente avant d^'etre affectée à a
        // a = i++ => i incrémenté après après avoir été affecté à a
        int nU= ++nX;
        System.out.println(" ++ nx  :" + nU);// renvoi 9
        int nI= nY--;
        System.out.println(" nY-- : " + nI); // renvoi -8



    }
}
