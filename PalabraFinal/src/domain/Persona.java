
package domain;

public class Persona {
    public final static int MI_CONSTANT = 11;
   // si es declarada como final, quiere decir  que ya no tendra clases hijas o subclases
    
    private String nombre;
    
    public void imprimir(){
        System.out.println("metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
