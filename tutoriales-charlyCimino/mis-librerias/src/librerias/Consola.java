/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librerias;

import java.util.Scanner;

/**
 *
 * @author marcoantoniodominguezramon
 */
public class Consola {
    
    private static Scanner input = new Scanner(System.in);
    
    private Consola(){}
    
    public static void escribir(Object x){
        System.out.println(x);
    }
    
    public static String leer(){
        return input.nextLine();
    }
    
    public static String leer(String mensaje){
        Consola.escribir(mensaje);
        return input.nextLine();
    }
}
