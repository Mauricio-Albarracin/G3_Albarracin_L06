package ejercicio3;

import actividad1.*;
import actividad2.*;
import actividad3.*;

// Clase PriorityQueueLinked que implementa la interfaz PriorityQueue
public class PriorityQueueLinked<E, N> implements PriorityQueue<E, N> {

    // Arreglo de colas, cada una representando una prioridad
    private QueueLink<E>[] queues;
    private int numPriorities;

    // Constructor que recibe el número de prioridades y crea las colas correspondientes
    @SuppressWarnings("unchecked")
    public PriorityQueueLinked(int numPriorities) {
        this.numPriorities = numPriorities;
        queues = new QueueLink[numPriorities];

        // Inicializa cada cola con una instancia de QueueLink
        for (int i = 0; i < numPriorities; i++) {
            queues[i] = new QueueLink<>();
        }
    }

    // Agrega un elemento con una prioridad específica
    @Override
    public void enqueue(E element, N pr) {
        int priority = (Integer) pr; // Convertir el parámetro N a Integer
        if (priority < 0 || priority >= numPriorities) {
            throw new IllegalArgumentException("Prioridad fuera de rango");
        }
        // Inserta el elemento en la cola correspondiente a la prioridad
        queues[priority].enqueue(element);
    }

    // Elimina y retorna el primer elemento de la cola con la mayor prioridad
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        for (int i = 0; i < numPriorities; i++) {
            if (!queues[i].isEmpty()) {
                // Si hay elementos en la cola de la prioridad actual, los elimina
                return queues[i].dequeue();
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía");
    }

    // Retorna el primer elemento de la cola con la mayor prioridad sin eliminarlo
    @Override
    public E front() throws ExceptionIsEmpty {
        for (int i = 0; i < numPriorities; i++) {
            if (!queues[i].isEmpty()) {
                // Si hay elementos en la cola de la prioridad actual, los retorna
                return queues[i].front();
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía");
    }

    // Retorna el último elemento de la cola con la menor prioridad sin eliminarlo
    @Override
    public E back() throws ExceptionIsEmpty {
        for (int i = numPriorities - 1; i >= 0; i--) {
            if (!queues[i].isEmpty()) {
                // Si hay elementos en la cola de la prioridad actual, los retorna
                return queues[i].back();
            }
        }
        throw new ExceptionIsEmpty("La cola de prioridad está vacía");
    }

    // Retorna true si todas las colas están vacías
    @Override
    public boolean isEmpty() {
        for (int i = 0; i < numPriorities; i++) {
            if (!queues[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

    // Método para representar la cola de prioridad como una cadena
    @Override
    public String toString() {
        // Inicializamos la cadena que contendrá el resultado
        String result = "";

        // Recorremos todas las prioridades en el arreglo de colas
        for (int i = 0; i < numPriorities; i++) {
            // Agregamos la representación de la cola de cada prioridad
            // La cadena result incluirá el índice de la prioridad y el contenido de la cola
            result += "Prioridad " + i + ": " + queues[i].toString() + "\n";
        }
        // Retornamos la cadena result que contiene todas las representaciones de las colas
        return result;
    }
}
