
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    /*El bloque se ejecuta antes del constructor, cuando se carga esta clase
    en memoria, el bloque estatico se ejecuta primera y luego el no estatico sin embargo
    el bloque no estatico se repetira cada vez que se ejecute la clase
    mientras que el estatico solo la primera vez*/
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
        //idPersona = 10; no se puede agregar por que no es estatica.
    }
    
    {
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona= " + idPersona + '}';
    }
    
}
