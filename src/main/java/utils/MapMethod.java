package utils;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by franck on 11/03/16.
 */
public class MapMethod {

    public static void afficherMapKey(final LinkedHashMap<String, String> map){
        for (String s: map.keySet()){
            System.out.print(s+" ");
        }
    }

    public static void afficherMap(final TreeMap<String, String> map){
        for (Map.Entry<String,String> element: map.entrySet()){
            System.out.print(element.getKey()+": "+element.getValue());
        }
    }
}
