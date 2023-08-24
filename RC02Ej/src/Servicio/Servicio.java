/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class Servicio {

    RevolverDeAgua revolver;
    ArrayList<Jugador> listaJugadores = new ArrayList();
    Scanner leer = new Scanner(System.in);

    private void llenarRevolver() {
        revolver = new RevolverDeAgua();
        Random random = new Random();
        revolver.setPosicionActual(0);
        revolver.setPosicionAgua(random.nextInt(6) + 1);
    }

    private boolean mojar() {
        return revolver.getPosicionActual() == revolver.getPosicionAgua();
    }

    private void siguienteChorro() {
        
        int posicion = revolver.getPosicionActual();
        revolver.setPosicionActual(posicion + 1);
    }

    private void cargarJugadores() {
        System.out.println("Ingrese la cantidad de Jugadores entre 1 y 6");
        int cantJugadores = leer.nextInt();
        leer.nextLine();
        if (cantJugadores <= 6) {
            for (int i = 0; i < cantJugadores; i++) {
                Jugador jugador = new Jugador();
                jugador.setId(i + 1);
                jugador.setNombre("Jugador " + jugador.getId());
                jugador.setMojado(false);
                listaJugadores.add(jugador);
            }
        } else {
            for (int i = 0; i < 6; i++) {
                Jugador jugador = new Jugador();
                jugador.setId(i + 1);
                jugador.setMojado(false);
                listaJugadores.add(jugador);
            }

        }

    }

    private boolean disparo() {
        boolean esMojado = mojar();
        if (esMojado) {
            System.out.println("Te mojaste");
            return true;
        } else {
            System.out.println("No te mojaste");
            siguienteChorro();
            return false;
        }
    }

    public void llenarJuego() {
        llenarRevolver();
        cargarJugadores();
        Juego juego = new Juego();

        juego.setListaJugadores(listaJugadores);
        juego.setRevolver(revolver);

    }

    public void ronda() {

        boolean disparo = false;
        do{
        for (Jugador jugador : listaJugadores) {
            disparo = disparo();
            jugador.setMojado(disparo);
            if (disparo) {
                break;
            }
        }
        }while(!disparo);        

        for (Jugador jugador : listaJugadores) {
            if (jugador.isMojado()) {
                System.out.println("El jugador que se mojó es: " + jugador.toString());

            }
        }

    }

}
