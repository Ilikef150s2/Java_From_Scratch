
package test;

import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        indicarDiaSemana(Dias.LUNES);
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
