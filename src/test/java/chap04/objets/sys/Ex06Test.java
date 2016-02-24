package chap04.objets.sys;

import chap04.objets.string.Ex01;
import junit.framework.TestCase;
import tools.mocks.MockOutputStream;

import java.io.OutputStream;

/**
 * Created by franck on 24/02/16.
 */
public class Ex06Test extends TestCase {


    public Ex06 ex06;
    public MockOutputStream mockOutputStream;
    public OutputStream os;


    public void setUp() throws Exception {
        ex06 = new Ex06();
        mockOutputStream = new MockOutputStream();
    }

    public void testPrintEnvVar() throws Exception {

        os = mockOutputStream.getOutputStream();
        ex06.printEnvVar();
        assertEquals("1.8.0_45\n", os.toString());

    }

    public void testExecRunTime() throws Exception {

        os = mockOutputStream.getOutputStream();
        ex06.execRunTime();
        assertNotNull(os.toString());

    }
}