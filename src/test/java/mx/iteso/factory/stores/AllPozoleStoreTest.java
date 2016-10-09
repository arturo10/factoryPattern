package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.AllPozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 8/10/2016.
 */
public class AllPozoleStoreTest {

    private AllPozoleStore pozoleStore;
    private Pozole pozole;
    @Before
    public void setUp(){
        pozoleStore= new AllPozoleStore("Blanco");
    }
    @Test
    public void createPozoleTest(){
        pozole=pozoleStore.createPozole("pierna");
        assertEquals(Pozole.POZOLEBLANCOPIERNA,pozole.getName());
    }
}
