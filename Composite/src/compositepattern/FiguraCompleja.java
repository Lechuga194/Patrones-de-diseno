package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que maneja a las figuras complejas 
 * @author josel
 */
public class FiguraCompleja implements FiguraGeometrica{
    
    String nombre;
    List<FiguraSimple> componentes = new ArrayList<FiguraSimple>();
    
    /**
     * Metodo para añadir una figura simple al ArrayList componentes
     * @param linea 
     */
    public void agregarFiguraSimple(FiguraSimple linea){
        componentes.add(linea);
    }

    /**
     * Metodo que recoge e imprime la informacion de una figura
     */
    @Override
    public void getInformacionFigura() { 
        Iterator<FiguraSimple> componenteIterador = componentes.iterator();
        if(componentes.size() > 0 && componentes.size() != 2){
            while(componenteIterador.hasNext()){
                componenteIterador.next().getInformacionFigura();
            }
            System.out.println("La figura tiene " + componentes.size() + " lados y su nombre es " + getNombre()
                    + "\n---------------------");
        }else{
            System.out.println("No pueden existir Figuras complejas sin figuras simples o una figura compleja solo con dos simples"
                    + "\n---------------------");
        }
    }
    
    /**
     * Metodo que se encarga de asignarle el nombre a una figura
     */
    public void setNombre(){  
       switch (componentes.size()){
           case 1:
               nombre = "Linea";
               break;
           case 3:
               nombre = "Triangulo";
               break;
           case 4:
               nombre = "Rectangulo";
               break;
           case 5: 
               nombre = "Pentagono";
               break;
           default:
               nombre = "poligono";
               break;
       }
    }
    
    /**
     * Metodo que regresa el nombre de la figura
     * @return nombre
     */
    public String getNombre(){
        setNombre();
        return nombre;
    }
    
}
