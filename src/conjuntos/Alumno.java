/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

/**
 *
 * @author edi
 */
public class Alumno {
    private String nombre;
    private int id;
    private static int folio = 0;
    private boolean ingenieria;
    private boolean licenciatura;
    private double promedio;
    private int edad;

    public Alumno() {
    }

    /**
     * 
     * @param nombre
     * @param ingenieria: true si el alumno es de ingenieria
     */
    

    public Alumno(String nombre, boolean ingenieria, boolean licenciatura, double promedio, int edad) {
        this.nombre = nombre;
        this.ingenieria = ingenieria;
        this.licenciatura = licenciatura;
        this.promedio = promedio;
        this.edad = edad;
        folio++;
        id = folio;
    }

    public Alumno(int id) {
        this.id = id;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isIngenieria() {
        return ingenieria;
    }

    public void setIngenieria(boolean ingenieria) {
        this.ingenieria = ingenieria;
    }

    public boolean isLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(boolean licenciatura) {
        this.licenciatura = licenciatura;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Alumno other = (Alumno) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", id=" + id + ", ingenieria=" + ingenieria + ", licenciatura=" + licenciatura + ", promedio=" + promedio + ", edad=" + edad + '}';
    }

   
    
    
    
}
