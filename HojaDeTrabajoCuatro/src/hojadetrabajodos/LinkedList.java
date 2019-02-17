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
public class LinkedList<E>  extends AbstractList<E>{
    
    public int size = 0;
    
        // A linked list node 
    private class Node { 
  
        int data; // integer data 
        Node link; // reference variavle Node type 
        Node otherlink;
    } 
    // create globle top reference variable 
    Node top; 
    // Constructor 
    LinkedList() 
    { 
        this.top = null; 
    } 
  
    // Utility function to add an element x in the stack 
    public void push(int x) // insert at the beginning 
    { 
        // create new node temp and allocate memory 
        Node temp = new Node(); 
  
        // check if stack (heap) is full. Then inserting an 
        //  element would lead to stack overflow 
        if (temp == null) { 
            System.out.print("\nHeap Overflow"); 
            return; 
        } 
  
        // initialize data into temp data field 
        temp.data =  x; 
  
        // put top reference into temp link 
        temp.link = top; 
  
        // update top reference 
        top = temp; 
        this.size++;
    } 
  
    // Utility function to check if the stack is empty or not 
    public boolean isEmpty() 
    { 
        return top == null; 
    } 
  
    // Utility function to return top element in a stack 
    public int peek() 
    { 
        // check for empty stack 
        if (!isEmpty()) { 
            return top.data; 
        } 
        else { 
            System.out.println("Stack is empty"); 
            return -1; 
        } 
    } 
  
    // Utility function to pop top element from the stack 
    public int pop() // remove at the beginning 
    { 
        // check for stack underflow 
        if (top == null) { 
            System.out.print("\nStack Underflow"); 
            return 0; 
        } 
        Node temp = top;
        // update the top pointer to point to the next node 
        top = (top).link;
        this.size--;
        return temp.data;
    } 
    
    public int size(){
        return this.size;
    }
}
