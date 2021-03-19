
public class CajaPrueba {
    public static void main(String[] args) {
        Caja caja = new Caja();
       caja.alto = 2;
       caja.ancho = 3;
       caja.profundo = 6;
       
        System.out.println("El volumen de la caja es: " + caja.calcularVolumen());
    }
}
