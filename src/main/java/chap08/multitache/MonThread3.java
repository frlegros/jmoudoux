package chap08.multitache;

/**
 * Created by frlegros on 29/02/16.
 */
public class MonThread3 implements Runnable{

    private static int nbRun;

    public void run() {
        int i;
        System.out.println("Test Monthread3");
        MonThread3.nbRun++;
        try{
            for (i=0;i<100;i++){
                MonThread6.sleep(2000);
                System.out.println(MonThread3.nbRun+" > "+i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
