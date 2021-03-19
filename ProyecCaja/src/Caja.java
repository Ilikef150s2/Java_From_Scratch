
import java.util.Scanner;

public class Caja {

    //declaramos las variables que usaremos en los metodos
    int alto, ancho, profundo;

   // creamos el constructor vacia para usarlo como objeto
    public Caja(){
    }
    // creamos el constructor con argumentos y se los damos igual que las variables en el mismo orden.
    public Caja(int alto, int ancho, int profundo) {
        // le decimos a los argumentos que tendran el mismo valor que las variables por eso usamos el this.
        this.alto = alto; // le decimos alto tendra el valor de alto de la variable local de la clase
        this.ancho = ancho;
        this.profundo = profundo;
    }

    //creamos el metodo donde haremos la magia de calcular el volumen de la caja
    // declareamos int el metodo ya que devolvera un entero.
    public int calcularVolumen() {
        int vol = ancho * alto * profundo;
        //retorna un entero que se llama vol.
        return vol;
    }
}
