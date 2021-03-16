import java.util.Scanner;

public class operaCondici{
    
    public static void main(String[] args) {
        
        int a = 15;
        int valorMinimo = 0, valorMaximo=10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        // Iniciamos la variable vacaciones false y diaDescanso como true
        boolean vacaciones = false;
        boolean diaDescanso = true;
        //cuando entra en el if las variables estan definidas como true y false, esto le llamamos "bandera"
        //usamos el operaodr de condicion or para revisar si cualqueira de los dos es true, devuelve un true, solo devolvera un false si los dos son false
        if(vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego del hijo");
        else
            System.out.println("Padre ocupado");
                
        
    }
}
