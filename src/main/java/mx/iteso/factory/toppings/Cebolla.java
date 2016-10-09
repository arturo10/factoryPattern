package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.ToppingsDecorator;

/**
 * Created by Arturo Hernandez on 8/10/2016.
 */
public class Cebolla extends ToppingsDecorator {
    Pozole pozole;
    public Cebolla(Pozole pozole){
        this.pozole=pozole;
    }

    @Override
    public String getToppings(){
        return pozole.getToppings()+ "Cebolla \n";
    }

    @Override
    public String getName() {
        return pozole.getName();
    }
}
