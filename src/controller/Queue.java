package controller;
import java.util.NoSuchElementException;

import models.Node;
public class Queue<T>{
    private Node<T> first;
    private Node<T> last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public boolean Empty(){
        return first == null;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<T>(data);
        if(Empty()){
            first = newNode;
            last = newNode;
        }else{
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public T dequeue(){
        if(Empty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        T data = first.getValue();
        first = first.getNext();
        if(first == null){
            last = null;
        }
        size--;
        return data;
    }


    public int size(){
        if(Empty()){
            return 0;
        }
        return size;
    }

    public void printAllNodes(){
        Node<T> current = first;
        System.out.println("Cima-> ");
        while(current != null){
            System.out.println(current.getValue()+ "-->") ;
            current = current.getNext();
        }
        System.out.println("Fin!!!!!");

    }
    

    public T getFirst(){
        if(Empty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.getValue();
    }
    public T getLast(){
        if(Empty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return last.getValue();
    }
}