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
public class DoublyLinkedList<E> extends AbstractList<E>{
    
    public int size = 0;
    
    public class Node
    {
    int data;
    Node next;
    Node prev;

    public Node(int data,Node next, Node prev){

        this.next=next;
        this.data=data;
        this.prev=prev;

    }
    public Node(){

    }

    public int getData(){

        return data;
    }

    public void setData(int data){

        this.data=data;
    }

    public Node getNext(){

        return next;
    }

    public void setNext(Node next){
        this.next=next;
    }

    public Node getPrev(){

        return prev;
    }

    public void setPrev(Node prev){
        this.prev=prev;
    }
         }
    
    Node head = null;
    Node tail = null;

    public int size() {
         return size;
           }

    public boolean isEmpty()
           {
        return head == null;
        }    
      public void push(int data) {

        tail = head;
        head = new Node(data,null,null);
        head.data=data;
        head.next= tail;
        head.prev = null;


        if(tail != null) {
            tail.prev=head;
        }

        size++;

      }

      public int pop() {
        if (!isEmpty()) {
            int dato = head.data;
            head = head.next;   // delete first node
            size--;
            return dato;
        } else {
            System.out.println("İs Empty");
            return 0;
        }

    }

       public int peek() {

        int tmp = head.data;
        return tmp;
    }
      }

