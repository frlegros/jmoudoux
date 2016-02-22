package chap04.objets.classeinterne;

/**
 * Created by frlegros on 16/02/16.
 */
public class ClassePrincipale20 {

    private int val = 5;

    public static void main(String[] args){

        ClassePrincipale20 cp = new ClassePrincipale20();
        ClasseInterne ci = cp. new ClasseInterne();
        ci.afficherValeur();
    }


    class ClasseInterne{

        public void afficherValeur(){

            System.out.println("val: "+val);
        }
    }

}
