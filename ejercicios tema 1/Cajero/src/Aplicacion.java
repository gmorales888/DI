import clases.Cuenta;
import clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {
        Persona p = new Persona("Gabriel","Morales");
        Cuenta c = new Cuenta(1,1234,p);

        c.ingresarSaldo(534,c);
        System.out.println("Actualmente tiene: "+c.consultarSaldo());
        c.sacarDinero(600,c);
        System.out.println("Actualmente tiene: "+c.consultarSaldo());
        c.sacarDinero(200,c);
        System.out.println("Actualmente tiene: "+c.consultarSaldo());
    }
}
