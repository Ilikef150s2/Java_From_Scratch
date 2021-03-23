
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        //Accedemos a la clase persona y agregamos valor a nombre de Joel
        persona1.nombre = "Joel";
        System.out.println("persona1 nombre: " + persona1.nombre);
        System.out.println("persona1 apellido: " + persona1.apellido);
        
    }
}
