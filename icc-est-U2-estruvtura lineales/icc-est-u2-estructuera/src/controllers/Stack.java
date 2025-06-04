package controllers;

import java.util.EmptyStackException;

import Models.Node;

public class Stack {
    private Node top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }
    public int pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }
    public int peek(){
        if (top == null){
            throw new EmptyStackException();
        }
        int value = top.getValue();
        return value;
    }
    public boolean isEmpty(){
       return top == null;
    }

    public void printSatck() {
        Node aux = top;
       while (aux != null){
        System.out.print(aux.getValue()+ "|");
        aux = aux.getNext();
       }
       System.out.println();
    }
    public int size(){
        int count = 0;
        Node current = top;
        while(current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }
}
