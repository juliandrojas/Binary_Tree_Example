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
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo raiz = new Nodo("F");
        Nodo nodo2 = new Nodo("A");
        Nodo nodo3 = new Nodo("G");
        
        raiz.setIzquierda(nodo2);
        nodo2.setIzquierda(new Nodo("B"));
        
        Nodo nodo4 = new Nodo("D");
        nodo2.setDerecha(nodo4);
        
        nodo4.setIzquierda(new Nodo("C"));
        nodo4.setDerecha(new Nodo("E"));
        
        raiz.setDerecha(nodo3);
        
        Nodo nodo5 = new Nodo("I");
        nodo3.setDerecha(nodo5);
        
        nodo5.setIzquierda(new Nodo("H"));
        
        //EJECUTAR RESULTADOS EN PRE ORDEN
        System.out.println("Pre orden: ");
        preOrden(raiz);
        
        //EJECUTAR RESULTADOS EN IN ORDEN
        System.out.println("In orden: ");
        inOrden(raiz);
        
        //EJECUTAR RESULTADOS EN POST ORDEN
        System.out.println("Post orden: ");
        postOrden(raiz);
    }
    public static void preOrden(Nodo raiz){
        if(raiz != null){
            System.out.println(raiz.getDato());//RAÍZ
            preOrden(raiz.getIzquierda());//IZQUIERDA
            preOrden(raiz.getDerecha());//DERECHA
        }
    }
    public static void inOrden(Nodo raiz){
        if(raiz != null){
            inOrden(raiz.getIzquierda());//IZQUIERDA
            System.out.println(raiz.getDato());//RAÍZ
            inOrden(raiz.getDerecha());//DERECHA
        }
    }
    public static void postOrden(Nodo raiz){
        if(raiz != null){
            postOrden(raiz.getIzquierda());//IZQUIERDA
            postOrden(raiz.getDerecha());//DERECHA
            System.out.println(raiz.getDato());//RAÍZ
        }
    }
}
