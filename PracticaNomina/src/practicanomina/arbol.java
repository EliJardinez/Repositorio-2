/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicanomina;


public class arbol {
    
    String nombre, puesto;
    double sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public arbol() {
    }

    public arbol(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
       
           return "Nombre: " + nombre +"    ,puesto:    "+puesto+ "  ,Sueldo= $" + sueldo;
    }
    
    
}
    
    

    
    
    

