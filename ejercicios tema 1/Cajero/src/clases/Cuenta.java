package clases;

public class Cuenta {

    //atributos
    private int id;
    private int pin;
    private Persona titular;
    private float saldo;

    //constructores
    public Cuenta(int id, int pin, Persona titular) {
        this.id = id;
        this.pin = pin;
        this.titular = titular;
    }

    //metodos
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void ingresarSaldo(float saldo, Cuenta cuenta) {
        cuenta.setSaldo(getSaldo()+saldo);
        System.out.println("Ha ingresado "+saldo);
    }

    public void sacarDinero(float saldo, Cuenta cuenta) {
        if(this.saldo-saldo > 0) {
            cuenta.setSaldo(getSaldo() - saldo);
            System.out.println("Operacion realizada. Le queda " + getSaldo());
        } else {
            System.out.println("No se puede realizar la operacion, introduzca un cantidad menor o igual a "+getSaldo());
        }
    }

    public float consultarSaldo() {
        return getSaldo();
    }
}
