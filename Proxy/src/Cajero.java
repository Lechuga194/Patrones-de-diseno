import java.io.Serializable;
import java.util.Hashtable;

public class Cajero implements Serializable, InterfazCajero {

    Hashtable<Integer, Cliente> clientes = new Hashtable<Integer, Cliente>();

    @Override
    public void retirarDinero(Cliente cliente, double monto) {
        if(cliente.getSaldo() >= monto){
            cliente.setSaldo(cliente.getSaldo()-monto);
            System.out.println("Retiro de: " + monto + " exitoso");
            return;
        }

        System.out.println("No cuentas con fondos suficientes");
    }

}
