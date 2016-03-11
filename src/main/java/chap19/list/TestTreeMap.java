package chap19.list;

import utils.MapMethod;

import java.util.TreeMap;

/**
 * Created by franck on 11/03/16.
 */
public class TestTreeMap {

    public static void main(String[] args){
        TreeMap<String,String> map = new TreeMap<String, String>();
        map.put("cle3", "valeur3");
        map.put("cle2", "valeur2");
        map.put("cle1", "valeur1");

        MapMethod.afficherMap(map);
    }

}
