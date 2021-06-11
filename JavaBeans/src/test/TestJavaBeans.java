
package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Castro");
        
        System.out.println("Persona" + persona);
        System.out.println("PErsona apellido " + persona.getApellido());
    }
}
