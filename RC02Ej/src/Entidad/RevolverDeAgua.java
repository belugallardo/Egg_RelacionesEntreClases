/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.*/
/**
 *
 * @author belugallardo
 */
public class RevolverDeAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {

    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver: " + "\n"
                + "Posicion Actual: " + posicionActual + ",\n"
                + "Posición de Agua: " + posicionAgua ;
    }

}
