
public class CicloWhile {

    public static void main(String[] args) {
        var contador = 0;   //creamos la variable para controlar el ciclo
        while (contador < 3) { //el ciclo se repetira hasta que el contador sea menos que 3
            System.out.println("contador = " + contador);
            contador++;    //incrementamos contador para el ciclo no sea infinito
        }

        
        /*El ciclo do while pór lo menos se ejecuta una vez*/
        do {
            System.out.println("contador = " + contador);
        } while (contador < 3);
    }
}
