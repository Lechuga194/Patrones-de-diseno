public class Cliente {

    public int cuenta;
    public int nip;
    public double saldo;

    /**
     * Constructor que recibe cuenta, nip y saldo
     * @param cuenta
     * @param nip
     * @param saldo
     */
    public Cliente(int cuenta, int nip, double saldo){
        this.cuenta = cuenta;
        this.nip = nip;
        this.saldo = saldo;
    }

    /**
     * Metodo que regresa el numero de cuenta de un usuario
     * @return
     */
    public int getCuenta(){
        return cuenta;
    }

    /**
     * Metodo que regresa el nip del usuario
     * @return
     */
    public int getNip(){
        return nip;
    }

    /**
     * Metodo que regresa el saldo de un usuario
     * @return
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     * Metodo que modifica el saldo de un usaurio
     * @param saldo
     */
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
