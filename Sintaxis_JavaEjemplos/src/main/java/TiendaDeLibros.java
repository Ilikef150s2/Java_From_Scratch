
import java.util.Scanner;

public class TiendaDeLibros {

    public static void main(String[] args) {
        // creamos el objeto para capturar los datos ingresados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        //pedimos el dato , en este caso el nombre
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        //capturamos el dato y al mismo tiempo convertimos el dato en entero con integer.parseInt
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        // capturamos el el dato y al mismo tiempo lo convertimos en double con Double.parseDouble
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        // capturamos el dato en este caso true o false y lo pasamos a boolean con Boolean.parseBoolean
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        //Imprimimos los datos en pantalla
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
