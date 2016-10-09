package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleBlancoStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 8/10/2016.
 */
public class LechugaTest {
    private PozoleStore pozoleStore;
    @Before
    public void setUp(){
        pozoleStore = new PozoleBlancoStore();
    }

    @Test
    public void testToppings(){
        Pozole pozole=pozoleStore.orderPozole("pollo");
        pozole=new Lechuga(pozole);
        assertEquals("Lechuga \n", pozole.getToppings());
    }
}
