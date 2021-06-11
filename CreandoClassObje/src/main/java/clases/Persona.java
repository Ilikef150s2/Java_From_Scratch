
package clases;

public class Persona {
    //atributos de la clase
    //hacer public los atributos no es buena practica pero este solo es un ejemplo.
    public String nombre;
    public String apellido;
    
    public void desplegarInformacion(){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
    public static void main(String[] args) {
        
    }
}
