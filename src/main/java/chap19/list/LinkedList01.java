package chap19.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by franck on 09/03/16.
 */
public class LinkedList01 {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();
        linkedList.add("element 1");
        linkedList.add("element 2");
        linkedList.add("element 3");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println("objet="+iterator.next());
        }
    }
}
