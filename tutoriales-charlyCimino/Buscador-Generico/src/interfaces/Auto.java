/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Marco Dominguez
 */
public class Auto implements Identificable<String> {
    
    private String patente;
    private String color;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + '}';
    }

    @Override
    public String getId() {
        return patente;
    }

    @Override
    public void setId(String x) {
        this.patente = x;
    }

    @Override
    public boolean sameId(String anotherID) {
        return this.patente.equals(anotherID);
    }

  

  
    
    
    
}
