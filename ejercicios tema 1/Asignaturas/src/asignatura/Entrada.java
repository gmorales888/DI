package asignatura;

public class Entrada {

    public static void main(String[] args) {
        Asignatura pmdm = new Asignatura(1);
        Asignatura di = new Asignatura(2);
        Asignatura ad = new Asignatura(3);

        Alumno alumnoDam = new Alumno(pmdm, di, ad);

        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumnoDam);
        System.out.println("Me han dado las notas!!!");
        alumnoDam.verNotas();
        System.out.println(profesor.calcularMedia(alumnoDam));
    }
}
