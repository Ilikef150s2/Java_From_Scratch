
package domain;
import domain.Empleado;

public class Gerente extends Empleado{
    
    private String departamento;
/*Dejamos que sea private por que n o se hereda las caracteristicas
    a mas clases, si esto fuera asi , podriamos dejar el atributo protected
    y luego modificarlos con get y set.*/
    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    //podemos indicar que estamos sobreescriendo con override
    @Override
    public String obtenerDetalles(){
        /*Usamos return con super para recuperar los datos
        que tenemos en el constructor de la clase padre
        y solo agregamos el departamento*/
        return super.obtenerDetalles() + ", Departamento= " + this.departamento;
    }
}
