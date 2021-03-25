package domain;

//importamos Date para usar el formato de fecha en el atributo de fecha registro.
import java.util.Date;

// agregamos extends para decirle que heredara atributos de persona
public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    //pasamos los atributos de persona y los juntamos con los de cliente
    /*Siempre tiene que pasar los atribuytos o parametros que se
    ocuparan en el orden exacto que pasaremos al toString*/
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
            char genero, int edad, String direccion){
        //usamos super para decir que hereda de Persona
        super(nombre,genero,edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;   
        this.vip = vip;
    }
//creamos get and set para manipular los datos, mostrar o cambiar.
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
