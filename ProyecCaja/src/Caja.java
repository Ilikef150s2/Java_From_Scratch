
import java.util.Scanner;

public class Caja {

    //declaramos las variables que usaremos en los metodos
    int alto, ancho, profundo;

    public Caja(){
        
    }
    public Caja(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        int vol = ancho * alto * profundo;
        return vol;
    }
}
