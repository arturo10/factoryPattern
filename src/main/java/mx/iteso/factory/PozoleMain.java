package mx.iteso.factory;

import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import mx.iteso.factory.toppings.*;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();

        Pozole pozole = verdeStore.orderPozole("pollo");
        pozole= new Cebolla(pozole);
        pozole= new Chile(pozole);
        pozole.prepare();
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("pollo");
        pozole= new Cebolla(pozole);
        pozole= new Chile(pozole);
        pozole= new Col(pozole);
        pozole= new Oregano(pozole);
        pozole= new Rabanos(pozole);
        pozole.prepare();
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");
        pozole= new Cebolla(pozole);
        pozole= new Rabanos(pozole);
        pozole= new Lechuga(pozole);
        pozole.prepare();
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

    }
}