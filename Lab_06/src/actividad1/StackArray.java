package actividad1;

class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;

    public StackArray(int n){
        this.array = (E[])new Object[n];
        tope = -1;
    }

    public void push(E x){
        // include here your code
        if (isFull()){
            System.out.println("La pila está llena, no se puede insertar más elementos");
        }
        array[++tope] = x; // Se incrementa el tope y se coloca el nuevo elemento
    }

    public E pop() throws ExceptionIsEmpty{
        // include here your code 
        if (isEmpty()){
            throw new ExceptionIsEmpty("No se puede desapilar, porque la pila se encuentra vacía");
        }
        return array[tope--]; // Devuelve el elemento que está en el tope y luego apunta al valor anterior a que está en el tope
    }

    public E top() throws ExceptionIsEmpty{
        // include here your code
        if (isEmpty()){
            throw new ExceptionIsEmpty("No se puede obtener el tope porque la pila está vacía");
        }
        return array[tope]; // Devuelve el elemento que está en la cima, el último elemento de la pila
    }

    public boolean isEmpty() {
        return this.tope == -1; // Va a mostrar true si es que no tenemos elementos en la pila (la pila está vacía)
    }
    public boolean isFull (){
    // include here your code
        return tope == array.length - 1; // Va a mostrar true si es que la pila está llena
    }

    //The elements must be included in the chain from the one at the top
    //to the one at the bottom of the stack.

    @Override
    public String toString() {
        String texto = "["; // Empieza la cadena con un corchete de apertura

        if (!isEmpty()) { // Verifica si la pila no está vacía
            for (int i = tope; i > 0; i--) { // Recorre desde el tope hasta el segundo elemento
                texto += array[i] + ", "; // Agrega el elemento y una coma con espacio
            }
        texto += array[0]; // Agrega el último elemento sin coma al final
        }

        texto += "]"; // Cierra la cadena con un corchete de cierre
        return texto; // Devuelve la representación como texto de la pila
    }
}
