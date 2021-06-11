
package clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Joel";
        persona1.apellido = "Mikaelson";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        //actualmente no tiene valores persona2
        persona2.desplegarInformacion();
        
        persona2.nombre = "Carlos ";
        persona2.apellido = "Lara ";
        
        persona2.desplegarInformacion();
    }
}
