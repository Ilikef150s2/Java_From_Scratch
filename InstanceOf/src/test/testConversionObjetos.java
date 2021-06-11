
package test;

import domain.*;

public class testConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 3500,TipoEscritura.CLASICO);
       // System.out.println("empleado " + empleado);
        
        //System.out.println(empleado.obtenerDetalles());
       //downcasting
        //((Escritor)empleado).getTipoEscritura();
        
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //upCasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
