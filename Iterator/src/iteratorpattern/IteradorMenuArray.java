package iteratorpattern;

/**
 * Clase que maneja el iterador para el menu de Array
 * @author josel
 */
public class IteradorMenuArray implements Iterador {
    
    int indice = 0;
    MenuItem[] menu;

    /**
     * Constructor que recibe un arreglo del tipo MenuItem
     * @param menu 
     */
    public IteradorMenuArray(MenuItem[] menu){
        this.menu = menu;
    }
    
    /**
     * Metodo para saber si el arreglo tiene un siguinte elemento
     * @return siguiente elemento
     */
    @Override
    public boolean hasNext() {
        if(indice < menu.length)
            return true;
        return false;
    }

    /**
     * Metodo para seleccionar el siguiente elemento del arreglo
     * @return objeto
     */
    @Override
    public Object next() {
        MenuItem menuItem = menu[indice];
        indice += 1;
        return menuItem;
    }
    
}
