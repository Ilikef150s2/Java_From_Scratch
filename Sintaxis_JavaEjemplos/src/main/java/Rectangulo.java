
import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        System.out.println("Proporciona el alto: ");
        Scanner scanner = new Scanner(System.in);
        /*hacemos que los datos introducidos por el usuario se transformen a float
        para luego usarlos libremente. */ 
        var alto = Float.parseFloat(scanner.nextLine());

        System.out.println("Proporciona el ancho:");
        var ancho = Float.parseFloat(scanner.nextLine());

        float area = alto * ancho;
        float perimetro = area * 2;

        //Imprimimos los resultado
        System.out.println("Area :" + area);
        System.out.println("Perimetro :" + perimetro);
    }
}
