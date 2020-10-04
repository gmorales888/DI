import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(
                "1. Anadir coche\n"+
                "2. Listar coches\n"+
                "3. Buscar coche\n"+
                "4. Mostrar costes\n"+
                "5. Eliminar coches\n"+
                "6. Vaciar garaje\n"+
                "7. Salir");
            opcion = sc.nextInt();
            String marca, modelo, matricula;
            int coste;

            switch (opcion) {
                case 1:
                    System.out.println("Escriba la marca: ");
                    marca = sc.next();
                    System.out.println("Escriba el modelo: ");
                    modelo = sc.next();
                    System.out.println("Escriba la matricula: ");
                    matricula = sc.next();
                    System.out.println("Escriba el coste: ");
                    coste = sc.nextInt();

                    garaje.anadirCoche(new Coche(marca,modelo,matricula,coste));
                    break;
                case 2:
                    garaje.listarCoches();
                    break;
                case 3:
                    System.out.println("Introduzca la matricula del coche que desea buscar: ");
                    matricula = sc.next();
                    garaje.buscarCoche(matricula);
                    break;
                case 4:
                    garaje.mostrarCostes();
                    break;
                case 5:
                    System.out.println("Introduzca la matricula del coche que desea eliminar: ");
                    matricula = sc.next();
                    garaje.eliminarCoche(matricula);
                    break;
                case 6:
                    garaje.vaciarGaraje();
                    break;
                case 7:
                    break;
            }
        } while (opcion!=7);
    }
}
