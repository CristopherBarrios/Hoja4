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
public class Factory {
    
    public AbstractPila CrearPila(int a){
        if(a==1){
                AbstractPila stack = new PilaArrayList();
                return stack;
        }else if(a==2){
            AbstractPila stack = new PilaVector();
            return stack;
        }
        else{
            return null;
        }
    }
    
    public AbstractList CrearLista(int a){
        if(a==1){
            AbstractList stack = new LinkedList();
                return stack;
        }else if(a==2){
            AbstractList stack = new DoublyLinkedList();
                return stack;
        } else if(a==3){
            AbstractList stack = new CircularLinkedList();
                return stack;
        } else{
            return null;
        }
        
    }
}
