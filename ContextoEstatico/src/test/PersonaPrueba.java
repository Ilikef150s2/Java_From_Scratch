package test;

import domain.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedro");
        Persona persona2 = new Persona("Karla");

        imprimir(persona1);
        imprimir(persona2);
    }

    //le pasamos argumento de tipo Persona y le pasamos valor de persona
    public static void imprimir(Persona persona) {
        //creamos este metodo para llamar al metodo toString indirectamente con persona
        System.out.println(persona);
    }

}
