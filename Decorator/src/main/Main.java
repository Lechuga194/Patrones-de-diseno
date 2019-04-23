package main;

import decorator.Habitacion;
import decorator.HabitacionBasica;
import decorator.PlayaBasica;
import decorator.PlayaVIP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seleccion;
        Habitacion habitacionBasica = new HabitacionBasica();
        Habitacion playaBasica = new PlayaBasica(habitacionBasica);
        Habitacion playaVIP = new PlayaVIP(new PlayaBasica(habitacionBasica));

        do {
            System.out.println("Bienvenido al Hotel, selecciona la habitacion que deseas" +
                    "\n1 Habitacion Basica" +
                    "\n2 Habitacion en Playa" +
                    "\n3 Habitacion VIP en la playa" +
                    "\n4 Salir");
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1:
                    menu(habitacionBasica);
                    break;
                case 2:
                    menu(playaBasica);
                    break;
                case 3:
                    menu(playaVIP);
                    break;
                default:
                    System.out.println("Bye!");
            }
        } while (seleccion != 4);


    }

    public static void menu(Habitacion habitacion) {

        Scanner sc = new Scanner(System.in);
        int seleccion;

        System.out.println("Detalles de la habitacion: " +
                habitacion.getDescripcion() + " ¿Deseas reservar esta habitacion?" +
                "\n 1 si" +
                "\n 2 no");
        seleccion = sc.nextInt();

        if (seleccion == 1) {
            System.out.println("Introduce el numero de dias que deseas quedarte?");
            seleccion = sc.nextInt();

            String resumen = "El precio final es " + habitacion.getPrecio()*seleccion + " Gracias por hospedarte!, hasta pronto";
            String resumenPromo = "Eres elegible para la promocion! \nEl precio final de tu estancia es: " + habitacion.getPrecio() + " Gracias por hospedarte!, hasta luego.";

            if (habitacion instanceof HabitacionBasica) {
                if (seleccion == 5)
                    System.out.println(resumenPromo);
                else
                    System.out.println(resumen);
            } else if (habitacion instanceof PlayaBasica) {
                if (seleccion > 5)
                    System.out.println(resumenPromo);
                else
                    System.out.println(resumen);
            } else if (habitacion instanceof PlayaVIP) {
                if (seleccion > 4)
                    System.out.println(resumenPromo);
                else
                    System.out.println(resumen);
            }
        }
    }

}
