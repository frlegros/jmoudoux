package chap04.objets.interfac.ex01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tools.mocks.*;

import java.io.OutputStream;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 12/02/16.
 */
public class VoitureTest {

    public MockOutputStream mockOutputStream;
    protected Voiture voiture;

    @Before
    public void setUp() throws Exception {

        mockOutputStream = new MockOutputStream();
        voiture = new Voiture();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAfficherType() throws Exception {

        OutputStream os = mockOutputStream.getOutputStream();

        // Perform tests
        voiture.afficherType();
        assertEquals("Je suis une voiture\n", os.toString());
    }
}