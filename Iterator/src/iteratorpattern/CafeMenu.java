package iteratorpattern;

import java.util.Iterator;
import java.util.Hashtable;

public class CafeMenu{
  Hashtable menuItems = new Hashtable();

  public CafeMenu(){
    addItem("Hamburguesa vegetariana y papas fritas", "Hamburguesa de carne vegetariana con lechuga, tomate y papas fritas", 10, true);
    addItem("Cafe americano", "Cafe americano sencillo con azucar al gusto, acompañado con un trozo de pastel de zanahoria", 20, true);
    addItem("Burrito", "Burrito con carne, frijoles y huacamole", 12, false);
  }

  public void addItem(String nombre, String descripcion, int precio, boolean esVegano){
    MenuItem menuItem = new MenuItem(nombre, descripcion, precio, esVegano);
    menuItems.put(menuItem.getNombre(), menuItem);
  }

  public Hashtable getItems(){
    return menuItems;
  }
}
