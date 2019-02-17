/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajodos;

/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public abstract class AbstractList<E> implements List<E>{
    public abstract int size();
    
    public abstract boolean isEmpty();
    // post: returns true iff list has no elements
  
    public abstract void push(int value);
    // post: value is added to beginning of list
    
    public abstract int pop();
    // pre: list is not empty
    // post: returns first value in list
    
    public abstract int peek();
}
