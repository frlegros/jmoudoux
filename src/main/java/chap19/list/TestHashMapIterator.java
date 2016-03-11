package chap19.list;

import java.util.HashMap;

/**
 * Created by franck on 11/03/16.
 */
public class TestHashMapIterator {

    public static void main(String[] args){

        HashMap<String,String> map = new HashMap<String, String>(34);
        map.put("1", "un");
        map.put("2", "deux");
        map.put("3", "trois");
        map.put("4", "quatre");
        map.put("5", "cinq");
        for (String s: map.keySet()){
            System.out.print(s+" ");
        }
    }
}
