package chap08.multitache;

/**
 * Created by franck on 01/03/16.
 */
public class LancerDemonThread3 {

    public static void main(String[] args){

        System.out.println("Thread.MIN_PRIORITY  = "+Thread.MIN_PRIORITY);
        System.out.println("Thread.NORM_PRIORITY  = "+Thread.NORM_PRIORITY);
        System.out.println("Thread.MAX_PRIORITY  = "+Thread.MAX_PRIORITY);
        Thread thread = new Thread(new MonThread3(),"MonThread");
        System.out.println("MonThread3 Priority Default= "+thread.getPriority());
        try{
            thread.setPriority(8);
        }catch (IllegalArgumentException e){
            System.out.println("Priority is out of range. Must be included in [0-10]");
        }
        System.out.println("MonThread3 Priority setTo= "+thread.getPriority());
        thread.start();
    }
}
