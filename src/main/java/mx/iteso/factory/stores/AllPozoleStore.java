package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;

/**
 * Created by Arturo Hernandez on 6/10/2016.
 */
public class AllPozoleStore extends PozoleStore {

    private String caldo;
    private String meat;
    public AllPozoleStore(String caldo){
        this.caldo=caldo;
    }

    @Override
    protected Pozole createPozole(String meat) {
        PozoleStore store=null;
        if(this.caldo.equals("Rojo"))
            store=new PozoleRojoStore();
        else if(this.caldo.equals("Verde"))
            store=new PozoleVerdeStore();
        else if(this.caldo.equals("Blanco"))
            store=new PozoleBlancoStore();
        else if(this.caldo.equals("Menudo"))
            store=new MenudoStore();
        else if(this.caldo.equals("Pozolillo"))
            store=new PozolilloStore();
        else return null;

        return store.orderPozole(meat);

    }
}
