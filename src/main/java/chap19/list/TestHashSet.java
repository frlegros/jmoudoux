package chap19.list;

import utils.CollectionMethods;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by frlegros on 10/03/16.
 */
public class TestHashSet {

    public static void main(String[] args){
        Set set = new HashSet();
        set.add("CCCC");
        set.add("BBBB");
        set.add("DDDD");
        set.add("BBBB");
        set.add("AAAA");

        CollectionMethods.displayCollection(set);
    }
}
