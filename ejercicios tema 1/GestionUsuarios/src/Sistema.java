import Clases.Usuario;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class Sistema {
    private Hashtable<String,Usuario> listaUsuarios;

    public Sistema() {
        listaUsuarios = new Hashtable<>();
    }

    public void registrarUsuario(Usuario usuario){
        if(listaUsuarios.containsKey(usuario.getPass())) {
            System.out.println("El usuario ya existe");
        } else {
            listaUsuarios.put(usuario.getPass(),usuario);
            System.out.println("Usuario agregado correctamente");
        }
    }

    public void buscarUsuario(String nombre) {
        Collection<Usuario> usuarios = listaUsuarios.values();
        for (Usuario item : usuarios) {
            if (item.getNombre().equals(nombre)) {
                System.out.println("Usuario encontrado");
                System.out.println(item);
            }
        }
    }

    public void listarUsuarios() {
        if(listaUsuarios.size()>0) {

            Enumeration<String> claves = listaUsuarios.keys();
            while (claves.hasMoreElements()) {
                String key = claves.nextElement();
                Usuario usuario = listaUsuarios.get(key);
                System.out.println(usuario);
            }
        } else {
            System.out.println("La lista esta vacia");
        }
    }

    public void resetearPass(Usuario usuario, String nuevaPass) {
        if (listaUsuarios.containsKey(usuario.getPass())) {
            listaUsuarios.remove(usuario.getPass());
            listaUsuarios.put(nuevaPass, new Usuario(usuario.getNombre(), nuevaPass));
        } else {
            System.out.println("Usuario no encontrado");
        }
    }

    public void login(Usuario u) {
        if(listaUsuarios.containsKey(u.getPass())) {
            Usuario u1 = listaUsuarios.get(u.getPass());
                    if (u.getNombre().equals(u1.getNombre())) {
                        System.out.println("Sesion iniciada");
                    } else {
                        System.out.println("Usuario o contraseña incorrectos");
                    }
        } else {
            System.out.println("Usuario no encontrado");
        }
    }
}
