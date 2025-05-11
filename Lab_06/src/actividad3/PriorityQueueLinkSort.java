package actividad3;

import actividad1.*;
public class PriorityQueueLinkSort<E, N extends Comparable<N>> implements PriorityQueue<E, N> {

    // Clase interna que representa una entrada en la cola con su dato y su prioridad
    public class EntryNode {
        E data;
        N priority;

        EntryNode(E data, N priority) {
            this.data = data;
            this.priority = priority;
        }

        @Override
        public String toString() {
            return "(" + data + ", " + priority + ")";
        }
    }

    private Node<EntryNode> first; // Referencia al primer nodo de la lista (frente de la cola)
    private Node<EntryNode> last;  // Referencia al último nodo de la lista (final de la cola)

    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }

    // Inserta un nuevo elemento en la cola con su prioridad, manteniendo el orden
    @Override
    public void enqueue(E x, N pr) {
        EntryNode newEntry = new EntryNode(x, pr);
        Node<EntryNode> newNode = new Node<>(newEntry);

        if (isEmpty()) {
            // Si la cola está vacía, el nuevo nodo es el primero y último
            first = last = newNode;
        } else if (pr.compareTo(first.getData().priority) > 0) {
            // Si la nueva prioridad es mayor que la del primero, insertar al inicio
            newNode.setNext(first);
            first = newNode;
        } else {
            Node<EntryNode> current = first;
            Node<EntryNode> previous = null;

            // Buscar posición correcta para mantener el orden por prioridad descendente
            while (current != null && pr.compareTo(current.getData().priority) <= 0) {
                previous = current;
                current = current.getNext();
            }

            // Insertar entre previous y current
            newNode.setNext(current);
            previous.setNext(newNode);

            if (current == null) {
                // Si se insertó al final, actualizar 'last'
                last = newNode;
            }
        }
    }

    // Elimina y retorna el elemento con mayor prioridad (frente de la cola)
    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("No se puede eliminar de una cola vacía");

        E aux = first.getData().data;
        first = first.getNext();

        if (first == null)
            last = null;

        return aux;
    }

    // Devuelve el elemento con mayor prioridad sin eliminarlo
    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La cola está vacía");
        return first.getData().data;
    }

    // Devuelve el elemento con menor prioridad sin eliminarlo
    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty())
            throw new ExceptionIsEmpty("La cola está vacía");
        return last.getData().data;
    }

    // Verifica si la cola está vacía
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    // Devuelve una representación en cadena de la cola desde el frente hasta el final
    @Override
    public String toString() {
        String texto = "["; // Empieza la cadena con un corchete de apertura

        if (!isEmpty()) { // Verifica si la cola no está vacía
            Node<EntryNode> current = this.first;
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
