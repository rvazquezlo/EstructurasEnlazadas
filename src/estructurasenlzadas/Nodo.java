/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasenlzadas;

/**
 *
 * @author hca
 */
public class Nodo <T>{
    private T dato;
    private Nodo<T> direccion;
    
    public Nodo(){
        direccion = null;
    }
    
    public Nodo(T dato){
        this();
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getDireccion() {
        return direccion;
    }

    public void setDireccion(Nodo<T> direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + ", direccion=" + direccion + '}';
    }
    
}
