//Importamos las clases del paquete actividad1 y actividad2
import actividad1.*;
import actividad2.*;
import actividad3.*;
import ejercicio1.*;
import ejercicio2.*;
import ejercicio3.*;

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
        System.out.println("\n");
        
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
        System.out.println("\n");
        
        /*COLAS DE PRIORIDAD*/
        System.out.println("===================================COLAS DE PRIORIDAD===================================");
         // Crear una cola de prioridad que almacene Strings con prioridad Integer
        PriorityQueue<String, Integer> cola1 = new PriorityQueueLinkSort<>();

        // Pruebas de enqueue
        System.out.println("Agregando elementos a la cola de prioridad:");
        cola1.enqueue("Tarea baja", 1);
        cola1.enqueue("Tarea media", 5);
        cola1.enqueue("Tarea urgente", 10);
        cola1.enqueue("Tarea crítica", 20);
        cola1.enqueue("Tarea leve", 2);

        // Imprimir el contenido de la cola (debe estar ordenado por prioridad descendente)
        System.out.println("Contenido de la cola:");
        System.out.println(cola1);

        // Probar front (debe ser "Tarea crítica")
        try {
            System.out.println("Elemento al frente (mayor prioridad): " + cola1.front());
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error al obtener el frente: " + e.getMessage());
        }

        // Probar back (debe ser "Tarea baja")
        try {
            System.out.println("Elemento al final (menor prioridad): " + cola1.back());
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error al obtener el final: " + e.getMessage());
        }

        // Probar dequeue (elimina "Tarea crítica")
        try {
            System.out.println("Eliminando elemento con mayor prioridad: " + cola1.dequeue());
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }

        // Mostrar el estado de la cola después de eliminar
        System.out.println("Cola después del dequeue:");
        System.out.println(cola1);

        // Probar isEmpty (debe ser false)
        System.out.println("¿La cola está vacía?: " + cola1.isEmpty());

        // Probar cola con enteros
        PriorityQueue<Integer, Integer> colaNumeros = new PriorityQueueLinkSort<>();
        colaNumeros.enqueue(100, 3);
        colaNumeros.enqueue(200, 7);
        colaNumeros.enqueue(50, 1);

        System.out.println("Cola de números:");
        System.out.println(colaNumeros);

        // Probar múltiples dequeue
        try {
            while (!colaNumeros.isEmpty()) {
                System.out.println("Eliminado: " + colaNumeros.dequeue());
            }
        } catch (ExceptionIsEmpty e) {
            System.out.println("Error al vaciar la cola de números: " + e.getMessage());
        }

        // Probar isEmpty después de vaciar
        System.out.println("¿Cola de números vacía?: " + colaNumeros.isEmpty());
        System.out.println("\n");
        
        /*PILA ENLAZADA (STACKLINK)*/
        System.out.println("===================================STACKLINK===================================");
        // Test con una pila de tipo String
        Stack<String> stackStrings = new StackLink<>();  // Creamos una pila para almacenar Strings

        // Realizamos operaciones con Strings
        stackStrings.push("Elemento 1");
        stackStrings.push("Elemento 2");
        stackStrings.push("Elemento 3");

        // Verificamos el contenido de la pila
        System.out.println("Contenido de la pila de Strings: " + stackStrings);

        // Obtenemos el elemento superior (sin eliminar)
        try {
            System.out.println("Elemento en la cima: " + stackStrings.top());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Eliminamos un elemento
        try {
            System.out.println("Elemento eliminado: " + stackStrings.pop());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Verificamos si la pila está vacía
        System.out.println("¿La pila de Strings está vacía?: " + stackStrings.isEmpty());

        // Test con una pila de tipo Integer
        Stack<Integer> stackIntegers = new StackLink<>();  // Creamos una pila para almacenar Integers

        // Realizamos operaciones con enteros
        stackIntegers.push(10);
        stackIntegers.push(20);
        stackIntegers.push(30);

        // Verificamos el contenido de la pila
        System.out.println("Contenido de la pila de enteros: " + stackIntegers);

        // Obtenemos el elemento superior (sin eliminar)
        try {
            System.out.println("Elemento en la cima: " + stackIntegers.top());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Eliminamos un elemento
        try {
            System.out.println("Elemento eliminado: " + stackIntegers.pop());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Verificamos si la pila está vacía
        System.out.println("¿La pila de enteros está vacía?: " + stackIntegers.isEmpty());
        System.out.println("\n");
        
        /*COLA DE TIPO STRING (QUEUEARRAY)*/
        System.out.println("===================================QUEUEARRAY===================================");
         Queue<String> colaStrings = new QueueArray<>(5);  // Se declara usando la interfaz y se instancia con QueueArray

        // Se agregan elementos a la cola
        colaStrings.enqueue("Uno");
        colaStrings.enqueue("Dos");
        colaStrings.enqueue("Tres");

        // Se muestra el contenido actual
        System.out.println("Contenido de la cola de Strings: " + colaStrings);

        // Se consulta el primer y último elemento
        try {
            System.out.println("Elemento al frente: " + colaStrings.front());
            System.out.println("Elemento al final: " + colaStrings.back());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Se elimina un elemento
        try {
            System.out.println("Elemento eliminado: " + colaStrings.dequeue());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Verifica si la cola está vacía
        System.out.println("¿La cola de Strings está vacía?: " + colaStrings.isEmpty());

        // ======================== Cola de tipo Integer ========================
        Queue<Integer> colaEnteros2 = new QueueArray<>(4);  // También usando la interfaz

        // Se agregan números enteros
        colaEnteros2.enqueue(10);
        colaEnteros2.enqueue(20);
        colaEnteros2.enqueue(30);

        // Se muestra el contenido actual
        System.out.println("Contenido de la cola de enteros: " + colaEnteros2);

        // Se consulta el primer y último número
        try {
            System.out.println("Elemento al frente: " + colaEnteros2.front());
            System.out.println("Elemento al final: " + colaEnteros2.back());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Se elimina un número
        try {
            System.out.println("Elemento eliminado: " + colaEnteros2.dequeue());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }

        // Verifica si la cola está vacía
        System.out.println("¿La cola de enteros está vacía?: " + colaEnteros2.isEmpty());
        System.out.println("\n");
        
        /*PRIORIDAD DE COLA ENLAZADA (PriorityQueueLinked)*/
        System.out.println("===================================PRIORITYQUEUELINKED===================================");

        // Crear objetos PriorityQueueLinked de diferentes tipos usando la interfaz PriorityQueue
        PriorityQueue<Integer, Integer> priorityQueue1 = new PriorityQueueLinked<>(3); // Para enteros con 3 prioridades
        PriorityQueue<String, Integer> priorityQueue2 = new PriorityQueueLinked<>(2); // Para cadenas con 2 prioridades
        
        try {
            // Probar operaciones con enteros
            priorityQueue1.enqueue(10, 1); // Insertar 10 en la prioridad 1
            priorityQueue1.enqueue(20, 0); // Insertar 20 en la prioridad 0
            priorityQueue1.enqueue(30, 2); // Insertar 30 en la prioridad 2

            System.out.println("Dequeued from priorityQueue1: " + priorityQueue1.dequeue()); // Debe devolver 20 (prioridad 0)
            System.out.println("Front from priorityQueue1: " + priorityQueue1.front()); // Debe devolver 10 (prioridad 1)

            // Probar operaciones con cadenas
            priorityQueue2.enqueue("Task A", 1); // Insertar "Task A" en la prioridad 1
            priorityQueue2.enqueue("Task B", 0); // Insertar "Task B" en la prioridad 0

            System.out.println("Dequeued from priorityQueue2: " + priorityQueue2.dequeue()); // Debe devolver "Task B" (prioridad 0)
            System.out.println("Front from priorityQueue2: " + priorityQueue2.front()); // Debe devolver "Task A" (prioridad 1)

            // Verificar si las colas están vacías
            System.out.println("Is priorityQueue1 empty? " + priorityQueue1.isEmpty()); // Debe devolver false
            System.out.println("Is priorityQueue2 empty? " + priorityQueue2.isEmpty()); // Debe devolver false

        } catch (ExceptionIsEmpty e) {
            // Manejo de la excepción si las colas están vacías
            System.out.println("Exception: " + e.getMessage());
        }
    }   
}
