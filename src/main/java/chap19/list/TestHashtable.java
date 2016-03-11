package chap19.list;

import java.util.Hashtable;

/**
 * Created by franck on 11/03/16.
 */
public class TestHashtable {

    public static void main(String[] args){
        Hashtable<Integer, String> numbers = new Hashtable<Integer, String>();
        numbers.put(1,"Element1");
        numbers.put(2,"Element2");
        numbers.put(3,"Element3");
        String n = numbers.get(2);
        if(n!=null){
            System.out.println("<2, "+n+">");
        }
    }
}
