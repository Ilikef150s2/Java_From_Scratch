
public class CajaPrueba {
    public static void main(String[] args) {
        Caja caja = new Caja(); //creamos el objeto caja
       caja.alto = 2;
       caja.ancho = 3;
       caja.profundo = 6;
       
       // imprimimos resultado usando el objeto caja y llamando al metodo calcularVolumen
        System.out.println("El volumen de la caja es: " + caja.calcularVolumen());
    }
}
