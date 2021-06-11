
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        
        //indicarDiaSemana(Dias.LUNES);
        System.out.println("Continente #4: " + Continentes.AMERICA);
        System.out.println("Paises en el 4 continente: " + Continentes.AMERICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES: 
                System.out.println("Segundo dia de la semana");
                break;
        }
    }
}
