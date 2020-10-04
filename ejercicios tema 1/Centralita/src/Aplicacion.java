import Clases.Llamada;
import Clases.Tipo;

import java.util.Arrays;

public class Aplicacion {

    public static void main(String[] args) {
        Llamada llamada1 = new Llamada(Tipo.local,672354090,912377716,460);
        System.out.println("Llamada registrada. Coste: "+llamada1.getCoste());
        Llamada llamada2 = new Llamada(Tipo.tarifa,672354090,912377716,780);
        System.out.println("Llamada registrada. Coste: "+llamada2.getCoste());
        Llamada llamada3 = new Llamada(Tipo.provincial1,672354090,912377716,220);
        System.out.println("Llamada registrada. Coste: "+llamada3.getCoste());
        Llamada llamada4 = new Llamada(Tipo.provincial2,672354090,912377716,290);
        System.out.println("Llamada registrada. Coste: "+llamada4.getCoste());
        Llamada llamada5 = new Llamada(Tipo.provincial1,672354090,912377716,330);
        System.out.println("Llamada registrada. Coste: "+llamada5.getCoste());
    }
}
