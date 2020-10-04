import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        ArrayList<Double> temp = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcion;
        double temperatura;

        final String MENU = "*****BIENVENIDO A LA GESTION DE TEMPERATURAS*****\n"+
                "1. Para agregar una temperatura\n"+
                "2. Para ver máximos\n"+
                "3. Para listar las temperaturas\n"+
                "4. Para vaciar la lista\n"+
                "5. Para salir\n";

        do {
            System.out.println(MENU);
            opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Introduce temperatura");
                    temperatura = sc.nextDouble();
                    temp.add(temperatura);
                    break;

                case 2:
                    System.out.println("Listar");
                    for(Double item :temp) {
                        System.out.println("Temperatura: "+item);
                    }
                    break;

                case 3:
                    Collections.sort(temp);
                    System.out.println("El minimo es : "+temp.get(0)+"\nEl maximo es: "+temp.get(temp.size()-1));
                    break;

                case 4:
                    temp.clear();
                    System.out.println("Se ha vaciado la lista");
                    break;

                case 5:
                    break;
            }
        } while (opcion != 5);
    }
}