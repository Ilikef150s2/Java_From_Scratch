package ni.com.mg.ventas.test;

import ni.com.mg.ventas.*;  //importamos todas las clases que estan dentro del paquete con el aterisco

public class VentasTest {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.0);//creamos el primer producto
        Producto producto2 = new Producto("Pantalon", 100.0);//creamos el primer producto
        Producto producto3 = new Producto("Cel", 200.0);//creamos el primer producto
        Orden orden1 = new Orden();
        //llamamos los metodos con los datos que le agregamos
        /*orden1 es el objeto para mandar a llamar al metodo o clase agregarProducto*/
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
    }
}
