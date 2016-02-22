package chap03.reglesdebase;

/**
 * Created by frlegros on 01/02/16.
 */
public class Declaration {

    public static void main(String[] args){

        float val2 = 10f;
        double res2 = val2 / 0 ;
        System.out.println(res2);
        //
        try {
            int val = 10;
            double res = val / 0;
            System.out.println(res);
        }
        catch (ArithmeticException error){
            System.out.println("div by zero impossible");
        }
        //
        short x=5, y=15;
        x = (short) (x + y);
        //
        char code = 'E';
        int index = code - 'A';
        System.out.println(index);
        //
        int nombre = 100;
        String chaine = "test";
        int[] nombres = new int[10];

        System.out.println(nombre);
        System.out.println(chaine);
        System.out.println(nombres);

    }

}
