package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Arturo Hernandez on 6/10/2016.
 */
public class Pozolillo extends Pozole {

    public Pozolillo() {
        name = "Pozolillo";
        broth = "Caldo Blanco";

    }

    @Override
    public void serve() {
        System.out.println("Serving hot with a small plate" );
    }
}
