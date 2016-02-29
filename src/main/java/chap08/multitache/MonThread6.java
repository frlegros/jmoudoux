package chap08.multitache;

/**
 * Created by frlegros on 29/02/16.
 */
public class MonThread6 extends Thread {


    private boolean actif =true;

    public static void main(String[] args){
        try {
            MonThread6 monThread6 = new MonThread6();
            monThread6.start();
            monThread6.sleep(2000);
            System.in.read();
            monThread6.arreter();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void run(){
        int i=0;
        while(actif){
            System.out.println(""+i);
            i++;
        }
    }

    public void arreter(){
        actif=false;
    }
}
