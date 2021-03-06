package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 6/10/2016.
 */
public class PozoleVerdeStoreTest {
    private PozoleStore pozoleStore;
    private Pozole pozole;
    @Before
    public void setUp(){
        pozoleStore= new PozoleVerdeStore();
    }
    @Test
    public void createPozoleTest(){
        pozole=pozoleStore.orderPozole("trompa");
        assertEquals(Pozole.POZOLEVERDETROMPA,pozole.getName());
    }
}
