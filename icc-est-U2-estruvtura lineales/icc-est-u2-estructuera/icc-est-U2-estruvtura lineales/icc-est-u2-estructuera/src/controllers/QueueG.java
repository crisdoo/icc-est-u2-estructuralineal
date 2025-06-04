package controllers;

import Models.NodeGeneric;
import Models.Persona;
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
    // Elimina una persona por nombre y la retorna (null si no se encuentra)
public Persona deleteByName(String nombre) {
    if (isEmpty()) return null;

    NodeGeneric<T> current = front;
    NodeGeneric<T> previous = null;

    while (current != null) {
        T value = current.getValue();
        if (value instanceof Persona persona) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                // Si es el primero
                if (current == front) {
                    front = front.getNext();
                    if (front == null) rear = null;
                } else {
                    previous.setNext(current.getNext());
                    if (current == rear) rear = previous;
                }
                return persona;
            }
        }
        previous = current;
        current = current.getNext();
    }
    return null;
}

}

    

