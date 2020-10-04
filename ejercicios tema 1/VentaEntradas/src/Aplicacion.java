import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int zonaPrincipal = 1000;
        int zonaCompraVenta = 200;
        int zonaVip = 25;

        do {
            System.out.println("1. Mostrar numero de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("En la Zona Principal quedan: " + zonaPrincipal + " entradas");
                    System.out.println("En la Zona Compra-Venta quedan: " + zonaCompraVenta + " entradas");
                    System.out.println("En la Zona Vip quedan: " + zonaVip + " entradas");
                    break;
                case 2:
                    int opcion2, cantidad;
                    System.out.println("1. Para comprar en la zona principal");
                    System.out.println("2. Para comprar en la zona compra-venta");
                    System.out.println("3. Para comprar en la zona vip");
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            if (zonaPrincipal > 0) {
                                System.out.println("Cuantas entradas quiere?");
                                cantidad = sc.nextInt();
                                zonaPrincipal -= cantidad;
                            } else {
                                System.out.println("No quedan entradas en la zona principal");
                            }
                            break;
                        case 2:
                            if (zonaCompraVenta > 0) {
                                System.out.println("Cuantas entradas quiere?");
                                cantidad = sc.nextInt();
                                zonaCompraVenta -= cantidad;
                            } else {
                                System.out.println("No quedan entradas en la zona compra-venta");
                            }
                            break;
                        case 3:
                            if (zonaVip > 0) {
                                System.out.println("Cuantas entradas quiere?");
                                cantidad = sc.nextInt();
                                zonaVip -= cantidad;
                            } else {
                                System.out.println("No quedan entradas en la zona Vip");
                            }
                            break;
                    }
                    break;
                case 3:
                    break;
            }
        } while (opcion!=3);
    }
}