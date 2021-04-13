
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        /*
        int - Integer
        long - Long
        float- Float
        double- Double
        boolean- Boolean
        byte- Byte
        char- Character
        short- Short
        */
        
        Integer entero = 3;
        System.out.println("entero = " + entero);
  /* A esto se le llama autoboxing umboxing, cuando usamos
  el tipo de datos envolvente segun el dato primitivo o objec */
        double entero2 = entero.doubleValue();//esto es: UMBOXING
        System.out.println("entero = " + entero2);
    }
}
