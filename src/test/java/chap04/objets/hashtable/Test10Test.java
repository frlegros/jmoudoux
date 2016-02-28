package chap04.objets.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Hashtable;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 28/02/16.
 */
public class Test10Test {

    Hashtable h;
    Test10 test10;

    @Before
    public void setUp() throws Exception {

        test10= new Test10();

        h= new Hashtable();
        h.put("jour", new Date());
        h.put(new Integer(1), "premier");
        h.put(new Integer(2), "deuxième");
    }

    @Test
    public void testPrintHTable() throws Exception {

        test10.printHTable(h);

    }
}