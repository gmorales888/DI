public class Coche {
    private String marca, modelo, matricula;
    private int coste;

    //constructores
    public Coche(String marca, String modelo, String matricula, int coste) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.coste = coste;
    }

    //metodos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", coste=" + coste +
                '}';
    }
}
