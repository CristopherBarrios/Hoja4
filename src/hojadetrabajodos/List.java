/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hojadetrabajodos;

/**
 *
 * @author moyha
 */
public interface List<E> {
    public boolean isEmpty();
    // post: returns true iff list has no elements
  
    public void push(int value);
    // post: value is added to beginning of list
    
    public int pop();
    // pre: list is not empty
    // post: returns first value in list
    
    public int peek();
    
    public int size();
    
}
