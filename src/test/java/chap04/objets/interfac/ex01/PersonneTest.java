package chap04.objets.interfac.ex01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import tools.mocks.MockOutputStream;

import java.io.OutputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by frlegros on 12/02/16.
 */
public class PersonneTest {

    public MockOutputStream mockOutputStream;
    protected Personne voiture;

    @Before
    public void setUp() throws Exception {

        mockOutputStream = new MockOutputStream();
        voiture = new Personne();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAfficherType() throws Exception {

        OutputStream os = mockOutputStream.getOutputStream();


        // Perform tests
        voiture.afficherType();
        assertEquals("Je suis une Personne\n", os.toString());
    }
}