package chap04.objets.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by frlegros on 28/02/16.
 */
public class Test10 {

    public void printHTable(Hashtable ht){

        for (Enumeration e=ht.keys();e.hasMoreElements();){
            System.out.println(e.nextElement());
        }
    }
}
