
package operaciones;

public class Aritmetica {
    //atributos 
    int a;
    int b;
    
    //metodo void que significa que no devuelve ningun valor en especifico.
    public void suma(){
       int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }
    
    //Indica que devuelve un entero
    public int sumaconRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        //creamos las dos variables que tendran los argumentos
        a = arg1;
        b = arg2;

      //  this.a = arg1;  podemos usar this para ubicarnos que usamos variables locales de nuestra propia clase
      //  this.b = arg2;  es una manera de leer mas rrapido un codigo o entenderlo mas rrapido
      //podemos usar this tambien para llama metodos.
        //podemos devolverlo de un solo o podemos usar una variable, es preferencia personal.
        return a + b;
    }
}
