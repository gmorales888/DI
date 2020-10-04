package Clases;

public class Llamada {
    //atributos
    private int coste, origen, destino, duracion;

    //constructores
    public Llamada(Tipo tipo, int origen, int destino, int duracion) {
        setCoste(tipo,duracion);
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }


    //metodos
    public int getCoste() {
        return coste;
    }

    public void setCoste(Tipo tipo, int duracion) {
        if (tipo==Tipo.tarifa) {
            this.coste = 0;
        } else if(tipo==Tipo.local) {
            this.coste = 15*duracion;
        } else if(tipo==Tipo.provincial1) {
            this.coste = 20*duracion;
        } else if (tipo==Tipo.provincial2) {
            this.coste = 25*duracion;
        } else {
            this.coste = 30*duracion;
        }
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
