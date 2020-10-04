public class Aplicacion {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.agregarUsuario(new Persona("Gabriel", "Morales", "47469999T", 645433582));
        agenda.getPersona("Gabriel");
        agenda.borrarPersona("Gabriel");
        agenda.agregarUsuario(new Persona("Gabriel", "Morales", "47469999T", 645433582));
        agenda.listarTodos();
    }
}
