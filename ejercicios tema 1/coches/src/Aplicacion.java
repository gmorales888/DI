import clases.Coche;
import clases.Garaje;

import java.util.Arrays;

public class Aplicacion {

    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Coche focus = new Coche("Ford","Focus",150);
        Coche ibiza = new Coche("Seat","Ibiza", 100);

        garaje.aceptarCoche(focus,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(ibiza,"chapa");
        garaje.devolverCoche();
        garaje.aceptarCoche(focus,"aceite");
        garaje.devolverCoche();
        garaje.aceptarCoche(ibiza,"chapa");
        garaje.devolverCoche();

        System.out.println(ibiza.toString());
        System.out.println(focus.toString());
    }
}
