/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayfunciones;

import java.util.Scanner;

/**
 *
 * @author Marco Dominguez
 */
public class Prueba {

    /**
     * un corredor registra N vueltas. la maquina informa cuantas vueltas superan el promedio
     */
    public static void main(String[] args) {
        int nroVueltas = leerEnteroEntre("cuantas vueltas ", 4,10);
        int[] vueltas = new int[nroVueltas];
        for(int i = 0; i < vueltas.length;i++){
            String mensaje = "vuelta " + (i+1)+ " de " + vueltas.length + " : ";
            vueltas[i]=leerEnteroEntre(mensaje,1,100);
        }
        mostrarArreglo(vueltas);
        int cant = obtenerValoresMayores(vueltas);
        System.out.println("Valores Mayores " + cant);
    }
    
    static int obtenerValoresMayores(int[] arreglo){
        int cont=0;
        double promedio = obtenerPromedio(arreglo);
        System.out.println("Promedio: " + promedio);
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]> promedio){
                cont++;
            }
        }
        return cont;
    }
    
    static double obtenerPromedio(int[] arreglo){
        int acum = 0;
        double prom;
        for(int i = 0; i< arreglo.length;i++){
            acum += arreglo[i];
            }
        prom = (double)acum / arreglo.length;
        return prom;
    }
    
    static void mostrarArreglo(int[] arreglo){
        for(int i= 0; i < arreglo.length;i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
    }
    
    static int leerEnteroEntre(String cartel,int menor,int mayor){
        Scanner entrada = new Scanner(System.in);
        System.out.print(cartel);
        double x = entrada.nextDouble();
        while((int) x != x || x < menor || x > mayor){
            System.out.print("ERROR." + cartel);
            x = entrada.nextDouble();
        }
        return (int)x;
    }
    
}
