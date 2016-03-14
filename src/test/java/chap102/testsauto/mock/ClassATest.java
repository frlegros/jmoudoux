package chap102.testsauto.mock;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Before;
import org.junit.Test;

import static org.easymock.EasyMock.createControl;

import static org.junit.Assert.*;

/**
 * Created by franck on 14/03/16.
 */
public class ClassATest {

    IMocksControl control = createControl();
    InterfaceB mockB;

    @Before
    public void setUp() throws Exception {

        mockB = control.createMock(ClassB.class);
    }

    @Test
    public void testMaMethode(){

        ClassA classA = new ClassA();
        assertEquals(classA.maMethode(),"toto");
    }

}