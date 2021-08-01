package poo;

public class Aritmetica {
    // Atributos
    public int a;
    public int b;

    // Métodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }

    public int sumaConRetorno() {
        int resultado = a + b;
        return resultado;
    }
}
