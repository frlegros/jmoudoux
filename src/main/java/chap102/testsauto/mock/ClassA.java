package chap102.testsauto.mock;

/**
 * Created by franck on 14/03/16.
 */
public class ClassA {

    public String maMethode(){

        // debut des traitements
        InterfaceB classB = creerClassB();
        //Suite des traitements
        return classB.maMethodeB();
    }

    protected InterfaceB creerClassB() {
        return new ClassB();
    }
}
