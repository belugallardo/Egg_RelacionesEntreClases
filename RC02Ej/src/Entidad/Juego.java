/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author belugallardo
 */
public class Juego {
    private ArrayList<Jugador> listaJugadores;
    private RevolverDeAgua revolver;

    public Juego(ArrayList<Jugador> listaJugadores, RevolverDeAgua revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
    
    
}
