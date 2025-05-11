package actividad2;

import actividad1.*;

// Clase QueueLink que implementa una cola genérica usando nodos enlazados.
public class QueueLink<E> implements Queue<E> {
    private Node<E> first; // Apunta al primer nodo (frente de la cola)
    private Node<E> last;  // Apunta al último nodo (final de la cola)

    // Constructor: inicializa la cola como vacía
    public QueueLink(){
        this.first = null;
        this.last = null;
    }

    // Agrega un nuevo elemento al final de la cola
    public void enqueue(E x){
        Node<E> aux = new Node<E>(x);
        if (this.isEmpty()) {
            this.first = aux;
        } else {
            this.last.setNext(aux);
        }
        this.last = aux;
    }

    // Elimina el elemento del frente y lo retorna
    public E dequeue() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        E data = this.first.getData();
        this.first = this.first.getNext();
        if (this.first == null) {
            this.last = null;
        }
        return data;
    }

    // Retorna el último elemento (sin eliminarlo)
    public E back() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return this.last.getData();
    }

    // Retorna el primer elemento (sin eliminarlo)
    public E front() throws ExceptionIsEmpty {
        if (this.isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía");
        }
        return this.first.getData();
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return this.first == null;
    }

    // Devuelve una representación en cadena de la cola desde el frente hasta el final
    @Override
    public String toString() {
        String texto = "["; // Empieza la cadena con un corchete de apertura

        if (!isEmpty()) { // Verifica si la cola no está vacía
            Node<E> current = this.first;
            while (current.getNext() != null) { // Recorre hasta el penúltimo nodo
                texto += current.getData() + ", "; // Agrega el dato con coma y espacio
                current = current.getNext(); // Avanza al siguiente nodo
            }
            texto += current.getData(); // Agrega el último dato sin coma
        }
        texto += "]"; // Cierra la cadena con un corchete de cierre
        return texto; // Devuelve la representación como texto de la cola
    }
}
