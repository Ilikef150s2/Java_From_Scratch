package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 4000.0);

        /*podemos llamarlo con solo el nombre del objeto ya que con el
        metodo tostring nos facilita los datos directos*/
        System.out.println(empleado1);
        //creamos el objeto de tipo date por separado y luego se la pasamos al constructor de cliente.
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Neo", 'h', 15, "ninguna");
        System.out.println(cliente1);
    }
}
