package chap19.list;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by frlegros on 09/03/16.
 */
public class TestCopyOnWriteArrayList {

    static Thread parcoursThread;

    static Thread modifThread;

private static void lancerModifThread(final CopyOnWriteArrayList<String> list){

    modifThread = new Thread(new Runnable() {
        long compteur =0;
        public void run() {

            while (!Thread.interrupted()){
                int taille = list.size();
                Random random = new Random();
                if (random.nextBoolean()) {
                    if (taille>1){
                        list.remove(random.nextInt(taille-1));
                    }
                }else {
                    if ((taille<10)){
                        list.addIfAbsent("Element "+compteur);
                    }
                }
                compteur++;
            }
            System.out.println("Arrêt du Thread modif");
        }
    });
}

private static void lancerParcoursThread(final List<String> list){
    parcoursThread = new Thread(new Runnable() {
        public void run() {
            while ((!Thread.interrupted())){
                Iterator<String> iter = list.iterator();
                while (iter.hasNext()){
                    String element = iter.next();
                    System.out.println(element);
                }
                System.out.println("");
            }
            System.out.println("Arrêt du Thread parcours");
        }
    });
    parcoursThread.start();
}

    public static void main(String[] args){

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        lancerParcoursThread(list);
        lancerModifThread(list);
        try{
            Thread.sleep((10000));
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        modifThread.interrupt();
        parcoursThread.interrupt();
    }
}
