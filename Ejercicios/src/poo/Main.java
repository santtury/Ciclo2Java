package poo;

public class Main {
    public static void main(String[] args) {
        Aritmetica objetoOperacion1 = new Aritmetica();
        System.out.println("Suma objeto 1");
        objetoOperacion1.a = 5;
        objetoOperacion1.b = 5;
        objetoOperacion1.sumar();

        int valor = objetoOperacion1.sumaConRetorno();
        System.out.println("La suma con retorno: " + valor);

        Aritmetica objetoOperacion2 = new Aritmetica();
        System.out.println("Suma objeto 2");
        objetoOperacion2.a = 20;
        objetoOperacion2.b = 20;
        objetoOperacion2.sumar();
    }
}
