package compositepattern;

/**
 * Clase main
 * @author josel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraSimple a = new FiguraSimple();
        
        FiguraCompleja c0 = new FiguraCompleja();
        FiguraCompleja c1 = new FiguraCompleja();
        FiguraCompleja c2 = new FiguraCompleja();
        FiguraCompleja c3 = new FiguraCompleja();
        FiguraCompleja c4 = new FiguraCompleja();
        FiguraCompleja c5 = new FiguraCompleja();
        FiguraCompleja c6 = new FiguraCompleja();
        
        
        c1.agregarFiguraSimple(a);

        c2.agregarFiguraSimple(a);
        c2.agregarFiguraSimple(a);
        
        c3.agregarFiguraSimple(a);
        c3.agregarFiguraSimple(a);
        c3.agregarFiguraSimple(a);
        
        c4.agregarFiguraSimple(a);
        c4.agregarFiguraSimple(a);
        c4.agregarFiguraSimple(a);
        c4.agregarFiguraSimple(a);
        
        c5.agregarFiguraSimple(a); 
        c5.agregarFiguraSimple(a);
        c5.agregarFiguraSimple(a);
        c5.agregarFiguraSimple(a);
        c5.agregarFiguraSimple(a);
        
        c6.agregarFiguraSimple(a);
        c6.agregarFiguraSimple(a); 
        c6.agregarFiguraSimple(a);
        c6.agregarFiguraSimple(a);
        c6.agregarFiguraSimple(a);
        c6.agregarFiguraSimple(a);

        
        c0.getInformacionFigura();
        c1.getInformacionFigura();
        c2.getInformacionFigura();
        c3.getInformacionFigura();
        c4.getInformacionFigura();
        c5.getInformacionFigura();
        c6.getInformacionFigura();
        
    }
    
}
