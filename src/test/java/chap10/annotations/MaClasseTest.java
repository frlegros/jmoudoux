package chap10.annotations;

import junit.framework.TestCase;
import org.junit.Test;
import tools.mocks.MockOutputStream;

import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by franck on 01/03/16.
 */
public class MaClasseTest extends TestCase {

    public MockOutputStream mockOutputStream;
    public OutputStream os;
    public MaClasse maClasse;

    @Override
    public void setUp() throws Exception {

        mockOutputStream = new MockOutputStream();
        maClasse = new MaClasse();

    }

    @Test
    public void testMaMethode() throws Exception {

        os = mockOutputStream.getOutputStream();
        maClasse.maMethode();
        assertEquals("Ma methode fille\n", os.toString());
    }


}