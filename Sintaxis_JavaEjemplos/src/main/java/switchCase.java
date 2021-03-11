
public class switchCase {

    public static void main(String[] args) {

        var numero = 0;
        var numeroTexto = "numero desconocido";

        switch (numero) {
            case 1:
                System.out.println("Numero 1");
                break;   // Indica el final de la seccion de intruccion y se sale del switch.

            case 2:
                System.out.println("Numero 2");
                break;

            case 3:
                System.out.println("Numero 3");
                break;

            default:    // se ejecuta por si el valor ingresado en switch no pertenece a ninguno de los casos
                numeroTexto = "numero desconocido";
            /*le decimos que si no entra a ninguna opcion, que el 
                valor de numero texto siga siendo numero desconocico*/
                
                System.out.println(numeroTexto);
        }

    }
}
