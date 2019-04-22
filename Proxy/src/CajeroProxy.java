import java.io.Serializable;

public class CajeroProxy implements Serializable, InterfazCajero {

    private Cajero cajero;

    /**
     * Constructor de proxy que recibe un cajero real
     * @param cajero
     */
    public CajeroProxy(Cajero cajero){
        this.cajero = cajero;
    }

    @Override
    public void retirarDinero(Cliente cliente, double monto) {
        cajero.retirarDinero(cliente, monto);
    }
}
