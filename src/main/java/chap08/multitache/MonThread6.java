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
            System.in.read();
            monThread6.arreter();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void run(){
        int i=0;
        try{
            while(actif){
                MonThread6.sleep(2000);
                System.out.println(""+i);
                i++;
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void arreter(){
        actif=false;
    }
}
