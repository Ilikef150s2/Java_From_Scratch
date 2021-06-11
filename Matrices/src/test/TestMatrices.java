package test;

import domain.Persona;

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

        System.out.println("Impresion de matriz de objetos");
        //cremos la matriz de tipo objeto persona y le decimos que cree una nueva que tenga 2x3
        Persona personas[][] = new Persona[2][3];
        imprimir(frutas); //aqui solo llamamos el metodo que creamos de imprimir 
        System.out.println("Separando matrices");
        personas[0][0] = new Persona("Joel");
        personas[1][0] = new Persona("Ervin");
        personas[1][1] = new Persona("Moreno");
        imprimir(personas);
    }

    /*Crearemos un metodo par ano repetir el codigo de imprimir
    con el for iterando en cada espacio de la matriz*/

 /*Se crea el metodo de imprimir matriz y dentro de los argumentos
    se pone el tipo que es object y luego los arumentos
    en este caso e suna matriz, no es necesario agregarlo valor
    por que solo es paso de argumentos*/
    public static void imprimir(Object matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                //aplicamos lo mismo que al principio le damos al for interno que recorra el tama;o del reglon
                System.out.println("Matriz en posicion: " + ren + "-" + col + ": " + matriz[ren][col]);
                //mandamos a imprimir los valores que encuentra en la matriz.
            }

        }
    }
}
