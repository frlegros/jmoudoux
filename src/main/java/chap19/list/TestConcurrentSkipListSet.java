package chap19.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Created by frlegros on 10/03/16.
 */
public class TestConcurrentSkipListSet {

    public static void main(String[] args){

        final Collection set = new ConcurrentSkipListSet();
        System.out.println("begin");

        final Thread modificateur= new Thread(new Runnable() {
            public void run() {

                String mesTaches[] = new String[5];

                for (int i=1;i<=5;i++){
                    mesTaches[i-1] = new String("Task "+i);
                }

                for (int j=1;j<=100;j++){
                    if (j % 2 == 0){
                        for (int i=1;i<=5;i++){
                            String element = mesTaches[i-1];
                            System.out.println("insert element "+element);
                            set.add(element);
                        }
                        System.out.println("Queue size="+set.size());
                    }else {
                        for (int i=1;i<=5;i++){
                            String element =mesTaches[i-1];
                            System.out.println("remove element "+element);
                            set.remove(element);
                        }
                    }
                }
            }
        },"Modificateur");

        modificateur.start();

        final Thread iterateur= new Thread(new Runnable() {
            public void run() {

                int i = 0;
                while (modificateur.isAlive()){
                    Iterator<String> iterator = set.iterator();
                    StringBuilder contenu = new StringBuilder("[");
                    while (iterator.hasNext()){
                        contenu.append(iterator.next());
                        if (iterator.hasNext()){
                            contenu.append(", ");
                        }
                    }

                    contenu.append("]");
                    System.out.println("Contenu="+contenu);
                    i++;
                }

            }
        },"iterateur");

        iterateur.start();
        try{
            modificateur.join();
            iterateur.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("fin");
    }
}
