package chap08.multitache;

/**
 * Created by franck on 01/03/16.
 */
public class LanceurDeThreads {

    public static void main(String[] args){
        ThreadGroup threadGroup = new ThreadGroup("groupe");
        Thread thread1 = new Thread(threadGroup,new MonThread3(),"Numero 1");
        Thread thread2 = new Thread(threadGroup,new MonThread3(),"Numero 2");
        thread1.start();
        thread2.start();
    }
}
