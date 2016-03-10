package chap19.list;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by franck on 10/03/16.
 */
public class TestNavigableSet {

    public static void main(String[] args){
        NavigableSet<String> set = new TreeSet<String>();
        for (int i=0;i<10;i++){
            set.add(""+i);
        }

        System.out.println(set);
        System.out.println("ceilling(5)="+set.ceiling("5"));
        System.out.println("floor(5)="+set.floor("5"));
        System.out.println("higher(5)="+set.higher("5"));
        System.out.println("lower(5)="+set.lower("5"));

        System.out.println("Ordre descendant");
        afficherSet(set.descendingSet());

        System.out.println("headSet(5)");
        afficherSet(set.headSet("5"));

        System.out.println("headSet(5),true");
        afficherSet(set.headSet("5",true));

        System.out.println("subSet(\"3\", \"5\")");
        afficherSet(set.subSet("3", "5"));

        System.out.println("subSet(\"3\", true, \"5\", true)");
        afficherSet(set.subSet("3", true, "5", true));

        System.out.println("tailSet(5)");
        afficherSet(set.tailSet("5"));

        System.out.println("tailSet(5),true");
        afficherSet(set.tailSet("5",true));

        System.out.println("pollFirst()");
        System.out.println(set.pollFirst());

        System.out.println("pollLast()");
        System.out.println(set.pollLast());
    }

    private static void afficherSet(final Set<String> set) {
        Iterator<String> iterator =set.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element);
            if (iterator.hasNext()){
                System.out.print(", ");
            }else {
                System.out.println("");
            }
        }
    }

}
