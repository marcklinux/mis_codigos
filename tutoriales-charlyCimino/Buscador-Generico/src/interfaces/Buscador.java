/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Marco Dominguez
 */
public class Buscador<T extends Identificable, K> {
    public T buscar(Collection<? extends T> elementos, K id){
        T encontrado = null;
        Iterator<? extends T> it = elementos.iterator();
        while(it.hasNext() && encontrado == null){
            T actual = it.next();
            if(actual.sameId(id)){
                encontrado = actual;
            }
        }
        return encontrado;
    }
}
