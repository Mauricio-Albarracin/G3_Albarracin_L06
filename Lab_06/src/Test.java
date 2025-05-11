//Importamos las clases del paquete actividad 1
import actividad1.Stack;
import actividad1.StackArray;
import actividad1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) {
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
    }
}
