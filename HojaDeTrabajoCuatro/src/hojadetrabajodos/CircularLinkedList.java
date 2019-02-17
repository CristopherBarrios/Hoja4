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
public class CircularLinkedList<E> extends AbstractList<E>{
    public class Node{
        int data;
        Node link;
        
        public Node(int d, Node l){
            this.link = l;
            this.data = d;
        }
    }
    
    Node end = null;
    
    public int size= 0;
    
    public void push(int item){
        if(isEmpty()){
        end = new Node(item, null);
        end.link = end;
        }else{
            Node algo = new Node(item, end.link);
            end.link = algo;
        }
        size++;
    }
    
    public int size() {
         return size;
           }
    
    public boolean isEmpty(){
        if(this.size == 0){
            return true;            
        }
        else{
            return false;
        }
    }
    
    public int pop(){
        if (!isEmpty()) {
            int dato = end.link.data;
            end = end.link;   // delete first node
            size--;
            return dato;
        } else {
            System.out.println("İs Empty");
            return 0;
        }
    }
    
    public int peek(){
        int tmp = end.link.data;
        return tmp;
    }
    
    
}
