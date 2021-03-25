
package domain;

public class Persona {
    //protected permite pasar herencia a clases hijas, y private solo en el mismo paquete
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //agregamos el constructor vacio
    public Persona(){
}
    //agregamos el constructor para iniciar nombre
    public Persona (String nombre){
        this.nombre = nombre;
    }
//agregamos el constructor con todos los atributos completos
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //agregamos el get y set de los atributos para tener acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    } 
}
