
package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; //se hara referencia a la clase Empleado y no al objeto
    
    public Empleado(){
        //incrementamos el contados y hacemos uso del atributo statico
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo){
       // super(nombre);   no usamos super en este caso por que solo se puede usar super o this pero no los dos
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;     
}
    //cremaos get and set para manipular los valores de los atributos
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //creamos el metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}