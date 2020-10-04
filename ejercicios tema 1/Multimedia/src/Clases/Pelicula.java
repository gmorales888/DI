package Clases;

public class Pelicula extends Multimedia {
    private String[] actores, pais;
    private double duracion;

    //constructores
    public Pelicula(String titulo, String autor, int ano, int codigo, String[] actores, String[] pais, double duracion) {
        super(titulo, autor, ano, codigo);
        this.actores = actores;
        this.pais = pais;
        this.duracion = duracion;
    }

    //metodos

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    public String[] getPais() {
        return pais;
    }

    public void setPais(String[] pais) {
        this.pais = pais;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + "actores: "+actores+" pais: "+pais+" duracion: "+duracion;
    }
}
