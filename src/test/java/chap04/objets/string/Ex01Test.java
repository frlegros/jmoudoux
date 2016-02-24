package chap04.objets.string;

import junit.framework.TestCase;
import tools.mocks.MockOutputStream;

import java.io.OutputStream;

/**
 * Created by franck on 23/02/16.
 */
public class Ex01Test extends TestCase {

    public Ex01 ex01;

    public void setUp() throws Exception {
        ex01 = new Ex01();
    }

    public void testSetUneChaine() throws Exception {

        ex01.strToUpper("toto");
        assertEquals("TOTO",ex01.getUneChaine());
    }

    public void testIsContentEqual() throws Exception {

        String var1 = "Bonjour";
        String var2 = "Bonjour";
        boolean res = ex01.isObjContentEqual(var1, var2);
        assertEquals(res,true);
    }

    public void testIsRefEqual() throws Exception {

        String var1 = "Bonjour";
        String var2 = new String("Bonjour");
        boolean res = ex01.isObjRefEqual(var1, var2);
        assertEquals(res,false);
    }

    public void testIsEmpty() throws Exception {

        String str1 = null;
        boolean res = ex01.isObjEmpty(str1);
        assertEquals(res,true);
        //
        str1 = "";
        res = ex01.isObjEmpty(str1);
        assertEquals(res,true);

    }

    public void testIsNotEmpty() throws Exception {

        String str1 = "toto";
        boolean res = ex01.isObjEmpty(str1);
        assertEquals(res,false);
    }


}