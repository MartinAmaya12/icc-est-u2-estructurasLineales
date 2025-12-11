package controller;

import java.util.EmptyStackException;
import models.Node;
public class Stack<T> {
    private Node<T>  top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
        
    }

    //Metodo para insertar
    public void push(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(top);
        top = newNode;
        size++; 
    }

    //Metodo para sacar y/o ekiminar
    public T pop(){
        
        if(top == null){
            return null;
            //throw new EmptyStackException(); //es como programar un error en rojo y e mas eficiente 
        }
        T data = top.getValue();
        top = top.getNext();
        size--;
        return data;
    }


    public T peek(){
        if(top == null)
            //return null;
            throw new EmptyStackException(); //es como programar un error en rojo y e mas eficiente 
        return top.getValue();
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }
        return size;
    }

    public void printAllNodes(){
        Node<T> current = top;
        System.out.println("Cima-> ");
        while(current != null){
            System.out.println(current.getValue()+ "-->") ;
            current = current.getNext();
        }
        System.out.println("Fin!!!!!");
    }
}
