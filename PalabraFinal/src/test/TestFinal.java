
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println(miVariable);
        /* miVarible = 20;
        esto ya no se puede hacer por que cuando se usa final en 
        una variable indica que luego que se le da el valor ya no se podra editar ni 
        cambiar*/
        
        //Persona.MI_CONSTANT = 5; no podemos modificarlo ya que esta como final
        System.out.println("Imprimiendo constante: " + Persona.MI_CONSTANT);
        
        final Persona persona1 = new Persona();
        //persona1 = new Persona();  esto no lo podemos hacer ya que declaramos el metodo como final
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 cambio: " + persona1.getNombre());
        /* cuando usamos final en un metodo no podemos cambiarlo pero si el valor que tiene dentro podemos modificarlo.*/
    }
}
