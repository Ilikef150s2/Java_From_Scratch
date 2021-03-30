
package ni.com.mg.ventas;

public class Producto {
    //creamos los atributos privados para que no tengan acceso directo a ellos
    private final int idProducto; //final para que no se pueda modificar despues
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    /*creamos nuestro constructor vacio y le decimos que inicie la variable
    idProducto para que empieze a contar los id.*/
    private Producto(){
        /*El incremento de contador producto se le asigna como id a id producto.
        le pasa el mismo valor*/
        this.idProducto = ++Producto.contadorProductos;
        /*No necesitamos el set ni el get ya que ya esta relacionado con la clase
        y idProducto*/
    }
    
    /*Creamos constructor que llevara los demas argumentos*/
    public Producto(String nombre, double precio){
        this(); //llamada a constructor privada de la clase
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //creamos el get de idproducto para llamarlo, es el unico que necesitamos
    public int getIdProducto(){
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override //lo usamos para llamarlo como metodo e imprimir los valores
    public String toString() {
        return "Producto{" + "idProducto= " + idProducto + ", nombre= " + nombre + ", precio= " + precio + '}';
    }
    
}
