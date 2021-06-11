
package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {1,3,5,3};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Carlos"), new Persona("Julio")};
        /*para usar el for each se debe poner el tipo de datos en este caso
        es de tipo persona y luego una variable que contendra el arreglo y luego dos puntos
        e indicarle como se llama el arreglo*/
        for(Persona persona: personas){
            System.out.println("Nombre = " + persona);
        }
    }
}
