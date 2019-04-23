package iteratorpattern;

/**
 * Interfaz que manejara los dos tipos de iteradores
 * @author josel
 */
public interface Iterador {
    
    /**
     * Metodo para saber si se tiene un siguiente elemento
     * @return siguiente elemento
     */
    public boolean hasNext();
    
    /**
     * Metodo para tomar el siguiente elemento
     * @return 
     */
    public Object next();
    
}
