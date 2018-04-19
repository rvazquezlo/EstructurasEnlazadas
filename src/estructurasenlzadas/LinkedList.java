/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasenlzadas;

import java.util.Iterator;

/**
 *
 * @author hca
 */
public class LinkedList<T> implements Iterable<T>{
    private Nodo<T> inicio; //el primer nodo de a lista
    private Nodo<T> fin; //el ultimo nodo de la lista
    
    /**
     * Constructor vacio asigna null a los dos atributos
     */
    public LinkedList(){
        inicio = null;
        fin = null;
    }
    
    /**
     * Determina si la lista esta vacia
     * @return: true if list is empty
     */
    public boolean isEmpty(){
        return inicio == null; 
    }
   
    /**
     * Agrega un dato a inicio 
     * @param dato: que se quiere agregar 
     */
    public void addHead(T dato){
        Nodo<T> nuevo;
        
        nuevo = new Nodo(dato);
        if(isEmpty())
            fin = nuevo;
        nuevo.setDireccion(inicio);
        inicio = nuevo;
    }
    
    /**
     * Agrega un dato al final 
     * @param dato: que se quiere agregar 
     */
    public void addTail(T dato){
        Nodo<T> nuevo;
        
        nuevo = new Nodo(dato);
        if(isEmpty())
            inicio = nuevo;
        else
            fin.setDireccion(nuevo);
        fin = nuevo;
    }
    
    public Iterator<T> iterator(){
        return new IteradorLinkedList(inicio);
    }
    
    /**
     * Elimna el primer elemento de la estructura
     * @return: el elemento quitado. Si no habia elemento, regresa null 
     */
    public T removeHead(){
        T removed;
        Nodo<T> auxiliar;
        
        removed = null;
        if(!isEmpty()){
            removed = inicio.getDato();
            auxiliar = inicio;
            if(inicio == fin)//solo hay un dato;
                fin = null;
            inicio = inicio.getDireccion();
            auxiliar.setDireccion(null);
        }
        return removed;
    }
    
//    toString alternativo    
//    public String toString(){
//        StringBuilder sb;
//        Nodo<T> auxiliar;
//        
//        sb = new StringBuilder();
//        auxiliar = inicio;
//        while(auxiliar != null){
//          sb.append(auxiliar.getDato());
//          auxiliar = auxiliar.getDireccion();
//        }
//        return sb.toString();    
//    }
    
    /**
     * Metodo auxiliar, recursivo de toString
     * @param auxiliar: auxiliar que se mueve de elemento a elemento
     * @param sb
     * @return 
     */
    private String toString(Nodo<T> auxiliar, StringBuilder sb){
        if(auxiliar == null)
            return sb.toString();
        else{
            sb.append(auxiliar.getDato() + "\n");
            return toString(auxiliar.getDireccion(), sb);
        }
    }
    
    /** 
     * @return: los elementos de la estructura en froma de cadena
     * @see private String toString(Nodo<T> auxiliar, StringBuilder sb)
     */
    public String toString(){
        StringBuilder sb;
        Nodo<T> auxiliar;
        
        sb = new StringBuilder();
        auxiliar = inicio;
        sb.append("Elementos de la lista: \n");
        return toString(auxiliar, sb);
    }
     
     
}
