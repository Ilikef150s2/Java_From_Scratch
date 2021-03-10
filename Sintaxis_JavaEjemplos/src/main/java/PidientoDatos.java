
import java.util.Scanner;

public class PidientoDatos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // cremos el objeto scanner para pedir datos
        
        System.out.println("Proporciona un nombre:");
        var usuario = scanner.nextLine();   // se captura los datos que se escriben con .nextLine()

        System.out.println("Usuario: " + usuario);
    }
}
