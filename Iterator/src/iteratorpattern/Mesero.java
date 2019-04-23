package iteratorpattern;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Clase que controlara al mesero
 * @author josel
 */
public class Mesero {
    MenuArray menuArray = new MenuArray();
    MenuItem[] menuArrayItems = menuArray.getMenu();

    MenuArrayList menuArrayList = new MenuArrayList();
    ArrayList menuArrayListItems = menuArrayList.getMenu();

    CafeMenu menuHashtable = new CafeMenu();
    Hashtable menuHashtableItems = menuHashtable.getItems();


    /**
     * Imprime el menu de Array
     */
    public void imprimeMenuArray() {

        for (int i = 0; i < menuArrayItems.length; i++) {
            System.out.println(menuArrayItems[i]);
        }
    }

    public void imprimeMenuArrayList(){
            System.out.println(menuArrayListItems);

    }

    public void imprimeMenuHashtable(){
      System.out.println(menuHashtableItems.values());
    }

}
