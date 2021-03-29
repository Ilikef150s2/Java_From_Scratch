public class OrdenDescendente {

    public static void main(String[] args) {
        //valores: {10,20,30,90,300}
        int arreglo[] = {10, 20, 30, 90, 300};
        ordenamiento(arreglo); //llamamos el metodo de ordenamiento
        imprimir(arreglo);

    }

    //metodo burbuja es solo eficiente con pocos datos
    public static void ordenamiento(int[] A) { // a es el nombre del argum en este metodo
        for (int x = 0; x < A.length; x++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < A.length - 1; y++) {
                /*Se repetira hasta que y sea menor que 5-1=4 osea 4 veces*/
                int elementoActual = A[y],/* y vale 0 actualmente y elemento guardara
                        el valor que este en esa posicion*/
                        elementoSiguiente = A[y + 1];
                if (elementoActual < elementoSiguiente) {
                    /* Intercambia, toma el elemento menor y lo pone a la izquierda o mejor
                    dicho en la posicion 0*/
                    A[y] = elementoSiguiente;
                    /*el elemento actual antes de ser sobreescrito se guarda en la posicion donde
                    estaba antes el valor menor, osea en la posicion derecha o mejor dicho en la posicion 1*/
                    A[y + 1] = elementoActual;
                    //luego esto se repite hasta que se ordena todo el arreglo
                }
            }
        }
    }

    public static void imprimir(int[] arr) {
        //el for recorre todo el arreglo desde la posicion 0
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}
