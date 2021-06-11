
import java.util.Scanner;

public class NumMayor {
    public static void main(String[] args) {
        System.out.println("Proporcione el numero1:");
        //creamos el objeto para almacenar datos del usuario.
        Scanner consola = new Scanner(System.in);
        //convertimos lo recibido en consola a entero.
        var num1 = Integer.parseInt(consola.nextLine());
        //pedimos el segundo nuemro.
        System.out.println("Proporcione el numero2");
        var num2 = Integer.parseInt(consola.nextLine());
        if (num1 > num2) {
            System.out.println("El numero mayor es:" + num1);
        }
}
}
