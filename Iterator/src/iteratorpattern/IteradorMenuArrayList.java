package iteratorpattern;

import java.util.ArrayList;

/**
 * Clase que maneja el iterador para el menu de ArrayList
 * @author josel
 */
public class IteradorMenuArrayList implements Iterador{

    int indice = 0;
    private final ArrayList<MenuItem> menu;
    
    /**
     * Constructor para el menu ArrayList que recibe un Arraylist de MenuItem
     * @param menu 
     */
    IteradorMenuArrayList(ArrayList<MenuItem> menu){
        this.menu = menu;
        
    }
    
    /**
     * Metodo que regresa si el ArrayList tiene un elemento siguiente
     * @return 
     */
    @Override
    public boolean hasNext() {
        if(indice < menu.size())
            return true;          
        return false;
    }

    /**
     * Metodo que selecciona el objeto del arraylist
     * @return 
     */
    @Override
    public Object next() {
        MenuItem menuItem = menu.get(indice);
        indice += 1;
        return menuItem;

    }
    
}
