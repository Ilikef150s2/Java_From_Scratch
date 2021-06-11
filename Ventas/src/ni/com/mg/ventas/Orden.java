
package ni.com.mg.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];//creamos el arreglo productos de tipo producto
    private static int contadorOrdenes;/*Esta variable nos ayudara a contar los objetos que 
    creemos y ayudarnos a darnos el id unico que necesitamos*/
    private int contadorProductos; /*esta variable nos servira para contar los
    objetos de tipo producto que se creen de tipo productos*/
    private static final int MAX_PRODUCTOS = 10; //constante
    
    public Orden(){//constrcutos vacio por que no se le pasa argumentos
        this.idOrden = ++Orden.contadorOrdenes;/*inicializamos el id orden
        y la asociamos con el contador de ordenes para que se asigne
        el valor 1 al a la variable idOrden*/
        this.productos = new Producto[Orden.MAX_PRODUCTOS];/*iniciamos el arreglo y creamos
        la instancia con la clase Producto para usar los valores,
        y le pasamos el limite con la constante que creamos*/
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){ /*usamos la variable
            contadorProductos para usarla como referencia para incrementar los productos. y le anteponemos
            this para referirnos a que es propia de esta clase*/
            this.productos[this.contadorProductos++] = producto; /*agregamos el valor de la 
            variable contadorProdcuto y luego la incrementamos para que aumente
            la cantidad de producto cada vez que se evalue y entre un argumento producto*/
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) { /* el for se detendra segun la
            variable contadorProductos siempre y cuando tenga valor.*/
            Producto producto = this.productos[i];
            //total += producto.getPrecio(); //total = total + producto.getPrecio()
            total += this.productos[i].getPrecio(); /*obtenemos el precio desde el arreglo
            que tenemos en esta clase y se lo asignamos a total, que se va a umentando*/
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal(); /*imprimimos totalOrden 
        llamando el metodo calcularTotal*/
        System.out.println("Total de la orden : " + "$" +totalOrden);
        System.out.println("Productos de la orden: " + this.contadorProductos);//agregamos contadorProductos para ver cuantos productos tiene la orden
        for (int i = 0; i < this.contadorProductos; i++) { /*creamos este for para leer los productos
            del arreglo productos*/
            System.out.println(this.productos[i]);
        }
    }
}
