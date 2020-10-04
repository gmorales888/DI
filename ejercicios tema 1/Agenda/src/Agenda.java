import java.util.ArrayList;

public class Agenda {

    private ArrayList<Persona> listaPersonas;

    //constructores
    public Agenda() {
        listaPersonas = new ArrayList<>();
    }

    //metodos
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void agregarUsuario(Persona persona) {
        listaPersonas.add(persona);
    }

    public void getPersona(String nombre) {
        for (Persona item:listaPersonas) {
            if(item.getNombre().equals(nombre)){
                System.out.println(item.toString());
            }
        }
    }

    public void borrarPersona(String nombre) {
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (listaPersonas.get(i).getNombre().equals(nombre)) {
                listaPersonas.remove(i);
            }
        }
    }

    public void listarTodos() {
        for (Persona persona:listaPersonas) {
            persona.toString();
        }
    }
}
