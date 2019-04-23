package iteratorpattern;

import java.util.ArrayList;

/**
 * Clase para el segundo menu (ArrayList)
 * @author josel
 */
public class MenuArrayList{
   ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
   
   
   /**
    * constructor
    */
   public MenuArrayList(){
       MenuItem a = new MenuItem("pastel", "Pastelito de chocolate", 100, false);
       MenuItem b = new MenuItem("Helado", "Helado de sabores", 20, false);
       MenuItem c = new MenuItem("Crepa", "Boneless pizza", 50, false);
       this.agregarAlMenu(a, b, c);
   }
   
   /**
    * Metodo que agrega exactamente tres platillos al menu
    * @param a
    * @param b
    * @param c 
    */
   public void agregarAlMenu(MenuItem a, MenuItem b, MenuItem c){
       menuItems.add(a);
       menuItems.add(b);
       menuItems.add(c);
   }
   
   /**
     * Metodo que regresa el menu
     * @return 
     */
    public ArrayList<MenuItem> getMenu(){
        return menuItems;
    }
    
}
