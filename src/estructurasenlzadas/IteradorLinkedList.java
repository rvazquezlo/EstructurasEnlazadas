/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasenlzadas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author hca
 */
public class IteradorLinkedList<T> implements Iterator <T>{
    private Nodo<T> actual;
    
    public IteradorLinkedList(Nodo<T> inicio){
        actual = inicio;
    }
    
    public boolean hasNext(){
        return actual != null;
    }
    
    public T next(){
        T dato;
        
        if(hasNext()){
            dato = actual.getDato();
            actual = actual.getDireccion();
            return dato;
        }
        throw new NoSuchElementException();
    }
}
