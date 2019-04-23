package compositepattern;

/**
 * Clase que implementa figura geometrica y se encarga de manejar las figuras simples (lineas)
 * @author josel
 */
public class FiguraSimple implements FiguraGeometrica{

    /**
     * Metodo que recoge la informacion de una figura
     */
    @Override
    public void getInformacionFigura() {
        System.out.println("|");
    }
    
    
    
}
