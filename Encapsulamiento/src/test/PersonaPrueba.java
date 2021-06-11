package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000, false);
        System.out.println("Nombre antes de cambiar: " + persona1.getNombre());
        System.out.println("persona1: " + persona1.toString());

        persona1.setNombre("Carlos");
        /*ahora podemos usar get y set o is para accedera y configurar a los valores
        ya que estos estan privados y no se pueden acceder a ellos
        directamente como antes lo haciamos persona.nombre*/
//        System.out.println("nombre luego de cambiar: " + persona1.getNombre());
//        System.out.println("sueldo: " + persona1.getSueldo());
//        System.out.println("eliminado: " + persona1.isEliminado());

        //imprime la cadena de texto que creamos con el metodo toString
        System.out.println("persona1: " + persona1);

        /*Podemos escribir el metodo toString para imprimir pero
        no es necesario ya que cuando en la clase persona
        lee un metodo toString devuelve automaticamente los valores
        dentro del metodo solo mandando a llamar al metodo
        llamado persona1*/
    }
}
