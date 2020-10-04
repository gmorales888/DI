import Clases.Libreria;
import Clases.Libro;

public class Aplicacion {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        libreria.agregarElemento(new Libro("Los pilares de la tierra","KF",1923,1234,12,32,"String"));
    }
}
