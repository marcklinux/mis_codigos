/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author Marco Dominguez
 */
public interface Identificable<T> {
    
    public abstract T getId();
    public abstract void setId(T x);
    public abstract boolean sameId(T anotherID);
    
}
