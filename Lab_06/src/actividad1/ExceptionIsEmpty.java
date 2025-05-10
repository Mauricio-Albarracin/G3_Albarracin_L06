package actividad1;

public class ExceptionIsEmpty extends Exception{
    public ExceptionIsEmpty(){
        super("La pila está vacía"); //Constructor del mensaje a mostrar
    }

    public ExceptionIsEmpty(String mensaje){
        super(mensaje); //Constructor que va a mostrar del mensaje
    }
}
