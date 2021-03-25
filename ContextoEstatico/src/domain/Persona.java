package domain;

public class Persona {

    private int idPersona;
    private String nommbre;
    private static int contadorPersona;
    
    public Persona(String nombre){
        this.nommbre = nombre;
        //incrementamos el contador con Persona, asi nos referemis al de la clase.
        Persona.contadorPersona++;
        this.idPersona = Persona.contadorPersona;
    }
    //creamos get y set para acceder a los atributos "Modificadores de acceso"
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }
    
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona = " + idPersona + ", nommbre = " + nommbre + '}';
    }
    
}
