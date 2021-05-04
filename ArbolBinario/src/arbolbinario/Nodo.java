/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author ROJAS
 */
public class Nodo {
    /*
    En el video aparece NodoIzquierda y NodoDerecha
    pero yo los puse solamente como izquierda y derecha
    */
    public String dato;
    public Nodo izquierda;
    public Nodo derecha;

    public Nodo(String dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
}
