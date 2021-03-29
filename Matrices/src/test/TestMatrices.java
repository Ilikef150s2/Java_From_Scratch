package test;

public class TestMatrices {

    public static void main(String[] args) {
        /*creamos el arreglo de enteros y luego lo instanciamos diciendo que es entero
        y que tiene 3 filas y 2 columnas, recordar que se cuenta desde 0*/
        int edades[][] = new int[3][2];
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

        //usaremos un for para iterar la matriz
        //ren significa reglones
        //col significa columnas
        System.out.println("Iterando con ciclo for \n");
        for (int ren = 0; ren < edades.length; ren++) {
            //ponemos edades[ren].length para devolver el largo del reglon "2"
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades: " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }

        System.out.println("Imprimiendo matriz de frutas");
        //ingresamos valor a la matriz de forma manual y sencilla.
        String frutas[][] = {{"Banano", "Jocote", "Mandarina"}};

        for (int ren = 0; ren < frutas.length; ren++) {
            for (int col = 0; col < frutas[ren].length; col++) {
                //aplicamos lo mismo que al principio le damos al for interno que recorra el tama;o del reglon que es 2
                System.out.println("Fruta en posicion: " + ren + "-" + col + ": " + frutas[ren][col]);
                //mandamos a imprimir los valores que encuentra en la matriz.
            }

        }
    }
}
