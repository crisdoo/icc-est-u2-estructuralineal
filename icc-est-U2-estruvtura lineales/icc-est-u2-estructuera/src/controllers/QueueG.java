package controllers;

import Models.NodeGeneric;
    public class QueueG<T> {
    private NodeGeneric<T> front;
    private NodeGeneric<T> rear;

    public QueueG() {
        this.front = null;
        this.rear = null;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía.");
        }
        T value = front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printCola() {
        NodeGeneric<T> current = front;
        System.out.print("Cola: ");
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

    

