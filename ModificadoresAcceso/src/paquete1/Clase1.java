
package paquete1;

public class Clase1 {
    protected String atributoProtected = "valor protected";

    protected Clase1() {
        System.out.println("Constructor protected");
    }
    
    public Clase1 (String arg){
        System.out.println("constructor publico");
    }
    
    protected void metodoProtected(){
        System.out.println("metodo protected");
    }
}