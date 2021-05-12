package test;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = 10/0;
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
        System.out.println("Resultado = " + resultado);
    }
}
