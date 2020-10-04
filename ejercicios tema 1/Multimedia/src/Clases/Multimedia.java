package Clases;

public abstract class Multimedia {
    protected String titulo, autor;
    protected int ano, codigo;

    //constructor
    public Multimedia(String titulo, String autor, int ano, int codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.codigo = codigo;
    }

    //metodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", codigo=" + codigo +
                '}';
    }
}
