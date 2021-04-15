package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
       Empleado empleado = new Empleado("Juan", 5000);

       empleado = new Gerente("Karla", 10000, "Contabilidad");
    }
    
    public static void determinarTipo(Empleado empleado){
        
    }
}
