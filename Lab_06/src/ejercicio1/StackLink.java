package ejercicio1;

import actividad1.*;
public class StackLink<E> implements Stack<E> {

    private Node<E> top;  // Nodo que representa la cima de la pila

    // Constructor que inicializa la pila vacía
    public StackLink() {
        top = null;
    }

    // Inserta un elemento en la cima de la pila
    @Override
    public void push(E x) {
        // Se crea un nuevo nodo que apunta al nodo actual de la cima
        Node<E> newNode = new Node<>(x, top);
        // Se actualiza la cima de la pila con el nuevo nodo
        top = newNode;
    }

    // Elimina y retorna el elemento que está en la cima de la pila
    @Override
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("No se puede eliminar de una pila vacía");
        }
        // Se guarda el dato del nodo actual de la cima
        E data = top.getData();
        // Se actualiza la cima al siguiente nodo
        top = top.getNext();
        return data;
    }

    // Retorna el elemento que está en la cima de la pila sin eliminarlo
    @Override
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía");
        }
        return top.getData();
    }

    // Verifica si la pila está vacía
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    // Representa el contenido de la pila como una cadena
    @Override
    public String toString() {
        StringBuilder texto = new StringBuilder("[");
        Node<E> current = top;

        // Recorre la pila desde la cima hasta el final
        while (current != null) {  // Mientras el nodo actual no sea nulo (es decir, mientras haya más nodos en la pila)
            texto.append(current.getData());  // Añadir el dato del nodo actual al StringBuilder (esto representa el valor del nodo en la pila)
            current = current.getNext();  // Avanzar al siguiente nodo en la pila (actualizar el puntero a "next")
        if (current != null) {  // Si aún hay un nodo después del actual (es decir, no hemos llegado al final de la pila)
            texto.append(", ");  // Añadir una coma y un espacio para separar los elementos visualmente
        }
    }
        texto.append("]");
        return texto.toString();
    }
}
