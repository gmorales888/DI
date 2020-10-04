package clases;

public class Garaje {
    //atributos
    private Coche coche;
    private String averia;
    private int numeroCoches;

    //metodos
    public boolean aceptarCoche(Coche coche, String averia) {
        if(numeroCoches>0) {
            System.out.println("No te puedo atender");
            return false;
        } else {
            System.out.println("He aceptado un coche");
            if(averia.equals("aceite")) {
                coche.getMotor().setLitrosDeAceite(coche.getMotor().getLitros_de_aceite()+10);
            }
            this.coche = coche;
            this.averia = averia;
            numeroCoches++;
            /////////////////////////////////////////////coche.getPrecioAverias();
            return true;
        }
    }

    public void devolverCoche() {
        if(coche!=null) {
            numeroCoches = 0;
            this.averia = null;
            this.coche = null;
            System.out.println("He devuelto un coche");
        } else {
            System.out.println("No tengo ningun cliente");
        }
    }
}
