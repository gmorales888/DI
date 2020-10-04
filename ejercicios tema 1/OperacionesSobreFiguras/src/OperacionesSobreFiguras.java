import java.util.*;
public class OperacionesSobreFiguras {

    Scanner sc = new Scanner(System.in);

    final String MENU_PRINCIPAL =
            "**Bienvenido a la calculadora de trigronometría**\n"+
            "1 Para hacer operaciones con Circulos\n"+
            "2 Para hacer operaciones con Rectangulos\n"+
            "3 Para hacer operaciones con Triangulos\n"+
            "4 Para salir\n"+
            "Introduce sobre el objeto que quieres operar:\n";

    final String MENU_CIRCULO =
            "*********************Circulo*********************\n"+
            "1 Para calcular el perímetro\n"+
            "2 Para calcular el area\n";

    final String MENU_RECTANGULO =
            "*******************Rectangulo********************\n"+
            "1 Para calcular el perímetro\n"+
            "2 Para calcular el area\n";

    final String MENU_TRIANGULO =
            "********************Triangulo********************\n"+
            "1 Para calcular el perímetro\n"+
            "2 Para calcular el area\n";

    void calculoCirculo() {
        System.out.println(MENU_CIRCULO);
        int opcion = sc.nextInt();
        double radio = 0;

        if (opcion!=1&&opcion!=2) {
            System.out.println("Escriba 1 o 2");
        }
        else {
            System.out.println("Introduce el radio: ");
            radio = sc.nextFloat();
        }

        switch (opcion) {
            case 1: System.out.println("El radio es: "+ 2*Math.PI*radio); break;
            case 2: System.out.println("El area es: "+ 2*Math.PI*Math.pow(radio,2)); break;
        }
    }

    void calculoRectangulo() {
        System.out.println(MENU_RECTANGULO);
        int opcion = sc.nextInt();
        float alto=0, ancho=0;

        if (opcion!=1&&opcion!=2) {
            System.out.println("Escriba 1 o 2");
        }
        else {
            System.out.println("Introduce el alto: ");
            alto = sc.nextFloat();
            System.out.println("Introduce el ancho: ");
            ancho = sc.nextFloat();
        }

        switch (opcion) {
            case 1: System.out.println("El perimetro es: "+alto*2+ancho*2); break;
            case 2: System.out.println("El area es: "+alto*ancho); break;
        }
    }

    void calculoTriangulo() {
        System.out.println(MENU_TRIANGULO);
        int opcion = sc.nextInt();
        double l1=0, l2=0, l3=0;

        if (opcion!=1&&opcion!=2) {
            System.out.println("Escriba 1 o 2");
        }
        else {
            System.out.println("Introduce el lado 1: ");
            l1 = sc.nextDouble();
            System.out.println("Introduce el lado 2: ");
            l2 = sc.nextDouble();
            System.out.println("Introduce el lado 3: ");
            l3 = sc.nextDouble();
        }

        double sp = (l1+l2+l3)/2;
        double area = Math.sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));

        switch (opcion) {
            case 1: System.out.println("El perimetro es: "+l1+l2+l3); break;
            case 2: System.out.println("El area es: "+area); break;
        }
    }

    void inicio() {

        boolean salir = false;
        int opcion;

        while(!salir) {
            System.out.println(MENU_PRINCIPAL);
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        calculoCirculo();
                        break;
                    case 2:
                        calculoRectangulo();
                        break;
                    case 3:
                        calculoTriangulo();
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Escriba un numero del 1 al 4");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Argumento no valido");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        new OperacionesSobreFiguras().inicio();
    }
}