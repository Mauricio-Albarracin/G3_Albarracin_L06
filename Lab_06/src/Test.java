//Importamos las clases del paquete actividad1 y actividad2
import actividad1.*;
import actividad2.*;

public class Test {
    public static void main(String[] args) {
        /*PILAS*/
        System.out.println("===================================PILAS===================================");
        // Crear una pila de enteros con capacidad 5
        Stack<Integer> pilaEnteros = new StackArray<>(5);

        // Agregar elementos a la pila
        pilaEnteros.push(10);  // Inserta el número 10 en el tope
        pilaEnteros.push(20);  // Inserta el número 20 en el tope
        pilaEnteros.push(30);  // Inserta el número 30 en el tope

        // Mostrar el estado de la pila después de agregar elementos
        System.out.println("Pila de enteros después de agregar elementos: " + pilaEnteros);

        // Obtener el elemento en el tope sin eliminarlo
        try {
            System.out.println("Elemento que esta en el tope de la pila: " + pilaEnteros.top());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Eliminar un elemento de la pila
        try {
            System.out.println("Elemento desapilado: " + pilaEnteros.pop());  // Elimina el último elemento agregado
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Mostrar la pila después de la operación pop
        System.out.println("Pila de enteros después de eliminar un elemento: " + pilaEnteros);

        // Crear una pila de cadenas con capacidad 3
        Stack<String> pilaCadenas = new StackArray<>(3);

        // Agregar elementos a la pila de cadenas
        pilaCadenas.push("Prueba");
        pilaCadenas.push("AED");

        // Mostrar el estado de la pila de cadenas
        System.out.println("Pila de cadenas de texto después de agregar elementos: " + pilaCadenas);

        // Eliminar un elemento de la pila de cadenas
        try {
            System.out.println("Elemento desapilado de la pila de cadenas de texto: " + pilaCadenas.pop());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Mostrar la pila de cadenas después de la operación pop
        System.out.println("Pila de cadenas de texto después de eliminar un elemento: " + pilaCadenas);
        
        /*COLAS*/
        System.out.println("===================================COLAS===================================");
        // Crear una cola de enteros
        Queue<Integer> colaEnteros = new QueueLink<>();

        // Agregar elementos a la cola
        colaEnteros.enqueue(10);  // Inserta el número 10 al final
        colaEnteros.enqueue(20);  // Inserta el número 20 al final
        colaEnteros.enqueue(30);  // Inserta el número 30 al final

        // Mostrar el estado de la cola después de agregar elementos
        System.out.println("Cola de enteros después de agregar elementos: " + colaEnteros);

        // Obtener el primer elemento (frente de la cola)
        try {
            System.out.println("Elemento al frente de la cola: " + colaEnteros.front());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Eliminar un elemento de la cola
        try {
            System.out.println("Elemento eliminado de la cola: " + colaEnteros.dequeue());  // Elimina el primer elemento
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Mostrar la cola después de la operación dequeue
        System.out.println("Cola de enteros después de eliminar un elemento: " + colaEnteros);

        // Crear una cola de cadenas de texto
        Queue<String> colaCadenas = new QueueLink<>();

        // Agregar elementos a la cola de cadenas
        colaCadenas.enqueue("Prueba");
        colaCadenas.enqueue("AED");

        // Mostrar el estado de la cola de cadenas
        System.out.println("Cola de cadenas de texto después de agregar elementos: " + colaCadenas);

        // Eliminar un elemento de la cola de cadenas
        try {
            System.out.println("Elemento eliminado de la cola de cadenas de texto: " + colaCadenas.dequeue());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Mostrar la cola de cadenas después de la operación dequeue
        System.out.println("Cola de cadenas de texto después de eliminar un elemento: " + colaCadenas);

        // Probar la operación back (último elemento)
        try {
            System.out.println("Último elemento de la cola de enteros: " + colaEnteros.back());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
    }   
}
