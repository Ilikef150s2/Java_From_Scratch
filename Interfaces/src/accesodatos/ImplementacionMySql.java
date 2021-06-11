
package accesodatos;

public class ImplementacionMySql  implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde MySql");

    }
        //debemos hacer esta clase abstracta para implementar las de IAccesoDatos
    
}
