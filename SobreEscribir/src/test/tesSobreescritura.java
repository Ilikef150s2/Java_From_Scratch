package test;

import domain.Gerente;

public class tesSobreescritura {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Sistemas", "Juan ", 4000);
        System.out.println(gerente1.obtenerDetalles());
    }
}
