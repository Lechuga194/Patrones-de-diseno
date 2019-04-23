package iteratorpattern;


/**
 * Clase main para probar el codigo
 * @author josel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //"Simulacion" del mismo mesero que puede acceder a ambos menu
        Mesero a = new Mesero();
        a.imprimeMenuArray();
        a.imprimeMenuArrayList();
        a.imprimeMenuHashtable();


    }

}
