package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 6/10/2016.
 */
public class PozoleVerdePolloTest {

    private PozoleStore pozoleStore;
    private Pozole pozole;

    @Before
    public void setUp() {
        pozoleStore = new PozoleVerdeStore();
    }

    @Test
    public void createPozoleTest() {
        pozole = pozoleStore.orderPozole("pollo");
        assertEquals(Pozole.POZOLEVERDEPOLLO, pozole.getName());
    }
}
