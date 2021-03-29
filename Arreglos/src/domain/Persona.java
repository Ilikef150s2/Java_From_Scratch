
package domain;

public class Persona {
   private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    @Override
    public String toString() {
        /*si ponemos super y mandamos a llamar el mismo toString
        nos referimos a la clase padre de persona que en este caso seria 
        de tipo objeto y eso imprimie la direccion en memoria*/
        return "Persona{" + "nombre=" + nombre + '}' + ", " + super.toString();
    }
   
}
