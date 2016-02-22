package chap04.objets.classeinterne;

/**
 * Created by frlegros on 15/02/16.
 */
public class ClassPrincipale1 {

    public static void main(String[] args){
        ClassPrincipale1 classPrincipale1 = new ClassPrincipale1();
        ClassPrincipale1.ClasseInterne classeInterne = classPrincipale1. new ClasseInterne();
        System.out.println(classPrincipale1.getClass().getName());
        System.out.println(classeInterne.getClass().getName());
    }

public class ClasseInterne{

}

}
