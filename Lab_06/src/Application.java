import ejercicio1.*; // Importamos StackLink (una implementación de pila enlazada)
import actividad1.*; // Importamos cualquier otra clase que puedas necesitar de actividad1

public class Application {

    // Método para verificar si los símbolos (corchetes/paréntesis/llaves) están correctamente balanceados
    public static boolean symbolBalancing(String S) {
        StackLink<Character> stack = new StackLink<>(); // Creamos una pila vacía

        // Recorremos cada carácter de la cadena de entrada
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i); // Obtenemos el carácter actual

            // Si es un símbolo de apertura, lo apilamos
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                stack.push(currentChar);
            }
            // Si es un símbolo de cierre
            else if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                // Si la pila está vacía, no hay símbolo de apertura correspondiente
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = '\0'; // Inicializamos una variable para almacenar el tope de la pila

                try {
                    topChar = stack.pop(); // Desapilamos el tope de la pila
                } catch (ExceptionIsEmpty e) {
                    // Si ocurre una excepción, retornamos falso
                    return false;
                }

                // Verificamos si el símbolo de apertura y cierre coinciden
                if ((currentChar == ')' && topChar != '(') ||
                    (currentChar == ']' && topChar != '[') ||
                    (currentChar == '}' && topChar != '{')) {
                    return false; // Si no coinciden, no están balanceados
                }
            }
        }

        // Al final, la pila debe estar vacía para que esté balanceado
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Arreglo de expresiones de prueba para evaluar
        String[] pruebas = {
            "()()()[()]()",        // Balanceado correctamente
            "((()))[]",            // Balanceado correctamente
            "([])[](",             // Falta cerrar un paréntesis
            "([{)]}",              // Orden incorrecto de cierre
            "[",                   // Falta cerrar el corchete
            "[][][]{{{}}}"         // Balanceado correctamente
        };

        // Imprimimos encabezados con formato
        System.out.printf("%-25s %s\n", "Entrada", "Salida");
        System.out.println("-----------------------------------");

        // Evaluamos cada expresión de prueba y mostramos su resultado
        for (String prueba : pruebas) {
            boolean resultado = symbolBalancing(prueba); // Evaluamos la expresión
            System.out.printf("%-25s %s\n", "\"" + prueba + "\"", resultado); // Imprimimos resultado
        }
    }
}
