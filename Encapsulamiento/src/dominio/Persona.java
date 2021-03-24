package dominio;

public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    //creamos los metodos get y set de cada atributo de la clase
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    //se usa is y no get cuando es de tipo booleano ya que es como una pregunta
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
}
