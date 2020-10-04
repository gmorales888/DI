import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Garaje {
    private Hashtable<String,Coche> garaje;

    public Garaje() {
        garaje = new Hashtable<>();
    }

    public void anadirCoche(Coche coche) {
        if(garaje.containsKey(coche.getMatricula())) {
            System.out.println("La matricula ya esta agregada");
        } else {
            garaje.put(coche.getMatricula(),coche);
            System.out.println("Coche agregado correctamente");
        }
    }

    public void listarCoches() {
        if(garaje.size()>0) {
            Enumeration<String> claves = garaje.keys();
            while (claves.hasMoreElements()) {
                String key = claves.nextElement();
                Coche coche = garaje.get(key);
                System.out.println(coche);
            }
        } else {
            System.out.println("El garaje esta vacio");
        }
    }

    public void buscarCoche(String matricula) {
        if(garaje.containsKey(matricula)) {
            System.out.println(garaje.get(matricula));
        } else {
            System.out.println("Coche no encontrado");
        }

        /*
        Collection<Usuario> usuarios = listaUsuarios.values();
        for (Usuario item : usuarios) {
            if (item.getNombre().equals(nombre)) {
                System.out.println("Usuario encontrado");
                System.out.println(item);
            }
        }
         */
    }

    public void mostrarCostes() {
        Collection<Coche> coches = garaje.values();
        int coste = 0;
        for (Coche item:coches) {
            coste += item.getCoste();
        }
        System.out.println("El coste acumulado es: "+coste);
    }

    public void eliminarCoche(String matricula) {
        if(garaje.containsKey(matricula)) {
            garaje.remove(matricula);
            System.out.println("Coche eliminado");
        } else {
            System.out.println("Coche no encontrado");
        }
    }

    public void vaciarGaraje() {
        garaje.clear();
        System.out.println("Garaje vaciado");
    }
}
