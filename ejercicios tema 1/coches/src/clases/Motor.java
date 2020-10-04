package clases;

public class Motor {

    //atributos
    private int litrosDeAceite;
    private int cv;

    //constructores
    public Motor(int cv) {
        this.cv = cv;
        this.litrosDeAceite = 0;
    }

    //metodos

    public int getLitros_de_aceite() {
        return litrosDeAceite;
    }

    public int getCv() {
        return cv;
    }

    public void setLitrosDeAceite(int litrosDeAceite) {
        this.litrosDeAceite = litrosDeAceite;
    }
}
