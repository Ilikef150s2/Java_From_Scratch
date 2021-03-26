
package domain;

public class Empleado extends Persona {
    public void imprimir(){//haciendo eso se llama sobreescribir metodo
        System.out.println("Modificando la impresion del metodo dentro de la clase hija");
        /* aparece error por que el metodo o clase esta declarado final y no pueden modificar o sobreescribir en las clases
                hijas. */
    }
}
