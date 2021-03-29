package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3]; //esto le podemos llamar arreglo unidemensional.
        /*solo imprimimos la variable arreglo, esto devolvera solo la ubicacion en la memoria
        ya que no tiene valores dentro de sus espacios. Si nos fijamos el 3 significa cuantos espacios tendra el arreglo*/
        System.out.println("edades" + edades);
        // ingresamos un valor en la ubicacion 0 del arreglo, la ubicacion empieza desde 0 hasta n-1
        edades[0] = 10;
        //Ahora imprimimos lo que esta en la posicion del arreglo numero 0
        System.out.println("elemento 0 " +  ": " + edades[0]);
        
        //edades[3] = 2;  esto es un error ya que no hay una posicion donde almacenar el 2
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elementos " + i +": " + edades[i]);
        }
    }
}
