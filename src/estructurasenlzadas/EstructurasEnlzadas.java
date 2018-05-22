/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasenlzadas;

/**
 *
 * @author Regina Vazquez
 */
public class EstructurasEnlzadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> estructura;
        
        estructura = new LinkedList();
        
        //Vacia
        System.out.println("true: " + estructura.isEmpty());
        System.out.println("nada: " + estructura.toString());
        
        estructura.addTail(3);
        System.out.println("3: " + estructura.toString());
        
        estructura.addHead(1);
        System.out.println("1, 3: " + estructura.toString());
        
        estructura.addHead(3);
        System.out.println("3, 1, 3: " + estructura.toString());
        
        estructura.addTail(3);
        System.out.println("3, 1, 3, 3: " + estructura.toString());
        
        System.out.println("true: " + estructura.insertaAntesQue(3, 2));
        System.out.println("2, 3, 1, 3, 3: " + estructura.toString());
        
        estructura.addTail(4);
        System.out.println("2, 3, 1, 3, 3, 4: " + estructura.toString());
        
        System.out.println("true: " + estructura.insertaAntesQue(4, 5));
        System.out.println("2, 3, 1, 3, 3, 5, 4: " + estructura.toString());
        
        System.out.println("true: " + estructura.insertaAntesQue(1, 7));
        System.out.println("2, 3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
        
        System.out.println("false: " + estructura.insertaAntesQue(8, 5));
        System.out.println("2, 3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
        
        System.out.println("false: " + estructura.insertaAntesQue(null, 5));
        System.out.println("2, 3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
        
        System.out.println("false: " + estructura.insertaAntesQue(8, null));
        System.out.println("2, 3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
        
        System.out.println("false: " + estructura.insertaAntesQue(null, null));
        System.out.println("2, 3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
        
//        estructura = new LinkedList();
//        estructura.addHead(8);
//        
//        System.out.println("\n\ntrue: " + estructura.insertaAntesQue(8, 5));
//        System.out.println("5, 8: " + estructura.toString());

        System.out.println("2: " + estructura.removeFirst());
        System.out.println("3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
        
        System.out.println("4: " + estructura.removeLast());
        System.out.println("3, 7, 1, 3, 3, 5: " + estructura.toString());
        
        estructura.addTail(4);
        System.out.println("3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
        
        System.out.println("7: " + estructura.busca(7));
        System.out.println("7: " + estructura.buscaRecursiva(7));
        
        System.out.println("3: " + estructura.busca(3));
        System.out.println("3: " + estructura.buscaRecursiva(3));
        
        System.out.println("4: " + estructura.busca(4));
        System.out.println("4: " + estructura.buscaRecursiva(4));
        
        System.out.println("null: " + estructura.busca(9));
        System.out.println("null: " + estructura.buscaRecursiva(9));
        
//        estructura = new LinkedList();
        System.out.println("null: " + estructura.busca(3));
        System.out.println("null: " + estructura.buscaRecursiva(3));
        
        //Probado
//        System.out.println("\nPrueba remove:");
//        
//        System.out.println("null: " + estructura.remove(2));
//        System.out.println("3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
//        
//        System.out.println("3: " + estructura.remove(3));
//        System.out.println("7, 1, 3, 3, 5, 4: " + estructura.toString());
//        
//        System.out.println("4: " + estructura.remove(4));
//        System.out.println("7, 1, 3, 3, 5: " + estructura.toString());
//        
//        System.out.println("1: " + estructura.remove(1));
//        System.out.println("7, 3, 3, 5: " + estructura.toString());
//        
//        System.out.println("7: " + estructura.remove(7));
//        System.out.println("3, 3, 5: " + estructura.toString());
//        
//        estructura = new LinkedList();
//        
//        System.out.println("null: " + estructura.remove(7));
//        System.out.println("vacia: " + estructura.toString());


        //Probado
//        System.out.println("false: " + estructura.eliminaAnteriorA(3));
//        System.out.println("3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
//        
//        System.out.println("true: " + estructura.eliminaAnteriorA(4));
//        System.out.println("3, 7, 1, 3, 3, 4: " + estructura.toString());
//        
//        System.out.println("true: " + estructura.eliminaAnteriorA(7));
//        System.out.println("7, 1, 3, 3, 4: " + estructura.toString());
//        
//        System.out.println("true: " + estructura.eliminaAnteriorA(1));
//        System.out.println("1, 3, 3, 4: " + estructura.toString());
//        
//        System.out.println("false: " + estructura.eliminaAnteriorA(9));
//        System.out.println("1, 3, 3, 4: " + estructura.toString());
//        
//        System.out.println("false: " + estructura.eliminaAnteriorA(null));
//        System.out.println("1, 3, 3, 4: " + estructura.toString());
        
        //Probado
//        System.out.println("\nPrueba eliminaSiguienteDe:");
//        
//        System.out.println("false: " + estructura.eliminaSiguienteDe(4));
//        System.out.println("3, 7, 1, 3, 3, 5, 4: " + estructura.toString());
//        
//        System.out.println("true: " + estructura.eliminaSiguienteDe(3));
//        System.out.println("3, 1, 3, 3, 5, 4: " + estructura.toString());
//        
//        System.out.println("true: " + estructura.eliminaSiguienteDe(5));
//        System.out.println("3, 1, 3, 3, 5: " + estructura.toString());
//        
//        System.out.println("true: " + estructura.eliminaSiguienteDe(3));
//        System.out.println("3, 3, 3, 5: " + estructura.toString());
//        
//        System.out.println("false: " + estructura.eliminaSiguienteDe(9));
//        System.out.println("3, 3, 3, 5: " + estructura.toString());
//        
//        estructura = new LinkedList();
//        
//        System.out.println("false: " + estructura.eliminaSiguienteDe(9));
//        System.out.println("vacia: " + estructura.toString());
//        
//        estructura.addTail(8);
//        
//        System.out.println("false: " + estructura.eliminaSiguienteDe(8));
//        System.out.println("8: " + estructura.toString());

        System.out.println("\nPrueba eliminaRepetidos:");
        
        System.out.println("1: " + estructura.eliminaTodosRepetidosOrdenado());
        System.out.println("3, 7, 1, 3, 5, 4: " + estructura.toString());
        
        estructura.addHead(4);
        estructura.addHead(4);
        estructura.addHead(2);
        estructura.insertaAntesQue(1, 2);
        estructura.insertaAntesQue(1, 1);
        estructura.addTail(8);
        estructura.insertaAntesQue(8, 8);
        estructura.insertaAntesQue(8, 5);
        System.out.println("2, 4, 4, 3, 7, 2, 1, 1, 3, 5, 4, 5, 8, 8: " + estructura.toString());
        
        System.out.println("3: " + estructura.eliminaTodosRepetidosOrdenado());
        System.out.println("2, 4, 3, 7, 2, 1, 3, 5, 4, 5, 8: " + estructura.toString());
        
        
        System.out.println("0: " + estructura.eliminaTodosRepetidosOrdenado());
        System.out.println("2, 4, 3, 7, 2, 1, 3, 5, 4, 5, 8: " + estructura.toString());
        
//        estructura = new LinkedList();
//        System.out.println("0: " + estructura.eliminaTodosRepetidosOrdenado());
//        System.out.println("vacia: " + estructura.toString());

        System.out.println("4: " + estructura.eliminaTodosRepetidosDesordenado());
        System.out.println("2, 4, 3, 7, 1, 5, 8: " + estructura.toString());
        
        estructura.addHead(8);
        System.out.println("1: " + estructura.eliminaTodosRepetidosDesordenado());
        System.out.println("8, 2, 4, 3, 7, 1, 5: " + estructura.toString());
        
        System.out.println("0: " + estructura.eliminaTodosRepetidosDesordenado());
        System.out.println("8, 2, 4, 3, 7, 1, 5: " + estructura.toString());
        
        estructura = new LinkedList();
        System.out.println("0: " + estructura.eliminaTodosRepetidosDesordenado());
        System.out.println("vacio: " + estructura.toString());
    }
    
}
