/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Marco Dominguez
 */
public class Persona implements Identificable<Integer> {

    private int DNI;
    private String nombre;
    private String apellido;

    public Persona(int DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    @Override
    public Integer getId() {
        return DNI;
    }

    @Override
    public void setId(Integer x) {
        this.DNI=x;
    }

    @Override
    public boolean sameId(Integer anotherID) {
        return this.DNI == anotherID;
    }

   
    
    

}
