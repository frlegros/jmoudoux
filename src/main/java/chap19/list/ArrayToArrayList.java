package chap19.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by frlegros on 08/03/16.
 */
public class ArrayToArrayList {

    public static void main(String[] args){

        String tableau[] = {"A", "B", "C", "D"};
        List<String> liste = new ArrayList<String>();

        System.out.println("Contenu du tableau");
        for (String str: tableau){
            System.out.print(" "+str);
        }

        System.out.println("\nContenu de la liste");
        liste = Arrays.asList(tableau);
        for (String str: liste){
            System.out.print(" "+str);
        }

        tableau[0] = "AA";

        System.out.println("\nContenu de la liste");
        for (String str: liste){
            System.out.print(" "+str);
        }

        liste.add("E");

        System.out.println("\nContenu du tableau");
        for (String str: tableau){
            System.out.print(" "+str);
        }
    }


}
