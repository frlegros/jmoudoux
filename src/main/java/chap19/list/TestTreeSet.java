package chap19.list;

import utils.CollectionMethods;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by frlegros on 10/03/16.
 */
public class TestTreeSet {

    public static void main(String[] args){
        Set set = new TreeSet<String>();
        set.add("CCCC");
        set.add("BBBB");
        set.add("DDDD");
        set.add("BBBB");
        set.add("AAAA");

        CollectionMethods.displayCollection(set);
    }
}
