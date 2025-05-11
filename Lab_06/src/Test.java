//Importamos las clases del paquete actividad1 y actividad2
import actividad1.*;
import actividad2.*;
import actividad3.*;
import ejercicio1.StackLink;

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
    }   
}
