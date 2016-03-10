package utils;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by frlegros on 10/03/16.
 */
public class CollectionMethods {

    public static void displayCollection(Collection set) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
