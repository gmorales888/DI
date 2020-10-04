import Clases.Usuario;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Registra");
            System.out.println("2. Busca");
            System.out.println("3. Lista");
            System.out.println("4. Resetea");
            System.out.println("5. Login");
            opcion = sc.nextInt();
            String u,p;
            switch (opcion) {
                case 1:
                    System.out.println("Usuario: ");
                    u = sc.nextLine();
                    System.out.println("Password: ");
                    p = sc.nextLine();
                    sistema.registrarUsuario(new Usuario(u,p));
                    System.out.println("Usuario registrado correctamente");
                    break;
                case 2:
                    System.out.println("Introduce el usuario a buscar: ");
                    u = sc.next();
                    sistema.buscarUsuario(u);
                    break;
                case 3:
                    sistema.listarUsuarios();
                    break;
                case 4:
                    System.out.println("Introduce usuario: ");
                    u = sc.next();
                    System.out.println("Introduce contraseña antigua: ");
                    p = sc.next();
                    System.out.println("Introduce contraseña nueva: ");
                    String pn = sc.next();
                    sistema.resetearPass(new Usuario(u,p),pn);
                    break;
                case 5:
                    break;
            }
        } while (opcion!=5);
    }
}