package chap102.testsauto.mock.monservice;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by frlegros on 15/03/16.
 */
public class MonServiceTest {

    private Calculatrice mockCalulatrice = null;

    private MonService monService = null;

    @Before
    public void setUp() throws Exception {
        mockCalulatrice = EasyMock.createMock(Calculatrice.class);

        monService = new MonService(){
            protected Calculatrice creerCalculatrice(){
                return mockCalulatrice;
            }
        };
    }

    @Test
    public void testAdditionnerParamreInvalide(){

        long retour =0l;

        EasyMock.expect(mockCalulatrice.additionner(1,2)).andThrow(new IllegalArgumentException());
        EasyMock.replay(mockCalulatrice);

        retour = monService.additionner(-1, 2);
        Assert.assertEquals("Valeur retournée esi invalide", -1l, retour);
    }

}