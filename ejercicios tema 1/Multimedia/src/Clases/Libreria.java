package Clases;

import java.util.ArrayList;

public class Libreria {
    ArrayList<Multimedia> libreria;

    public Libreria() {
        System.out.println("Libreria inaugurada");
        libreria = new ArrayList<>();
    }

    public void agregarElemento(Multimedia elemento) {
        boolean existe = false;

        for (Multimedia item :libreria) {
            if (item.getCodigo() == elemento.getCodigo()) {
                System.out.println("No se puede agregar");
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("Elemento duplicado");
        } else  {
            System.out.println("Agregado correctamente");
            this.libreria.add(elemento);
        }

        this.libreria.add(elemento);
    }
    public void eliminarElemento(int codigo) {
            for (int i = 0; i < libreria.size(); i++) {
                if (libreria.get(i).getCodigo() == codigo) {
                    System.out.println("borrado correctamente");
                    libreria.remove(1);
                    break;
                }
            }
    }
}
