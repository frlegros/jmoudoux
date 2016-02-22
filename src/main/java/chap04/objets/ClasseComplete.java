package chap04.objets;

/**
 * Created by frlegros on 08/02/16.
 */
public class ClasseComplete extends ClasseAbstraite{


    ClasseComplete(){

        super();
        System.out.println("Ceci est le constructeur de la classe complete");

    }

    void methodeAbstraite(){
        System.out.println("Ceci est une méthode abstraite redéfinie dans la classe complete");

    }

    public static void main(String[] args){

        ClasseComplete classeComplete = new ClasseComplete();
        classeComplete.methodePartgee();
        classeComplete.methodeAbstraite();
    }
}
