
public class Palindromo {
    public static void main(String[] args) {
        String palabra = "oso"; //declaramos palabra de tipo String y le  pasamos oso
        System.out.println("El texto "+palabra+"es palindromo? : "+detecPalindromo(palabra));
        //imprimimos y mandamos a llamar el metodo detecPalindromo
    }
    
    public static boolean detecPalindromo(String texto){/*Le pasamos un String texto ya 
        que asi podra leer, numeros o cadenas de caracteres*/
        
        /*Para leer mejro la cadena y verificar si es palidromo lo mejor 
        seria reducir todo a minusculas, por eso usaremos la funcion tolowercase*/

        texto = texto.toLowerCase();
        
        for (int i = 0, j = texto.length() -1; i<= j; i++, j--) {
         /*j es igual al longitud de palabras - 1 para que tome la ultima posicion 
            luego termina cuando isea menor o igual que j   y se desplazara de izquierda a derecha
            y j de derecha a izquierda*/
            if (texto.charAt(i) != texto.charAt(j)) {
                /*comprobamos si el caracter izquierda es distinto al de la
                derecha retornamos false*/
                return false;
            }
            
        }
        return true;//si la condicion no se cumple devuelve true
    }
}

