/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajodos;

import java.util.ArrayList;

/**
 *
 * @author Martin Ortega Yung 18020
 * Cristopher Barrios 18207
 */
public class PilaArrayList<E> extends AbstractPila<E>{
    
    ArrayList<E> arr = new ArrayList<E>();

    public void push(E item){
        this.arr.add(item);
    }
    
    public E pop(){
        int algo = arr.size();
        return this.arr.remove(algo-1);
    } 
    
    public E peek(){
        int algo = arr.size();
        return this.arr.get(algo-1);
    }
    
    public boolean empty(){
        if(this.arr.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int size(){
        return this.arr.size();
    }
    
}
