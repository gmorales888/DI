import java.util.ArrayList;
import java.util.Comparator;

public class Aplicacion {

    ArrayList<Float> temperaturas = new ArrayList<Float>();

    void inicio() {
        agregarTempratura(34, temperaturas);
        agregarTempratura(23, temperaturas);
        agregarTempratura(14, temperaturas);

        System.out.println(verMaximos(temperaturas));
        System.out.println(listarTodos(temperaturas));

        vaciarLista(temperaturas);
        agregarTempratura(26, temperaturas);
        System.out.println(listarTodos(temperaturas));

    }

    public void agregarTempratura(float t, ArrayList<Float> al) {
        al.add(t);
    }

    public float verMaximos(ArrayList<Float> al) {
        al.sort(Comparator.naturalOrder());
        return al.get(al.size()-1);
    }

    public String listarTodos(ArrayList<Float> al) {
        String s = "";
        for (int i=0;i<al.size();i++) {
            if(i==0) s+=al.get(i);
            else s+=", "+al.get(i);
        }
        return s;
    }

    public void vaciarLista(ArrayList<Float> al) {
        al.clear();
        System.out.println("Se ha borrado el contenido del ArrayList");
    }

    public static void main(String[] args) {
        new Aplicacion().inicio();
    }

}
