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
    public T removeFirst(){
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
    
    public T removeLast(){
        Nodo<T> auxiliar;
        T removed;
        
        removed = null;
        if(!isEmpty()){
            auxiliar = inicio;
            removed = fin.getDato();
            if(auxiliar.getDireccion() == null){//solo hay un dato
                inicio = null;
                fin = null;
            }
            else{
                while(fin != auxiliar.getDireccion()){
                    auxiliar = auxiliar.getDireccion();
                }
                auxiliar.setDireccion(null);
                fin = null;
            }
        }
        return removed;
    }
    
    public T busca(T dato){
        Iterator<T> iterador;
       // encontrado;
        T encontrado, auxiliar;
        
        iterador = this.iterator();
        encontrado = null;
        while(iterador.hasNext() && encontrado == null){
            auxiliar = iterador.next();
            if(auxiliar.equals(dato))
                encontrado = auxiliar;
        }
        return encontrado;
    }
    
    public T buscaRecursiva(T dato){
        Nodo<T> auxiliar;
        T encontrado;
        
        encontrado = null;
        if(!isEmpty()){
            auxiliar = inicio;
            encontrado = buscaRecursiva(dato, auxiliar);
        }
        else
            encontrado = null;
        return encontrado;
    }
    
    private T buscaRecursiva(T dato, Nodo<T> auxiliar){
        if(auxiliar.getDato().equals(dato)){
            return auxiliar.getDato();
        }
        return buscaRecursiva(dato, auxiliar.getDireccion());
    }
    
    public T remove(T dato){
        Nodo<T> auxiliar;
        T removed;
        
        removed = null;
        if(!isEmpty()){
            auxiliar = inicio;
            if(auxiliar.getDireccion() == null){//solo hay un dato
                inicio = null;
                removed = fin.getDato();
                fin = null;
            }
            else{
                while(!auxiliar.getDireccion().equals(dato) || auxiliar.getDireccion() != null){
                    auxiliar = auxiliar.getDireccion();
                }
                if(auxiliar.getDireccion().equals(dato)){
                    removed = auxiliar.getDireccion().getDato();
                    auxiliar.getDireccion().setDato(null);
                    auxiliar.setDireccion(null);
                }
            }
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
