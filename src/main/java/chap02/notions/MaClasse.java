package chap02.notions;

/**
 * Created by frlegros on 31/01/16.
 */
public class MaClasse {

    public  static void main(String[] args){
        System.out.println("Bonjour");
        MonAutreClasse.afficher("Je m'appelle Franck");
    }
}

class MonAutreClasse{

    public static void afficher(String message){
        System.out.println(message);
    }
}
