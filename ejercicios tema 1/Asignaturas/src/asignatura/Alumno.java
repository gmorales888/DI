package asignatura;

public class Alumno {
    private Asignatura a1,a2,a3;

    public Alumno(Asignatura asi1,Asignatura asi2,Asignatura asi3){
        this.a1 = asi1;
        this.a2 = asi2;
        this.a3 = asi3;
    }

    public Alumno(int id1, int id2, int id3){
        this.a1 = new Asignatura(id1);
        this.a2 = new Asignatura(id2);
        this.a3 = new Asignatura(id3);
    }

    public void verNotas(){
        System.out.printf(  "%s: %.2f%n" +
                            "%s: %.2f%n" +
                            "%s: %.2f%n",   getA1().getIdentificador(), getA1().getCalificacion(),
                                            getA2().getIdentificador(), getA2().getCalificacion(),
                                            getA3().getIdentificador(), getA3().getCalificacion());
    }

    //getter y setter
    public Asignatura getA1() {
        return a1;
    }

    public void setA1(Asignatura a1) {
        this.a1 = a1;
    }

    public Asignatura getA2() {
        return a2;
    }

    public void setA2(Asignatura a2) {
        this.a2 = a2;
    }

    public Asignatura getA3() {
        return a3;
    }

    public void setA3(Asignatura a3) {
        this.a3 = a3;
    }
}