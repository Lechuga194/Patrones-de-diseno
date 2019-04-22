package proxy;

/**
 * Interfaz que maneja a cajero y cajero proxy
 */
public interface InterfazCajero {

    /**
     * Metodo que recibe un numero de cuenta y un monto a retirar
     * @param cliente
     * @param monto
     */
    void retirarDinero(Cliente cliente, double monto);
}
