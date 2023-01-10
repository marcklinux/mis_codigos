/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Marco Dominguez
 */
public class Principal {
    
    public static void main(String[] args) {
        Persona p = new Persona(180284,"marco","dominguez");
        Auto a = new Auto("eschido","rojo");
        
        identificar(a);
        identificar(p);
        
    }
    
    public static void identificar(Identificable objetIdent){
            System.out.println("Yo soy " + objetIdent.getId());
        }
}
