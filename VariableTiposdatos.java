package variabletiposdatos;

public class VariableTiposdatos {

    public static void main(String[] args) {
        //boolean sirve para ver si o no , o mejor llamado como bandera
        boolean valoLogico = false;
        
        // Tipo de dato caracter.
        char valorCaracter = 'J';
        
        // Tipo d edato string, cadenas d ecaracteres
        // podemos declararlo como queramos o dependiendo del uso que le vayamos a dar.
        String cadena = "Hola que pasa";
        String cadena1 = "";
        String cadena2 = null;
        
        //Tipos de datos enteros
        
        byte numero = 0;
        short numero1 = 0;
        int numero2 = 0;
        long numero3 = 0L;  /*agregamos la L mayuscula para decirle que no lo tome
                              como entero normal si no que lo tome como entero largo
                               desde el principio. */
        
        //Tipos de datos reales. osea numeros con decimales
        float numero4 = 0.1f;  //le ponemos f para decirle  que es un float
        double numero5 = 0.2;
        
        // eclaracion de constantes 
        
        final int VALOR = 4;  // se tiene que declarar la constante desde el principio.
        
        //Concatenando informacion y mostrandola por consola.
        System.out.println(numero);
        System.out.println(cadena);
        System.out.println(cadena + " " + numero3);
    }
    
}
