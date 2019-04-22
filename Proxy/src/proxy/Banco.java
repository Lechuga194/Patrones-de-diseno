package proxy;

import java.util.Hashtable;
import java.util.Scanner;

public class Banco {

    Scanner sc = new Scanner(System.in);
    Hashtable<Integer, Cliente> clientes = new Hashtable<Integer, Cliente>();
    Cajero cajero = new Cajero();
    CajeroProxy cajeroProxy = new CajeroProxy(cajero);
    int cuenta;
    int nip;
    double monto;
    Cliente dummy;


    /**
     * Metodo que ejecuta las operaciones del cajero
     */
    public void iniciaOperacion() {

        Cliente c1 = new Cliente(1, 1, 5000.00);
        Cliente c2 = new Cliente(2, 2, 6000.00);
        Cliente c3 = new Cliente(3, 3, 5.50);

        clientes.put(c1.getCuenta(), c1);
        clientes.put(c2.getCuenta(), c2);
        clientes.put(c3.getCuenta(), c3);

        System.out.println("Introduce tu numero de cuenta");
        cuenta = sc.nextInt();

        if (clientes.containsKey(cuenta)) {
            System.out.println("Introduce tu nip");
            nip = sc.nextInt();
            if (clientes.get(cuenta).getNip() == nip) {
                dummy = clientes.get(cuenta);
                System.out.println("Tu saldo es de: " + dummy.getSaldo() + " \nIntroduce la cantidad a retirar");
                monto = sc.nextDouble();
                cajeroProxy.retirarDinero(dummy, monto);
            } else {
                System.out.println("Pin incorrecto");
                this.iniciaOperacion();
            }
        } else {
            System.out.println("Numero de cuenta no encontrado");
            this.iniciaOperacion();
        }
    }
}
