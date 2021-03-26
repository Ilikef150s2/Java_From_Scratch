package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        /*solo imprimimos la variable arreglo, esto devolvera solo la ubicacion en la memoria
        ya que no tiene valores dentro de sus espacios*/
        System.out.println("edades" + edades);
        // ingresamos un valor en la ubicacion 0 del arreglo, la ubicacion empieza desde 0 hasta n-1
        edades[0] = 10;
        //Ahora imprimimos lo que esta en la posicion del arreglo numero 0
        System.out.println("elemento 0: " + edades[0]);
    }
}
