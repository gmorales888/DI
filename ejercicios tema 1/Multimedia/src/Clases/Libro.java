package Clases;

public final class Libro extends Multimedia{
    private int edicion, numPaginas;
    private String soporte;

    //constructores
    public Libro(String titulo, String autor, int ano, int codigo, int edicion, int numPaginas, String soporte) {
        super(titulo, autor, ano, codigo);
        this.edicion = edicion;
        this.numPaginas = numPaginas;
        this.soporte = soporte;
    }

    //metodos

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    @Override
    public String toString() {
        return super.toString() + "edicion: "+edicion+" pagina: "+numPaginas+" soporte: "+soporte;
    }
}
