package asignatura;

public class Asignatura {

    //atributos
    private int identificador;
    private double calificacion;

    //constructores
    public Asignatura(int id) {
        this.identificador = id;
    }

    //Metodos
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}