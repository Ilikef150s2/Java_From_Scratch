package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
//        Clase1 clase1 = new Clase1("publico");
//        System.out.println("clase1 "+ clase1);
//        clase1.metodoPublico;
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);

        /*El modificador de acceso protected esta dise;ado exactmente
        para manejar correctamente las caracteristicas de herencia. ya sea las clases hijas usaran 
        caracteris de las clases padres es n ecesario ponerlas como protected. y asi es como se puede modifciar usando this.*/
    }
}
