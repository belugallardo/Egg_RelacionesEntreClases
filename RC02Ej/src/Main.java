
import Servicio.Servicio;

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
        
        servicio.llenarJuego();
        servicio.ronda();
    }
    
}
