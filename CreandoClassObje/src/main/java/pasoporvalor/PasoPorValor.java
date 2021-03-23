package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        //Actualmente x vale 10
        System.out.println("x = " + x);
        /*se llama la funcion y esta devuelve un 10 por que lo que hay
        dentro de la funcion no afecta el valor local de esta funcion es primitiva */
        cambioValor(x);
        System.out.println("x nuevo valor: " + x);
    }
    //creamos una funcion estatica que no devuelve nada y le pasmaos un argumento
    public static void cambioValor(int arg1){
        System.out.println("arg1 = "+ arg1);
        /*En la siguiente linea cambiamos el valor del arg1 a 15, pero esto no afecta al valor x
        cuando llamammos la funcion cambio de valor ya que, este ultimo valor se pierde y no 
        produce ningun cambio en la copia que se le esta pasando en los argumentos en la funcion.*/
        arg1 = 15;
    }
}
