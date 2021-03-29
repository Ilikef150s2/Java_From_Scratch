
package ni.com.mg.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];//cremos el arreglo de tipo producto
    private static int contadorOrdenes;/*Esta variable nos ayudara a contar los objetos que 
    creemos y ayudarnos a darnos el id unico que necesitamos*/
    private int contadorProductos; /*esta variable nos servira para contar los
    objetos de tipo producto que se creen de tipo productos*/
    private static final int MAX_PRODUCTOS = 10; //constante
    
    public Orden(){//constrcutos vacio por que no se le pasa argumentos
        this.idOrden = ++Orden.contadorOrdenes;/*inicializamos el id orden
        y la asociamos con el contador de ordenes para que se asigne
        el valor 1 al a la variable idOrden*/
        this.productos = new Producto[Orden.MAX_PRODUCTOS];/*iniciamos el arreglo
        y le pasamos el limite con la constante que creamos*/
    }
    
    
}
