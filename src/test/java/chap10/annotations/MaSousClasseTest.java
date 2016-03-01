package chap10.annotations;

import junit.framework.TestCase;
import org.junit.Test;
import tools.mocks.MockOutputStream;

import java.io.OutputStream;

/**
 * Created by franck on 01/03/16.
 */
public class MaSousClasseTest extends TestCase {

    public MockOutputStream mockOutputStream;
    public OutputStream os;
    public MaSousClasse td;

    @Override
    public void setUp() throws Exception {

        mockOutputStream = new MockOutputStream();
        td = new MaSousClasse();

    }

    @Test
    public void testMaMethode() throws Exception {

        os = mockOutputStream.getOutputStream();
        td.maMethode();
        assertEquals("Test Deprecated\n", os.toString());
    }
}