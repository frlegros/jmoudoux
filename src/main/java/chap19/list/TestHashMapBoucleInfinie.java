package chap19.list;

import chap19.list.resources.MonElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by franck on 11/03/16.
 */
public class TestHashMapBoucleInfinie {

    /**
     * Attention : cette application engendre généralement une boucle infinie
     * qui consomme toute la CPU de la machine
     */
    public static void main(String[] args){
        final Map<MonElement, String> map = new HashMap<MonElement, String>(2,02f);

        System.out.println("begin");
        for (int j=0;j<10;j++){
            Thread t1 = new Thread(new Runnable() {
                public void run() {
                    for (int i=1;i<10;i++){
                        map.put(new MonElement(i),"element "+i);
                    }
                }
            },"thread 0"+j);
            t1.start();
        }

        for (int j=0;j<10;j++){
            Thread t2 = new Thread(new Runnable() {
                public void run() {
                    for (int i=1;i<=10;i++){
                        System.out.println(map.get(i));
                    }
                }
            },"Thread 1"+j);
            t2.start();
        }
    }
}
