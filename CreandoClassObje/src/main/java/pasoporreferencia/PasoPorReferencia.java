
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        //Accedemos a la clase persona y agregamos valor a nombre de Joel
        persona1.nombre = "Joel";
        System.out.println("persona1 nombre: " + persona1.nombre);
        /*si llamamos acontinuacion el atributo apellido nos devolvera null, ya que 
        usamos la clase persona pero la clase no contiene datos, solo declaramos los tipos de datos
                persona y sus atributos, no lo llenamos por lo tanto es null*/
        //System.out.println("persona1 apellido: " + persona1.apellido);
        cambioDeValor(persona1);
        
        System.out.println("persona 1 vale actual: " + persona1.nombre);
    }
    /* Podemos poner el mismo nombre de la clase a la hora de pasarle el valor*/
    public static void cambioDeValor(Persona persona){
        persona.nombre = "Carlos";
        System.out.println("Persona desde metodo cambio: " + persona.nombre);
    }
}
