package chap19.list;

import utils.MapMethod;

import java.util.LinkedHashMap;

/**
 * Created by franck on 11/03/16.
 */
public class TestLinkedHashMap {

    public static void main(String[] args){
        LinkedHashMap<String,String> map = new LinkedHashMap<String, String>();
        map.put(null,"");
        for (int i=10;i<19;i++){
            map.put(""+i, "");
        }
        MapMethod.afficherMapKey(map);
        System.out.println("");
        map.get("11");
        map.get("14");
        map.get("14");
        map.get("11");
        map.get("16");
        map.get("11");
        MapMethod.afficherMapKey(map);
    }
}
