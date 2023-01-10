/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Marco Dominguez
 */
public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BCD234", "Verde"));
        autos.add(new Auto("DEF458", "Blanco"));
        autos.add(new Auto("CDE345", "Azul"));
        autos.add(new Auto("DEF457", "Gris"));
        
        Buscador<Auto,String> buscadorDeAutosPorPatente;
        buscadorDeAutosPorPatente = new Buscador<>();
        Auto a=buscadorDeAutosPorPatente.buscar(autos, "DEF457");
        System.out.println(a);
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1234, "Pepe", "Gomez"));
        personas.add(new Persona(1596, "Ana", "Perez"));
        personas.add(new Persona(7645, "Luis", "Lopez"));
        personas.add(new Persona(2345, "Lía", "Alvarez"));
        personas.add(new Persona(4763, "Sara", "Britez"));
        
        Buscador<Persona,Integer> buscadorDePersonasPorDNI;
        buscadorDePersonasPorDNI=new Buscador<>();
        Persona p = buscadorDePersonasPorDNI.buscar(personas, 1234);
        System.out.println(p);
        
        
        
    }
    
    
}
