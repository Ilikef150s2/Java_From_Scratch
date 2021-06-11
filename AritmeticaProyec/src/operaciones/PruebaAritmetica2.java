
package operaciones;

public class PruebaAritmetica2 {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("El valor a del constructor vacio es: " + aritmetica1.a );
        System.out.println("El valor b del constructor vacio es: " + aritmetica1.b);
        
        //llamamos a miMetodo
        miMetodo();
        
        Aritmetica aritmetica2 = new Aritmetica(5, 9);
        System.out.println("El valor a del constructor pasando argumentos es: " + aritmetica2.a);
        System.out.println("El valor de la variable b pasando argumento con el construc es: " + aritmetica2.b);
        
    }
    //cremoa sotro metodo para probar el alcance de las variables.
    public static void miMetodo(){
        // a esta fuera del alcance de este metodo ya que fue declarado en otro metodo.
        //a = 3;
            System.out.println("Otro metodo");
}
}
