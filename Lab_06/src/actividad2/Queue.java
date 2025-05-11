package actividad2;

//Importación del paquete actividad1, el * indica que va a importar todas las clases
import actividad1.*;

public interface Queue<E> {
    void enqueue(E x);
    E dequeue() throws ExceptionIsEmpty;
    E front() throws ExceptionIsEmpty;
    E back() throws ExceptionIsEmpty;
    boolean isEmpty();
} 
