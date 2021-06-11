
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
         //llamamos al metodo suma
        aritmetica1.suma();
        
        //creamos una variable donde llamamos el metodo con retorno de infor.
        int resultado = aritmetica1.sumaconRetorno();
        System.out.println("resultado " + resultado);
        //llamamos al metodo con argumentos y reusamos la variable resultado
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado: " + resultado);
    }
}
