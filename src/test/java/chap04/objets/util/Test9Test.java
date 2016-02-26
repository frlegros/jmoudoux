package chap04.objets.util;

import junit.framework.TestCase;

import java.util.StringTokenizer;

/**
 * Created by franck on 26/02/16.
 */
public class Test9Test extends TestCase {

    Test9 t9;

    @Override
    public void setUp() throws Exception {

        t9 = new Test9();
    }

    public void testTest9() throws Exception {

        String[] eltChain={"chaine1","chaine2","chaine3","chaine4"};
        StringTokenizer res = t9.setTokennizer("chaine1,chaine2,chaine3,chaine4", ",");
        int cpt = 0;
        while (res.hasMoreTokens()){
            assertEquals(eltChain[cpt],res.nextToken());
            cpt++;
        }
    }
}