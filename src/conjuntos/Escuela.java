/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Regina Vazquez
 */
public class Escuela {
    private String nombre;
    private String direccion;
    private ConjuntoADT<Alumno> ingenieria, licenciatura;

    public Escuela(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Escuela() {
        ingenieria = new ConjuntoA<Alumno>();
        licenciatura = new ConjuntoA<Alumno>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Escuela other = (Escuela) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    public String toString(){
        StringBuilder sb;
        Iterator<Alumno> iteradorIng, iteradorLic;
        
        sb = new StringBuilder();
        sb.append("Escuela: ");
        sb.append("\n\tNombre: " + nombre);
        sb.append("\n\tDireccion" + direccion);
        sb.append("\n\tAlumnos ingenieria:");
        sb.append("\n\t\t" + ingenieria.toString());
        sb.append("\n\tAlumnos licenciatura:");
        sb.append("\n\t\t" + licenciatura.toString());
        return sb.toString();
    }
    
    /**
     * 
     * @param nombre
     * @param ingenieria
     * @param licenciatura
     * @param promedio
     * @param edad
     * @return: <ul>
     * <li>-1 si no se pudo dar de alta porque no estudia ni ingenieria</li>
     * ni licenciatura o porque ya estaba dado de alta
     * <li>De otra forma, regresa la clave del alumno dado de alta</li>
     * </ul> 
     */
    public int altaAlumno(String nombre, boolean ingenieria, boolean licenciatura, double promedio, int edad){
        int claveAlumno;
        Alumno alumno;
        
        alumno = new Alumno(nombre, ingenieria, licenciatura, promedio, edad);
        claveAlumno = -1;
        if(ingenieria)
            if(this.ingenieria.add(alumno))
                claveAlumno = alumno.getId();
        if(licenciatura)
            if(this.licenciatura.add(alumno) && claveAlumno == -1)
                claveAlumno = alumno.getId();
        return claveAlumno;      
    }
    
    public String bajaAlumno(int claveAlumno){
        String baja;
        Alumno alumno, alumnoIng, alumnoLic;
        
        baja = "Alumno no encontrado en el registro";
        if(claveAlumno > 0)
        {
            alumno = new Alumno(claveAlumno);
            alumnoIng = ingenieria.quita(alumno);
            alumnoLic = licenciatura.quita(alumno);
            if(alumnoLic != null && alumnoLic.equals(alumno))
                baja = alumnoLic.toString();
            else if(alumnoIng != null && alumnoIng.equals(alumno))
                baja = alumnoIng.toString();      
        }
        return baja; 
    }
    
    public String regresaTodosLosAlumnos(){
        ConjuntoADT<Alumno> todos;
        String alumnos;
        
        alumnos = "No hay alumnos";
        todos = ingenieria.union(licenciatura);
        if(todos != null)
            alumnos = todos.toString();
        return alumnos;
    }
    
    public String regresaAlumnosIngLic(){
        ConjuntoADT<Alumno> todos;
        String alumnos;
        
        alumnos = "No hay alumnos que estudien ambas carreras";
        todos = ingenieria.interseccion(licenciatura);
        if(todos != null && todos.getCardinalidad() > 0)
            alumnos = todos.toString();
        return alumnos;
    }
    
     public String regresaAlumnosIngOLic(){
        ConjuntoADT<Alumno> todos;
        String alumnos;
        
        alumnos = "No hay alumnos que estudien licenciatura O ingenieria";
        todos = licenciatura.diferencia(ingenieria).union(ingenieria.diferencia(licenciatura));
        if(todos != null && todos.getCardinalidad() > 0)
            alumnos = todos.toString();
        return alumnos;
    }
     
    public double calculaPromedioIngenieria(){
        double promedio;
        Iterator<Alumno> iterador;
        
        iterador = ingenieria.iterator();
        promedio = 0;
        while(iterador.hasNext())
            promedio = promedio + iterador.next().getPromedio();
        return promedio / ingenieria.getCardinalidad();
    }
    
    public int calculaAlumnosMayoresLicenciatura(int edad){
        int alumnosMayores;
        Iterator<Alumno> iterador;
        
        iterador = licenciatura.iterator();
        alumnosMayores = 0;
        while(iterador.hasNext())
            if(iterador.next().getEdad() > edad)
                alumnosMayores++;
        return alumnosMayores;
    }
            
     
    
}
