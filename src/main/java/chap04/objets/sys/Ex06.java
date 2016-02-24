package chap04.objets.sys;

/**
 * Created by franck on 23/02/16.
 */
public class Ex06 {

    private String uneChaine;


    public void printEnvVar(){

        System.out.println(System.getProperty("java.version"));
    }

    public void execRunTime(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Tot Memo= "+runtime.totalMemory());
    }

}
