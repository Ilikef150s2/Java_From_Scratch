package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,2,4);
        imprimirNumeros(1,2);
        variosparametros("Juan", 7,7,7);
    }
    
    private static void variosparametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        /*Los tres puntos quiere decir que no se sabe cuanto valores se 
        pasara hasta que se inicie la ejecucion del codigo*/
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: " + numeros[i]);
        }
    }
}
