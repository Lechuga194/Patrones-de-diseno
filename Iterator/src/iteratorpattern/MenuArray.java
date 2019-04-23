package iteratorpattern;

/**
 * Clase para el menu del primer restaurante (Array)
 * @author josel
 */
public class MenuArray {
    
    MenuItem[] menuItems = new MenuItem[3];
    
    /**
     * Constructor
     */
    MenuArray(){
        MenuItem a = new MenuItem("Brocheta", "Carne en cubito", 10, false);
        MenuItem b = new MenuItem("Sushi", "Pescado crudo", 20, false);
        MenuItem c = new MenuItem("Sandwich", "emparedado de queso y jamon", 25, false);
        this.agregarAlMenu(a,b,c);
    }
    
    /**
     * Metodo que agrega al menu exactamente tres platillos al menu
     * @param a
     * @param b
     * @param c 
     */
    public void agregarAlMenu (MenuItem a, MenuItem b, MenuItem c){
        menuItems[0] = a;
        menuItems[1] = b;
        menuItems[2] = c;
    }
    
    /**
     * Metodo que regresa el menu
     * @return 
     */
    public MenuItem[] getMenu(){
        return menuItems;
    }

}
