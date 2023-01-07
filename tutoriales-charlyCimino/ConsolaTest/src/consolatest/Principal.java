/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consolatest;

import librerias.Consola;

/**
 *
 * @author marcoantoniodominguezramon
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = Consola.leer("cual es tu nombre");
        Consola.escribir("hola " + nombre);
    }
    
}
