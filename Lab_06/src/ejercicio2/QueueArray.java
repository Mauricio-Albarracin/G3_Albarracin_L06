package ejercicio2;

import actividad1.*;
import actividad2.*;

// Clase genérica QueueArray que implementa la interfaz Queue
public class QueueArray<E> implements Queue<E> {

    // Arreglo donde se almacenan los elementos de la cola
    private E[] data;

    // Índice del primer elemento de la cola
    private int first;

    // Índice del último elemento insertado en la cola
    private int last;

    // Número actual de elementos en la cola
    private int size;

    // Capacidad máxima del arreglo (tamaño fijo)
    private int capacity;

    // Constructor que recibe el tamaño máximo de la cola
    @SuppressWarnings("unchecked")
    public QueueArray(int capacity) {
        this.capacity = capacity;
        data = (E[]) new Object[capacity]; // Se crea un arreglo genérico
        first = 0;
        last = -1;
        size = 0;
    }

    // Agrega un nuevo elemento al final de la cola
    @Override
    public void enqueue(E x) {
        if (size == capacity) {
            // Si ya se alcanzó la capacidad máxima, lanza una excepción
            throw new IllegalStateException("La cola está llena");
        }
        // Se actualiza la posición del último usando aritmética modular
        last = (last + 1) % capacity;
        data[last] = x;
        size++;
    }

    // Elimina y retorna el primer elemento de la cola
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            // Si está vacía, lanza una excepción personalizada
            throw new ExceptionIsEmpty("No se puede eliminar de una cola vacía");
        }
        // Se obtiene y elimina el primer elemento
        E element = data[first];
        data[first] = null; // Limpia la posición para evitar referencias innecesarias
        first = (first + 1) % capacity; // Actualiza el índice del primero
        size--;
        return element;
    }

    // Retorna el primer elemento de la cola sin eliminarlo
    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return data[first];
    }

    // Retorna el último elemento insertado sin eliminarlo
    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return data[last];
    }

    // Verifica si la cola está vacía
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Devuelve una representación en texto de la cola
    @Override
    public String toString() {
        String texto = "[";
        // Se recorre desde 'first' hasta 'size' elementos adelante, considerando el ciclo circular
        for (int i = 0; i < size; i++) {
            int index = (first + i) % capacity;
            texto += data[index];
            if (i < size - 1) {
                texto += ", ";
            }
        }
        texto += "]";
        return texto;
    }
}
