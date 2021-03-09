package ejemplocasting;

public class EjemploCasting {

    public static void main(String[] args) {
        int alfa = 20;
        float beta = 23.5F;
        beta = alfa;
        
        alfa = (int) beta;   /*se pone al tipo de dato entre parentesis que se quiere cambiar y luego la variable
                                que tiene el valor . el valor de beta que es float pasa
                               a ser entero por la conversion. */
        alfa = (char) 'b';
        System.out.println(alfa);
        
        char caracter = (char) alfa;   //alfa es entero, con casting lo pasamos a caracter
        System.out.println(caracter);
        
        
// Veremos lo qu eosn wraper,  valores primitivos y hacer cambios.        
        int numero = Integer.parseInt("100");  //le estoy pasando una cadena para que sea un enter
        System.out.println(numero*3);          // esto permite hacer operaciones luego como si fuer aun entero normal
        
        String cadena = Integer.toString(23);  // Le pasamos un entero con toString para transformarlo en cadena
        System.out.println(cadena);
    }
    
}
