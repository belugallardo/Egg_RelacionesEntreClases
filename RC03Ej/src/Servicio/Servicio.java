/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Carta;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class Servicio {

    ArrayList<Carta> baraja = new ArrayList();
    ArrayList<Carta> monton = new ArrayList();
    private Iterator<Carta> iterador;
    private int contador = 0;
    private int cartasDisponibles = 40;
    Scanner leer = new Scanner(System.in);

    public void crearBaraja() {

        for (Palo aux : Palo.values()) {
            String palo = aux.name();
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Carta carta = new Carta();
                    carta.setNumero(i);
                    carta.setPalo(palo);
                    baraja.add(carta);
                }
            }
        }
    }

    public void barajar() {
        ArrayList<Carta> barajaLista = new ArrayList(baraja);
        Collections.shuffle(barajaLista);
        baraja = new ArrayList(barajaLista);
    }

    public void iniciarIterador() {
        iterador = baraja.iterator();
    }

    public Carta siguienteCarta() {
        contador++;
        cartasDisponibles--;
        if (iterador.hasNext()) {
            Carta carta = iterador.next();
            monton.add(carta);
            System.out.println("La carta es " + carta.toString());
            return carta;
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }

    }

    public void cartasDisponibles() {

        System.out.println("Cartas Disponibles: " + cartasDisponibles);
    }

    public void darCartas() {
        System.out.println("¿Cuantas cartas desea?");
        int cantCartas = leer.nextInt();
        leer.nextLine();

        if (cartasDisponibles >= cantCartas) {
            contador += cantCartas;
            cartasDisponibles -= cantCartas;
            for (int i = 0; i < cantCartas; i++) {
                Carta carta = iterador.next();
                monton.add(carta);
                System.out.println("La carta es " + carta.toString());
            }
        } else {
            System.out.println("No hay suficientes cartas");
        }

    }

    public void cartasMonton() {
        for (Carta carta : monton) {
            System.out.println(carta.toString());
        }

    }
    /*mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/
    public void mostrarBaraja(){
        for (Carta carta : baraja) {
            if(!monton.contains(carta)){
                System.out.println(carta.toString());
            }
            
        }
    }
}
