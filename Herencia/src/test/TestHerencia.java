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

        Cliente cliente1 = new Cliente(new Date(), true, "Neo", 'h', 15, "ninguna");
        System.out.println(cliente1);
    }
}
