
package accesodatos;

public interface IAccesoDatos {
    int MAAX_REGISTRO = 10;
    
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    //estos metodos los simularemos como si fuera una base de datos.
}
