
package test;

import domain.Persona;

public class TestArregloPersona {
    public static void main(String[] args) {
        /*Declaramos un objeto arreglo de tipo persona con 2 elementos*/
        Persona personas[] = new Persona[2];
        //tipo persona, nombre del arreglo, new arreglo con numero de elementos
        //tambien podemos crear el arreglo y pasar los valores de un solo
        String frutas[] = {"Sandia","banano", "jocote"};
        
        //creamos los objetos del arreglo personas:
        personas[0]= new Persona("Juan");
        personas[1]= new Persona("Karla");
        //nombre del objeto  y luego se crea pasandole el valor
        
        System.out.println("Persona 0= " + personas[0]);
        System.out.println("Persona 1= " + personas[1]);
        
        //recorreos el arreglo y mostramos en pantalla el mismo arreglo con .length
        for(int i=0; i < personas.length; i++){
            System.out.println("persona "+ i + ": "+ personas[i]);
        }
        
         for(int i=0; i < frutas.length; i++){
            System.out.println("fruta "+ i + ": "+ frutas[i]);
        }
    }
}
