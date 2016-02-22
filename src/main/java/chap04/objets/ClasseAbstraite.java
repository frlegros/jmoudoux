package chap04.objets;

/**
 * Created by frlegros on 08/02/16.
 */
abstract class ClasseAbstraite {

    ClasseAbstraite(){
        System.out.println("Ceci est le constructeur de la classe abstraite");
    }

    void methodePartgee(){
        System.out.println("Ceci est une méthode partagée de la classe abstraite");
    }

    abstract void methodeAbstraite();

}
