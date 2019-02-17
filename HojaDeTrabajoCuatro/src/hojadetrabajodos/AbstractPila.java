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
public abstract class AbstractPila<E> implements iPila<E>{
    
    public abstract void push(E item);
    
    abstract public E pop();
    
    abstract public E peek();    
    
    public boolean empty(){
        int algo = 0;
        if(algo == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int size(){
        return 0;
    }
}
