
import Servicio.Servicio;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author belugallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio servicio = new Servicio();
        int opcion;
        Scanner leer = new Scanner(System.in);

        servicio.crearBaraja();
        servicio.barajar();
        servicio.iniciarIterador();
        System.out.println("Nuevo juego");

        do {
            menu();
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    servicio.siguienteCarta();
                    break;
                case 2: 
                    servicio.cartasDisponibles();
                    break;
                case 3: 
                    servicio.darCartas();
                    break;
                case 4:
                    servicio.cartasMonton();
                    break;
                case 5: 
                    servicio.mostrarBaraja();
                    break;
                case 6: 
                    System.out.println("salida exitosa");
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
                    
            }

        }while(opcion != 6);
    }
    
    

    public static void menu() {
        System.out.println("Elija la opción deseada\n"
                + "1 - siguiente carta\n"
                + "2 - cartas disponibles\n"
                + "3 - dar cartas\n"
                + "4 - cartas monton\n"
                + "5 - mostrar baraja\n"
                + "6 - salir");
    }

}
