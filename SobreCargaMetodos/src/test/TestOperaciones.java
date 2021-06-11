
package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(3, 6);
        var resultado2 = Operaciones.sumar(2.4, 3.7); //podemos usar la letra de al lado de un numero entero
        System.out.println("resultado: " + resultado);
        System.out.println("resultado2: " + resultado2);
    }
}
