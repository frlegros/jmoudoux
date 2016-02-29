package chap08.multitache;

/**
 * Created by frlegros on 29/02/16.
 */
public class MonThread3 implements Runnable{



    public static void main(String[] args){

        MonThread3 monThread3 = new MonThread3();
        monThread3.start();
    }

    public void start(){
        run();
    }
    public void run() {
        int i=0;
        for (i=0;i>10;i++){
            System.out.println(""+i);
        }
    }
}
