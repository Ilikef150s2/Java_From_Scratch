
package enumeracion;
public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    
    //creamos un get para llamar los paises del continente
    public int getPaises(){
        return this.paises;
    }
}
