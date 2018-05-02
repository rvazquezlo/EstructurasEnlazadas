/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import java.util.Iterator;

/**
 *
 * @author Regina
 */
public class Conjuntos {
    
    /**
     * Generar una cadena con los nombres de todos los alumnos que 
     * dominan inglés y francés
     * @return 
     */
    public static String encuentraAlumnosinglesYFrances(ConjuntoADT<String> ingles, ConjuntoADT<String> frances){
        return ingles.interseccion(frances).toString();
    }
    
    /**
     * Obtener el total de alumnos que sólo dominan inglés
     * @return 
     */
    public static int encuentraSoloIngles(ConjuntoADT<String> ingles, ConjuntoADT<String> frances, ConjuntoADT<String> otro){
        ConjuntoADT<String> soloInglesConjunto;
        Iterator<String> iterador;
        int soloIngles;
        
        soloInglesConjunto = ingles.diferencia(frances).diferencia(otro);
        iterador = soloInglesConjunto.iterator();
        soloIngles = 0;
        while(iterador.hasNext()){
            soloIngles++;
            iterador.next();
        }
        return soloIngles;    
    }
    
    /**
     * cadena con los nombres de los alumnos que dominan, al menos, 3 idiomas
     * @return 
     */
    public static String encuentraTresIdiomas(ConjuntoADT<String> ingles, ConjuntoADT<String> frances, ConjuntoADT<String> otro){
        return ingles.interseccion(frances).interseccion(otro).toString();
        
    }

    public static<T> void imprimeConjunto(ConjuntoADT<T> conjunto){
        Iterator<T> iterador;
        
        iterador = conjunto.iterator();
        System.out.println();
        while(iterador.hasNext())
            System.out.print(iterador.next() + " ");   
    }
    
    public static<T> boolean equals(ConjuntoADT<T> conjunto1, ConjuntoADT<T> conjunto2){
        boolean iguales;
        int cardinalidad1;
        
        iguales = false;
        if(conjunto1 == conjunto2)
            iguales = true;
        else if(conjunto1 != null && conjunto2 != null){
            cardinalidad1 = conjunto1.getCardinalidad();
            if(cardinalidad1 == conjunto2.getCardinalidad())
                if(conjunto2.interseccion(conjunto1).getCardinalidad() == cardinalidad1)
                    iguales = true;        
        }// end outter-if
        return iguales;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tiene que ser ADT porque los metodos esperan un conjunto ADT, no A
//        ConjuntoADT<Integer> c1 = new ConjuntoA<Integer>();
//        ConjuntoADT<Integer> c2 = new ConjuntoA<Integer>();
//        ConjuntoADT<Integer> interseccion;
//        ConjuntoADT<Integer> union, diferencia;
//        int i;
//        
//        for(i = 0; i < 20; i++)
//            c1.add(i);
//        for(i = 10; i < 30; i++)
//            c2.add(i);
//        
//        interseccion = c1.interseccion(c2);
//        union = c1.union(c2);
//        diferencia = c1.diferencia(c2);
//        
//        imprimeConjunto(c1);
//        imprimeConjunto(c2);
//        imprimeConjunto(union);
//        imprimeConjunto(interseccion);
//        imprimeConjunto(diferencia);
//        
//        
//        //Pruebas Escuela
//        Escuela escuela;
//        
//        escuela = new Escuela();
//        System.out.println(escuela.altaAlumno("Regina", true, true, 10, 20));
//        System.out.println(escuela.altaAlumno("Mirko", false, true, 10, 19));
//        System.out.println(escuela.altaAlumno("Fer", true, false, 9.3, 19));
//        System.out.println(escuela.altaAlumno("enrique", false, true, 7.3, 20));
//        System.out.println(escuela.altaAlumno("MAriana", false, true, 7.8, 21));
//        System.out.println(escuela.altaAlumno("MAria", true, false, 8.1, 19));
//        System.out.println(escuela.altaAlumno("Carlos", true, false, 9.7, 17));
//        System.out.println(escuela.altaAlumno("Regina", false, false, 10, 20));
//        
////        System.out.println(escuela.bajaAlumno(-1));
////        System.out.println(escuela.bajaAlumno(3));
//
//        System.out.println(escuela.regresaTodosLosAlumnos());
//        System.out.println(escuela.regresaAlumnosIngLic());
//        System.out.println(escuela.regresaAlumnosIngOLic());
//        System.out.println(escuela.calculaPromedioIngenieria());
//        System.out.println(escuela.calculaAlumnosMayoresLicenciatura(18));
//        
//        
        ///
        ConjuntoADT<String> frances, ingles, otros;
        
        frances = new ConjuntoA<String>();
        frances.add("Eugenio");
        frances.add("Paulina");
        frances.add("Regina");
        frances.add("Valentina");
        ingles = new ConjuntoA<String>();
        ingles.add("Paulina");
        ingles.add("Eugenio");
        ingles.add("Regina");
        ingles.add("Pablo");
        ingles.add("Valentina");
        ingles.add("Claudia");
        ingles.add("Carlos");
        otros = new ConjuntoA<String>();
        otros.add("Valentina");
        otros.add("Pablo");
        System.out.println(encuentraAlumnosinglesYFrances(ingles, frances));
        System.out.println(encuentraSoloIngles(ingles, frances, otros));
        System.out.println(encuentraTresIdiomas(ingles, frances, otros));
        
        
        
        System.out.println();
        
        
        
    }
    
}
