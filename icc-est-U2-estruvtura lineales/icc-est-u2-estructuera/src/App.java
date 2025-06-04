import java.util.Queue;

import Models.Persona;
import controllers.QueueG;
import controllers.Stack;
import controllers.StackG;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        System.out.println("Tam ="+ stack.size());
        stack.printSatck();
        stack.pop();
        System.out.println("Tam = "+ stack.size());
        stack.printSatck();
    }

    StackG stackG = new StackG<Integer>();
    
    
    /*persona p1 = new Persona("Juan");
    persona p2 = new Persona("Maria");
    persona p3 = new Persona("Pedro");

    QueueG<Persona> colaPersonas = new QueueG<Persona>();
    colaPersonas.add(p1);
    colaPersonas.add(p2);
    colaPersonas.add(p3);
    colaPersonas.printCola();
    System.out.println("Persona antendida"+ colaPersonas.remove());
    colaPersonas.printCola();*/
    
    
        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");

        QueueG<Persona> colaPersonas = new QueueG<>();

        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);

        colaPersonas.printCola();

        System.out.println("Persona atendida: " + colaPersonas.remove());

        colaPersonas.printCola();
    
}


