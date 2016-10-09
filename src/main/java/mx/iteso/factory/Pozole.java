package mx.iteso.factory;

import java.util.ArrayList;

public abstract class Pozole {
    public String name;
    public String broth;
    public String toppings = "";
    public static final String MENUDO="Menudo";
    public static final String POZOLEBLANCOCACHETE="Pozole Blanco con Cachete";
    public static final String POZOLEBLANCOOREJA="Pozole Blanco con Oreja";
    public static final String POZOLEBLANCOPIERNA="Pozole Blanco con Pierna";
    public static final String POZOLEBLANCOPOLLO="Pozole Blanco con Pollo";
    public static final String POZOLEBLANCOTROMPA="Pozole Blanco con Trompa";
    public static final String POZOLEROJOCACHETE="Pozole Rojo con Cachete";
    public static final String POZOLEROJOOREJA="Pozole Rojo con Oreja";
    public static final String POZOLEROJOPIERNA="Pozole Rojo con Pierna";
    public static final String POZOLEROJOPOLLO="Pozole Rojo con Pollo";
    public static final String POZOLEROJOTROMPA="Pozole Rojo con Trompa";
    public static final String POZOLEVERDECACHETE="Pozole Verde con Cachete";
    public static final String POZOLEVERDEOREJA="Pozole Verde con Oreja";
    public static final String POZOLEVERDEPIERNA="Pozole Verde con Pierna";
    public static final String POZOLEVERDEPOLLO="Pozole Verde con Pollo";
    public static final String POZOLEVERDETROMPA="Pozole Verde con Trompa";
    public static final String POZOLILLO="Pozolillo";


    public void serve() {
        System.out.println("Serving in regular pozole plate..." );
    }

    public void prepare() {
        System.out.println("Preparing " + getName());
        System.out.println("Adding corn kernels..." );
        System.out.println("Adding broth..." );
        System.out.println("Adding toppings:" );
        System.out.println( getToppings());

    }
    public String getToppings(){
        return toppings;
    }

    public String getName(){
        return name;
    }
}