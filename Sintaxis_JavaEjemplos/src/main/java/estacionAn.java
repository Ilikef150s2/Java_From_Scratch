import java.util.Scanner;

public class estacionAn{   // Nombre de la clase, esta es publica

    public static void main(String[] args) {   //Declaramos que esta sera la clase main, donde llamara el codigo a ejecutar.

        var scanner = new Scanner(System.in);   //Creamos la variable para pedir datos
        System.out.println("Proporciona el mes del año: ");
        var mes = scanner.nextInt();//mes del año

        String estacion = null;

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        }
        else if( mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }
        else if( mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }
        else if( mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        else{
            estacion = "Mes incorrecto";
        }
        
        System.out.println("estacion: " + estacion + ", para el mes: " + mes);
    }
}
