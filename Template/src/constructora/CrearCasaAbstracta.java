/*
 * Amaya Lopez Dulce,Lechuga Martinez Eduardo | Practica02 | Modelado y Programacion
 */
package constructora;

/**
 * Clase abstracta que actuara en el patron template
 * @since 1/9/18
 * @author Dulce - Eduardo
 */
public abstract class CrearCasaAbstracta {
    
    /**
     * Metodo Construir implementado en la calse abstracta que usara 
     * la implementacion de TipoCasa de las clases concretas
     */
    public void Construir(){
        System.out.println("¡Estamos construyendo tu nuevo hogar!");
        System.out.println("Su casa de " + this.getMaterial() + " esta lista!");
    }
    
    /**
     * Metodo que imprime en pantalla el ticket con el precio y mas detalles
     * su implementacion es aqui ya que usara a las clases concretas
     */
    public void Ticket(){
        System.out.println("-----------Constructora Lechuga------------");
        System.out.println("Material usado: " + this.getMaterial() + " " + this.getPrecio());
        System.out.println("Mano de obra:            MX/N 50,000");
        System.out.println("Cupon de descuento:      MX/N -50,000");
        System.out.println("Gran total:              " + this.getPrecio());
        System.out.println("-----------Gracias por su compra-----------");
    }
    
    /**
     * Metodo abstracto que heredaran las clases concretas
     * para conocer el material del que estan hechas
     * @return String material
     */
    public abstract String getMaterial();
    
    /**
     * Metodo abstracto que heredan las clases concretas
     * para conocer el pracio de la casa
     * @return String precio
     */
    public abstract String getPrecio();
}
