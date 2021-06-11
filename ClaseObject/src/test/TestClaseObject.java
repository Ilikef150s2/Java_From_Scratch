
package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("tienen la misma referencia en memoria");
        }else {
            System.out.println("tienen distinta referencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("El contenido son iguales");
        }else {
            System.out.println("El contenido no son iguales");
        }
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hascode son iguales");
        } else{
            System.out.println("el valoor hascode son distintos");
        }
    }   
}
