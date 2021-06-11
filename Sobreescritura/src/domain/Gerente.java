package domain;

public class Gerente extends Empleado {
    
    private String departamento;
    /*Dejamos que sea private por que n o se hereda las caracteristicas
    a mas clases, si esto fuera asi , podriamos dejar el atributo protected
    y luego modificarlos con get y set.*/
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento:" + this.departamento;
    }
    /*Usamos return con super para recuperar los datos
        que tenemos en el constructor de la clase padre
        y solo agregamos el departamento*/
    
}
