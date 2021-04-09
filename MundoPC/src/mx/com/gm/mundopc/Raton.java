package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada{ /*esta clase extiende de dispositivo 
    entrada, osea es una clase hija*/
    private final int idRaton; //declaramos final para que no sea cambiada una vez iniciada
    private static int contadorRatones;
    
    //iniciamos los atributos de la clase padre
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", " + super.toString() +'}';
    }
    
}
