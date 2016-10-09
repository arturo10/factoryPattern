package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;


/**
 * Created by Arturo Hernandez on 6/10/2016.
 */
public class PozolilloStore extends PozoleStore{

    @Override
    protected Pozole createPozole(String meat) {

            return new Pozolillo();

    }
}
