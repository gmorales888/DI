package clases;

public class Coche {

    //atributos
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAverias;

    //constructores
    public Coche(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(cv);
    }

    //metodos

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAverias() {
        return precioAverias;
    }

    public void acumularAveria() {
        precioAverias += (int) Math.random()*100;
    }

    @Override
    public String toString() {
        return String.format("Marca: %s Modelo: %s Aceite %d Averias %.2f",
                getMarca(),getModelo(),getMotor().getLitros_de_aceite(),getPrecioAverias());
    }
}
