
package test;

import domain.*; //usamos las clases dentro de esta carpeta

public class TestClasesAbstractas {
    public static void main(String[] args){
        /*se pueden poner abstractas para evitar que se creen 
        objetos de la clase padre*/
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar(); //ejecutamos el metodo y lo llamamos
    }
}
