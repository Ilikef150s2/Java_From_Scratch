
package test;

public class TestMatrices {
    public static void main(String[] args) {
        /*creamos el arreglo de enteros y luego lo instanciamos diciendo que es entero
        y que tiene 3 filas y 2 columnas, recordar que se cuenta desde 0*/
        int edades[][] = new int [3][2];
        System.out.println("edades: " + edades);
        //si imprimimos esta variable nos devolvera la direccion de memoria
        
        edades[0][0] = 1;
        edades[0][1] = 2;
        edades[1][0] = 3;
        edades[1][1] = 4;
        /*podemos ingresar datos en la matriz de esta forma
        diciendo primero las fila sy luego las columnas*/
        System.out.println("edades 0-0: " + edades[0][0]);
        System.out.println("edades 0-1: " + edades[0][1]);
        System.out.println("edades 1-0: " + edades[1][0]);
    }
}
